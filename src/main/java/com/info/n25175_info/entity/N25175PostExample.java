package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.List;

public class N25175PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175PostExample() {
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

        public Criteria andNpIdIsNull() {
            addCriterion("np_id is null");
            return (Criteria) this;
        }

        public Criteria andNpIdIsNotNull() {
            addCriterion("np_id is not null");
            return (Criteria) this;
        }

        public Criteria andNpIdEqualTo(Integer value) {
            addCriterion("np_id =", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdNotEqualTo(Integer value) {
            addCriterion("np_id <>", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdGreaterThan(Integer value) {
            addCriterion("np_id >", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("np_id >=", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdLessThan(Integer value) {
            addCriterion("np_id <", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdLessThanOrEqualTo(Integer value) {
            addCriterion("np_id <=", value, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdIn(List<Integer> values) {
            addCriterion("np_id in", values, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdNotIn(List<Integer> values) {
            addCriterion("np_id not in", values, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdBetween(Integer value1, Integer value2) {
            addCriterion("np_id between", value1, value2, "npId");
            return (Criteria) this;
        }

        public Criteria andNpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("np_id not between", value1, value2, "npId");
            return (Criteria) this;
        }

        public Criteria andNpNameIsNull() {
            addCriterion("np_name is null");
            return (Criteria) this;
        }

        public Criteria andNpNameIsNotNull() {
            addCriterion("np_name is not null");
            return (Criteria) this;
        }

        public Criteria andNpNameEqualTo(String value) {
            addCriterion("np_name =", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameNotEqualTo(String value) {
            addCriterion("np_name <>", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameGreaterThan(String value) {
            addCriterion("np_name >", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameGreaterThanOrEqualTo(String value) {
            addCriterion("np_name >=", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameLessThan(String value) {
            addCriterion("np_name <", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameLessThanOrEqualTo(String value) {
            addCriterion("np_name <=", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameLike(String value) {
            addCriterion("np_name like", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameNotLike(String value) {
            addCriterion("np_name not like", value, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameIn(List<String> values) {
            addCriterion("np_name in", values, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameNotIn(List<String> values) {
            addCriterion("np_name not in", values, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameBetween(String value1, String value2) {
            addCriterion("np_name between", value1, value2, "npName");
            return (Criteria) this;
        }

        public Criteria andNpNameNotBetween(String value1, String value2) {
            addCriterion("np_name not between", value1, value2, "npName");
            return (Criteria) this;
        }

        public Criteria andNpSignIsNull() {
            addCriterion("np_sign is null");
            return (Criteria) this;
        }

        public Criteria andNpSignIsNotNull() {
            addCriterion("np_sign is not null");
            return (Criteria) this;
        }

        public Criteria andNpSignEqualTo(Integer value) {
            addCriterion("np_sign =", value, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignNotEqualTo(Integer value) {
            addCriterion("np_sign <>", value, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignGreaterThan(Integer value) {
            addCriterion("np_sign >", value, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("np_sign >=", value, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignLessThan(Integer value) {
            addCriterion("np_sign <", value, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignLessThanOrEqualTo(Integer value) {
            addCriterion("np_sign <=", value, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignIn(List<Integer> values) {
            addCriterion("np_sign in", values, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignNotIn(List<Integer> values) {
            addCriterion("np_sign not in", values, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignBetween(Integer value1, Integer value2) {
            addCriterion("np_sign between", value1, value2, "npSign");
            return (Criteria) this;
        }

        public Criteria andNpSignNotBetween(Integer value1, Integer value2) {
            addCriterion("np_sign not between", value1, value2, "npSign");
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