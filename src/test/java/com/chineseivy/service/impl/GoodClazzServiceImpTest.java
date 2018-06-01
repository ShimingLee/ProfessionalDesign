package com.chineseivy.service.impl;

import com.chineseivy.bean.GoodClassPackage;
import com.chineseivy.dao.GoodClassMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class GoodClazzServiceImpTest {

    @Autowired
    private GoodClassMapper goodClassMapper;

    @Test
    public void selectGoodClazzByPrimaryKey() {
       GoodClassPackage goodClassPackage = goodClassMapper.selectByPrimaryKey(1);
       System.out.println(goodClassPackage.getCategories().getCategoriesname());
    }
}