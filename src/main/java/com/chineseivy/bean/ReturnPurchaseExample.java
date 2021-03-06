package com.chineseivy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnPurchaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public ReturnPurchaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
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
     * This method corresponds to the database table t_returnedPurchase
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
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
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
     * This class corresponds to the database table t_returnedPurchase
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

        public Criteria andReturnidIsNull() {
            addCriterion("returnId is null");
            return (Criteria) this;
        }

        public Criteria andReturnidIsNotNull() {
            addCriterion("returnId is not null");
            return (Criteria) this;
        }

        public Criteria andReturnidEqualTo(Integer value) {
            addCriterion("returnId =", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotEqualTo(Integer value) {
            addCriterion("returnId <>", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidGreaterThan(Integer value) {
            addCriterion("returnId >", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnId >=", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLessThan(Integer value) {
            addCriterion("returnId <", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLessThanOrEqualTo(Integer value) {
            addCriterion("returnId <=", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidIn(List<Integer> values) {
            addCriterion("returnId in", values, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotIn(List<Integer> values) {
            addCriterion("returnId not in", values, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidBetween(Integer value1, Integer value2) {
            addCriterion("returnId between", value1, value2, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotBetween(Integer value1, Integer value2) {
            addCriterion("returnId not between", value1, value2, "returnid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andReturnreasonIsNull() {
            addCriterion("returnReason is null");
            return (Criteria) this;
        }

        public Criteria andReturnreasonIsNotNull() {
            addCriterion("returnReason is not null");
            return (Criteria) this;
        }

        public Criteria andReturnreasonEqualTo(String value) {
            addCriterion("returnReason =", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonNotEqualTo(String value) {
            addCriterion("returnReason <>", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonGreaterThan(String value) {
            addCriterion("returnReason >", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonGreaterThanOrEqualTo(String value) {
            addCriterion("returnReason >=", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonLessThan(String value) {
            addCriterion("returnReason <", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonLessThanOrEqualTo(String value) {
            addCriterion("returnReason <=", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonLike(String value) {
            addCriterion("returnReason like", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonNotLike(String value) {
            addCriterion("returnReason not like", value, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonIn(List<String> values) {
            addCriterion("returnReason in", values, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonNotIn(List<String> values) {
            addCriterion("returnReason not in", values, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonBetween(String value1, String value2) {
            addCriterion("returnReason between", value1, value2, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnreasonNotBetween(String value1, String value2) {
            addCriterion("returnReason not between", value1, value2, "returnreason");
            return (Criteria) this;
        }

        public Criteria andReturnimgIsNull() {
            addCriterion("returnImg is null");
            return (Criteria) this;
        }

        public Criteria andReturnimgIsNotNull() {
            addCriterion("returnImg is not null");
            return (Criteria) this;
        }

        public Criteria andReturnimgEqualTo(String value) {
            addCriterion("returnImg =", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgNotEqualTo(String value) {
            addCriterion("returnImg <>", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgGreaterThan(String value) {
            addCriterion("returnImg >", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgGreaterThanOrEqualTo(String value) {
            addCriterion("returnImg >=", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgLessThan(String value) {
            addCriterion("returnImg <", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgLessThanOrEqualTo(String value) {
            addCriterion("returnImg <=", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgLike(String value) {
            addCriterion("returnImg like", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgNotLike(String value) {
            addCriterion("returnImg not like", value, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgIn(List<String> values) {
            addCriterion("returnImg in", values, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgNotIn(List<String> values) {
            addCriterion("returnImg not in", values, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgBetween(String value1, String value2) {
            addCriterion("returnImg between", value1, value2, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturnimgNotBetween(String value1, String value2) {
            addCriterion("returnImg not between", value1, value2, "returnimg");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("returnTime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("returnTime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterion("returnTime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterion("returnTime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterion("returnTime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("returnTime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterion("returnTime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterion("returnTime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterion("returnTime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterion("returnTime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterion("returnTime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterion("returnTime not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturnreplyIsNull() {
            addCriterion("returnReply is null");
            return (Criteria) this;
        }

        public Criteria andReturnreplyIsNotNull() {
            addCriterion("returnReply is not null");
            return (Criteria) this;
        }

        public Criteria andReturnreplyEqualTo(String value) {
            addCriterion("returnReply =", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyNotEqualTo(String value) {
            addCriterion("returnReply <>", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyGreaterThan(String value) {
            addCriterion("returnReply >", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyGreaterThanOrEqualTo(String value) {
            addCriterion("returnReply >=", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyLessThan(String value) {
            addCriterion("returnReply <", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyLessThanOrEqualTo(String value) {
            addCriterion("returnReply <=", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyLike(String value) {
            addCriterion("returnReply like", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyNotLike(String value) {
            addCriterion("returnReply not like", value, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyIn(List<String> values) {
            addCriterion("returnReply in", values, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyNotIn(List<String> values) {
            addCriterion("returnReply not in", values, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyBetween(String value1, String value2) {
            addCriterion("returnReply between", value1, value2, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReturnreplyNotBetween(String value1, String value2) {
            addCriterion("returnReply not between", value1, value2, "returnreply");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("replyTime is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("replyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(Date value) {
            addCriterion("replyTime =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(Date value) {
            addCriterion("replyTime <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(Date value) {
            addCriterion("replyTime >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("replyTime >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(Date value) {
            addCriterion("replyTime <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(Date value) {
            addCriterion("replyTime <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<Date> values) {
            addCriterion("replyTime in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<Date> values) {
            addCriterion("replyTime not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(Date value1, Date value2) {
            addCriterion("replyTime between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(Date value1, Date value2) {
            addCriterion("replyTime not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateIsNull() {
            addCriterion("afterSaleAndReturnedState is null");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateIsNotNull() {
            addCriterion("afterSaleAndReturnedState is not null");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateEqualTo(Integer value) {
            addCriterion("afterSaleAndReturnedState =", value, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateNotEqualTo(Integer value) {
            addCriterion("afterSaleAndReturnedState <>", value, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateGreaterThan(Integer value) {
            addCriterion("afterSaleAndReturnedState >", value, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterSaleAndReturnedState >=", value, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateLessThan(Integer value) {
            addCriterion("afterSaleAndReturnedState <", value, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateLessThanOrEqualTo(Integer value) {
            addCriterion("afterSaleAndReturnedState <=", value, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateIn(List<Integer> values) {
            addCriterion("afterSaleAndReturnedState in", values, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateNotIn(List<Integer> values) {
            addCriterion("afterSaleAndReturnedState not in", values, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateBetween(Integer value1, Integer value2) {
            addCriterion("afterSaleAndReturnedState between", value1, value2, "aftersaleandreturnedstate");
            return (Criteria) this;
        }

        public Criteria andAftersaleandreturnedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("afterSaleAndReturnedState not between", value1, value2, "aftersaleandreturnedstate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_returnedPurchase
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
     * This class corresponds to the database table t_returnedPurchase
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