package com.chineseivy.controller;

import com.chineseivy.bean.*;
import com.chineseivy.service.ActivityService;
import com.chineseivy.service.GoodService;
import com.chineseivy.service.WarehouseService;
import com.chineseivy.util.OBeanBase;
import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by admin on 2018/4/18
 */

/**
 * @ReturnCode:
 * @TrueCode: 10010
 * @FalseCode: 10020
 * @CheckFalseCode: 10021
 * @DataBaseFalseCode: 10022
 **/

@Controller
@RequestMapping(value = "/good")
public class GoodController {

    @Autowired
    @Qualifier("goodService")
    private GoodService goodService;
    @Autowired
    @Qualifier("warehouseService")
    private WarehouseService warehouseService;

    private OBeanBase goodMessage = new OBeanBase();
    @RequestMapping(value = "/insertPicture",
            method = RequestMethod.POST)
    @ResponseBody
    /**
    * @Program: GoodController.java
    * @Method: insertPicture
    * @Description: 插入新的图片信息
    * @Author: Shiming Lee
    * @Create: 2018/6/2 16:00
    * @params: [picture, request]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase insertPicture(@RequestParam(value = "picture") MultipartFile picture, HttpServletRequest request) {
        OBeanBase fileMessage = new OBeanBase();
        String filePath = "";
        if (picture.isEmpty()) {
            System.out.println("文件未上传");
        }else {
            String originalPictureName = picture.getOriginalFilename();
            String suffix = originalPictureName.substring(originalPictureName.lastIndexOf("."));
            String fileName = request.getSession().getServletContext().getRealPath("/")+UUID.randomUUID().toString() + suffix;
            filePath = fileName;
            File savePicture = new File(filePath);
            fileMessage.setMessage(filePath);
            try {
                picture.transferTo(savePicture);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileMessage;
    }

    @RequestMapping(value = "/insertGoodMessage",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
     * @Program: GoodController.java
     * @Method: insertGoodMessage
     * @Description: 插入商品信息（全部插入
     * @Author: Shiming Lee
     * @Create: 2018/5/20 22:39
     * @params: [good]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase insertGoodMessage(@RequestBody Good good) {
        System.out.println(good.getGoodname());
        goodService.insertGood(good);
        int goodId = goodService.maxId();
        int shopId = goodService.selectShopId(goodId);
        Warehouse warehouse = new Warehouse();
        warehouse.setGoodid(goodId);
        warehouse.setShopid(shopId);
        warehouse.setSupplytime(new Date());
        int flag = warehouseService.insertWarehouse(warehouse);
        if (flag > 0) {
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("插入成功");
            goodMessage.setDatamessage(flag);
        } else {
            goodMessage.setMessage("插入失败");
            goodMessage.setCode(OBeanBase.FALSECODE);
            goodMessage.setDatamessage(flag);
        }
        return goodMessage;
    }

    @RequestMapping(value = "/findGoodMessageByGoodKey",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
     * @Program: GoodController.java
     * @Method: findGoodMessage
     * @Description: 根据ID寻找商品信息
     * @Author: Shiming Lee
     * @Create: 2018/5/22 8:20
     * @params: [goodId]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase findGoodMessageByGoodKey(@RequestParam int goodId) {
        GoodPackage good = goodService.selectGoodByPrimaryKey(goodId);
        if (good.getGoodid()!=null){
            goodMessage.setDatamessage(good);
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("查询成功");
        }else {
            goodMessage.setCode(OBeanBase.FALSECODE);
            goodMessage.setMessage("查询失败");
        }
        return goodMessage;
    }

    @RequestMapping(value = "/findAllGoodMessage",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**j
     * @Program: GoodController.java
     * @Method: findAllGoodMessage
     * @Description: 查找全部商品信息
     * @Author: Shiming Lee
     * @Create: 2018/5/22 8:22
     * @params: []
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase findAllGoodMessage() {
        List<GoodPackage> goodList = goodService.selectAllGood();
        goodMessage.setDatamessage(goodList);
        goodMessage.setClassName(this.getClass());
        System.out.println();
        if (goodList.isEmpty() != false) {
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("查询成功");
        } else {
            goodMessage.setCode(OBeanBase.DATABASEFALSECODE);
            goodMessage.setMessage("查询失败");
        }
        return goodMessage;
    }

    @RequestMapping(value = "/updateGoodMessage",
            method = RequestMethod.PUT,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
     * @Program: GoodController.java
     * @Method: updateGoodMessage
     * @Description: 更新商品信息
     * @Author: Shiming Lee
     * @Create: 2018/5/20 22:38
     * @params: [goodState, good]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase updateGoodMessage(@RequestBody Good good) {
        int flag = 0;
        System.out.println("---------+++++++++"+good.getGoodname()+"{{{{{"+good.getGoodid());
        if (good.getGoodstate() == 0 && good.getGoodid()!=null) {
            System.out.println("3333333");
            GoodPackage oldGood = goodService.selectGoodByPrimaryKey(good.getGoodid());
            Double oldPrice =  oldGood.getPrice();
            System.out.println(good.getPrice().equals(oldPrice));
            if (good.getPrice().equals(oldPrice)){
                System.out.println("000000");
                //不更改原价
                flag = goodService.updateGood(good);
            }else{
                //更改原价
                System.out.println("999999999");
                flag = goodService.updateGood(good);
            }
        } else if (good.getGoodstate() == 2 && good.getGoodid()!=null) {
            System.out.println("77777777");
            goodMessage.setCode(OBeanBase.CHECKFALSECODE);
            goodMessage.setMessage("验证拒绝");
            goodMessage.setDatamessage("管理员下架处理");
        } else if (good.getGoodstate() == 1 && good.getGoodid()!=null) {
            System.out.println("55555555");
            goodMessage.setMessage("更新失败");
            goodMessage.setDatamessage("商品处于上架状态无法更新");
        } else {
            goodMessage.setDatamessage("出错");
            goodMessage.setMessage("更新失败");
        }
        if (flag>0){
            System.out.println("更新成功");
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("更新成功");
        }else{
            System.out.println("更新失败");
            goodMessage.setMessage(OBeanBase.TRUECODE);
            goodMessage.setMessage("更新失败");
        }
        return goodMessage;
    }

    @RequestMapping(value = "/deleteGoodMessageByGoodKey",
            method = RequestMethod.DELETE)
    @ResponseBody
    /**
     * @Program: GoodController.java
     * @Method: deleteGoodMessageByGoodKey
     * @Description: 根据商品Id删除商品信息
     * @Author: Shiming Lee
     * @Create: 2018/5/22 22:53
     * @params: [goodId]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase deleteGoodMessageByGoodKey(@RequestParam int goodId) {
        int flag = goodService.deleteGoodByPrimaryKey(goodId);
        goodMessage.setDatamessage(flag);
        goodMessage.setClassName(this.getClass());
        if (flag > 0) {
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("删除成功");
        } else {
            goodMessage.setCode(OBeanBase.DATABASEFALSECODE);
            goodMessage.setMessage("查询失败");
        }
        return goodMessage;
    }


}
