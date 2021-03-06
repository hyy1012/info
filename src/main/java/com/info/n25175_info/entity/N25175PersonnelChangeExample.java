package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class N25175PersonnelChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175PersonnelChangeExample() {
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

        public Criteria andPcIdIsNull() {
            addCriterion("pc_id is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("pc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(Integer value) {
            addCriterion("pc_id =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(Integer value) {
            addCriterion("pc_id <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(Integer value) {
            addCriterion("pc_id >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_id >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(Integer value) {
            addCriterion("pc_id <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(Integer value) {
            addCriterion("pc_id <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<Integer> values) {
            addCriterion("pc_id in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<Integer> values) {
            addCriterion("pc_id not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(Integer value1, Integer value2) {
            addCriterion("pc_id between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_id not between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNull() {
            addCriterion("pc_name is null");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNotNull() {
            addCriterion("pc_name is not null");
            return (Criteria) this;
        }

        public Criteria andPcNameEqualTo(String value) {
            addCriterion("pc_name =", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotEqualTo(String value) {
            addCriterion("pc_name <>", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThan(String value) {
            addCriterion("pc_name >", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThanOrEqualTo(String value) {
            addCriterion("pc_name >=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThan(String value) {
            addCriterion("pc_name <", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThanOrEqualTo(String value) {
            addCriterion("pc_name <=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLike(String value) {
            addCriterion("pc_name like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotLike(String value) {
            addCriterion("pc_name not like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameIn(List<String> values) {
            addCriterion("pc_name in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotIn(List<String> values) {
            addCriterion("pc_name not in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameBetween(String value1, String value2) {
            addCriterion("pc_name between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotBetween(String value1, String value2) {
            addCriterion("pc_name not between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcTypeIsNull() {
            addCriterion("pc_type is null");
            return (Criteria) this;
        }

        public Criteria andPcTypeIsNotNull() {
            addCriterion("pc_type is not null");
            return (Criteria) this;
        }

        public Criteria andPcTypeEqualTo(Integer value) {
            addCriterion("pc_type =", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotEqualTo(Integer value) {
            addCriterion("pc_type <>", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeGreaterThan(Integer value) {
            addCriterion("pc_type >", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_type >=", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeLessThan(Integer value) {
            addCriterion("pc_type <", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pc_type <=", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeIn(List<Integer> values) {
            addCriterion("pc_type in", values, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotIn(List<Integer> values) {
            addCriterion("pc_type not in", values, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeBetween(Integer value1, Integer value2) {
            addCriterion("pc_type between", value1, value2, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_type not between", value1, value2, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcContentIsNull() {
            addCriterion("pc_content is null");
            return (Criteria) this;
        }

        public Criteria andPcContentIsNotNull() {
            addCriterion("pc_content is not null");
            return (Criteria) this;
        }

        public Criteria andPcContentEqualTo(String value) {
            addCriterion("pc_content =", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentNotEqualTo(String value) {
            addCriterion("pc_content <>", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentGreaterThan(String value) {
            addCriterion("pc_content >", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentGreaterThanOrEqualTo(String value) {
            addCriterion("pc_content >=", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentLessThan(String value) {
            addCriterion("pc_content <", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentLessThanOrEqualTo(String value) {
            addCriterion("pc_content <=", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentLike(String value) {
            addCriterion("pc_content like", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentNotLike(String value) {
            addCriterion("pc_content not like", value, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentIn(List<String> values) {
            addCriterion("pc_content in", values, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentNotIn(List<String> values) {
            addCriterion("pc_content not in", values, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentBetween(String value1, String value2) {
            addCriterion("pc_content between", value1, value2, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcContentNotBetween(String value1, String value2) {
            addCriterion("pc_content not between", value1, value2, "pcContent");
            return (Criteria) this;
        }

        public Criteria andPcDateIsNull() {
            addCriterion("pc_date is null");
            return (Criteria) this;
        }

        public Criteria andPcDateIsNotNull() {
            addCriterion("pc_date is not null");
            return (Criteria) this;
        }

        public Criteria andPcDateEqualTo(Date value) {
            addCriterion("pc_date =", value, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateNotEqualTo(Date value) {
            addCriterion("pc_date <>", value, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateGreaterThan(Date value) {
            addCriterion("pc_date >", value, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pc_date >=", value, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateLessThan(Date value) {
            addCriterion("pc_date <", value, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateLessThanOrEqualTo(Date value) {
            addCriterion("pc_date <=", value, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateIn(List<Date> values) {
            addCriterion("pc_date in", values, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateNotIn(List<Date> values) {
            addCriterion("pc_date not in", values, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateBetween(Date value1, Date value2) {
            addCriterion("pc_date between", value1, value2, "pcDate");
            return (Criteria) this;
        }

        public Criteria andPcDateNotBetween(Date value1, Date value2) {
            addCriterion("pc_date not between", value1, value2, "pcDate");
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