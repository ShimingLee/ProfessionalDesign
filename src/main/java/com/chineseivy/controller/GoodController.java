package com.chineseivy.controller;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.bean.Warehouse;
import com.chineseivy.service.GoodService;
import com.chineseivy.service.WarehouseService;
import com.chineseivy.util.OBeanBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
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
        String referencePath = "";
        if (picture.isEmpty()) {
            System.out.println("文件未上传");
        } else {
            String originalPictureName = picture.getOriginalFilename();
            String suffix = originalPictureName.substring(originalPictureName.lastIndexOf("."));
            String fileName = UUID.randomUUID().toString() + suffix;
            filePath = request.getSession().getServletContext().getRealPath("/") + "\\imgUpload\\good\\" + fileName;
            referencePath = "imgUpload/good/" + fileName;
            File savePicture = new File(filePath);
            if (!savePicture.getParentFile().exists()) {
                boolean result = savePicture.getParentFile().mkdirs();
                if (!result) {
                    System.out.println("目录创建失败");
                    fileMessage.setMessage("目录创建失败");
                    fileMessage.setDatamessage("目录创建失败");
                } else {
                    System.out.println("目录创建成功");
                    fileMessage.setMessage("目录创建成功");
                    fileMessage.setDatamessage(referencePath);
                }
            } else {
                fileMessage.setMessage("文件夹目录已存在");
                fileMessage.setDatamessage(referencePath);
            }

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
        int flag = 0;
        if (StringUtils.isEmpty(good.getGoodname())) {
            goodMessage.setMessage("商品名为空");
            goodMessage.setCode(OBeanBase.FALSECODE);
            goodMessage.setDatamessage(flag);
        } else {
            System.out.println(good.getGoodname());
            goodService.insertGood(good);
            int goodId = goodService.maxId();
            int shopId = goodService.selectShopId(goodId);
            Warehouse warehouse = new Warehouse();
            warehouse.setGoodid(goodId);
            warehouse.setShopid(shopId);
            warehouse.setSupplytime(new Date());
            flag = warehouseService.insertWarehouse(warehouse);
            System.out.println("goodController:flag=" + flag);
            if (flag > 0) {
                goodMessage.setCode(OBeanBase.TRUECODE);
                goodMessage.setMessage("插入成功");
                goodMessage.setDatamessage(flag);
            } else {
                goodMessage.setMessage("插入失败");
                goodMessage.setCode(OBeanBase.FALSECODE);
                goodMessage.setDatamessage(flag);
            }
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
        if (good.getGoodid() != null) {
            goodMessage.setDatamessage(good);
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("查询成功");
        } else {
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
        if (goodList.isEmpty() != true) {
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
        System.out.println("---------+++++++++" + good.getGoodname() + "{{{{{" + good.getGoodid());
        if (good.getGoodid() != null) {
            flag = goodService.updateGood(good);
        }else {
            goodMessage.setDatamessage("出错");
            goodMessage.setMessage("更新失败");
            return goodMessage;
        }
        if (flag > 0) {
            System.out.println("更新成功");
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("更新成功");
            goodMessage.setDatamessage(flag);
        } else {
            System.out.println("更新失败");
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("更新失败");
            goodMessage.setDatamessage(flag);
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
    public OBeanBase deleteGoodMessageByGoodKey(@RequestParam(value = "goodId") int goodId) {
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

    @RequestMapping(value = "/changeGoodStateByAdmin",
            method = RequestMethod.PUT)
    @ResponseBody
    /**
     * @Program: GoodController.java
     * @Method: changeGoodStateByAdmin
     * @Description: 管理员修改商品状态
     * @Author: Shiming Lee
     * @Create: 2018/6/11 14:16
     * @params: [goodid, goodstate]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase changeGoodStateByAdmin(@RequestParam(value = "goodid") int goodid, @RequestParam(value = "goodstate") int goodstate) {
        int flag = goodService.updateGoodStateByAdmin(goodid, goodstate);
        if (flag > 0) {
            goodMessage.setMessage("管理员修改成功");
            goodMessage.setDatamessage(flag);
            goodMessage.setCode(OBeanBase.TRUECODE);
        } else {
            goodMessage.setMessage("修改失败");
            goodMessage.setCode(OBeanBase.FALSECODE);
        }
        return goodMessage;
    }
}
