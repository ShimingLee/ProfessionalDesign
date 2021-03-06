package com.chineseivy.controller;

import com.chineseivy.bean.*;
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
import java.text.SimpleDateFormat;
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
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: insertWarehouse
     * @Description: 插入库存信息
     * @Author: Shiming Lee
     * @Create: 2018/5/24 13:26
     * @params: [warehouse]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase insertWarehouse(@RequestBody Warehouse warehouse) {
        if(warehouse.getGoodid()!=null&&warehouse.getShopid()!=null){
            if (warehouseService.selectByPrimaryKey(warehouse.getGoodid())!=null){
                warehouseMessage.setMessage("添加失败");
                warehouseMessage.setDatamessage("已有该商品信息");
            }else {
                int flag = warehouseService.insertWarehouse(warehouse);
                if (flag>0){
                    warehouseMessage.setMessage("插入成功");
                    warehouseMessage.setDatamessage(flag);
                    warehouseMessage.setClassName(this.getClass().getName());
                    warehouseMessage.setCode(OBeanBase.TRUECODE);
                }else {
                    warehouseMessage.setMessage("插入失败");
                    warehouseMessage.setDatamessage("插入失败");
                    warehouseMessage.setClassName(this.getClass().getName());
                    warehouseMessage.setCode(OBeanBase.FALSECODE);
                }
            }
        }else{
            warehouseMessage.setDatamessage("ID值未携带完全");
            warehouseMessage.setMessage("验证问题");
            warehouseMessage.setCode(OBeanBase.CHECKFALSECODE);
        }
        return warehouseMessage;
    }

    @RequestMapping(value = "/deleteWarehouse",
            method = RequestMethod.DELETE,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public OBeanBase deleteWarehouse(@RequestBody WarehouseKey warehouseKey) {
        int flag = warehouseService.deleteWarehouse(warehouseKey);
        warehouseMessage.setDatamessage(flag);
        warehouseMessage.setMessage("删除成功");
        return warehouseMessage;
    }

    @RequestMapping(value = "/updateWarehouse",
            method = RequestMethod.PUT,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: updateWarehouse
     * @Description: 更新库存信息
     * @Author: Shiming Lee
     * @Create: 2018/5/24 15:28
     * @params: [warehouse]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase updateWarehouse(@RequestBody Warehouse warehouse) {
        System.out.println("warehouse.goodId"+warehouse.getGoodid());
        if (warehouse.getGoodid()!=null) {
            int flag = warehouseService.updateWarehouse(warehouse);
            if (flag > 0) {
                warehouseMessage.setMessage("更新成功");
                warehouseMessage.setDatamessage(flag);
                warehouseMessage.setClassName(this.getClass());
                warehouseMessage.setCode("10010");
            } else {
                warehouseMessage.setMessage("更新失败");
                warehouseMessage.setClassName(this.getClass());
            }
        }else{
            warehouseMessage.setCode(OBeanBase.CHECKFALSECODE);
            warehouseMessage.setMessage("未携带goodID");
        }
        return warehouseMessage;
    }

    @RequestMapping(value = "/selectAllWarehouse",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
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
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
     * @Program: WarehouseController.java
     * @Method: selectWarehouseByWarehouseId
     * @Description: 按仓库ID查询仓库信息
     * @Author: Shiming Lee
     * @Create: 2018/5/24 15:28
     * @params: [goodId]
     * @returns: com.chineseivy.util.OBeanBase
     **/
    public OBeanBase selectWarehouseByWarehouseId(@RequestParam int goodId) {
        WarehousePackage warehouse = warehouseService.selectByPrimaryKey(goodId);
        if (warehouse.getGood().getGoodname()!=null) {
            warehouseMessage.setMessage("查询成功");
            warehouseMessage.setClassName(this.getClass().getName());
            warehouseMessage.setDatamessage(warehouse);
            warehouseMessage.setCode("10010");
        }else {
            warehouseMessage.setMessage("查询失败");
            warehouseMessage.setClassName(this.getClass().getName());
        }
        return warehouseMessage;

    }
}
