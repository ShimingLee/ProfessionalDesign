package com.chineseivy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class WarehousePackage {
    private Good good;
    private Shop shop;
    private Date supplytime;
    private Integer supplynumber;
    private Integer warenumber;
    private String formatsupplytime;

    public String getFormatsupplytime() {
        return formatsupplytime;
    }

    public void setFormatsupplytime(String formatsupplytime) {
        this.formatsupplytime = formatsupplytime;
    }

    public Good getGood() {
        return good;
    }
    public void setGood(Good good) {
        this.good = good;
    }
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

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
}