package com.chineseivy.bean;

/**
 * created by tiankunping on 2018/3/22
 * 投诉
 */
public class Complain {//投诉模块通过外键连接，投诉的为店家或商品。
                       //管理员直接处理该模块
    private int complainID;
    private String complainReason;
    private String complainImage;//投诉图片可以为空
    private int complainState;

    public Complain() {
    }

    public Complain(int complainID, String complainReason, String complainImage, int complainState) {
        this.complainID = complainID;
        this.complainReason = complainReason;
        this.complainImage = complainImage;
        this.complainState = complainState;
    }

    public int getComplainID() {
        return complainID;
    }

    public void setComplainID(int complainID) {
        this.complainID = complainID;
    }

    public String getComplainReason() {
        return complainReason;
    }

    public void setComplainReason(String complainReason) {
        this.complainReason = complainReason;
    }

    public String getComplainImage() {
        return complainImage;
    }

    public void setComplainImage(String complainImage) {
        this.complainImage = complainImage;
    }

    public int getComplainState() {
        return complainState;
    }

    public void setComplainState(int complainState) {
        this.complainState = complainState;
    }
}
