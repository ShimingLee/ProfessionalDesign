package com.chineseivy.bean;

public class GoodClassPackage {
    private Integer goodclassid;
    private Categories categories;
    private String goodclassname;
    public Integer getGoodclassid() {
        return goodclassid;
    }
    public void setGoodclassid(Integer goodclassid) {
        this.goodclassid = goodclassid;
    }
    public Categories getCategories() {
        return categories;
    }
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public String getGoodclassname() {
        return goodclassname;
    }
    public void setGoodclassname(String goodclassname) {
        this.goodclassname = goodclassname == null ? null : goodclassname.trim();
    }
}