package com.chineseivy.controller;

import com.chineseivy.bean.Warehouse;
import com.chineseivy.bean.WarehouseKey;
import com.chineseivy.bean.WarehousePackage;
import com.chineseivy.service.WarehouseService;
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
 * Created by admin on 2018/6/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})

public class WarehouseContrallerTest {

    @Autowired
    private WarehouseService warehouseService;
    @Test
    public void insertWarehouse() {

    }

    @Test
    public void deleteWarehouse() {
    }

    @Test
    public void updateWarehouse() {
        Warehouse warehouse = new Warehouse();
        warehouse.setShopid(1);
        warehouse.setGoodid(49);
        warehouse.setSupplynumber(18);
        System.out.println(warehouseService.updateWarehouse(warehouse));
    }

    @Test
    public void selectAllWarehouse() {
        List<WarehousePackage> warehouseList = warehouseService.selectAllWarehouse();
        for (WarehousePackage warehouse:warehouseList) {
            System.out.println(warehouse.getFormatsupplytime());
        }
    }

    @Test
    public void selectWarehouseByWarehouseId() {
        WarehousePackage warehouse = warehouseService.selectByPrimaryKey(1);
        System.out.println(warehouse.getGood().getGoodid());
        System.out.println(warehouse.getSupplynumber());
    }
}