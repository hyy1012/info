package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class N25175AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175AdminExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andBy(String code) {
            addCriterion(code);
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNull() {
            addCriterion("a_username is null");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNotNull() {
            addCriterion("a_username is not null");
            return (Criteria) this;
        }

        public Criteria andAUsernameEqualTo(String value) {
            addCriterion("a_username =", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotEqualTo(String value) {
            addCriterion("a_username <>", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThan(String value) {
            addCriterion("a_username >", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("a_username >=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThan(String value) {
            addCriterion("a_username <", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThanOrEqualTo(String value) {
            addCriterion("a_username <=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLike(String value) {
            addCriterion("a_username like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotLike(String value) {
            addCriterion("a_username not like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameIn(List<String> values) {
            addCriterion("a_username in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotIn(List<String> values) {
            addCriterion("a_username not in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameBetween(String value1, String value2) {
            addCriterion("a_username between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotBetween(String value1, String value2) {
            addCriterion("a_username not between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNull() {
            addCriterion("a_password is null");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNotNull() {
            addCriterion("a_password is not null");
            return (Criteria) this;
        }

        public Criteria andAPasswordEqualTo(String value) {
            addCriterion("a_password =", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotEqualTo(String value) {
            addCriterion("a_password <>", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThan(String value) {
            addCriterion("a_password >", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("a_password >=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThan(String value) {
            addCriterion("a_password <", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThanOrEqualTo(String value) {
            addCriterion("a_password <=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLike(String value) {
            addCriterion("a_password like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotLike(String value) {
            addCriterion("a_password not like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordIn(List<String> values) {
            addCriterion("a_password in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotIn(List<String> values) {
            addCriterion("a_password not in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordBetween(String value1, String value2) {
            addCriterion("a_password between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotBetween(String value1, String value2) {
            addCriterion("a_password not between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andARoleIsNull() {
            addCriterion("a_role is null");
            return (Criteria) this;
        }

        public Criteria andARoleIsNotNull() {
            addCriterion("a_role is not null");
            return (Criteria) this;
        }

        public Criteria andARoleEqualTo(Integer value) {
            addCriterion("a_role =", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotEqualTo(Integer value) {
            addCriterion("a_role <>", value, "aRole");
            return (Criteria) this;
        }

        //lusifer 扩展
        public Criteria andARoleNotEqualToOrARoleIsNull(Integer value) {
            addCriterion("(a_role <> " + value + " or a_role is null)");
            return (Criteria) this;
        }

        public Criteria andARoleGreaterThan(Integer value) {
            addCriterion("a_role >", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_role >=", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleLessThan(Integer value) {
            addCriterion("a_role <", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleLessThanOrEqualTo(Integer value) {
            addCriterion("a_role <=", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleIn(List<Integer> values) {
            addCriterion("a_role in", values, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotIn(List<Integer> values) {
            addCriterion("a_role not in", values, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleBetween(Integer value1, Integer value2) {
            addCriterion("a_role between", value1, value2, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotBetween(Integer value1, Integer value2) {
            addCriterion("a_role not between", value1, value2, "aRole");
            return (Criteria) this;
        }

        public Criteria andAStatusIsNull() {
            addCriterion("a_status is null");
            return (Criteria) this;
        }

        public Criteria andAStatusIsNotNull() {
            addCriterion("a_status is not null");
            return (Criteria) this;
        }

        public Criteria andAStatusEqualTo(Integer value) {
            addCriterion("a_status =", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotEqualTo(Integer value) {
            addCriterion("a_status <>", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusGreaterThan(Integer value) {
            addCriterion("a_status >", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_status >=", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusLessThan(Integer value) {
            addCriterion("a_status <", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusLessThanOrEqualTo(Integer value) {
            addCriterion("a_status <=", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusIn(List<Integer> values) {
            addCriterion("a_status in", values, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotIn(List<Integer> values) {
            addCriterion("a_status not in", values, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusBetween(Integer value1, Integer value2) {
            addCriterion("a_status between", value1, value2, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("a_status not between", value1, value2, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAEditIsNull() {
            addCriterion("a_edit is null");
            return (Criteria) this;
        }

        public Criteria andAEditIsNotNull() {
            addCriterion("a_edit is not null");
            return (Criteria) this;
        }

        public Criteria andAEditEqualTo(Integer value) {
            addCriterion("a_edit =", value, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditNotEqualTo(Integer value) {
            addCriterion("a_edit <>", value, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditGreaterThan(Integer value) {
            addCriterion("a_edit >", value, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_edit >=", value, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditLessThan(Integer value) {
            addCriterion("a_edit <", value, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditLessThanOrEqualTo(Integer value) {
            addCriterion("a_edit <=", value, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditIn(List<Integer> values) {
            addCriterion("a_edit in", values, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditNotIn(List<Integer> values) {
            addCriterion("a_edit not in", values, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditBetween(Integer value1, Integer value2) {
            addCriterion("a_edit between", value1, value2, "aEdit");
            return (Criteria) this;
        }

        public Criteria andAEditNotBetween(Integer value1, Integer value2) {
            addCriterion("a_edit not between", value1, value2, "aEdit");
            return (Criteria) this;
        }

        public Criteria andADateIsNull() {
            addCriterion("a_date is null");
            return (Criteria) this;
        }

        public Criteria andADateIsNotNull() {
            addCriterion("a_date is not null");
            return (Criteria) this;
        }

        public Criteria andADateEqualTo(Date value) {
            addCriterionForJDBCDate("a_date =", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotEqualTo(Date value) {
            addCriterionForJDBCDate("a_date <>", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateGreaterThan(Date value) {
            addCriterionForJDBCDate("a_date >", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("a_date >=", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateLessThan(Date value) {
            addCriterionForJDBCDate("a_date <", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("a_date <=", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateIn(List<Date> values) {
            addCriterionForJDBCDate("a_date in", values, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotIn(List<Date> values) {
            addCriterionForJDBCDate("a_date not in", values, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("a_date between", value1, value2, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("a_date not between", value1, value2, "aDate");
            return (Criteria) this;
        }

        public Criteria andASubtimeIsNull() {
            addCriterion("a_subTime is null");
            return (Criteria) this;
        }

        public Criteria andASubtimeIsNotNull() {
            addCriterion("a_subTime is not null");
            return (Criteria) this;
        }

        public Criteria andASubtimeEqualTo(Date value) {
            addCriterionForJDBCDate("a_subTime =", value, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("a_subTime <>", value, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("a_subTime >", value, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("a_subTime >=", value, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeLessThan(Date value) {
            addCriterionForJDBCDate("a_subTime <", value, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("a_subTime <=", value, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeIn(List<Date> values) {
            addCriterionForJDBCDate("a_subTime in", values, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("a_subTime not in", values, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("a_subTime between", value1, value2, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASubtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("a_subTime not between", value1, value2, "aSubtime");
            return (Criteria) this;
        }

        public Criteria andASumIsNull() {
            addCriterion("a_sum is null");
            return (Criteria) this;
        }

        public Criteria andASumIsNotNull() {
            addCriterion("a_sum is not null");
            return (Criteria) this;
        }

        public Criteria andASumEqualTo(String value) {
            addCriterion("a_sum =", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotEqualTo(String value) {
            addCriterion("a_sum <>", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumGreaterThan(String value) {
            addCriterion("a_sum >", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumGreaterThanOrEqualTo(String value) {
            addCriterion("a_sum >=", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumLessThan(String value) {
            addCriterion("a_sum <", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumLessThanOrEqualTo(String value) {
            addCriterion("a_sum <=", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumLike(String value) {
            addCriterion("a_sum like", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotLike(String value) {
            addCriterion("a_sum not like", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumIn(List<String> values) {
            addCriterion("a_sum in", values, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotIn(List<String> values) {
            addCriterion("a_sum not in", values, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumBetween(String value1, String value2) {
            addCriterion("a_sum between", value1, value2, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotBetween(String value1, String value2) {
            addCriterion("a_sum not between", value1, value2, "aSum");
            return (Criteria) this;
        }

        public Criteria andASubIsNull() {
            addCriterion("a_sub is null");
            return (Criteria) this;
        }

        public Criteria andASubIsNotNull() {
            addCriterion("a_sub is not null");
            return (Criteria) this;
        }

        public Criteria andASubEqualTo(Integer value) {
            addCriterion("a_sub =", value, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubNotEqualTo(Integer value) {
            addCriterion("a_sub <>", value, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubGreaterThan(Integer value) {
            addCriterion("a_sub >", value, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_sub >=", value, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubLessThan(Integer value) {
            addCriterion("a_sub <", value, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubLessThanOrEqualTo(Integer value) {
            addCriterion("a_sub <=", value, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubIn(List<Integer> values) {
            addCriterion("a_sub in", values, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubNotIn(List<Integer> values) {
            addCriterion("a_sub not in", values, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubBetween(Integer value1, Integer value2) {
            addCriterion("a_sub between", value1, value2, "aSub");
            return (Criteria) this;
        }

        public Criteria andASubNotBetween(Integer value1, Integer value2) {
            addCriterion("a_sub not between", value1, value2, "aSub");
            return (Criteria) this;
        }

        public Criteria andAJnumIsNull() {
            addCriterion("a_jnum is null");
            return (Criteria) this;
        }

        public Criteria andAJnumIsNotNull() {
            addCriterion("a_jnum is not null");
            return (Criteria) this;
        }

        public Criteria andAJnumEqualTo(Integer value) {
            addCriterion("a_jnum =", value, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumNotEqualTo(Integer value) {
            addCriterion("a_jnum <>", value, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumGreaterThan(Integer value) {
            addCriterion("a_jnum >", value, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_jnum >=", value, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumLessThan(Integer value) {
            addCriterion("a_jnum <", value, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumLessThanOrEqualTo(Integer value) {
            addCriterion("a_jnum <=", value, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumIn(List<Integer> values) {
            addCriterion("a_jnum in", values, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumNotIn(List<Integer> values) {
            addCriterion("a_jnum not in", values, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumBetween(Integer value1, Integer value2) {
            addCriterion("a_jnum between", value1, value2, "aJnum");
            return (Criteria) this;
        }

        public Criteria andAJnumNotBetween(Integer value1, Integer value2) {
            addCriterion("a_jnum not between", value1, value2, "aJnum");
            return (Criteria) this;
        }

        public Criteria andADepartIsNull() {
            addCriterion("a_depart is null");
            return (Criteria) this;
        }

        public Criteria andADepartIsNotNull() {
            addCriterion("a_depart is not null");
            return (Criteria) this;
        }

        public Criteria andADepartEqualTo(Integer value) {
            addCriterion("a_depart =", value, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartNotEqualTo(Integer value) {
            addCriterion("a_depart <>", value, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartGreaterThan(Integer value) {
            addCriterion("a_depart >", value, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_depart >=", value, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartLessThan(Integer value) {
            addCriterion("a_depart <", value, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartLessThanOrEqualTo(Integer value) {
            addCriterion("a_depart <=", value, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartIn(List<Integer> values) {
            addCriterion("a_depart in", values, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartNotIn(List<Integer> values) {
            addCriterion("a_depart not in", values, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartBetween(Integer value1, Integer value2) {
            addCriterion("a_depart between", value1, value2, "aDepart");
            return (Criteria) this;
        }

        public Criteria andADepartNotBetween(Integer value1, Integer value2) {
            addCriterion("a_depart not between", value1, value2, "aDepart");
            return (Criteria) this;
        }

        public Criteria andOrStatus(Integer value1, Integer value2) {
            addCriterion("(a_status=" + value1 + " or a_status="+value2+")");
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