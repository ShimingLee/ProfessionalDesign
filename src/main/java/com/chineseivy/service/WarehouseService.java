package com.chineseivy.service;

import com.chineseivy.bean.Warehouse;
import com.chineseivy.bean.WarehouseExample;
import com.chineseivy.bean.WarehouseKey;
import com.chineseivy.bean.WarehousePackage;

import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
public interface WarehouseService {
    /**
    * @Program: WarehouseService.java
    * @Method:
    * @Description: 插入库存量
    * @Author: Shiming Lee
    * @Create: 2018/5/24 12:56
    * @params:
    * @returns:
    **/
    int insertWarehouse(Warehouse warehouse);
    /**
    * @Program: WarehouseService.java
    * @Method:
    * @Description: 删除库存信息
    * @Author: Shiming Lee
    * @Create: 2018/5/24 12:58
    * @params:
    * @returns:
    **/
    int deleteWarehouse(WarehouseKey warehouseKey);
    /**
    * @Program: WarehouseService.java
    * @Method:
    * @Description: 更新库存信息
    * @Author: Shiming Lee
    * @Create: 2018/5/24 13:03
    * @params:
    * @returns:
    **/
    int updateWarehouse(Warehouse warehouse);
    /**
    * @Program: WarehouseService.java
    * @Method:
    * @Description: 查找库存量所有信息
    * @Author: Shiming Lee
    * @Create: 2018/5/24 13:04
    * @params:
    * @returns:
    **/
    List<WarehousePackage> selectAllWarehouse();
    /**
    * @Program: WarehouseService.java
    * @Method:
    * @Description: 通过主键查找库存量信息
    * @Author: Shiming Lee
    * @Create: 2018/5/24 13:04
    * @params:
    * @returns:
    **/
    WarehousePackage selectByPrimaryKey(WarehouseKey warehouseKey);
}
