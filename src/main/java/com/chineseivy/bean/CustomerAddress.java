package com.chineseivy.bean;

import java.io.Serializable;

/**
 * Created by Shiming Lee on 2018/3/22
 * 买家地址
 */
public class CustomerAddress implements Serializable {
    private int customerAddressID;
    private int customerID;
    private String customerAddress;
    //默认地址标记
    private int defaultAddress;
}
