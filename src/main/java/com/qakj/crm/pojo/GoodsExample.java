package com.qakj.crm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(String value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(String value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(String value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(String value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(String value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLike(String value) {
            addCriterion("goods_number like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotLike(String value) {
            addCriterion("goods_number not like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<String> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<String> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(String value1, String value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(String value1, String value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Integer value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Integer value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Integer value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Integer value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Integer> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Integer> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameIsNull() {
            addCriterion("goods_suppName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameIsNotNull() {
            addCriterion("goods_suppName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameEqualTo(String value) {
            addCriterion("goods_suppName =", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameNotEqualTo(String value) {
            addCriterion("goods_suppName <>", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameGreaterThan(String value) {
            addCriterion("goods_suppName >", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_suppName >=", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameLessThan(String value) {
            addCriterion("goods_suppName <", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameLessThanOrEqualTo(String value) {
            addCriterion("goods_suppName <=", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameLike(String value) {
            addCriterion("goods_suppName like", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameNotLike(String value) {
            addCriterion("goods_suppName not like", value, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameIn(List<String> values) {
            addCriterion("goods_suppName in", values, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameNotIn(List<String> values) {
            addCriterion("goods_suppName not in", values, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameBetween(String value1, String value2) {
            addCriterion("goods_suppName between", value1, value2, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppnameNotBetween(String value1, String value2) {
            addCriterion("goods_suppName not between", value1, value2, "goodsSuppname");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressIsNull() {
            addCriterion("goods_address is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressIsNotNull() {
            addCriterion("goods_address is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressEqualTo(String value) {
            addCriterion("goods_address =", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressNotEqualTo(String value) {
            addCriterion("goods_address <>", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressGreaterThan(String value) {
            addCriterion("goods_address >", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("goods_address >=", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressLessThan(String value) {
            addCriterion("goods_address <", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressLessThanOrEqualTo(String value) {
            addCriterion("goods_address <=", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressLike(String value) {
            addCriterion("goods_address like", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressNotLike(String value) {
            addCriterion("goods_address not like", value, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressIn(List<String> values) {
            addCriterion("goods_address in", values, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressNotIn(List<String> values) {
            addCriterion("goods_address not in", values, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressBetween(String value1, String value2) {
            addCriterion("goods_address between", value1, value2, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsAddressNotBetween(String value1, String value2) {
            addCriterion("goods_address not between", value1, value2, "goodsAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIsNull() {
            addCriterion("goods_date is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIsNotNull() {
            addCriterion("goods_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDateEqualTo(Date value) {
            addCriterionForJDBCDate("goods_date =", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("goods_date <>", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("goods_date >", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_date >=", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateLessThan(Date value) {
            addCriterionForJDBCDate("goods_date <", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_date <=", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIn(List<Date> values) {
            addCriterionForJDBCDate("goods_date in", values, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("goods_date not in", values, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_date between", value1, value2, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_date not between", value1, value2, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberIsNull() {
            addCriterion("goods_supperNumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberIsNotNull() {
            addCriterion("goods_supperNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberEqualTo(String value) {
            addCriterion("goods_supperNumber =", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberNotEqualTo(String value) {
            addCriterion("goods_supperNumber <>", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberGreaterThan(String value) {
            addCriterion("goods_supperNumber >", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberGreaterThanOrEqualTo(String value) {
            addCriterion("goods_supperNumber >=", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberLessThan(String value) {
            addCriterion("goods_supperNumber <", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberLessThanOrEqualTo(String value) {
            addCriterion("goods_supperNumber <=", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberLike(String value) {
            addCriterion("goods_supperNumber like", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberNotLike(String value) {
            addCriterion("goods_supperNumber not like", value, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberIn(List<String> values) {
            addCriterion("goods_supperNumber in", values, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberNotIn(List<String> values) {
            addCriterion("goods_supperNumber not in", values, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberBetween(String value1, String value2) {
            addCriterion("goods_supperNumber between", value1, value2, "goodsSuppernumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSuppernumberNotBetween(String value1, String value2) {
            addCriterion("goods_supperNumber not between", value1, value2, "goodsSuppernumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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