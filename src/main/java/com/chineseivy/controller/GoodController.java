package com.chineseivy.controller;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.service.GoodService;
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
import java.util.ArrayList;
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
        int flag = goodService.insertGood(good);
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
            method = RequestMethod.GET)
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
            method = RequestMethod.GET)
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
        if (good.getGoodstate() == 0 && good.getGoodid()!=null) {
            flag = goodService.updateGood(good);
        } else if (good.getGoodstate() == 2) {
            goodMessage.setCode(OBeanBase.CHECKFALSECODE);
            goodMessage.setMessage("验证拒绝");
            goodMessage.setDatamessage("管理员下架处理");
        } else if (good.getGoodstate() == 1 && good.getGoodid()!=null) {
            flag = goodService.updateGood(good);
        } else if(good.getGoodid()==null){
            goodMessage.setMessage("未携带商品ID");
        } else{
            goodMessage.setMessage("未知错误");
        }
        if (flag>0){
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("更新成功");
        }else{
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
