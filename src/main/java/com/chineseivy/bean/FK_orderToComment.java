package com.chineseivy.bean;

/**
 * created by tiankunping on 2018/3/22
 * 订单与评价关系
 */
public class FK_orderToComment {
    private int comentID;
    private int orderID;

    public FK_orderToComment() {
    }
    public FK_orderToComment(int comentID, int orderID) {
        this.comentID = comentID;
        this.orderID = orderID;
    }

    public int getComentID() {
        return comentID;
    }

    public void setComentID(int comentID) {
        this.comentID = comentID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
