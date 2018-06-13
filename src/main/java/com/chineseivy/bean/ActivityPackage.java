package com.chineseivy.bean;

import java.util.Date;

import java.util.Date;
import java.util.List;

public class ActivityPackage {
    private Integer activityid;
    private String activitytheme;
    private String activitytext;
    private String activityimg;
    private Date activitystarttime;
    private Date activityendtime;
    private Double aim;
    private List<GoodPackage> goods;
    private String formatactivitystarttime;
    private String formatactivityendtime;

    public String getFormatactivitystarttime() {
        return formatactivitystarttime;
    }

    public void setFormatactivitystarttime(String formatactivitystarttime) {
        this.formatactivitystarttime = formatactivitystarttime;
    }

    public String getFormatactivityendtime() {
        return formatactivityendtime;
    }

    public void setFormatactivityendtime(String formatactivityendtime) {
        this.formatactivityendtime = formatactivityendtime;
    }

    public List<GoodPackage> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodPackage> goods) {
        this.goods = goods;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getActivitytheme() {
        return activitytheme;
    }

    public void setActivitytheme(String activitytheme) {
        this.activitytheme = activitytheme == null ? null : activitytheme.trim();
    }

    public String getActivitytext() {
        return activitytext;
    }

    public void setActivitytext(String activitytext) {
        this.activitytext = activitytext == null ? null : activitytext.trim();
    }

    public String getActivityimg() {
        return activityimg;
    }

    public void setActivityimg(String activityimg) {
        this.activityimg = activityimg == null ? null : activityimg.trim();
    }

    public Date getActivitystarttime() {
        return activitystarttime;
    }

    public void setActivitystarttime(Date activitystarttime) {
        this.activitystarttime = activitystarttime;
    }

    public Date getActivityendtime() {
        return activityendtime;
    }

    public void setActivityendtime(Date activityendtime) {
        this.activityendtime = activityendtime;
    }

    public Double getAim() {
        return aim;
    }

    public void setAim(Double aim) {
        this.aim = aim;
    }

}