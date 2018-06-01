package com.chineseivy.service.impl;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.dao.GoodMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/27
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class GoodServiceImpTest {
    @Autowired
    private GoodMapper goodMapper;
    @Test
    public void selectAllGood() {
        List<GoodPackage> goodPackageList= goodMapper.selectAllGoods();
        System.out.println(goodPackageList.size());

    }

    @Test
    public void selectGoodByPrimaryKey() {
        GoodPackage goodPackage = goodMapper.selectByPrimaryKey(5);
        System.out.println(goodPackage.getGoodname());
    }

    @Test
    public void insertGood() {
        Good good = new Good();
        good.setPicture("r24gf34t");
        good.setGoodname("鞋");
        good.setPrice(474.3);
        good.setGoodstate(0);
        int flag = goodMapper.insertSelective(good);
        System.out.println(flag);
    }

    @Test
    public void updateGood() {
        Good good = new Good();
        good.setGoodid(2);
        good.setGoodstate(1);
        good.setGoodname("cjien");
        int flag = goodMapper.updateByPrimaryKeySelective(good);
        System.out.println("更新行数："+flag);
    }

    @Test
    public void deleteGoodByPrimaryKey() {
        int flag = goodMapper.deleteByPrimaryKey(2);
        System.out.println("删除行数："+flag);
    }

    @Test
    public void selectGoodByGoodState() {
        List<GoodPackage> goodPackageList = goodMapper.selectByGoodState(1);
        System.out.println("goodPackage大小：" + goodPackageList.size());
    }
}