package com.chineseivy.bean;

public class ShoppingCart extends ShoppingCartKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shoppingCart.chooseStandard
     *
     * @mbg.generated
     */
    private String choosestandard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shoppingCart.chooseGoodNumber
     *
     * @mbg.generated
     */
    private Integer choosegoodnumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shoppingCart.chooseStandard
     *
     * @return the value of t_shoppingCart.chooseStandard
     *
     * @mbg.generated
     */
    public String getChoosestandard() {
        return choosestandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shoppingCart.chooseStandard
     *
     * @param choosestandard the value for t_shoppingCart.chooseStandard
     *
     * @mbg.generated
     */
    public void setChoosestandard(String choosestandard) {
        this.choosestandard = choosestandard == null ? null : choosestandard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shoppingCart.chooseGoodNumber
     *
     * @return the value of t_shoppingCart.chooseGoodNumber
     *
     * @mbg.generated
     */
    public Integer getChoosegoodnumber() {
        return choosegoodnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shoppingCart.chooseGoodNumber
     *
     * @param choosegoodnumber the value for t_shoppingCart.chooseGoodNumber
     *
     * @mbg.generated
     */
    public void setChoosegoodnumber(Integer choosegoodnumber) {
        this.choosegoodnumber = choosegoodnumber;
    }
}