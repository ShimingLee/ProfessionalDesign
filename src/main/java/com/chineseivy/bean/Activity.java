package com.chineseivy.bean;

import java.util.Date;

public class Activity {

    private Integer activityid;

    private Integer goodclassid;

    private String activitytheme;

    private String activitytext;

    private String activityimg;

    private Date activitystarttime;

    private Date activityendtime;

    private Double aim;

    private Double reduce;


    public Integer getActivityid() {
        return activityid;
    }


    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }


    public Integer getGoodclassid() {
        return goodclassid;
    }


    public void setGoodclassid(Integer goodclassid) {
        this.goodclassid = goodclassid;
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


    public Double getReduce() {
        return reduce;
    }


    public void setReduce(Double reduce) {
        this.reduce = reduce;
    }
}