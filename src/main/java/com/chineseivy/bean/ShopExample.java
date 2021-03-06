package com.chineseivy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public ShopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShoppasswordIsNull() {
            addCriterion("shopPassword is null");
            return (Criteria) this;
        }

        public Criteria andShoppasswordIsNotNull() {
            addCriterion("shopPassword is not null");
            return (Criteria) this;
        }

        public Criteria andShoppasswordEqualTo(String value) {
            addCriterion("shopPassword =", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordNotEqualTo(String value) {
            addCriterion("shopPassword <>", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordGreaterThan(String value) {
            addCriterion("shopPassword >", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("shopPassword >=", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordLessThan(String value) {
            addCriterion("shopPassword <", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordLessThanOrEqualTo(String value) {
            addCriterion("shopPassword <=", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordLike(String value) {
            addCriterion("shopPassword like", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordNotLike(String value) {
            addCriterion("shopPassword not like", value, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordIn(List<String> values) {
            addCriterion("shopPassword in", values, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordNotIn(List<String> values) {
            addCriterion("shopPassword not in", values, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordBetween(String value1, String value2) {
            addCriterion("shopPassword between", value1, value2, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoppasswordNotBetween(String value1, String value2) {
            addCriterion("shopPassword not between", value1, value2, "shoppassword");
            return (Criteria) this;
        }

        public Criteria andShoptelIsNull() {
            addCriterion("shopTel is null");
            return (Criteria) this;
        }

        public Criteria andShoptelIsNotNull() {
            addCriterion("shopTel is not null");
            return (Criteria) this;
        }

        public Criteria andShoptelEqualTo(String value) {
            addCriterion("shopTel =", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelNotEqualTo(String value) {
            addCriterion("shopTel <>", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelGreaterThan(String value) {
            addCriterion("shopTel >", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelGreaterThanOrEqualTo(String value) {
            addCriterion("shopTel >=", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelLessThan(String value) {
            addCriterion("shopTel <", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelLessThanOrEqualTo(String value) {
            addCriterion("shopTel <=", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelLike(String value) {
            addCriterion("shopTel like", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelNotLike(String value) {
            addCriterion("shopTel not like", value, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelIn(List<String> values) {
            addCriterion("shopTel in", values, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelNotIn(List<String> values) {
            addCriterion("shopTel not in", values, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelBetween(String value1, String value2) {
            addCriterion("shopTel between", value1, value2, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShoptelNotBetween(String value1, String value2) {
            addCriterion("shopTel not between", value1, value2, "shoptel");
            return (Criteria) this;
        }

        public Criteria andShopstarIsNull() {
            addCriterion("shopStar is null");
            return (Criteria) this;
        }

        public Criteria andShopstarIsNotNull() {
            addCriterion("shopStar is not null");
            return (Criteria) this;
        }

        public Criteria andShopstarEqualTo(Integer value) {
            addCriterion("shopStar =", value, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarNotEqualTo(Integer value) {
            addCriterion("shopStar <>", value, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarGreaterThan(Integer value) {
            addCriterion("shopStar >", value, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopStar >=", value, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarLessThan(Integer value) {
            addCriterion("shopStar <", value, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarLessThanOrEqualTo(Integer value) {
            addCriterion("shopStar <=", value, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarIn(List<Integer> values) {
            addCriterion("shopStar in", values, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarNotIn(List<Integer> values) {
            addCriterion("shopStar not in", values, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarBetween(Integer value1, Integer value2) {
            addCriterion("shopStar between", value1, value2, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopstarNotBetween(Integer value1, Integer value2) {
            addCriterion("shopStar not between", value1, value2, "shopstar");
            return (Criteria) this;
        }

        public Criteria andShopaddresIsNull() {
            addCriterion("shopAddres is null");
            return (Criteria) this;
        }

        public Criteria andShopaddresIsNotNull() {
            addCriterion("shopAddres is not null");
            return (Criteria) this;
        }

        public Criteria andShopaddresEqualTo(String value) {
            addCriterion("shopAddres =", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresNotEqualTo(String value) {
            addCriterion("shopAddres <>", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresGreaterThan(String value) {
            addCriterion("shopAddres >", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresGreaterThanOrEqualTo(String value) {
            addCriterion("shopAddres >=", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresLessThan(String value) {
            addCriterion("shopAddres <", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresLessThanOrEqualTo(String value) {
            addCriterion("shopAddres <=", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresLike(String value) {
            addCriterion("shopAddres like", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresNotLike(String value) {
            addCriterion("shopAddres not like", value, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresIn(List<String> values) {
            addCriterion("shopAddres in", values, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresNotIn(List<String> values) {
            addCriterion("shopAddres not in", values, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresBetween(String value1, String value2) {
            addCriterion("shopAddres between", value1, value2, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andShopaddresNotBetween(String value1, String value2) {
            addCriterion("shopAddres not between", value1, value2, "shopaddres");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andShopstateIsNull() {
            addCriterion("shopState is null");
            return (Criteria) this;
        }

        public Criteria andShopstateIsNotNull() {
            addCriterion("shopState is not null");
            return (Criteria) this;
        }

        public Criteria andShopstateEqualTo(Integer value) {
            addCriterion("shopState =", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateNotEqualTo(Integer value) {
            addCriterion("shopState <>", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateGreaterThan(Integer value) {
            addCriterion("shopState >", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopState >=", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateLessThan(Integer value) {
            addCriterion("shopState <", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateLessThanOrEqualTo(Integer value) {
            addCriterion("shopState <=", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateIn(List<Integer> values) {
            addCriterion("shopState in", values, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateNotIn(List<Integer> values) {
            addCriterion("shopState not in", values, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateBetween(Integer value1, Integer value2) {
            addCriterion("shopState between", value1, value2, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateNotBetween(Integer value1, Integer value2) {
            addCriterion("shopState not between", value1, value2, "shopstate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_shop
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}