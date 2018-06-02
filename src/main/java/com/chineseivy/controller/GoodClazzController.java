package com.chineseivy.controller;/**
 * Created by admin on 2018/5/27
 */

import com.chineseivy.bean.GoodClass;
import com.chineseivy.bean.GoodClassPackage;
import com.chineseivy.service.GoodClazzService;
import com.chineseivy.util.OBeanBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: ProfessionalDesign
 * @description: 商品类别
 * @author: Shiming Lee
 * @create: 2018-05-27 12:51
 **/

@Controller
@RequestMapping(value = "/goodClazz")
public class GoodClazzController {
    @Autowired
    @Qualifier("goodClazzService")
    private GoodClazzService goodClazzService;
    private OBeanBase goodClazzMessage = new OBeanBase();

    @RequestMapping(value = "/selectAllGoodClazz",
            method = RequestMethod.GET)
    @ResponseBody
    public OBeanBase selectAllGoodClazz(){
        List<GoodClassPackage> goodClassPackages = goodClazzService.selectAllGoodClass();
        goodClazzMessage.setDatamessage(goodClassPackages);
        return goodClazzMessage;
    }

    @RequestMapping(value = "/selectByPrimaryKey",
            method = RequestMethod.GET)
    @ResponseBody
    public OBeanBase selectByPrimaryKey(@RequestParam(value = "goodClassId") int goodClassId){
        GoodClassPackage goodClass = goodClazzService.selectGoodClazzByPrimaryKey(goodClassId);
        goodClazzMessage.setDatamessage(goodClass);
        return goodClazzMessage;
    }

    @RequestMapping(value = "/insertByPrimaryKey",
            method = RequestMethod.POST)
    @ResponseBody
    public OBeanBase insertByPrimaryKey(@RequestBody GoodClass goodClass){
        int flag = goodClazzService.insertSelective(goodClass);
        if (flag>0) {
            goodClazzMessage.setMessage("插入成功");
            goodClazzMessage.setDatamessage(flag);
        }else {
            goodClazzMessage.setMessage("插入失败");
        }
        return goodClazzMessage;
    }

    @RequestMapping(value = "/updateByPrimaryKey",
            method = RequestMethod.PUT)
    @ResponseBody
    public OBeanBase updateByPrimaryKey(@RequestBody GoodClass goodClass){
        int flag = goodClazzService.updateByPrimaryKeySelective(goodClass);
        goodClazzMessage.setDatamessage(flag);
        return goodClazzMessage;
    }

    @RequestMapping(value = "/deleteByPrimaryKey",
            method = RequestMethod.DELETE)
    @ResponseBody
    public OBeanBase deleteByPrimaryKey(@RequestParam(value = "goodClassId")int goodClassId){
        int flag = goodClazzService.deleteByPrimaryKey(goodClassId);
        goodClazzMessage.setDatamessage(flag);
        return goodClazzMessage;
    }
}

