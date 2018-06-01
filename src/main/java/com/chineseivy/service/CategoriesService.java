package com.chineseivy.service;

import com.chineseivy.bean.Categories;

import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
public interface CategoriesService {

    int deleteByPrimaryKey(Integer categoriesid);

    int insertCategories(Categories record);

    Categories selectByPrimaryKey(Integer categoriesid);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKey(Categories record);

    List<Categories> selectAllCategories();
}
