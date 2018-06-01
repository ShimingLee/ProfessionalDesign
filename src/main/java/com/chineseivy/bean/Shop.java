package com.chineseivy.bean;

import java.util.Date;

public class Shop {
    private Integer shopid;

    private String shopname;

    private String shoppassword;

    private String shoptel;

    private Integer shopstar;

    private String shopaddres;

    private Date registertime;

    private Integer shopstate;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }
    public String getShoppassword() {
        return shoppassword;
    }

    public void setShoppassword(String shoppassword) {
        this.shoppassword = shoppassword == null ? null : shoppassword.trim();
    }
    public String getShoptel() {
        return shoptel;
    }
    public void setShoptel(String shoptel) {
        this.shoptel = shoptel == null ? null : shoptel.trim();
    }

    public Integer getShopstar() {
        return shopstar;
    }

    public void setShopstar(Integer shopstar) {
        this.shopstar = shopstar;
    }

    public String getShopaddres() {
        return shopaddres;
    }

    public void setShopaddres(String shopaddres) {
        this.shopaddres = shopaddres == null ? null : shopaddres.trim();
    }
    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Integer getShopstate() {
        return shopstate;
    }

    public void setShopstate(Integer shopstate) {
        this.shopstate = shopstate;
    }
}