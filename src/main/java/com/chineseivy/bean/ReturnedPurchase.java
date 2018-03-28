package com.chineseivy.bean;

import java.util.Date;

/**
 * created by tiankunping on 2018/3/22
 * 售后及退货
 */
public class ReturnedPurchase {
    private int returnedPurchaseID;
    private String returnReason;
    private Date returnTime;
    private int afterSaleAndReturnedState;

    public ReturnedPurchase(int returnedPurchaseID, String returnReason, Date returnTime, int afterSaleAndReturnedState) {
        this.returnedPurchaseID = returnedPurchaseID;
        this.returnReason = returnReason;
        this.returnTime = returnTime;
        this.afterSaleAndReturnedState = afterSaleAndReturnedState;
    }

    public ReturnedPurchase() {
    }

    public int getReturnedPurchaseID() {
        return returnedPurchaseID;
    }

    public void setReturnedPurchaseID(int returnedPurchaseID) {
        this.returnedPurchaseID = returnedPurchaseID;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public int getAfterSaleAndReturnedState() {
        return afterSaleAndReturnedState;
    }

    public void setAfterSaleAndReturnedState(int afterSaleAndReturnedState) {
        this.afterSaleAndReturnedState = afterSaleAndReturnedState;
    }
}
