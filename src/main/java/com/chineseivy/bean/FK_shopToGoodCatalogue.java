package com.chineseivy.bean;

/**
 * Created by Shiming Lee on 2018/3/22
 */
public class FK_shopToGoodCatalogue {
    private int categoriesID;
    private int shopID;

    public FK_shopToGoodCatalogue() {
    }

    public FK_shopToGoodCatalogue(int categoriesID, int shopID) {
        this.categoriesID = categoriesID;
        this.shopID = shopID;
    }

    public int getCategoriesID() {
        return categoriesID;
    }

    public void setCategoriesID(int categoriesID) {
        this.categoriesID = categoriesID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }
}
