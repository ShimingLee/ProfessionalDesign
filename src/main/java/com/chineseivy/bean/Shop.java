package com.chineseivy.bean;

/**
 * Created by Shiming Lee on 2018/3/22
 * 卖家
 */
public class Shop {
    private int shopID;
    private String shopName;
    private String shopPassword;
    private String shopTel;
    private int star;
    private String shopAddress;
    private int shopState;

    public Shop() {
    }

    public Shop(int shopID, String shopName, String shopPassword, String shopTel, int star, String shopAddress, int shopState) {
        this.shopID = shopID;
        this.shopName = shopName;
        this.shopPassword = shopPassword;
        this.shopTel = shopTel;
        this.star = star;
        this.shopAddress = shopAddress;
        this.shopState = shopState;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPassword() {
        return shopPassword;
    }

    public void setShopPassword(String shopPassword) {
        this.shopPassword = shopPassword;
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getShopState() {
        return shopState;
    }

    public void setShopState(int shopState) {
        this.shopState = shopState;
    }
}
