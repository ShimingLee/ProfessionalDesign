package com.chineseivy.bean;

import java.util.Date;

public class Warehouse  {
    private Integer goodid;
    private Integer shopid;
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

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }
}