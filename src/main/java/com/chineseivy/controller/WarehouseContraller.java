package com.chineseivy.controller;

import com.chineseivy.bean.Warehouse;
import com.chineseivy.bean.WarehouseExample;
import com.chineseivy.bean.WarehouseKey;
import com.chineseivy.bean.WarehousePackage;
import com.chineseivy.service.WarehouseService;
import com.chineseivy.util.OBeanBase;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/4/18
 */

@Controller
@RequestMapping(value = "/warehouse")
public class WarehouseContraller {
    @Autowired
    @Qualifier("warehouseService")
    private WarehouseService warehouseService;
    private OBeanBase warehouseMessage = new OBeanBase();

    @RequestMapping(value = "/insertWarehouse",
            method = RequestMethod.POST)
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: insertWarehouse
     * @Description: 插入库存量信息
     * @Author: Shiming Lee
     * @Create: 2018/5/24 13:26
     * @params: [warehouse]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase insertWarehouse(@RequestBody Warehouse warehouse) {
        int flag = warehouseService.insertWarehouse(warehouse);
        if (flag>0){
            warehouseMessage.setMessage("插入成功");
            warehouseMessage.setDatamessage(flag);
            warehouseMessage.setClassName(this.getClass());
            warehouseMessage.setCode("10010");
        }else {
            warehouseMessage.setMessage("插入失败");
            warehouseMessage.setClassName(this.getClass());
        }
        return warehouseMessage;
    }

    @RequestMapping(value = "/deleteWarehouse",
            method = RequestMethod.DELETE)
    @ResponseBody
    public OBeanBase deleteWarehouse(@RequestBody WarehouseKey warehouseKey) {
        int flag = warehouseService.deleteWarehouse(warehouseKey);
        warehouseMessage.setDatamessage(flag);
        warehouseMessage.setMessage("删除成功");
        return warehouseMessage;
    }

    @RequestMapping(value = "/updateWarehouse",
            method = RequestMethod.PUT)
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: updateWarehouse
     * @Description: 更新库存量
     * @Author: Shiming Lee
     * @Create: 2018/5/24 15:28
     * @params: [warehouseId, warehouseExample]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase updateWarehouse(@RequestBody Warehouse warehouse) {
         int flag = warehouseService.updateWarehouse(warehouse);
         if (flag>0) {
             warehouseMessage.setMessage("更新成功");
             warehouseMessage.setDatamessage(flag);
             warehouseMessage.setClassName(this.getClass());
             warehouseMessage.setCode("10010");
         }else {
             warehouseMessage.setMessage("更新失败");
             warehouseMessage.setClassName(this.getClass());
         }
        return warehouseMessage;
    }

    @RequestMapping(value = "/selectAllWarehouse",
            method = RequestMethod.GET)
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: selectAllWarehouse
     * @Description: 查询所有库存信息
     * @Author: Shiming Lee
     * @Create: 2018/5/24 15:28
     * @params: []
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase selectAllWarehouse() {
        List<WarehousePackage> warehouseList = warehouseService.selectAllWarehouse();
        warehouseMessage.setCode("10010");
        warehouseMessage.setDatamessage(warehouseList);
        warehouseMessage.setMessage("查询成功");
        return warehouseMessage;
    }

    @RequestMapping(value = "/selectWarehouseByWarehouseId",
            method = RequestMethod.GET)
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: selectWarehouseByWarehouseId
     * @Description:
     * @Author: Shiming Lee
     * @Create: 2018/5/24 15:28
     * @params: [warehouseId]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase selectWarehouseByWarehouseId(@RequestBody WarehouseKey warehouseKey) {
        WarehousePackage warehouse = warehouseService.selectByPrimaryKey(warehouseKey);
        if (warehouse.getGood().getGoodname()!=null) {
            warehouseMessage.setMessage("查询成功");
            warehouseMessage.setClassName(this.getClass());
            warehouseMessage.setDatamessage(warehouse);
            warehouseMessage.setCode("10010");
        }else {
            warehouseMessage.setMessage("查询失败");
            warehouseMessage.setClassName(this.getClass());
        }
        return warehouseMessage;

    }
}
