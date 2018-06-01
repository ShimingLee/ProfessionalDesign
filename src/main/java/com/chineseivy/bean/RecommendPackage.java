package com.chineseivy.bean;

import java.util.Date;
import java.util.List;

public class RecommendPackage {
    private Integer recommendid;
    private Shop shop;
    private String recommendtheme;
    private String recommendtext;
    private Date recommendstarttime;
    private Date recommendendtime;
    private String recommendimg;
    private List<Good> goodList;

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    public Integer getRecommendid() {
        return recommendid;
    }
    public void setRecommendid(Integer recommendid) {
        this.recommendid = recommendid;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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