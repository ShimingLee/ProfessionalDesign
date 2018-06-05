package com.chineseivy.controller;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.bean.Warehouse;
import com.chineseivy.service.GoodService;
import com.chineseivy.service.WarehouseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/30
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class GoodControllerTest {
    @Autowired
    private GoodService goodService;
    @Autowired
    private WarehouseService warehouseService;

    @Test
    public void insertPicture() {

    }

    @Test
    public void updateGoodMessage() {
        Good good = new Good();
        good.setGoodid(5);
        good.setGoodname("jfdkjfie");
        goodService.updateGood(good);
    }

    @Test
    public void insertGoodMessage() {
        Good good = new Good();
        good.setGoodname("lsm");
        good.setPrice(30.1);
        int flag = goodService.insertGood(good);
        int goodId = goodService.maxId();
        int shopId = goodService.selectShopId(goodId);
        Warehouse warehouse = new Warehouse();
        warehouse.setGoodid(goodId);
        warehouse.setShopid(shopId);
        warehouse.setSupplytime(new Date());
        warehouseService.insertWarehouse(warehouse);
        System.out.println("-------------"+flag+"-----goodId"+goodId+"-----shopId"+shopId);

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