package com.chineseivy.controller;

import com.chineseivy.bean.GoodPackage;
import com.chineseivy.service.GoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/30
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
//配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
@WebAppConfiguration
public class GoodControllerTest {
    @Autowired
    private GoodService goodService;

    @Test
    public void insertPicture() {

    }

    @Test
    public void updateGoodMessage() {
    }

    @Test
    public void insertGoodMessage() {
    }

    @Test
    public void findGoodMessageByGoodKey() {
    }

    @Test
    public void findAllGoodMessage() {
        List<GoodPackage> goodPackageList = goodService.selectAllGood();
        System.out.println(goodPackageList.size());
    }

    @Test
    public void deleteGoodMessageByGoodKey() {
    }
}