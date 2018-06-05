package com.chineseivy.bean;

public class GoodPackage {

    private Integer goodid;

    private Shop shop;

    private int recommendstate;

    private Activity activity;

    private GoodClass goodClass;

    private int goodclassid;

    private String goodname;

    private Double price;

    private String picture;

    private String standard;

    private Integer goodstate;


    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public int getGoodclassid() {
        return goodclassid;
    }

    public void setGoodclassid(int goodclassid) {
        this.goodclassid = goodclassid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public Integer getGoodstate() {
        return goodstate;
    }

    public void setGoodstate(Integer goodstate) {
        this.goodstate = goodstate;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public int getRecommendstate() {
        return recommendstate;
    }

    public void setRecommendstate(int recommendstate) {
        this.recommendstate = recommendstate;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public GoodClass getGoodClass() {
        return goodClass;
    }

    public void setGoodClass(GoodClass goodClass) {
        this.goodClass = goodClass;
    }
}