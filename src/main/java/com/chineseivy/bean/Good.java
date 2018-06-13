package com.chineseivy.bean;

import javax.persistence.criteria.CriteriaBuilder;

public class Good {

    private Integer goodid;

    private Integer shopid;

    private Integer recommendstate;

    private String goodname;

    private Double price;

    private Integer activityid;

    private Integer goodclassid;

    private String picture;

    private String standard;

    private Integer goodstate;


    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
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

    public Integer getRecommendstate() {
        return recommendstate;
    }

    public void setRecommendstate(Integer recommendstate) {
        this.recommendstate = recommendstate;
    }

    public Integer getGoodclassid() {
        return goodclassid;
    }

    public void setGoodclassid(Integer goodclassid) {
        this.goodclassid = goodclassid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }
}