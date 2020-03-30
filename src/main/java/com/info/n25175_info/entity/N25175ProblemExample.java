package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class N25175ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175ProblemExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPTopicIsNull() {
            addCriterion("p_topic is null");
            return (Criteria) this;
        }

        public Criteria andPTopicIsNotNull() {
            addCriterion("p_topic is not null");
            return (Criteria) this;
        }

        public Criteria andPTopicEqualTo(String value) {
            addCriterion("p_topic =", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicNotEqualTo(String value) {
            addCriterion("p_topic <>", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicGreaterThan(String value) {
            addCriterion("p_topic >", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicGreaterThanOrEqualTo(String value) {
            addCriterion("p_topic >=", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicLessThan(String value) {
            addCriterion("p_topic <", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicLessThanOrEqualTo(String value) {
            addCriterion("p_topic <=", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicLike(String value) {
            addCriterion("p_topic like", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicNotLike(String value) {
            addCriterion("p_topic not like", value, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicIn(List<String> values) {
            addCriterion("p_topic in", values, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicNotIn(List<String> values) {
            addCriterion("p_topic not in", values, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicBetween(String value1, String value2) {
            addCriterion("p_topic between", value1, value2, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTopicNotBetween(String value1, String value2) {
            addCriterion("p_topic not between", value1, value2, "pTopic");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(Integer value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(Integer value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(Integer value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(Integer value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(Integer value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<Integer> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<Integer> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(Integer value1, Integer value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("p_type not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPListIsNull() {
            addCriterion("p_list is null");
            return (Criteria) this;
        }

        public Criteria andPListIsNotNull() {
            addCriterion("p_list is not null");
            return (Criteria) this;
        }

        public Criteria andPListEqualTo(Integer value) {
            addCriterion("p_list =", value, "pList");
            return (Criteria) this;
        }

        public Criteria andPListNotEqualTo(Integer value) {
            addCriterion("p_list <>", value, "pList");
            return (Criteria) this;
        }

        public Criteria andPListGreaterThan(Integer value) {
            addCriterion("p_list >", value, "pList");
            return (Criteria) this;
        }

        public Criteria andPListGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_list >=", value, "pList");
            return (Criteria) this;
        }

        public Criteria andPListLessThan(Integer value) {
            addCriterion("p_list <", value, "pList");
            return (Criteria) this;
        }

        public Criteria andPListLessThanOrEqualTo(Integer value) {
            addCriterion("p_list <=", value, "pList");
            return (Criteria) this;
        }

        public Criteria andPListIn(List<Integer> values) {
            addCriterion("p_list in", values, "pList");
            return (Criteria) this;
        }

        public Criteria andPListNotIn(List<Integer> values) {
            addCriterion("p_list not in", values, "pList");
            return (Criteria) this;
        }

        public Criteria andPListBetween(Integer value1, Integer value2) {
            addCriterion("p_list between", value1, value2, "pList");
            return (Criteria) this;
        }

        public Criteria andPListNotBetween(Integer value1, Integer value2) {
            addCriterion("p_list not between", value1, value2, "pList");
            return (Criteria) this;
        }

        public Criteria andPPostidIsNull() {
            addCriterion("p_postId is null");
            return (Criteria) this;
        }

        public Criteria andPPostidIsNotNull() {
            addCriterion("p_postId is not null");
            return (Criteria) this;
        }

        public Criteria andPPostidEqualTo(Integer value) {
            addCriterion("p_postId =", value, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidNotEqualTo(Integer value) {
            addCriterion("p_postId <>", value, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidGreaterThan(Integer value) {
            addCriterion("p_postId >", value, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_postId >=", value, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidLessThan(Integer value) {
            addCriterion("p_postId <", value, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidLessThanOrEqualTo(Integer value) {
            addCriterion("p_postId <=", value, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidIn(List<Integer> values) {
            addCriterion("p_postId in", values, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidNotIn(List<Integer> values) {
            addCriterion("p_postId not in", values, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidBetween(Integer value1, Integer value2) {
            addCriterion("p_postId between", value1, value2, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_postId not between", value1, value2, "pPostid");
            return (Criteria) this;
        }

        public Criteria andPScoreIsNull() {
            addCriterion("p_score is null");
            return (Criteria) this;
        }

        public Criteria andPScoreIsNotNull() {
            addCriterion("p_score is not null");
            return (Criteria) this;
        }

        public Criteria andPScoreEqualTo(Integer value) {
            addCriterion("p_score =", value, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreNotEqualTo(Integer value) {
            addCriterion("p_score <>", value, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreGreaterThan(Integer value) {
            addCriterion("p_score >", value, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_score >=", value, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreLessThan(Integer value) {
            addCriterion("p_score <", value, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreLessThanOrEqualTo(Integer value) {
            addCriterion("p_score <=", value, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreIn(List<Integer> values) {
            addCriterion("p_score in", values, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreNotIn(List<Integer> values) {
            addCriterion("p_score not in", values, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreBetween(Integer value1, Integer value2) {
            addCriterion("p_score between", value1, value2, "pScore");
            return (Criteria) this;
        }

        public Criteria andPScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("p_score not between", value1, value2, "pScore");
            return (Criteria) this;
        }

        public Criteria andPDateIsNull() {
            addCriterion("p_date is null");
            return (Criteria) this;
        }

        public Criteria andPDateIsNotNull() {
            addCriterion("p_date is not null");
            return (Criteria) this;
        }

        public Criteria andPDateEqualTo(Date value) {
            addCriterion("p_date =", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotEqualTo(Date value) {
            addCriterion("p_date <>", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateGreaterThan(Date value) {
            addCriterion("p_date >", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateGreaterThanOrEqualTo(Date value) {
            addCriterion("p_date >=", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLessThan(Date value) {
            addCriterion("p_date <", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLessThanOrEqualTo(Date value) {
            addCriterion("p_date <=", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateIn(List<Date> values) {
            addCriterion("p_date in", values, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotIn(List<Date> values) {
            addCriterion("p_date not in", values, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateBetween(Date value1, Date value2) {
            addCriterion("p_date between", value1, value2, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotBetween(Date value1, Date value2) {
            addCriterion("p_date not between", value1, value2, "pDate");
            return (Criteria) this;
        }

        public Criteria andPSignIsNull() {
            addCriterion("p_sign is null");
            return (Criteria) this;
        }

        public Criteria andPSignIsNotNull() {
            addCriterion("p_sign is not null");
            return (Criteria) this;
        }

        public Criteria andPSignEqualTo(Integer value) {
            addCriterion("p_sign =", value, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignNotEqualTo(Integer value) {
            addCriterion("p_sign <>", value, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignGreaterThan(Integer value) {
            addCriterion("p_sign >", value, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_sign >=", value, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignLessThan(Integer value) {
            addCriterion("p_sign <", value, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignLessThanOrEqualTo(Integer value) {
            addCriterion("p_sign <=", value, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignIn(List<Integer> values) {
            addCriterion("p_sign in", values, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignNotIn(List<Integer> values) {
            addCriterion("p_sign not in", values, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignBetween(Integer value1, Integer value2) {
            addCriterion("p_sign between", value1, value2, "pSign");
            return (Criteria) this;
        }

        public Criteria andPSignNotBetween(Integer value1, Integer value2) {
            addCriterion("p_sign not between", value1, value2, "pSign");
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