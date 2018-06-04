package com.chineseivy.controller;

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
//配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
@WebAppConfiguration
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
    }

    @Test
    public void selectAllWarehouse() {
        List<WarehousePackage> warehouseList = warehouseService.selectAllWarehouse();
        System.out.println(warehouseList);
    }

    @Test
    public void selectWarehouseByWarehouseId() {
        WarehouseKey warehouseKey = new WarehouseKey();
        warehouseKey.setGoodid(1);
        WarehousePackage warehouse = warehouseService.selectByPrimaryKey(warehouseKey);
        System.out.println(warehouse.getGood().getGoodid());
        System.out.println(warehouse.getSupplynumber());
    }
}