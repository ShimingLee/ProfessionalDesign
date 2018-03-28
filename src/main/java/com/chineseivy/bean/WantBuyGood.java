package com.chineseivy.bean;

import java.util.Date;

/**
 * created by tiankunping on 2018/3/22
 * 订单商品
 * 相当于一个“预”订单，即在正式订单生成前的产物，订单商品序号与商品需要一致，没有自动增加这一项
 */
public class WantBuyGood {
    private int orderID;
    private int goodID;
    private int boughtNumber;
    private String boughtStandard;//购物过程中商品规格必须填写，且保存方式以数组方式储存，故采用Text类型
    private Date wantBuyTime;
    private int invalidationState;//订单失效状态默认值为“0”，即未失效，若超过两天则值改为“1”失效状态

    public WantBuyGood() {
    }

    public WantBuyGood(int orderID, int goodID, int boughtNumber, String boughtStandard, Date wantBuyTime, int invalidationState) {
        this.orderID = orderID;
        this.goodID = goodID;
        this.boughtNumber = boughtNumber;
        this.boughtStandard = boughtStandard;
        this.wantBuyTime = wantBuyTime;
        this.invalidationState = invalidationState;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public int getBoughtNumber() {
        return boughtNumber;
    }

    public void setBoughtNumber(int boughtNumber) {
        this.boughtNumber = boughtNumber;
    }

    public String getBoughtStandard() {
        return boughtStandard;
    }

    public void setBoughtStandard(String boughtStandard) {
        this.boughtStandard = boughtStandard;
    }

    public Date getWantBuyTime() {
        return wantBuyTime;
    }

    public void setWantBuyTime(Date wantBuyTime) {
        this.wantBuyTime = wantBuyTime;
    }

    public int getInvalidationState() {
        return invalidationState;
    }

    public void setInvalidationState(int invalidationState) {
        this.invalidationState = invalidationState;
    }
}
