package com.chineseivy.bean;

import java.io.Serializable;

/**
 * Created by Shiming Lee on 2018/3/22
 * 商品大类别
 */
public class Categories implements Serializable {
    private int categoriesID;
    private String categoriesName;

    public Categories() {
    }

    public Categories(int categoriesID, String categoriesName) {
        this.categoriesID = categoriesID;
        this.categoriesName = categoriesName;
    }

    public int getCategoriesID() {
        return categoriesID;
    }

    public void setCategoriesID(int categoriesID) {
        this.categoriesID = categoriesID;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }
}
