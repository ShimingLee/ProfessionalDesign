package com.chineseivy.bean;

/**
 * Created by Shiming Lee on 2018/3/22
 * FK_销售报表与卖家关系
 */
public class FK_marketToShop {
    private int shopID;
    private int marketID;

    public FK_marketToShop() {
    }

    public FK_marketToShop(int shopID, int marketID) {
        this.shopID = shopID;
        this.marketID = marketID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getMarketID() {
        return marketID;
    }

    public void setMarketID(int marketID) {
        this.marketID = marketID;
    }
}
