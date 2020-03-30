package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.List;

public class N25175AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175AnswerExample() {
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

        public Criteria andNaIdIsNull() {
            addCriterion("na_id is null");
            return (Criteria) this;
        }

        public Criteria andNaIdIsNotNull() {
            addCriterion("na_id is not null");
            return (Criteria) this;
        }

        public Criteria andNaIdEqualTo(Integer value) {
            addCriterion("na_id =", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdNotEqualTo(Integer value) {
            addCriterion("na_id <>", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdGreaterThan(Integer value) {
            addCriterion("na_id >", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("na_id >=", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdLessThan(Integer value) {
            addCriterion("na_id <", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdLessThanOrEqualTo(Integer value) {
            addCriterion("na_id <=", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdIn(List<Integer> values) {
            addCriterion("na_id in", values, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdNotIn(List<Integer> values) {
            addCriterion("na_id not in", values, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdBetween(Integer value1, Integer value2) {
            addCriterion("na_id between", value1, value2, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("na_id not between", value1, value2, "naId");
            return (Criteria) this;
        }

        public Criteria andNaAnswerIsNull() {
            addCriterion("na_answer is null");
            return (Criteria) this;
        }

        public Criteria andNaAnswerIsNotNull() {
            addCriterion("na_answer is not null");
            return (Criteria) this;
        }

        public Criteria andNaAnswerEqualTo(String value) {
            addCriterion("na_answer =", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerNotEqualTo(String value) {
            addCriterion("na_answer <>", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerGreaterThan(String value) {
            addCriterion("na_answer >", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("na_answer >=", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerLessThan(String value) {
            addCriterion("na_answer <", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerLessThanOrEqualTo(String value) {
            addCriterion("na_answer <=", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerLike(String value) {
            addCriterion("na_answer like", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerNotLike(String value) {
            addCriterion("na_answer not like", value, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerIn(List<String> values) {
            addCriterion("na_answer in", values, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerNotIn(List<String> values) {
            addCriterion("na_answer not in", values, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerBetween(String value1, String value2) {
            addCriterion("na_answer between", value1, value2, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaAnswerNotBetween(String value1, String value2) {
            addCriterion("na_answer not between", value1, value2, "naAnswer");
            return (Criteria) this;
        }

        public Criteria andNaScoreIsNull() {
            addCriterion("na_score is null");
            return (Criteria) this;
        }

        public Criteria andNaScoreIsNotNull() {
            addCriterion("na_score is not null");
            return (Criteria) this;
        }

        public Criteria andNaScoreEqualTo(Integer value) {
            addCriterion("na_score =", value, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreNotEqualTo(Integer value) {
            addCriterion("na_score <>", value, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreGreaterThan(Integer value) {
            addCriterion("na_score >", value, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("na_score >=", value, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreLessThan(Integer value) {
            addCriterion("na_score <", value, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreLessThanOrEqualTo(Integer value) {
            addCriterion("na_score <=", value, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreIn(List<Integer> values) {
            addCriterion("na_score in", values, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreNotIn(List<Integer> values) {
            addCriterion("na_score not in", values, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreBetween(Integer value1, Integer value2) {
            addCriterion("na_score between", value1, value2, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("na_score not between", value1, value2, "naScore");
            return (Criteria) this;
        }

        public Criteria andNaProblemidIsNull() {
            addCriterion("na_problemId is null");
            return (Criteria) this;
        }

        public Criteria andNaProblemidIsNotNull() {
            addCriterion("na_problemId is not null");
            return (Criteria) this;
        }

        public Criteria andNaProblemidEqualTo(Integer value) {
            addCriterion("na_problemId =", value, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidNotEqualTo(Integer value) {
            addCriterion("na_problemId <>", value, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidGreaterThan(Integer value) {
            addCriterion("na_problemId >", value, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("na_problemId >=", value, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidLessThan(Integer value) {
            addCriterion("na_problemId <", value, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidLessThanOrEqualTo(Integer value) {
            addCriterion("na_problemId <=", value, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidIn(List<Integer> values) {
            addCriterion("na_problemId in", values, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidNotIn(List<Integer> values) {
            addCriterion("na_problemId not in", values, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidBetween(Integer value1, Integer value2) {
            addCriterion("na_problemId between", value1, value2, "naProblemid");
            return (Criteria) this;
        }

        public Criteria andNaProblemidNotBetween(Integer value1, Integer value2) {
            addCriterion("na_problemId not between", value1, value2, "naProblemid");
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