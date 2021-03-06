package com.chineseivy.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodClassExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public GoodClassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
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
     * This method corresponds to the database table t_goodClass
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
     * This method corresponds to the database table t_goodClass
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goodClass
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
     * This class corresponds to the database table t_goodClass
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

        public Criteria andGoodclassidIsNull() {
            addCriterion("goodClassId is null");
            return (Criteria) this;
        }

        public Criteria andGoodclassidIsNotNull() {
            addCriterion("goodClassId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodclassidEqualTo(Integer value) {
            addCriterion("goodClassId =", value, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidNotEqualTo(Integer value) {
            addCriterion("goodClassId <>", value, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidGreaterThan(Integer value) {
            addCriterion("goodClassId >", value, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodClassId >=", value, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidLessThan(Integer value) {
            addCriterion("goodClassId <", value, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidLessThanOrEqualTo(Integer value) {
            addCriterion("goodClassId <=", value, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidIn(List<Integer> values) {
            addCriterion("goodClassId in", values, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidNotIn(List<Integer> values) {
            addCriterion("goodClassId not in", values, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidBetween(Integer value1, Integer value2) {
            addCriterion("goodClassId between", value1, value2, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andGoodclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodClassId not between", value1, value2, "goodclassid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidIsNull() {
            addCriterion("categoriesId is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesidIsNotNull() {
            addCriterion("categoriesId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesidEqualTo(Integer value) {
            addCriterion("categoriesId =", value, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidNotEqualTo(Integer value) {
            addCriterion("categoriesId <>", value, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidGreaterThan(Integer value) {
            addCriterion("categoriesId >", value, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoriesId >=", value, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidLessThan(Integer value) {
            addCriterion("categoriesId <", value, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidLessThanOrEqualTo(Integer value) {
            addCriterion("categoriesId <=", value, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidIn(List<Integer> values) {
            addCriterion("categoriesId in", values, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidNotIn(List<Integer> values) {
            addCriterion("categoriesId not in", values, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidBetween(Integer value1, Integer value2) {
            addCriterion("categoriesId between", value1, value2, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andCategoriesidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoriesId not between", value1, value2, "categoriesid");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameIsNull() {
            addCriterion("goodClassName is null");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameIsNotNull() {
            addCriterion("goodClassName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameEqualTo(String value) {
            addCriterion("goodClassName =", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameNotEqualTo(String value) {
            addCriterion("goodClassName <>", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameGreaterThan(String value) {
            addCriterion("goodClassName >", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodClassName >=", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameLessThan(String value) {
            addCriterion("goodClassName <", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameLessThanOrEqualTo(String value) {
            addCriterion("goodClassName <=", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameLike(String value) {
            addCriterion("goodClassName like", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameNotLike(String value) {
            addCriterion("goodClassName not like", value, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameIn(List<String> values) {
            addCriterion("goodClassName in", values, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameNotIn(List<String> values) {
            addCriterion("goodClassName not in", values, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameBetween(String value1, String value2) {
            addCriterion("goodClassName between", value1, value2, "goodclassname");
            return (Criteria) this;
        }

        public Criteria andGoodclassnameNotBetween(String value1, String value2) {
            addCriterion("goodClassName not between", value1, value2, "goodclassname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_goodClass
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
     * This class corresponds to the database table t_goodClass
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