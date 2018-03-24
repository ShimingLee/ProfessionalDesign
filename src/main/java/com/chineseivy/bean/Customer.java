
package com.chineseivy.bean;

import java.io.Serializable;

/**
 * Created by Shiming Lee on 2018/3/22
 */
public class Customer implements Serializable {

    private int customerID;
    private String customerName;
    private String customerPassword;
    private String customerTel;
    //该账户是否出现违规使得管理员注销或用户直接注销情况
    private int customerState;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String customerPassword, String customerTel, int customerState) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerTel = customerTel;
        this.customerState = customerState;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public int getCustomerState() {
        return customerState;
    }

    public void setCustomerState(int customerState) {
        this.customerState = customerState;
    }
}
