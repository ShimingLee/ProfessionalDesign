package com.chineseivy.bean;

import java.util.Date;

public class Warehouse extends WarehouseKey {
    private Date supplytime;
    private Integer supplynumber;

    private Integer warenumber;

    public Date getSupplytime() {
        return supplytime;
    }

    public void setSupplytime(Date supplytime) {
        this.supplytime = supplytime;
    }

    public Integer getSupplynumber() {
        return supplynumber;
    }

    public void setSupplynumber(Integer supplynumber) {
        this.supplynumber = supplynumber;
    }

    public Integer getWarenumber() {
        return warenumber;
    }

    public void setWarenumber(Integer warenumber) {
        this.warenumber = warenumber;
    }

    @Override
    public Integer getGoodid() {
        return super.getGoodid();
    }

    @Override
    public void setGoodid(Integer goodid) {
        super.setGoodid(goodid);
    }

    @Override
    public Integer getShopid() {
        return super.getShopid();
    }

    @Override
    public void setShopid(Integer shopid) {
        super.setShopid(shopid);
    }
}