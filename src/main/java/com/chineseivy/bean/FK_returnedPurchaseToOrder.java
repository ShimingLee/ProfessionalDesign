package com.chineseivy.bean;

/**
 * created by tiankunping on 2018/3/22
 * 退货与订单关系
 */
public class FK_returnedPurchaseToOrder {
    private int returnedPurchaseID;
    private int orderID;

    public FK_returnedPurchaseToOrder() {
    }

    public FK_returnedPurchaseToOrder(int returnedPurchaseID, int orderID) {
        this.returnedPurchaseID = returnedPurchaseID;
        this.orderID = orderID;
    }

    public int getReturnedPurchaseID() {
        return returnedPurchaseID;
    }

    public void setReturnedPurchaseID(int returnedPurchaseID) {
        this.returnedPurchaseID = returnedPurchaseID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
