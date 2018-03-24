package com.chineseivy.bean;

import java.io.Serializable;

/**
 * Created by Shiming Lee on 2018/3/22
 */
public class FK_shopToGood implements Serializable {
    private int goodID;
    private int shopID;

    public FK_shopToGood() {
    }

    public FK_shopToGood(int goodID, int shopID) {
        this.goodID = goodID;
        this.shopID = shopID;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }
}
