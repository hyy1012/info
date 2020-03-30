package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.List;

public class N25175UserEnableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175UserEnableExample() {
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

        public Criteria andEIdef1IsNull() {
            addCriterion("e_idef1 is null");
            return (Criteria) this;
        }

        public Criteria andEIdef1IsNotNull() {
            addCriterion("e_idef1 is not null");
            return (Criteria) this;
        }

        public Criteria andEIdef1EqualTo(String value) {
            addCriterion("e_idef1 =", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1NotEqualTo(String value) {
            addCriterion("e_idef1 <>", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1GreaterThan(String value) {
            addCriterion("e_idef1 >", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1GreaterThanOrEqualTo(String value) {
            addCriterion("e_idef1 >=", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1LessThan(String value) {
            addCriterion("e_idef1 <", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1LessThanOrEqualTo(String value) {
            addCriterion("e_idef1 <=", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1Like(String value) {
            addCriterion("e_idef1 like", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1NotLike(String value) {
            addCriterion("e_idef1 not like", value, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1In(List<String> values) {
            addCriterion("e_idef1 in", values, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1NotIn(List<String> values) {
            addCriterion("e_idef1 not in", values, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1Between(String value1, String value2) {
            addCriterion("e_idef1 between", value1, value2, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef1NotBetween(String value1, String value2) {
            addCriterion("e_idef1 not between", value1, value2, "eIdef1");
            return (Criteria) this;
        }

        public Criteria andEIdef2IsNull() {
            addCriterion("e_idef2 is null");
            return (Criteria) this;
        }

        public Criteria andEIdef2IsNotNull() {
            addCriterion("e_idef2 is not null");
            return (Criteria) this;
        }

        public Criteria andEIdef2EqualTo(String value) {
            addCriterion("e_idef2 =", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2NotEqualTo(String value) {
            addCriterion("e_idef2 <>", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2GreaterThan(String value) {
            addCriterion("e_idef2 >", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2GreaterThanOrEqualTo(String value) {
            addCriterion("e_idef2 >=", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2LessThan(String value) {
            addCriterion("e_idef2 <", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2LessThanOrEqualTo(String value) {
            addCriterion("e_idef2 <=", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2Like(String value) {
            addCriterion("e_idef2 like", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2NotLike(String value) {
            addCriterion("e_idef2 not like", value, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2In(List<String> values) {
            addCriterion("e_idef2 in", values, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2NotIn(List<String> values) {
            addCriterion("e_idef2 not in", values, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2Between(String value1, String value2) {
            addCriterion("e_idef2 between", value1, value2, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEIdef2NotBetween(String value1, String value2) {
            addCriterion("e_idef2 not between", value1, value2, "eIdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef1IsNull() {
            addCriterion("e_ddef1 is null");
            return (Criteria) this;
        }

        public Criteria andEDdef1IsNotNull() {
            addCriterion("e_ddef1 is not null");
            return (Criteria) this;
        }

        public Criteria andEDdef1EqualTo(String value) {
            addCriterion("e_ddef1 =", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1NotEqualTo(String value) {
            addCriterion("e_ddef1 <>", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1GreaterThan(String value) {
            addCriterion("e_ddef1 >", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1GreaterThanOrEqualTo(String value) {
            addCriterion("e_ddef1 >=", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1LessThan(String value) {
            addCriterion("e_ddef1 <", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1LessThanOrEqualTo(String value) {
            addCriterion("e_ddef1 <=", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1Like(String value) {
            addCriterion("e_ddef1 like", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1NotLike(String value) {
            addCriterion("e_ddef1 not like", value, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1In(List<String> values) {
            addCriterion("e_ddef1 in", values, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1NotIn(List<String> values) {
            addCriterion("e_ddef1 not in", values, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1Between(String value1, String value2) {
            addCriterion("e_ddef1 between", value1, value2, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef1NotBetween(String value1, String value2) {
            addCriterion("e_ddef1 not between", value1, value2, "eDdef1");
            return (Criteria) this;
        }

        public Criteria andEDdef2IsNull() {
            addCriterion("e_ddef2 is null");
            return (Criteria) this;
        }

        public Criteria andEDdef2IsNotNull() {
            addCriterion("e_ddef2 is not null");
            return (Criteria) this;
        }

        public Criteria andEDdef2EqualTo(String value) {
            addCriterion("e_ddef2 =", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2NotEqualTo(String value) {
            addCriterion("e_ddef2 <>", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2GreaterThan(String value) {
            addCriterion("e_ddef2 >", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2GreaterThanOrEqualTo(String value) {
            addCriterion("e_ddef2 >=", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2LessThan(String value) {
            addCriterion("e_ddef2 <", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2LessThanOrEqualTo(String value) {
            addCriterion("e_ddef2 <=", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2Like(String value) {
            addCriterion("e_ddef2 like", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2NotLike(String value) {
            addCriterion("e_ddef2 not like", value, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2In(List<String> values) {
            addCriterion("e_ddef2 in", values, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2NotIn(List<String> values) {
            addCriterion("e_ddef2 not in", values, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2Between(String value1, String value2) {
            addCriterion("e_ddef2 between", value1, value2, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andEDdef2NotBetween(String value1, String value2) {
            addCriterion("e_ddef2 not between", value1, value2, "eDdef2");
            return (Criteria) this;
        }

        public Criteria andESdef1IsNull() {
            addCriterion("e_sdef1 is null");
            return (Criteria) this;
        }

        public Criteria andESdef1IsNotNull() {
            addCriterion("e_sdef1 is not null");
            return (Criteria) this;
        }

        public Criteria andESdef1EqualTo(String value) {
            addCriterion("e_sdef1 =", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1NotEqualTo(String value) {
            addCriterion("e_sdef1 <>", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1GreaterThan(String value) {
            addCriterion("e_sdef1 >", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1GreaterThanOrEqualTo(String value) {
            addCriterion("e_sdef1 >=", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1LessThan(String value) {
            addCriterion("e_sdef1 <", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1LessThanOrEqualTo(String value) {
            addCriterion("e_sdef1 <=", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1Like(String value) {
            addCriterion("e_sdef1 like", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1NotLike(String value) {
            addCriterion("e_sdef1 not like", value, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1In(List<String> values) {
            addCriterion("e_sdef1 in", values, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1NotIn(List<String> values) {
            addCriterion("e_sdef1 not in", values, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1Between(String value1, String value2) {
            addCriterion("e_sdef1 between", value1, value2, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef1NotBetween(String value1, String value2) {
            addCriterion("e_sdef1 not between", value1, value2, "eSdef1");
            return (Criteria) this;
        }

        public Criteria andESdef2IsNull() {
            addCriterion("e_sdef2 is null");
            return (Criteria) this;
        }

        public Criteria andESdef2IsNotNull() {
            addCriterion("e_sdef2 is not null");
            return (Criteria) this;
        }

        public Criteria andESdef2EqualTo(String value) {
            addCriterion("e_sdef2 =", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2NotEqualTo(String value) {
            addCriterion("e_sdef2 <>", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2GreaterThan(String value) {
            addCriterion("e_sdef2 >", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2GreaterThanOrEqualTo(String value) {
            addCriterion("e_sdef2 >=", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2LessThan(String value) {
            addCriterion("e_sdef2 <", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2LessThanOrEqualTo(String value) {
            addCriterion("e_sdef2 <=", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2Like(String value) {
            addCriterion("e_sdef2 like", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2NotLike(String value) {
            addCriterion("e_sdef2 not like", value, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2In(List<String> values) {
            addCriterion("e_sdef2 in", values, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2NotIn(List<String> values) {
            addCriterion("e_sdef2 not in", values, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2Between(String value1, String value2) {
            addCriterion("e_sdef2 between", value1, value2, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andESdef2NotBetween(String value1, String value2) {
            addCriterion("e_sdef2 not between", value1, value2, "eSdef2");
            return (Criteria) this;
        }

        public Criteria andETadef1IsNull() {
            addCriterion("e_tadef1 is null");
            return (Criteria) this;
        }

        public Criteria andETadef1IsNotNull() {
            addCriterion("e_tadef1 is not null");
            return (Criteria) this;
        }

        public Criteria andETadef1EqualTo(String value) {
            addCriterion("e_tadef1 =", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1NotEqualTo(String value) {
            addCriterion("e_tadef1 <>", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1GreaterThan(String value) {
            addCriterion("e_tadef1 >", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1GreaterThanOrEqualTo(String value) {
            addCriterion("e_tadef1 >=", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1LessThan(String value) {
            addCriterion("e_tadef1 <", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1LessThanOrEqualTo(String value) {
            addCriterion("e_tadef1 <=", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1Like(String value) {
            addCriterion("e_tadef1 like", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1NotLike(String value) {
            addCriterion("e_tadef1 not like", value, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1In(List<String> values) {
            addCriterion("e_tadef1 in", values, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1NotIn(List<String> values) {
            addCriterion("e_tadef1 not in", values, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1Between(String value1, String value2) {
            addCriterion("e_tadef1 between", value1, value2, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef1NotBetween(String value1, String value2) {
            addCriterion("e_tadef1 not between", value1, value2, "eTadef1");
            return (Criteria) this;
        }

        public Criteria andETadef2IsNull() {
            addCriterion("e_tadef2 is null");
            return (Criteria) this;
        }

        public Criteria andETadef2IsNotNull() {
            addCriterion("e_tadef2 is not null");
            return (Criteria) this;
        }

        public Criteria andETadef2EqualTo(String value) {
            addCriterion("e_tadef2 =", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2NotEqualTo(String value) {
            addCriterion("e_tadef2 <>", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2GreaterThan(String value) {
            addCriterion("e_tadef2 >", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2GreaterThanOrEqualTo(String value) {
            addCriterion("e_tadef2 >=", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2LessThan(String value) {
            addCriterion("e_tadef2 <", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2LessThanOrEqualTo(String value) {
            addCriterion("e_tadef2 <=", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2Like(String value) {
            addCriterion("e_tadef2 like", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2NotLike(String value) {
            addCriterion("e_tadef2 not like", value, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2In(List<String> values) {
            addCriterion("e_tadef2 in", values, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2NotIn(List<String> values) {
            addCriterion("e_tadef2 not in", values, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2Between(String value1, String value2) {
            addCriterion("e_tadef2 between", value1, value2, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andETadef2NotBetween(String value1, String value2) {
            addCriterion("e_tadef2 not between", value1, value2, "eTadef2");
            return (Criteria) this;
        }

        public Criteria andEIdef1nIsNull() {
            addCriterion("e_idef1n is null");
            return (Criteria) this;
        }

        public Criteria andEIdef1nIsNotNull() {
            addCriterion("e_idef1n is not null");
            return (Criteria) this;
        }

        public Criteria andEIdef1nEqualTo(String value) {
            addCriterion("e_idef1n =", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nNotEqualTo(String value) {
            addCriterion("e_idef1n <>", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nGreaterThan(String value) {
            addCriterion("e_idef1n >", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nGreaterThanOrEqualTo(String value) {
            addCriterion("e_idef1n >=", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nLessThan(String value) {
            addCriterion("e_idef1n <", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nLessThanOrEqualTo(String value) {
            addCriterion("e_idef1n <=", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nLike(String value) {
            addCriterion("e_idef1n like", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nNotLike(String value) {
            addCriterion("e_idef1n not like", value, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nIn(List<String> values) {
            addCriterion("e_idef1n in", values, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nNotIn(List<String> values) {
            addCriterion("e_idef1n not in", values, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nBetween(String value1, String value2) {
            addCriterion("e_idef1n between", value1, value2, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef1nNotBetween(String value1, String value2) {
            addCriterion("e_idef1n not between", value1, value2, "eIdef1n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nIsNull() {
            addCriterion("e_idef2n is null");
            return (Criteria) this;
        }

        public Criteria andEIdef2nIsNotNull() {
            addCriterion("e_idef2n is not null");
            return (Criteria) this;
        }

        public Criteria andEIdef2nEqualTo(String value) {
            addCriterion("e_idef2n =", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nNotEqualTo(String value) {
            addCriterion("e_idef2n <>", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nGreaterThan(String value) {
            addCriterion("e_idef2n >", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nGreaterThanOrEqualTo(String value) {
            addCriterion("e_idef2n >=", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nLessThan(String value) {
            addCriterion("e_idef2n <", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nLessThanOrEqualTo(String value) {
            addCriterion("e_idef2n <=", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nLike(String value) {
            addCriterion("e_idef2n like", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nNotLike(String value) {
            addCriterion("e_idef2n not like", value, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nIn(List<String> values) {
            addCriterion("e_idef2n in", values, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nNotIn(List<String> values) {
            addCriterion("e_idef2n not in", values, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nBetween(String value1, String value2) {
            addCriterion("e_idef2n between", value1, value2, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEIdef2nNotBetween(String value1, String value2) {
            addCriterion("e_idef2n not between", value1, value2, "eIdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nIsNull() {
            addCriterion("e_ddef1n is null");
            return (Criteria) this;
        }

        public Criteria andEDdef1nIsNotNull() {
            addCriterion("e_ddef1n is not null");
            return (Criteria) this;
        }

        public Criteria andEDdef1nEqualTo(String value) {
            addCriterion("e_ddef1n =", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nNotEqualTo(String value) {
            addCriterion("e_ddef1n <>", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nGreaterThan(String value) {
            addCriterion("e_ddef1n >", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nGreaterThanOrEqualTo(String value) {
            addCriterion("e_ddef1n >=", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nLessThan(String value) {
            addCriterion("e_ddef1n <", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nLessThanOrEqualTo(String value) {
            addCriterion("e_ddef1n <=", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nLike(String value) {
            addCriterion("e_ddef1n like", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nNotLike(String value) {
            addCriterion("e_ddef1n not like", value, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nIn(List<String> values) {
            addCriterion("e_ddef1n in", values, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nNotIn(List<String> values) {
            addCriterion("e_ddef1n not in", values, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nBetween(String value1, String value2) {
            addCriterion("e_ddef1n between", value1, value2, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef1nNotBetween(String value1, String value2) {
            addCriterion("e_ddef1n not between", value1, value2, "eDdef1n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nIsNull() {
            addCriterion("e_ddef2n is null");
            return (Criteria) this;
        }

        public Criteria andEDdef2nIsNotNull() {
            addCriterion("e_ddef2n is not null");
            return (Criteria) this;
        }

        public Criteria andEDdef2nEqualTo(String value) {
            addCriterion("e_ddef2n =", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nNotEqualTo(String value) {
            addCriterion("e_ddef2n <>", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nGreaterThan(String value) {
            addCriterion("e_ddef2n >", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nGreaterThanOrEqualTo(String value) {
            addCriterion("e_ddef2n >=", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nLessThan(String value) {
            addCriterion("e_ddef2n <", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nLessThanOrEqualTo(String value) {
            addCriterion("e_ddef2n <=", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nLike(String value) {
            addCriterion("e_ddef2n like", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nNotLike(String value) {
            addCriterion("e_ddef2n not like", value, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nIn(List<String> values) {
            addCriterion("e_ddef2n in", values, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nNotIn(List<String> values) {
            addCriterion("e_ddef2n not in", values, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nBetween(String value1, String value2) {
            addCriterion("e_ddef2n between", value1, value2, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andEDdef2nNotBetween(String value1, String value2) {
            addCriterion("e_ddef2n not between", value1, value2, "eDdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef1nIsNull() {
            addCriterion("e_sdef1n is null");
            return (Criteria) this;
        }

        public Criteria andESdef1nIsNotNull() {
            addCriterion("e_sdef1n is not null");
            return (Criteria) this;
        }

        public Criteria andESdef1nEqualTo(String value) {
            addCriterion("e_sdef1n =", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nNotEqualTo(String value) {
            addCriterion("e_sdef1n <>", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nGreaterThan(String value) {
            addCriterion("e_sdef1n >", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nGreaterThanOrEqualTo(String value) {
            addCriterion("e_sdef1n >=", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nLessThan(String value) {
            addCriterion("e_sdef1n <", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nLessThanOrEqualTo(String value) {
            addCriterion("e_sdef1n <=", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nLike(String value) {
            addCriterion("e_sdef1n like", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nNotLike(String value) {
            addCriterion("e_sdef1n not like", value, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nIn(List<String> values) {
            addCriterion("e_sdef1n in", values, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nNotIn(List<String> values) {
            addCriterion("e_sdef1n not in", values, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nBetween(String value1, String value2) {
            addCriterion("e_sdef1n between", value1, value2, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef1nNotBetween(String value1, String value2) {
            addCriterion("e_sdef1n not between", value1, value2, "eSdef1n");
            return (Criteria) this;
        }

        public Criteria andESdef2nIsNull() {
            addCriterion("e_sdef2n is null");
            return (Criteria) this;
        }

        public Criteria andESdef2nIsNotNull() {
            addCriterion("e_sdef2n is not null");
            return (Criteria) this;
        }

        public Criteria andESdef2nEqualTo(String value) {
            addCriterion("e_sdef2n =", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nNotEqualTo(String value) {
            addCriterion("e_sdef2n <>", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nGreaterThan(String value) {
            addCriterion("e_sdef2n >", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nGreaterThanOrEqualTo(String value) {
            addCriterion("e_sdef2n >=", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nLessThan(String value) {
            addCriterion("e_sdef2n <", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nLessThanOrEqualTo(String value) {
            addCriterion("e_sdef2n <=", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nLike(String value) {
            addCriterion("e_sdef2n like", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nNotLike(String value) {
            addCriterion("e_sdef2n not like", value, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nIn(List<String> values) {
            addCriterion("e_sdef2n in", values, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nNotIn(List<String> values) {
            addCriterion("e_sdef2n not in", values, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nBetween(String value1, String value2) {
            addCriterion("e_sdef2n between", value1, value2, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andESdef2nNotBetween(String value1, String value2) {
            addCriterion("e_sdef2n not between", value1, value2, "eSdef2n");
            return (Criteria) this;
        }

        public Criteria andETadef1nIsNull() {
            addCriterion("e_tadef1n is null");
            return (Criteria) this;
        }

        public Criteria andETadef1nIsNotNull() {
            addCriterion("e_tadef1n is not null");
            return (Criteria) this;
        }

        public Criteria andETadef1nEqualTo(String value) {
            addCriterion("e_tadef1n =", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nNotEqualTo(String value) {
            addCriterion("e_tadef1n <>", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nGreaterThan(String value) {
            addCriterion("e_tadef1n >", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nGreaterThanOrEqualTo(String value) {
            addCriterion("e_tadef1n >=", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nLessThan(String value) {
            addCriterion("e_tadef1n <", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nLessThanOrEqualTo(String value) {
            addCriterion("e_tadef1n <=", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nLike(String value) {
            addCriterion("e_tadef1n like", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nNotLike(String value) {
            addCriterion("e_tadef1n not like", value, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nIn(List<String> values) {
            addCriterion("e_tadef1n in", values, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nNotIn(List<String> values) {
            addCriterion("e_tadef1n not in", values, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nBetween(String value1, String value2) {
            addCriterion("e_tadef1n between", value1, value2, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef1nNotBetween(String value1, String value2) {
            addCriterion("e_tadef1n not between", value1, value2, "eTadef1n");
            return (Criteria) this;
        }

        public Criteria andETadef2nIsNull() {
            addCriterion("e_tadef2n is null");
            return (Criteria) this;
        }

        public Criteria andETadef2nIsNotNull() {
            addCriterion("e_tadef2n is not null");
            return (Criteria) this;
        }

        public Criteria andETadef2nEqualTo(String value) {
            addCriterion("e_tadef2n =", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nNotEqualTo(String value) {
            addCriterion("e_tadef2n <>", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nGreaterThan(String value) {
            addCriterion("e_tadef2n >", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nGreaterThanOrEqualTo(String value) {
            addCriterion("e_tadef2n >=", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nLessThan(String value) {
            addCriterion("e_tadef2n <", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nLessThanOrEqualTo(String value) {
            addCriterion("e_tadef2n <=", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nLike(String value) {
            addCriterion("e_tadef2n like", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nNotLike(String value) {
            addCriterion("e_tadef2n not like", value, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nIn(List<String> values) {
            addCriterion("e_tadef2n in", values, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nNotIn(List<String> values) {
            addCriterion("e_tadef2n not in", values, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nBetween(String value1, String value2) {
            addCriterion("e_tadef2n between", value1, value2, "eTadef2n");
            return (Criteria) this;
        }

        public Criteria andETadef2nNotBetween(String value1, String value2) {
            addCriterion("e_tadef2n not between", value1, value2, "eTadef2n");
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