package com.chineseivy.bean;

/**
 * created by tiankunping on 2018/3/22
 *订单与投诉关系
 */
public class FK_orderToComplain {
    private int complainID;
    private int orderID;

    public FK_orderToComplain() {
    }

    public FK_orderToComplain(int complainID, int orderID) {
        this.complainID = complainID;
        this.orderID = orderID;
    }

    public int getComplainID() {
        return complainID;
    }

    public void setComplainID(int complainID) {
        this.complainID = complainID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
