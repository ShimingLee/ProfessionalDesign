package com.chineseivy.bean;

/**
 * Created by Shiming Lee on 2018/3/22
 */

public class ShoppingCart {
    private int shoppingCartID;
    private int goodID;
    private int customerID;
    private int goodNumber;

    public ShoppingCart() {}

    public ShoppingCart(int shoppingCartID, int goodID, int customerID, int goodNumber) {
        this.shoppingCartID = shoppingCartID;
        this.goodID = goodID;
        this.customerID = customerID;
        this.goodNumber = goodNumber;
    }

    public int getShoppingCartID() {
        return shoppingCartID;
    }

    public void setShoppingCartID(int shoppingCartID) {
        this.shoppingCartID = shoppingCartID;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(int goodNumber) {
        this.goodNumber = goodNumber;
    }
}
