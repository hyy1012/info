package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.List;

public class N25175SubmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175SubmitExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSAidIsNull() {
            addCriterion("s_aid is null");
            return (Criteria) this;
        }

        public Criteria andSAidIsNotNull() {
            addCriterion("s_aid is not null");
            return (Criteria) this;
        }

        public Criteria andSAidEqualTo(Integer value) {
            addCriterion("s_aid =", value, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidNotEqualTo(Integer value) {
            addCriterion("s_aid <>", value, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidGreaterThan(Integer value) {
            addCriterion("s_aid >", value, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_aid >=", value, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidLessThan(Integer value) {
            addCriterion("s_aid <", value, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidLessThanOrEqualTo(Integer value) {
            addCriterion("s_aid <=", value, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidIn(List<Integer> values) {
            addCriterion("s_aid in", values, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidNotIn(List<Integer> values) {
            addCriterion("s_aid not in", values, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidBetween(Integer value1, Integer value2) {
            addCriterion("s_aid between", value1, value2, "sAid");
            return (Criteria) this;
        }

        public Criteria andSAidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_aid not between", value1, value2, "sAid");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSMarkIsNull() {
            addCriterion("s_mark is null");
            return (Criteria) this;
        }

        public Criteria andSMarkIsNotNull() {
            addCriterion("s_mark is not null");
            return (Criteria) this;
        }

        public Criteria andSMarkEqualTo(Integer value) {
            addCriterion("s_mark =", value, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkNotEqualTo(Integer value) {
            addCriterion("s_mark <>", value, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkGreaterThan(Integer value) {
            addCriterion("s_mark >", value, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_mark >=", value, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkLessThan(Integer value) {
            addCriterion("s_mark <", value, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkLessThanOrEqualTo(Integer value) {
            addCriterion("s_mark <=", value, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkIn(List<Integer> values) {
            addCriterion("s_mark in", values, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkNotIn(List<Integer> values) {
            addCriterion("s_mark not in", values, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkBetween(Integer value1, Integer value2) {
            addCriterion("s_mark between", value1, value2, "sMark");
            return (Criteria) this;
        }

        public Criteria andSMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("s_mark not between", value1, value2, "sMark");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNull() {
            addCriterion("s_score is null");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNotNull() {
            addCriterion("s_score is not null");
            return (Criteria) this;
        }

        public Criteria andSScoreEqualTo(Integer value) {
            addCriterion("s_score =", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotEqualTo(Integer value) {
            addCriterion("s_score <>", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThan(Integer value) {
            addCriterion("s_score >", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_score >=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThan(Integer value) {
            addCriterion("s_score <", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThanOrEqualTo(Integer value) {
            addCriterion("s_score <=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreIn(List<Integer> values) {
            addCriterion("s_score in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotIn(List<Integer> values) {
            addCriterion("s_score not in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreBetween(Integer value1, Integer value2) {
            addCriterion("s_score between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("s_score not between", value1, value2, "sScore");
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