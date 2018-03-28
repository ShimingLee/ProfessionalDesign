package com.chineseivy.bean;

import java.util.Date;

/**
 * created by tiankunping on 2018/3/22
 * 订单优惠券买家关系
 */
public class FK_orderCardCustome {
    private int orderCardUserID;
    private int cardID;
    private int customerID;
    private int orderID;
    private int totalCardNumber;
    private int usedNumber;//优惠券已使用数量默认为“0”
    private Date userdTime;//使用时间为购买时使用时间，未使用时可以为空
                           //当未使用优惠券时，使用时间可以不填

    public FK_orderCardCustome(int orderCardUserID, int cardID, int customerID, int orderID, int totalCardNumber, int usedNumber, Date userdTime) {
        this.orderCardUserID = orderCardUserID;
        this.cardID = cardID;
        this.customerID = customerID;
        this.orderID = orderID;
        this.totalCardNumber = totalCardNumber;
        this.usedNumber = usedNumber;
        this.userdTime = userdTime;
    }

    public FK_orderCardCustome() {
    }

    public int getOrderCardUserID() {
        return orderCardUserID;
    }

    public void setOrderCardUserID(int orderCardUserID) {
        this.orderCardUserID = orderCardUserID;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getTotalCardNumber() {
        return totalCardNumber;
    }

    public void setTotalCardNumber(int totalCardNumber) {
        this.totalCardNumber = totalCardNumber;
    }

    public int getUsedNumber() {
        return usedNumber;
    }

    public void setUsedNumber(int usedNumber) {
        this.usedNumber = usedNumber;
    }

    public Date getUserdTime() {
        return userdTime;
    }

    public void setUserdTime(Date userdTime) {
        this.userdTime = userdTime;
    }
}
