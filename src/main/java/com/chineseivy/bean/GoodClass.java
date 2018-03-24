package com.chineseivy.bean;

/**
 * Created by Shiming Lee on 2018/3/22
 * 商品小类别
 */
public class GoodClass {
    private int goodClassID;
    private int categoriesID;
    private String goodClassName;

    public GoodClass() {
    }

    public GoodClass(int goodClassID, int categoriesID, String goodClassName) {
        this.goodClassID = goodClassID;
        this.categoriesID = categoriesID;
        this.goodClassName = goodClassName;
    }

    public int getGoodClassID() {
        return goodClassID;
    }

    public void setGoodClassID(int goodClassID) {
        this.goodClassID = goodClassID;
    }

    public int getCategoriesID() {
        return categoriesID;
    }

    public void setCategoriesID(int categoriesID) {
        this.categoriesID = categoriesID;
    }

    public String getGoodClassName() {
        return goodClassName;
    }

    public void setGoodClassName(String goodClassName) {
        this.goodClassName = goodClassName;
    }
}
