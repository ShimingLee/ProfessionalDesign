package com.chineseivy.controller;

import com.chineseivy.bean.Categories;
import com.chineseivy.service.CategoriesService;
import com.chineseivy.util.OBeanBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
@Controller
@RequestMapping(value = "/categories")
public class CategoriesController {
    @Autowired
    @Qualifier(value = "categoriesService")
    private CategoriesService categoriesService;
    private OBeanBase categoriesMessage = new OBeanBase();

    @RequestMapping(value = "/selectAllCategories",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: CategoriesController.java
    * @Method: selectAllCategories
    * @Description: 查询所有大分类
    * @Author: Shiming Lee
    * @Create: 2018/6/3 11:05
    * @params: []
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase selectAllCategories(){
        List<Categories> categoriesList = categoriesService.selectAllCategories();
        if (categoriesList.isEmpty()){
            categoriesMessage.setMessage("查询失败");
            categoriesMessage.setCode(OBeanBase.FALSECODE);
        }else {
            categoriesMessage.setCode(OBeanBase.TRUECODE);
            categoriesMessage.setMessage("查询成功");
            categoriesMessage.setDatamessage(categoriesList);
        }
        return categoriesMessage;
    }

    @RequestMapping(value = "/selectCategoriesByPrimary",
            method = RequestMethod.GET)
    @ResponseBody
    /**
    * @Program: CategoriesController.java
    * @Method: selectCategoriesByPrimary
    * @Description: 根据ID查询分类
    * @Author: Shiming Lee
    * @Create: 2018/6/3 11:05
    * @params: [categoriesId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase selectCategoriesByPrimary(@RequestParam(value = "categoriesId")int categoriesId){
        Categories categories = categoriesService.selectByPrimaryKey(categoriesId);
        if(categories.getCategoriesid()!=null) {
            categoriesMessage.setDatamessage(categories);
            categoriesMessage.setCode(OBeanBase.TRUECODE);
            categoriesMessage.setMessage("查询成功");
        }else {
            categoriesMessage.setMessage("查询失败");
            categoriesMessage.setCode(OBeanBase.FALSECODE);
        }
        return categoriesMessage;
    }

    @RequestMapping(value = "/updateCategoriesByPrimary",
            method = RequestMethod.PUT,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: CategoriesController.java
    * @Method: updateCategoriesByPrimary
    * @Description: 根据ID更新分类
    * @Author: Shiming Lee
    * @Create: 2018/6/3 11:06
    * @params: [categories]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase updateCategoriesByPrimary(@RequestBody Categories categories){
        int flag = 0;
        if (categories.getCategoriesid()!=null) {
            flag = categoriesService.updateByPrimaryKeySelective(categories);
            if(flag>0) {
                categoriesMessage.setMessage("更新成功");
                categoriesMessage.setDatamessage(flag);
                categoriesMessage.setCode(OBeanBase.TRUECODE);
            }else {
                categoriesMessage.setMessage("更新失败");
                categoriesMessage.setCode(OBeanBase.FALSECODE);
            }
        }else {
            categoriesMessage.setMessage("缺少ID");
            categoriesMessage.setCode(OBeanBase.CHECKFALSECODE);
        }
        return categoriesMessage;
    }

    @RequestMapping(value = "/deleteCategoriesByPrimary",
            method = RequestMethod.DELETE)
    @ResponseBody
    /**
    * @Program: CategoriesController.java
    * @Method: deleteCategoriesByPrimary
    * @Description: 根据ID删除分类
    * @Author: Shiming Lee
    * @Create: 2018/6/3 11:06
    * @params: [categoriesId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase deleteCategoriesByPrimary(@RequestParam(value = "categoriesId")int categoriesId){
        int flag = categoriesService.deleteByPrimaryKey(categoriesId);
        if(flag>0) {
            categoriesMessage.setMessage("删除成功");
            categoriesMessage.setDatamessage(flag);
            categoriesMessage.setCode(OBeanBase.TRUECODE);
        }else {
            categoriesMessage.setMessage("删除失败");
            categoriesMessage.setCode(OBeanBase.FALSECODE);
        }
        return categoriesMessage;
    }
}
