package com.chineseivy.bean;

/**
 * created by tiankunping on 2018/3/22
 * 物流状态（发货状态）
 */
public class LogisticsState {
    private int shopID;
    private int orderID;
    private int logisticsState;//物流状态默认情况为“0”，即未发货，“1”为已发货，“2”为已到货，“3”为已收货

    public LogisticsState() {
    }

    public LogisticsState(int shopID, int orderID, int logisticsState) {
        this.shopID = shopID;
        this.orderID = orderID;
        this.logisticsState = logisticsState;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getLogisticsState() {
        return logisticsState;
    }

    public void setLogisticsState(int logisticsState) {
        this.logisticsState = logisticsState;
    }
}
