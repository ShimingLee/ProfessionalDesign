package com.chineseivy.bean;

import java.util.Date;

public class Recommend {
    private Integer recommendid;
    private Integer shopid;
    private String recommendtheme;
    private String recommendtext;
    private Date recommendstarttime;
    private Date recommendendtime;
    private String recommendimg;
    public Integer getRecommendid() {
        return recommendid;
    }
    public void setRecommendid(Integer recommendid) {
        this.recommendid = recommendid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getRecommendtheme() {
        return recommendtheme;
    }

    public void setRecommendtheme(String recommendtheme) {
        this.recommendtheme = recommendtheme == null ? null : recommendtheme.trim();
    }
    public String getRecommendtext() {
        return recommendtext;
    }
    public void setRecommendtext(String recommendtext) {
        this.recommendtext = recommendtext == null ? null : recommendtext.trim();
    }
    public Date getRecommendstarttime() {
        return recommendstarttime;
    }

    public void setRecommendstarttime(Date recommendstarttime) {
        this.recommendstarttime = recommendstarttime;
    }

    public Date getRecommendendtime() {
        return recommendendtime;
    }

    public void setRecommendendtime(Date recommendendtime) {
        this.recommendendtime = recommendendtime;
    }

    public String getRecommendimg() {
        return recommendimg;
    }

    public void setRecommendimg(String recommendimg) {
        this.recommendimg = recommendimg == null ? null : recommendimg.trim();
    }
}