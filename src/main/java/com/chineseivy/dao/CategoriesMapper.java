package com.chineseivy.dao;

import com.chineseivy.bean.Categories;
import com.chineseivy.bean.CategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoriesMapper {

    int deleteByPrimaryKey(Integer categoriesid);

    int insertSelective(Categories record);

    Categories selectByPrimaryKey(Integer categoriesid);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKey(Categories record);

    List<Categories> selectAllCategories();
}