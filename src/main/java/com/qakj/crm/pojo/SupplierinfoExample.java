package com.qakj.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupplierinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierinfoExample() {
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

        public Criteria andSuppNumberIsNull() {
            addCriterion("supp_number is null");
            return (Criteria) this;
        }

        public Criteria andSuppNumberIsNotNull() {
            addCriterion("supp_number is not null");
            return (Criteria) this;
        }

        public Criteria andSuppNumberEqualTo(String value) {
            addCriterion("supp_number =", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberNotEqualTo(String value) {
            addCriterion("supp_number <>", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberGreaterThan(String value) {
            addCriterion("supp_number >", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberGreaterThanOrEqualTo(String value) {
            addCriterion("supp_number >=", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberLessThan(String value) {
            addCriterion("supp_number <", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberLessThanOrEqualTo(String value) {
            addCriterion("supp_number <=", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberLike(String value) {
            addCriterion("supp_number like", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberNotLike(String value) {
            addCriterion("supp_number not like", value, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberIn(List<String> values) {
            addCriterion("supp_number in", values, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberNotIn(List<String> values) {
            addCriterion("supp_number not in", values, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberBetween(String value1, String value2) {
            addCriterion("supp_number between", value1, value2, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNumberNotBetween(String value1, String value2) {
            addCriterion("supp_number not between", value1, value2, "suppNumber");
            return (Criteria) this;
        }

        public Criteria andSuppNameIsNull() {
            addCriterion("supp_name is null");
            return (Criteria) this;
        }

        public Criteria andSuppNameIsNotNull() {
            addCriterion("supp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuppNameEqualTo(String value) {
            addCriterion("supp_name =", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotEqualTo(String value) {
            addCriterion("supp_name <>", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameGreaterThan(String value) {
            addCriterion("supp_name >", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameGreaterThanOrEqualTo(String value) {
            addCriterion("supp_name >=", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameLessThan(String value) {
            addCriterion("supp_name <", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameLessThanOrEqualTo(String value) {
            addCriterion("supp_name <=", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameLike(String value) {
            addCriterion("supp_name like", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotLike(String value) {
            addCriterion("supp_name not like", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameIn(List<String> values) {
            addCriterion("supp_name in", values, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotIn(List<String> values) {
            addCriterion("supp_name not in", values, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameBetween(String value1, String value2) {
            addCriterion("supp_name between", value1, value2, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotBetween(String value1, String value2) {
            addCriterion("supp_name not between", value1, value2, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIsNull() {
            addCriterion("supp_phone is null");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIsNotNull() {
            addCriterion("supp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneEqualTo(String value) {
            addCriterion("supp_phone =", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotEqualTo(String value) {
            addCriterion("supp_phone <>", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneGreaterThan(String value) {
            addCriterion("supp_phone >", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supp_phone >=", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLessThan(String value) {
            addCriterion("supp_phone <", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLessThanOrEqualTo(String value) {
            addCriterion("supp_phone <=", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLike(String value) {
            addCriterion("supp_phone like", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotLike(String value) {
            addCriterion("supp_phone not like", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIn(List<String> values) {
            addCriterion("supp_phone in", values, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotIn(List<String> values) {
            addCriterion("supp_phone not in", values, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneBetween(String value1, String value2) {
            addCriterion("supp_phone between", value1, value2, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotBetween(String value1, String value2) {
            addCriterion("supp_phone not between", value1, value2, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppAddressIsNull() {
            addCriterion("supp_address is null");
            return (Criteria) this;
        }

        public Criteria andSuppAddressIsNotNull() {
            addCriterion("supp_address is not null");
            return (Criteria) this;
        }

        public Criteria andSuppAddressEqualTo(String value) {
            addCriterion("supp_address =", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotEqualTo(String value) {
            addCriterion("supp_address <>", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressGreaterThan(String value) {
            addCriterion("supp_address >", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressGreaterThanOrEqualTo(String value) {
            addCriterion("supp_address >=", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressLessThan(String value) {
            addCriterion("supp_address <", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressLessThanOrEqualTo(String value) {
            addCriterion("supp_address <=", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressLike(String value) {
            addCriterion("supp_address like", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotLike(String value) {
            addCriterion("supp_address not like", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressIn(List<String> values) {
            addCriterion("supp_address in", values, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotIn(List<String> values) {
            addCriterion("supp_address not in", values, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressBetween(String value1, String value2) {
            addCriterion("supp_address between", value1, value2, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotBetween(String value1, String value2) {
            addCriterion("supp_address not between", value1, value2, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppCreditIsNull() {
            addCriterion("supp_credit is null");
            return (Criteria) this;
        }

        public Criteria andSuppCreditIsNotNull() {
            addCriterion("supp_credit is not null");
            return (Criteria) this;
        }

        public Criteria andSuppCreditEqualTo(Integer value) {
            addCriterion("supp_credit =", value, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditNotEqualTo(Integer value) {
            addCriterion("supp_credit <>", value, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditGreaterThan(Integer value) {
            addCriterion("supp_credit >", value, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("supp_credit >=", value, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditLessThan(Integer value) {
            addCriterion("supp_credit <", value, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditLessThanOrEqualTo(Integer value) {
            addCriterion("supp_credit <=", value, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditIn(List<Integer> values) {
            addCriterion("supp_credit in", values, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditNotIn(List<Integer> values) {
            addCriterion("supp_credit not in", values, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditBetween(Integer value1, Integer value2) {
            addCriterion("supp_credit between", value1, value2, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("supp_credit not between", value1, value2, "suppCredit");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberIsNull() {
            addCriterion("supplies_number is null");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberIsNotNull() {
            addCriterion("supplies_number is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberEqualTo(String value) {
            addCriterion("supplies_number =", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberNotEqualTo(String value) {
            addCriterion("supplies_number <>", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberGreaterThan(String value) {
            addCriterion("supplies_number >", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("supplies_number >=", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberLessThan(String value) {
            addCriterion("supplies_number <", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberLessThanOrEqualTo(String value) {
            addCriterion("supplies_number <=", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberLike(String value) {
            addCriterion("supplies_number like", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberNotLike(String value) {
            addCriterion("supplies_number not like", value, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberIn(List<String> values) {
            addCriterion("supplies_number in", values, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberNotIn(List<String> values) {
            addCriterion("supplies_number not in", values, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberBetween(String value1, String value2) {
            addCriterion("supplies_number between", value1, value2, "suppliesNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliesNumberNotBetween(String value1, String value2) {
            addCriterion("supplies_number not between", value1, value2, "suppliesNumber");
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