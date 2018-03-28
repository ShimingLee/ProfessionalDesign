package com.chineseivy.bean;

/**
 * created by tiankunping on 2018/3/22
 * 优惠券
 */
public class Card {
    private int cardID;
    private String cardName;
    private String cardText;
    private float cardPrice;
    private int cardState;//优惠券状态为是否处于正常开放状态，默认为“1”，如果管理员设置为取消该优惠券则默认值为“0”
    private int effectiveDate;//有效期为“0”时表示永久有效

    public Card(int cardID, String cardName, String cardText, float cardPrice, int cardState, int effectiveDate) {
        this.cardID = cardID;
        this.cardName = cardName;
        this.cardText = cardText;
        this.cardPrice = cardPrice;
        this.cardState = cardState;
        this.effectiveDate = effectiveDate;
    }

    public Card() {
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public float getCardPrice() {
        return cardPrice;
    }

    public void setCardPrice(float cardPrice) {
        this.cardPrice = cardPrice;
    }

    public int getCardState() {
        return cardState;
    }

    public void setCardState(int cardState) {
        this.cardState = cardState;
    }

    public int getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(int effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
