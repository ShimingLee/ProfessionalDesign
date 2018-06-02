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

    @RequestMapping(value = "/insertPicture",
            method = RequestMethod.POST)
    @ResponseBody
    public OBeanBase insertPicture(@RequestParam(value = "picture") MultipartFile picture) {
        OBeanBase fileMessage = new OBeanBase();
        String filePath = "";
        if (picture != null) {
            String originalPictureName = picture.getOriginalFilename();
            String suffix = originalPictureName.substring(originalPictureName.lastIndexOf("."));
            String fileName = UUID.randomUUID().toString() + suffix;
            filePath = "resources/img/" + fileName;
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
        OBeanBase goodMessage = new OBeanBase();
        if (good.getGoodstate() == 0) {
            goodMessage.setCode("200");
            goodService.updateGood(good);
        } else if (good.getGoodstate() == 2) {
            goodMessage.setCode("10821");
        } else if (good.getGoodstate() == 1) {
            goodMessage.setCode("200");
            goodService.updateGood(good);
        }
        return goodMessage;
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
        OBeanBase goodMessage = new OBeanBase();
        int flag = goodService.insertGood(good);
        if (flag > 0) {
            goodMessage.setCode(OBeanBase.TRUECODE);
            goodMessage.setMessage("插入成功");
            goodMessage.setDatamessage(flag);
        } else {
            goodMessage.setMessage("插入失败");
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
        OBeanBase goodMessage = new OBeanBase();
        GoodPackage good = goodService.selectGoodByPrimaryKey(goodId);
        System.out.println("fsdewrewtt-----------"+goodId);
//        System.out.println(good.getGoodname());
//        System.out.println(good.getGoodstate());
        goodMessage.setDatamessage(good);
        goodMessage.setClassName(this.getClass());
        goodMessage.setCode(OBeanBase.TRUECODE);
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
        OBeanBase goodMessage = new OBeanBase();
        List<GoodPackage> goodList = goodService.selectAllGood();
        goodMessage.setDatamessage(goodList);
        goodMessage.setClassName(this.getClass());
        if (goodList.isEmpty() != false) {
            goodMessage.setCode(OBeanBase.TRUECODE);
        } else {
            goodMessage.setCode(OBeanBase.DATABASEFALSECODE);
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
        OBeanBase goodMessage = new OBeanBase();
        int flag = goodService.deleteGoodByPrimaryKey(goodId);
        goodMessage.setDatamessage(flag);
        goodMessage.setClassName(this.getClass());
        if (flag != 0) {
            goodMessage.setCode(OBeanBase.TRUECODE);
        } else {
            goodMessage.setCode(OBeanBase.DATABASEFALSECODE);
        }
        return goodMessage;
    }


}
