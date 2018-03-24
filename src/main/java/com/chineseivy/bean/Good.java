package com.chineseivy.bean;

/**
 * Created by Shiming Lee on 2018/3/22
 */
public class Good {
    private int goodID;
    private int categoriesID;
    private String goodName;
    private float oldPrice;
    private float activityPrice;
    //现价
    private float price;
    //图片用String存放地址
    private String picture;
    //商品规格使用数组形式存放
    private String[] standard;
    //商品是否下架
    private int goodState;
    //商品是否参加活动即是否存在活动价
    private int activityState;
}
