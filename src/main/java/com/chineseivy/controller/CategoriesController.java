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
            method = RequestMethod.GET)
    @ResponseBody
    public OBeanBase selectAllCategories(){
        List<Categories> categoriesList = categoriesService.selectAllCategories();
        categoriesMessage.setDatamessage(categoriesList);
        return categoriesMessage;
    }

    @RequestMapping(value = "/selectCategoriesByPrimary",
            method = RequestMethod.GET)
    @ResponseBody
    public OBeanBase selectCategoriesByPrimary(@RequestParam(value = "categoriesId")int categoriesId){
        Categories categories = categoriesService.selectByPrimaryKey(categoriesId);
        categoriesMessage.setDatamessage(categories);
        return categoriesMessage;
    }

    @RequestMapping(value = "/updateCategoriesByPrimary",
            method = RequestMethod.PUT)
    @ResponseBody
    public OBeanBase updateCategoriesByPrimary(@RequestBody Categories categories){
        int flag = categoriesService.updateByPrimaryKeySelective(categories);
        if(flag>0) {
            categoriesMessage.setMessage("更新成功");
            categoriesMessage.setDatamessage(flag);
        }else {
            categoriesMessage.setMessage("更新失败");
        }
        return categoriesMessage;
    }
    @RequestMapping(value = "/deleteCategoriesByPrimary",
            method = RequestMethod.DELETE)
    @ResponseBody
    public OBeanBase deleteCategoriesByPrimary(@RequestParam(value = "categoriesId")int categoriesId){
        int flag = categoriesService.deleteByPrimaryKey(categoriesId);
        if(flag>0) {
            categoriesMessage.setMessage("更新成功");
            categoriesMessage.setDatamessage(flag);
        }else {
            categoriesMessage.setMessage("更新失败");
        }
        return categoriesMessage;
    }
}
