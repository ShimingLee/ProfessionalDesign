package com.chineseivy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Shiming Lee on 2018/3/22
 * 销售报表
 */
public class market implements Serializable {
    private int marketID;
    private long totalSaleVolume;
    //营业额
    private long totalTurnover;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date marketTime;
    private String shopCatagory;
    private int percentage;
    private String advice;

    public market() {
    }

    public market(int marketID, long totalSaleVolume, long totalTurnover, Date marketTime, String shopCatagory, int percentage, String advice) {
        this.marketID = marketID;
        this.totalSaleVolume = totalSaleVolume;
        this.totalTurnover = totalTurnover;
        this.marketTime = marketTime;
        this.shopCatagory = shopCatagory;
        this.percentage = percentage;
        this.advice = advice;
    }

    public int getMarketID() {
        return marketID;
    }

    public void setMarketID(int marketID) {
        this.marketID = marketID;
    }

    public long getTotalSaleVolume() {
        return totalSaleVolume;
    }

    public void setTotalSaleVolume(long totalSaleVolume) {
        this.totalSaleVolume = totalSaleVolume;
    }

    public long getTotalTurnover() {
        return totalTurnover;
    }

    public void setTotalTurnover(long totalTurnover) {
        this.totalTurnover = totalTurnover;
    }

    public Date getMarketTime() {
        return marketTime;
    }

    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }

    public String getShopCatagory() {
        return shopCatagory;
    }

    public void setShopCatagory(String shopCatagory) {
        this.shopCatagory = shopCatagory;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}

