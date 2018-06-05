package com.chineseivy.service.impl;

import com.chineseivy.bean.Warehouse;
import com.chineseivy.bean.WarehouseExample;
import com.chineseivy.bean.WarehouseKey;
import com.chineseivy.bean.WarehousePackage;
import com.chineseivy.dao.WarehouseMapper;
import com.chineseivy.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2018/5/12
 */
@Service("warehouseService")
public class WarehouseServiceImp implements WarehouseService {

    @Autowired
    private WarehouseMapper warehouseMapper;

    public int insertWarehouse(Warehouse warehouse) {
        int flag = warehouseMapper.insertSelective(warehouse);
        return flag;
    }

    public int deleteWarehouse(WarehouseKey warehouseKey) {
        int flag = warehouseMapper.deleteByPrimaryKey(warehouseKey);
        return flag;
    }

    public int updateWarehouse(Warehouse warehouse) {
        int goodId = warehouse.getGoodid();
        WarehouseKey warehouseKey = new WarehouseKey();
        warehouseKey.setGoodid(goodId);
        WarehousePackage warehouseOld = warehouseMapper.selectByPrimaryKey(warehouseKey);
        int wareNumber = warehouseOld.getWarenumber();
        int addware = warehouse.getSupplynumber();
        warehouse.setWarenumber(wareNumber+addware);
        warehouse.setSupplytime(new Date());
        int flag = warehouseMapper.updateByPrimaryKeySelective(warehouse);
        return flag;
    }

    public List<WarehousePackage> selectAllWarehouse() {
        List<WarehousePackage> warehouseList = warehouseMapper.selectAllWarehouse();
        return warehouseList;
    }

    public WarehousePackage selectByPrimaryKey(WarehouseKey warehouseKey) {
        WarehousePackage warehouse = warehouseMapper.selectByPrimaryKey(warehouseKey);
        return warehouse;
    }
}
