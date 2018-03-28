package com.chineseivy.bean;

import java.util.Date;

/**
 * created by tiankunping on 2018/3/22
 * 订单
 */
public class Order {
    private int orderID;
    private int customerID;
    private Date orderTime;
    private int paidState;//付款状态“0”为未付款，“1”为已付款
    private int useCardState;//优惠券默认为未使用状态即“0”，使用状态为“1”

    public Order() {
    }

    public Order(int orderID, int customerID, Date orderTime, int paidState, int useCardState) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderTime = orderTime;
        this.paidState = paidState;
        this.useCardState = useCardState;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getPaidState() {
        return paidState;
    }

    public void setPaidState(int paidState) {
        this.paidState = paidState;
    }

    public int getUseCardState() {
        return useCardState;
    }

    public void setUseCardState(int useCardState) {
        this.useCardState = useCardState;
    }
}
