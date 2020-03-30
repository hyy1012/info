package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.List;

public class N25175ResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175ResponseExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRResponseIsNull() {
            addCriterion("r_response is null");
            return (Criteria) this;
        }

        public Criteria andRResponseIsNotNull() {
            addCriterion("r_response is not null");
            return (Criteria) this;
        }

        public Criteria andRResponseEqualTo(String value) {
            addCriterion("r_response =", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseNotEqualTo(String value) {
            addCriterion("r_response <>", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseGreaterThan(String value) {
            addCriterion("r_response >", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseGreaterThanOrEqualTo(String value) {
            addCriterion("r_response >=", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseLessThan(String value) {
            addCriterion("r_response <", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseLessThanOrEqualTo(String value) {
            addCriterion("r_response <=", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseLike(String value) {
            addCriterion("r_response like", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseNotLike(String value) {
            addCriterion("r_response not like", value, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseIn(List<String> values) {
            addCriterion("r_response in", values, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseNotIn(List<String> values) {
            addCriterion("r_response not in", values, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseBetween(String value1, String value2) {
            addCriterion("r_response between", value1, value2, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRResponseNotBetween(String value1, String value2) {
            addCriterion("r_response not between", value1, value2, "rResponse");
            return (Criteria) this;
        }

        public Criteria andRSubmitidIsNull() {
            addCriterion("r_submitId is null");
            return (Criteria) this;
        }

        public Criteria andRSubmitidIsNotNull() {
            addCriterion("r_submitId is not null");
            return (Criteria) this;
        }

        public Criteria andRSubmitidEqualTo(Integer value) {
            addCriterion("r_submitId =", value, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidNotEqualTo(Integer value) {
            addCriterion("r_submitId <>", value, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidGreaterThan(Integer value) {
            addCriterion("r_submitId >", value, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_submitId >=", value, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidLessThan(Integer value) {
            addCriterion("r_submitId <", value, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidLessThanOrEqualTo(Integer value) {
            addCriterion("r_submitId <=", value, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidIn(List<Integer> values) {
            addCriterion("r_submitId in", values, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidNotIn(List<Integer> values) {
            addCriterion("r_submitId not in", values, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidBetween(Integer value1, Integer value2) {
            addCriterion("r_submitId between", value1, value2, "rSubmitid");
            return (Criteria) this;
        }

        public Criteria andRSubmitidNotBetween(Integer value1, Integer value2) {
            addCriterion("r_submitId not between", value1, value2, "rSubmitid");
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