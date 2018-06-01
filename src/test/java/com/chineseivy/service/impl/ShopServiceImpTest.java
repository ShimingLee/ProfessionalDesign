package com.chineseivy.service.impl;

import com.chineseivy.bean.Shop;
import com.chineseivy.dao.ShopMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class ShopServiceImpTest {

    @Autowired
    private ShopMapper shopMapper;
    @Test
    public void selectShopByPrimaryKey() {
        Shop shop = shopMapper.selectByPrimaryKey(1);
        System.out.println(shop.getShopname());
    }
}