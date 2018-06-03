package com.chineseivy.controller;
/**
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
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: GoodClazzController.java
    * @Method: selectAllGoodClazz
    * @Description: 选择全部的小类别
    * @Author: Shiming Lee
    * @Create: 2018/6/3 9:34
    * @params: []
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase selectAllGoodClazz(){
        List<GoodClassPackage> goodClassPackages = goodClazzService.selectAllGoodClass();
        if(goodClassPackages.isEmpty()){
            goodClazzMessage.setMessage("未查出小类别结果");
            goodClazzMessage.setCode(OBeanBase.DATABASEFALSECODE);
        }else {
            goodClazzMessage.setDatamessage(goodClassPackages);
            goodClazzMessage.setMessage("查询成功");
            goodClazzMessage.setCode(OBeanBase.TRUECODE);
        }
        return goodClazzMessage;
    }

    @RequestMapping(value = "/selectByPrimaryKey",
            method = RequestMethod.GET)
    @ResponseBody
    /**
    * @Program: GoodClazzController.java
    * @Method: selectByPrimaryKey
    * @Description: 按ID读取小分类
    * @Author: Shiming Lee
    * @Create: 2018/6/3 9:51
    * @params: [goodClassId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase selectByPrimaryKey(@RequestParam(value = "goodClassId") int goodClassId){
        GoodClassPackage goodClass = goodClazzService.selectGoodClazzByPrimaryKey(goodClassId);
        if (goodClass.getGoodclassid() != null) {
            goodClazzMessage.setDatamessage(goodClass);
            goodClazzMessage.setMessage("查询成功");
            goodClazzMessage.setCode(OBeanBase.TRUECODE);
        }else{
            goodClazzMessage.setMessage("查询失败");
            goodClazzMessage.setCode(OBeanBase.FALSECODE);
        }
        return goodClazzMessage;
    }

    @RequestMapping(value = "/insertByPrimaryKey",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: GoodClazzController.java
    * @Method: insertByPrimaryKey
    * @Description: 插入小类别
    * @Author: Shiming Lee
    * @Create: 2018/6/3 9:55
    * @params: [goodClass]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase insertByPrimaryKey(@RequestBody GoodClass goodClass){
        int flag = 0;
        if (goodClass.getGoodclassname()!=null) {
            flag = goodClazzService.insertSelective(goodClass);
        }
        if (flag>0) {
            goodClazzMessage.setMessage("插入成功");
            goodClazzMessage.setDatamessage(flag);
            goodClazzMessage.setCode(OBeanBase.TRUECODE);
        }else {
            goodClazzMessage.setMessage("插入失败");
            goodClazzMessage.setCode(OBeanBase.FALSECODE);
        }
        return goodClazzMessage;
    }

    @RequestMapping(value = "/updateByPrimaryKey",
            method = RequestMethod.PUT)
    @ResponseBody
    /**
    * @Program: GoodClazzController.java
    * @Method: updateByPrimaryKey
    * @Description: 更新小类别
    * @Author: Shiming Lee
    * @Create: 2018/6/3 9:56
    * @params: [goodClass]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase updateByPrimaryKey(@RequestBody GoodClass goodClass){
        int flag = 0;
        if (goodClass.getGoodclassid()!=null) {
            flag = goodClazzService.updateByPrimaryKeySelective(goodClass);
            goodClazzMessage.setMessage("更新成功");
            goodClazzMessage.setCode(OBeanBase.TRUECODE);
        }else {
            goodClazzMessage.setMessage("更新失败");
            goodClazzMessage.setCode(OBeanBase.FALSECODE);
        }
        goodClazzMessage.setDatamessage(flag);
        return goodClazzMessage;
    }

    @RequestMapping(value = "/deleteByPrimaryKey",
            method = RequestMethod.DELETE)
    @ResponseBody
    /**
    * @Program: GoodClazzController.java
    * @Method: deleteByPrimaryKey
    * @Description: 按照ID删除小类别
    * @Author: Shiming Lee
    * @Create: 2018/6/3 9:58
    * @params: [goodClassId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase deleteByPrimaryKey(@RequestParam(value = "goodClassId")int goodClassId){
        int flag = goodClazzService.deleteByPrimaryKey(goodClassId);
        if (flag>0){
            goodClazzMessage.setDatamessage(flag);
            goodClazzMessage.setMessage("删除成功");
            goodClazzMessage.setCode(OBeanBase.TRUECODE);
        }else {
            goodClazzMessage.setMessage("删除失败");
            goodClazzMessage.setCode(OBeanBase.FALSECODE);
        }
        return goodClazzMessage;
    }
}

