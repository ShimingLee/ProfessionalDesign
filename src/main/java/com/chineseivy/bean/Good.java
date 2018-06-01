package com.chineseivy.bean;

import javax.persistence.criteria.CriteriaBuilder;

public class Good {

    private Integer goodid;

    private Integer shopid;

    private Integer recommendid;

    private Double recommendprice;

    private String goodname;

    private Double oldprice;

    private Double price;

    private Integer activityid;

    private Integer goodclassid;

    private Double activityprice;

    private String picture;

    private String standard;

    private Integer goodstate;

    private Integer activtiystate;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Double getRecommendprice() {
        return recommendprice;
    }

    public void setRecommendprice(Double recommendprice) {
        this.recommendprice = recommendprice;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getActivityprice() {
        return activityprice;
    }

    public void setActivityprice(Double activityprice) {
        this.activityprice = activityprice;
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

    public Integer getActivtiystate() {
        return activtiystate;
    }

    public void setActivtiystate(Integer activtiystate) {
        this.activtiystate = activtiystate;
    }

    public Integer getRecommendid() {
        return recommendid;
    }

    public void setRecommendid(Integer recommendid) {
        this.recommendid = recommendid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getGoodClassid() {
        return goodclassid;
    }

    public void setGoodClassid(Integer goodClassid) {
        this.goodclassid = goodclassid;
    }


    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }
}