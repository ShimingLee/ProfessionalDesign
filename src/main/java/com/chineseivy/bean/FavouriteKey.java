package com.chineseivy.bean;

public class FavouriteKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_favourite.customerId
     *
     * @mbg.generated
     */
    private Integer customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_favourite.goodId
     *
     * @mbg.generated
     */
    private Integer goodid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_favourite.customerId
     *
     * @return the value of t_favourite.customerId
     *
     * @mbg.generated
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_favourite.customerId
     *
     * @param customerid the value for t_favourite.customerId
     *
     * @mbg.generated
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_favourite.goodId
     *
     * @return the value of t_favourite.goodId
     *
     * @mbg.generated
     */
    public Integer getGoodid() {
        return goodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_favourite.goodId
     *
     * @param goodid the value for t_favourite.goodId
     *
     * @mbg.generated
     */
    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }
}