package com.chineseivy.dao;

import com.chineseivy.bean.GoodClassPackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class GoodClassMapperTest {


    @Test
    public void selectByPrimaryKey() {
    }
}