package com.chineseivy.bean;

import java.io.Serializable;

/**
 * Created by Shiming Lee on 2018/3/22
 * 付款方式
 */
public class paidWay implements Serializable {
    private int paidWayID;
    private String paidWayName;

    public paidWay() {
    }

    public paidWay(int paidWayID, String paidWayName) {
        this.paidWayID = paidWayID;
        this.paidWayName = paidWayName;
    }

    public int getPaidWayID() {
        return paidWayID;
    }

    public void setPaidWayID(int paidWayID) {
        this.paidWayID = paidWayID;
    }

    public String getPaidWayName() {
        return paidWayName;
    }

    public void setPaidWayName(String paidWayName) {
        this.paidWayName = paidWayName;
    }
}