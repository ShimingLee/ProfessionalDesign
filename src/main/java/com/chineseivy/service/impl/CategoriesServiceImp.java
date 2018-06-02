package com.chineseivy.service.impl;/**
 * Created by admin on 2018/5/31
 */

import com.chineseivy.bean.Categories;
import com.chineseivy.dao.CategoriesMapper;
import com.chineseivy.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ProfessionalDesign
 * @description: 大类别
 * @author: Shiming Lee
 * @create: 2018-05-31 14:57
 **/
@Service("categoriesService")
public class CategoriesServiceImp implements CategoriesService {

    private CategoriesMapper categoriesMapper;

    public int deleteByPrimaryKey(Integer categoriesid) {
        int flag = categoriesMapper.deleteByPrimaryKey(categoriesid);
        return flag;
    }

    public int insertCategories(Categories record) {
        int flag = categoriesMapper.insertSelective(record);
        return flag;
    }

    public Categories selectByPrimaryKey(Integer categoriesid) {
        Categories categories = categoriesMapper.selectByPrimaryKey(categoriesid);
        return categories;
    }

    public int updateByPrimaryKeySelective(Categories record) {
        int flag = categoriesMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    public int updateByPrimaryKey(Categories record) {
        int flag = categoriesMapper.updateByPrimaryKey(record);
        return flag;
    }

    public List<Categories> selectAllCategories() {
        List<Categories> categoriesList = categoriesMapper.selectAllCategories();
        return categoriesList;
    }
}

