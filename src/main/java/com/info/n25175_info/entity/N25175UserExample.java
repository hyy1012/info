package com.info.n25175_info.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class N25175UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public N25175UserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUAidIsNull() {
            addCriterion("u_aid is null");
            return (Criteria) this;
        }

        public Criteria andUAidIsNotNull() {
            addCriterion("u_aid is not null");
            return (Criteria) this;
        }

        public Criteria andUAidEqualTo(Integer value) {
            addCriterion("u_aid =", value, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidNotEqualTo(Integer value) {
            addCriterion("u_aid <>", value, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidGreaterThan(Integer value) {
            addCriterion("u_aid >", value, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_aid >=", value, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidLessThan(Integer value) {
            addCriterion("u_aid <", value, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidLessThanOrEqualTo(Integer value) {
            addCriterion("u_aid <=", value, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidIn(List<Integer> values) {
            addCriterion("u_aid in", values, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidNotIn(List<Integer> values) {
            addCriterion("u_aid not in", values, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidBetween(Integer value1, Integer value2) {
            addCriterion("u_aid between", value1, value2, "uAid");
            return (Criteria) this;
        }

        public Criteria andUAidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_aid not between", value1, value2, "uAid");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUProvinceIsNull() {
            addCriterion("u_province is null");
            return (Criteria) this;
        }

        public Criteria andUProvinceIsNotNull() {
            addCriterion("u_province is not null");
            return (Criteria) this;
        }

        public Criteria andUProvinceEqualTo(String value) {
            addCriterion("u_province =", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotEqualTo(String value) {
            addCriterion("u_province <>", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceGreaterThan(String value) {
            addCriterion("u_province >", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("u_province >=", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceLessThan(String value) {
            addCriterion("u_province <", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceLessThanOrEqualTo(String value) {
            addCriterion("u_province <=", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceLike(String value) {
            addCriterion("u_province like", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotLike(String value) {
            addCriterion("u_province not like", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceIn(List<String> values) {
            addCriterion("u_province in", values, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotIn(List<String> values) {
            addCriterion("u_province not in", values, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceBetween(String value1, String value2) {
            addCriterion("u_province between", value1, value2, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotBetween(String value1, String value2) {
            addCriterion("u_province not between", value1, value2, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUCityIsNull() {
            addCriterion("u_city is null");
            return (Criteria) this;
        }

        public Criteria andUCityIsNotNull() {
            addCriterion("u_city is not null");
            return (Criteria) this;
        }

        public Criteria andUCityEqualTo(String value) {
            addCriterion("u_city =", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotEqualTo(String value) {
            addCriterion("u_city <>", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThan(String value) {
            addCriterion("u_city >", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThanOrEqualTo(String value) {
            addCriterion("u_city >=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThan(String value) {
            addCriterion("u_city <", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThanOrEqualTo(String value) {
            addCriterion("u_city <=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLike(String value) {
            addCriterion("u_city like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotLike(String value) {
            addCriterion("u_city not like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityIn(List<String> values) {
            addCriterion("u_city in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotIn(List<String> values) {
            addCriterion("u_city not in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityBetween(String value1, String value2) {
            addCriterion("u_city between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotBetween(String value1, String value2) {
            addCriterion("u_city not between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUPictureIsNull() {
            addCriterion("u_picture is null");
            return (Criteria) this;
        }

        public Criteria andUPictureIsNotNull() {
            addCriterion("u_picture is not null");
            return (Criteria) this;
        }

        public Criteria andUPictureEqualTo(String value) {
            addCriterion("u_picture =", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureNotEqualTo(String value) {
            addCriterion("u_picture <>", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureGreaterThan(String value) {
            addCriterion("u_picture >", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureGreaterThanOrEqualTo(String value) {
            addCriterion("u_picture >=", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureLessThan(String value) {
            addCriterion("u_picture <", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureLessThanOrEqualTo(String value) {
            addCriterion("u_picture <=", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureLike(String value) {
            addCriterion("u_picture like", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureNotLike(String value) {
            addCriterion("u_picture not like", value, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureIn(List<String> values) {
            addCriterion("u_picture in", values, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureNotIn(List<String> values) {
            addCriterion("u_picture not in", values, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureBetween(String value1, String value2) {
            addCriterion("u_picture between", value1, value2, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUPictureNotBetween(String value1, String value2) {
            addCriterion("u_picture not between", value1, value2, "uPicture");
            return (Criteria) this;
        }

        public Criteria andUMarriedIsNull() {
            addCriterion("u_married is null");
            return (Criteria) this;
        }

        public Criteria andUMarriedIsNotNull() {
            addCriterion("u_married is not null");
            return (Criteria) this;
        }

        public Criteria andUMarriedEqualTo(Integer value) {
            addCriterion("u_married =", value, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedNotEqualTo(Integer value) {
            addCriterion("u_married <>", value, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedGreaterThan(Integer value) {
            addCriterion("u_married >", value, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_married >=", value, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedLessThan(Integer value) {
            addCriterion("u_married <", value, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedLessThanOrEqualTo(Integer value) {
            addCriterion("u_married <=", value, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedIn(List<Integer> values) {
            addCriterion("u_married in", values, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedNotIn(List<Integer> values) {
            addCriterion("u_married not in", values, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedBetween(Integer value1, Integer value2) {
            addCriterion("u_married between", value1, value2, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUMarriedNotBetween(Integer value1, Integer value2) {
            addCriterion("u_married not between", value1, value2, "uMarried");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Integer value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Integer value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Integer value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Integer value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Integer value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Integer> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Integer> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Integer value1, Integer value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Integer value1, Integer value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUIdentityIsNull() {
            addCriterion("u_identity is null");
            return (Criteria) this;
        }

        public Criteria andUIdentityIsNotNull() {
            addCriterion("u_identity is not null");
            return (Criteria) this;
        }

        public Criteria andUIdentityEqualTo(String value) {
            addCriterion("u_identity =", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotEqualTo(String value) {
            addCriterion("u_identity <>", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityGreaterThan(String value) {
            addCriterion("u_identity >", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("u_identity >=", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityLessThan(String value) {
            addCriterion("u_identity <", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityLessThanOrEqualTo(String value) {
            addCriterion("u_identity <=", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityLike(String value) {
            addCriterion("u_identity like", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotLike(String value) {
            addCriterion("u_identity not like", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityIn(List<String> values) {
            addCriterion("u_identity in", values, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotIn(List<String> values) {
            addCriterion("u_identity not in", values, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityBetween(String value1, String value2) {
            addCriterion("u_identity between", value1, value2, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotBetween(String value1, String value2) {
            addCriterion("u_identity not between", value1, value2, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUBornIsNull() {
            addCriterion("u_born is null");
            return (Criteria) this;
        }

        public Criteria andUBornIsNotNull() {
            addCriterion("u_born is not null");
            return (Criteria) this;
        }

        public Criteria andUBornEqualTo(Date value) {
            addCriterionForJDBCDate("u_born =", value, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_born <>", value, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornGreaterThan(Date value) {
            addCriterionForJDBCDate("u_born >", value, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_born >=", value, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornLessThan(Date value) {
            addCriterionForJDBCDate("u_born <", value, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_born <=", value, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornIn(List<Date> values) {
            addCriterionForJDBCDate("u_born in", values, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_born not in", values, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_born between", value1, value2, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUBornNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_born not between", value1, value2, "uBorn");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNull() {
            addCriterion("u_age is null");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNotNull() {
            addCriterion("u_age is not null");
            return (Criteria) this;
        }

        public Criteria andUAgeEqualTo(Integer value) {
            addCriterion("u_age =", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotEqualTo(Integer value) {
            addCriterion("u_age <>", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThan(Integer value) {
            addCriterion("u_age >", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_age >=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThan(Integer value) {
            addCriterion("u_age <", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThanOrEqualTo(Integer value) {
            addCriterion("u_age <=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeIn(List<Integer> values) {
            addCriterion("u_age in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotIn(List<Integer> values) {
            addCriterion("u_age not in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeBetween(Integer value1, Integer value2) {
            addCriterion("u_age between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("u_age not between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUHeightIsNull() {
            addCriterion("u_height is null");
            return (Criteria) this;
        }

        public Criteria andUHeightIsNotNull() {
            addCriterion("u_height is not null");
            return (Criteria) this;
        }

        public Criteria andUHeightEqualTo(Integer value) {
            addCriterion("u_height =", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotEqualTo(Integer value) {
            addCriterion("u_height <>", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightGreaterThan(Integer value) {
            addCriterion("u_height >", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_height >=", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightLessThan(Integer value) {
            addCriterion("u_height <", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightLessThanOrEqualTo(Integer value) {
            addCriterion("u_height <=", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightIn(List<Integer> values) {
            addCriterion("u_height in", values, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotIn(List<Integer> values) {
            addCriterion("u_height not in", values, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightBetween(Integer value1, Integer value2) {
            addCriterion("u_height between", value1, value2, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("u_height not between", value1, value2, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUEthnicIsNull() {
            addCriterion("u_ethnic is null");
            return (Criteria) this;
        }

        public Criteria andUEthnicIsNotNull() {
            addCriterion("u_ethnic is not null");
            return (Criteria) this;
        }

        public Criteria andUEthnicEqualTo(Integer value) {
            addCriterion("u_ethnic =", value, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicNotEqualTo(Integer value) {
            addCriterion("u_ethnic <>", value, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicGreaterThan(Integer value) {
            addCriterion("u_ethnic >", value, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_ethnic >=", value, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicLessThan(Integer value) {
            addCriterion("u_ethnic <", value, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicLessThanOrEqualTo(Integer value) {
            addCriterion("u_ethnic <=", value, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicIn(List<Integer> values) {
            addCriterion("u_ethnic in", values, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicNotIn(List<Integer> values) {
            addCriterion("u_ethnic not in", values, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicBetween(Integer value1, Integer value2) {
            addCriterion("u_ethnic between", value1, value2, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUEthnicNotBetween(Integer value1, Integer value2) {
            addCriterion("u_ethnic not between", value1, value2, "uEthnic");
            return (Criteria) this;
        }

        public Criteria andUPolityIsNull() {
            addCriterion("u_polity is null");
            return (Criteria) this;
        }

        public Criteria andUPolityIsNotNull() {
            addCriterion("u_polity is not null");
            return (Criteria) this;
        }

        public Criteria andUPolityEqualTo(Integer value) {
            addCriterion("u_polity =", value, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityNotEqualTo(Integer value) {
            addCriterion("u_polity <>", value, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityGreaterThan(Integer value) {
            addCriterion("u_polity >", value, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_polity >=", value, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityLessThan(Integer value) {
            addCriterion("u_polity <", value, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityLessThanOrEqualTo(Integer value) {
            addCriterion("u_polity <=", value, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityIn(List<Integer> values) {
            addCriterion("u_polity in", values, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityNotIn(List<Integer> values) {
            addCriterion("u_polity not in", values, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityBetween(Integer value1, Integer value2) {
            addCriterion("u_polity between", value1, value2, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUPolityNotBetween(Integer value1, Integer value2) {
            addCriterion("u_polity not between", value1, value2, "uPolity");
            return (Criteria) this;
        }

        public Criteria andUSubscriptIsNull() {
            addCriterion("u_subscript is null");
            return (Criteria) this;
        }

        public Criteria andUSubscriptIsNotNull() {
            addCriterion("u_subscript is not null");
            return (Criteria) this;
        }

        public Criteria andUSubscriptEqualTo(Integer value) {
            addCriterion("u_subscript =", value, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptNotEqualTo(Integer value) {
            addCriterion("u_subscript <>", value, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptGreaterThan(Integer value) {
            addCriterion("u_subscript >", value, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_subscript >=", value, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptLessThan(Integer value) {
            addCriterion("u_subscript <", value, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptLessThanOrEqualTo(Integer value) {
            addCriterion("u_subscript <=", value, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptIn(List<Integer> values) {
            addCriterion("u_subscript in", values, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptNotIn(List<Integer> values) {
            addCriterion("u_subscript not in", values, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptBetween(Integer value1, Integer value2) {
            addCriterion("u_subscript between", value1, value2, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUSubscriptNotBetween(Integer value1, Integer value2) {
            addCriterion("u_subscript not between", value1, value2, "uSubscript");
            return (Criteria) this;
        }

        public Criteria andUPostIsNull() {
            addCriterion("u_post is null");
            return (Criteria) this;
        }

        public Criteria andUPostIsNotNull() {
            addCriterion("u_post is not null");
            return (Criteria) this;
        }

        public Criteria andUPostEqualTo(Integer value) {
            addCriterion("u_post =", value, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostNotEqualTo(Integer value) {
            addCriterion("u_post <>", value, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostGreaterThan(Integer value) {
            addCriterion("u_post >", value, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_post >=", value, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostLessThan(Integer value) {
            addCriterion("u_post <", value, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostLessThanOrEqualTo(Integer value) {
            addCriterion("u_post <=", value, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostIn(List<Integer> values) {
            addCriterion("u_post in", values, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostNotIn(List<Integer> values) {
            addCriterion("u_post not in", values, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostBetween(Integer value1, Integer value2) {
            addCriterion("u_post between", value1, value2, "uPost");
            return (Criteria) this;
        }

        public Criteria andUPostNotBetween(Integer value1, Integer value2) {
            addCriterion("u_post not between", value1, value2, "uPost");
            return (Criteria) this;
        }

        public Criteria andUTreatmentIsNull() {
            addCriterion("u_treatment is null");
            return (Criteria) this;
        }

        public Criteria andUTreatmentIsNotNull() {
            addCriterion("u_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andUTreatmentEqualTo(Integer value) {
            addCriterion("u_treatment =", value, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentNotEqualTo(Integer value) {
            addCriterion("u_treatment <>", value, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentGreaterThan(Integer value) {
            addCriterion("u_treatment >", value, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_treatment >=", value, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentLessThan(Integer value) {
            addCriterion("u_treatment <", value, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentLessThanOrEqualTo(Integer value) {
            addCriterion("u_treatment <=", value, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentIn(List<Integer> values) {
            addCriterion("u_treatment in", values, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentNotIn(List<Integer> values) {
            addCriterion("u_treatment not in", values, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentBetween(Integer value1, Integer value2) {
            addCriterion("u_treatment between", value1, value2, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUTreatmentNotBetween(Integer value1, Integer value2) {
            addCriterion("u_treatment not between", value1, value2, "uTreatment");
            return (Criteria) this;
        }

        public Criteria andUWorkIsNull() {
            addCriterion("u_work is null");
            return (Criteria) this;
        }

        public Criteria andUWorkIsNotNull() {
            addCriterion("u_work is not null");
            return (Criteria) this;
        }

        public Criteria andUWorkEqualTo(Date value) {
            addCriterionForJDBCDate("u_work =", value, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_work <>", value, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkGreaterThan(Date value) {
            addCriterionForJDBCDate("u_work >", value, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_work >=", value, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkLessThan(Date value) {
            addCriterionForJDBCDate("u_work <", value, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_work <=", value, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkIn(List<Date> values) {
            addCriterionForJDBCDate("u_work in", values, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_work not in", values, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_work between", value1, value2, "uWork");
            return (Criteria) this;
        }

        public Criteria andUWorkNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_work not between", value1, value2, "uWork");
            return (Criteria) this;
        }

        public Criteria andUBecomeIsNull() {
            addCriterion("u_become is null");
            return (Criteria) this;
        }

        public Criteria andUBecomeIsNotNull() {
            addCriterion("u_become is not null");
            return (Criteria) this;
        }

        public Criteria andUBecomeEqualTo(Date value) {
            addCriterionForJDBCDate("u_become =", value, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_become <>", value, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeGreaterThan(Date value) {
            addCriterionForJDBCDate("u_become >", value, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_become >=", value, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeLessThan(Date value) {
            addCriterionForJDBCDate("u_become <", value, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_become <=", value, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeIn(List<Date> values) {
            addCriterionForJDBCDate("u_become in", values, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_become not in", values, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_become between", value1, value2, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUBecomeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_become not between", value1, value2, "uBecome");
            return (Criteria) this;
        }

        public Criteria andUOutIsNull() {
            addCriterion("u_out is null");
            return (Criteria) this;
        }

        public Criteria andUOutIsNotNull() {
            addCriterion("u_out is not null");
            return (Criteria) this;
        }

        public Criteria andUOutEqualTo(Date value) {
            addCriterionForJDBCDate("u_out =", value, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_out <>", value, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutGreaterThan(Date value) {
            addCriterionForJDBCDate("u_out >", value, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_out >=", value, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutLessThan(Date value) {
            addCriterionForJDBCDate("u_out <", value, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_out <=", value, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutIn(List<Date> values) {
            addCriterionForJDBCDate("u_out in", values, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_out not in", values, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_out between", value1, value2, "uOut");
            return (Criteria) this;
        }

        public Criteria andUOutNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_out not between", value1, value2, "uOut");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNull() {
            addCriterion("u_address is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("u_address is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("u_address =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("u_address <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("u_address >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_address >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("u_address <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("u_address <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("u_address like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("u_address not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("u_address in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("u_address not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("u_address between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("u_address not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUWxIsNull() {
            addCriterion("u_wx is null");
            return (Criteria) this;
        }

        public Criteria andUWxIsNotNull() {
            addCriterion("u_wx is not null");
            return (Criteria) this;
        }

        public Criteria andUWxEqualTo(String value) {
            addCriterion("u_wx =", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotEqualTo(String value) {
            addCriterion("u_wx <>", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxGreaterThan(String value) {
            addCriterion("u_wx >", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxGreaterThanOrEqualTo(String value) {
            addCriterion("u_wx >=", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxLessThan(String value) {
            addCriterion("u_wx <", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxLessThanOrEqualTo(String value) {
            addCriterion("u_wx <=", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxLike(String value) {
            addCriterion("u_wx like", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotLike(String value) {
            addCriterion("u_wx not like", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxIn(List<String> values) {
            addCriterion("u_wx in", values, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotIn(List<String> values) {
            addCriterion("u_wx not in", values, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxBetween(String value1, String value2) {
            addCriterion("u_wx between", value1, value2, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotBetween(String value1, String value2) {
            addCriterion("u_wx not between", value1, value2, "uWx");
            return (Criteria) this;
        }

        public Criteria andUQqIsNull() {
            addCriterion("u_qq is null");
            return (Criteria) this;
        }

        public Criteria andUQqIsNotNull() {
            addCriterion("u_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUQqEqualTo(String value) {
            addCriterion("u_qq =", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotEqualTo(String value) {
            addCriterion("u_qq <>", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThan(String value) {
            addCriterion("u_qq >", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThanOrEqualTo(String value) {
            addCriterion("u_qq >=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThan(String value) {
            addCriterion("u_qq <", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThanOrEqualTo(String value) {
            addCriterion("u_qq <=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLike(String value) {
            addCriterion("u_qq like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotLike(String value) {
            addCriterion("u_qq not like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqIn(List<String> values) {
            addCriterion("u_qq in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotIn(List<String> values) {
            addCriterion("u_qq not in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqBetween(String value1, String value2) {
            addCriterion("u_qq between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotBetween(String value1, String value2) {
            addCriterion("u_qq not between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUFirstIsNull() {
            addCriterion("u_first is null");
            return (Criteria) this;
        }

        public Criteria andUFirstIsNotNull() {
            addCriterion("u_first is not null");
            return (Criteria) this;
        }

        public Criteria andUFirstEqualTo(Integer value) {
            addCriterion("u_first =", value, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstNotEqualTo(Integer value) {
            addCriterion("u_first <>", value, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstGreaterThan(Integer value) {
            addCriterion("u_first >", value, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_first >=", value, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstLessThan(Integer value) {
            addCriterion("u_first <", value, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstLessThanOrEqualTo(Integer value) {
            addCriterion("u_first <=", value, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstIn(List<Integer> values) {
            addCriterion("u_first in", values, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstNotIn(List<Integer> values) {
            addCriterion("u_first not in", values, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstBetween(Integer value1, Integer value2) {
            addCriterion("u_first between", value1, value2, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstNotBetween(Integer value1, Integer value2) {
            addCriterion("u_first not between", value1, value2, "uFirst");
            return (Criteria) this;
        }

        public Criteria andUFirstStartIsNull() {
            addCriterion("u_first_start is null");
            return (Criteria) this;
        }

        public Criteria andUFirstStartIsNotNull() {
            addCriterion("u_first_start is not null");
            return (Criteria) this;
        }

        public Criteria andUFirstStartEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_start =", value, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_start <>", value, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartGreaterThan(Date value) {
            addCriterionForJDBCDate("u_first_start >", value, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_start >=", value, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartLessThan(Date value) {
            addCriterionForJDBCDate("u_first_start <", value, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_start <=", value, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartIn(List<Date> values) {
            addCriterionForJDBCDate("u_first_start in", values, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_first_start not in", values, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_first_start between", value1, value2, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_first_start not between", value1, value2, "uFirstStart");
            return (Criteria) this;
        }

        public Criteria andUFirstEndIsNull() {
            addCriterion("u_first_end is null");
            return (Criteria) this;
        }

        public Criteria andUFirstEndIsNotNull() {
            addCriterion("u_first_end is not null");
            return (Criteria) this;
        }

        public Criteria andUFirstEndEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_end =", value, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_end <>", value, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndGreaterThan(Date value) {
            addCriterionForJDBCDate("u_first_end >", value, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_end >=", value, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndLessThan(Date value) {
            addCriterionForJDBCDate("u_first_end <", value, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_first_end <=", value, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndIn(List<Date> values) {
            addCriterionForJDBCDate("u_first_end in", values, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_first_end not in", values, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_first_end between", value1, value2, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_first_end not between", value1, value2, "uFirstEnd");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolIsNull() {
            addCriterion("u_first_school is null");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolIsNotNull() {
            addCriterion("u_first_school is not null");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolEqualTo(String value) {
            addCriterion("u_first_school =", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolNotEqualTo(String value) {
            addCriterion("u_first_school <>", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolGreaterThan(String value) {
            addCriterion("u_first_school >", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("u_first_school >=", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolLessThan(String value) {
            addCriterion("u_first_school <", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolLessThanOrEqualTo(String value) {
            addCriterion("u_first_school <=", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolLike(String value) {
            addCriterion("u_first_school like", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolNotLike(String value) {
            addCriterion("u_first_school not like", value, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolIn(List<String> values) {
            addCriterion("u_first_school in", values, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolNotIn(List<String> values) {
            addCriterion("u_first_school not in", values, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolBetween(String value1, String value2) {
            addCriterion("u_first_school between", value1, value2, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstSchoolNotBetween(String value1, String value2) {
            addCriterion("u_first_school not between", value1, value2, "uFirstSchool");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorIsNull() {
            addCriterion("u_first_major is null");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorIsNotNull() {
            addCriterion("u_first_major is not null");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorEqualTo(String value) {
            addCriterion("u_first_major =", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorNotEqualTo(String value) {
            addCriterion("u_first_major <>", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorGreaterThan(String value) {
            addCriterion("u_first_major >", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorGreaterThanOrEqualTo(String value) {
            addCriterion("u_first_major >=", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorLessThan(String value) {
            addCriterion("u_first_major <", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorLessThanOrEqualTo(String value) {
            addCriterion("u_first_major <=", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorLike(String value) {
            addCriterion("u_first_major like", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorNotLike(String value) {
            addCriterion("u_first_major not like", value, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorIn(List<String> values) {
            addCriterion("u_first_major in", values, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorNotIn(List<String> values) {
            addCriterion("u_first_major not in", values, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorBetween(String value1, String value2) {
            addCriterion("u_first_major between", value1, value2, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUFirstMajorNotBetween(String value1, String value2) {
            addCriterion("u_first_major not between", value1, value2, "uFirstMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakIsNull() {
            addCriterion("u_peak is null");
            return (Criteria) this;
        }

        public Criteria andUPeakIsNotNull() {
            addCriterion("u_peak is not null");
            return (Criteria) this;
        }

        public Criteria andUPeakEqualTo(Integer value) {
            addCriterion("u_peak =", value, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakNotEqualTo(Integer value) {
            addCriterion("u_peak <>", value, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakGreaterThan(Integer value) {
            addCriterion("u_peak >", value, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_peak >=", value, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakLessThan(Integer value) {
            addCriterion("u_peak <", value, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakLessThanOrEqualTo(Integer value) {
            addCriterion("u_peak <=", value, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakIn(List<Integer> values) {
            addCriterion("u_peak in", values, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakNotIn(List<Integer> values) {
            addCriterion("u_peak not in", values, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakBetween(Integer value1, Integer value2) {
            addCriterion("u_peak between", value1, value2, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakNotBetween(Integer value1, Integer value2) {
            addCriterion("u_peak not between", value1, value2, "uPeak");
            return (Criteria) this;
        }

        public Criteria andUPeakStartIsNull() {
            addCriterion("u_peak_start is null");
            return (Criteria) this;
        }

        public Criteria andUPeakStartIsNotNull() {
            addCriterion("u_peak_start is not null");
            return (Criteria) this;
        }

        public Criteria andUPeakStartEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_start =", value, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_start <>", value, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartGreaterThan(Date value) {
            addCriterionForJDBCDate("u_peak_start >", value, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_start >=", value, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartLessThan(Date value) {
            addCriterionForJDBCDate("u_peak_start <", value, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_start <=", value, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartIn(List<Date> values) {
            addCriterionForJDBCDate("u_peak_start in", values, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_peak_start not in", values, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_peak_start between", value1, value2, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_peak_start not between", value1, value2, "uPeakStart");
            return (Criteria) this;
        }

        public Criteria andUPeakEndIsNull() {
            addCriterion("u_peak_end is null");
            return (Criteria) this;
        }

        public Criteria andUPeakEndIsNotNull() {
            addCriterion("u_peak_end is not null");
            return (Criteria) this;
        }

        public Criteria andUPeakEndEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_end =", value, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_end <>", value, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndGreaterThan(Date value) {
            addCriterionForJDBCDate("u_peak_end >", value, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_end >=", value, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndLessThan(Date value) {
            addCriterionForJDBCDate("u_peak_end <", value, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_peak_end <=", value, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndIn(List<Date> values) {
            addCriterionForJDBCDate("u_peak_end in", values, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_peak_end not in", values, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_peak_end between", value1, value2, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_peak_end not between", value1, value2, "uPeakEnd");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolIsNull() {
            addCriterion("u_peak_school is null");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolIsNotNull() {
            addCriterion("u_peak_school is not null");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolEqualTo(String value) {
            addCriterion("u_peak_school =", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolNotEqualTo(String value) {
            addCriterion("u_peak_school <>", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolGreaterThan(String value) {
            addCriterion("u_peak_school >", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("u_peak_school >=", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolLessThan(String value) {
            addCriterion("u_peak_school <", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolLessThanOrEqualTo(String value) {
            addCriterion("u_peak_school <=", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolLike(String value) {
            addCriterion("u_peak_school like", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolNotLike(String value) {
            addCriterion("u_peak_school not like", value, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolIn(List<String> values) {
            addCriterion("u_peak_school in", values, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolNotIn(List<String> values) {
            addCriterion("u_peak_school not in", values, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolBetween(String value1, String value2) {
            addCriterion("u_peak_school between", value1, value2, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakSchoolNotBetween(String value1, String value2) {
            addCriterion("u_peak_school not between", value1, value2, "uPeakSchool");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorIsNull() {
            addCriterion("u_peak_major is null");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorIsNotNull() {
            addCriterion("u_peak_major is not null");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorEqualTo(String value) {
            addCriterion("u_peak_major =", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorNotEqualTo(String value) {
            addCriterion("u_peak_major <>", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorGreaterThan(String value) {
            addCriterion("u_peak_major >", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorGreaterThanOrEqualTo(String value) {
            addCriterion("u_peak_major >=", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorLessThan(String value) {
            addCriterion("u_peak_major <", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorLessThanOrEqualTo(String value) {
            addCriterion("u_peak_major <=", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorLike(String value) {
            addCriterion("u_peak_major like", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorNotLike(String value) {
            addCriterion("u_peak_major not like", value, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorIn(List<String> values) {
            addCriterion("u_peak_major in", values, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorNotIn(List<String> values) {
            addCriterion("u_peak_major not in", values, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorBetween(String value1, String value2) {
            addCriterion("u_peak_major between", value1, value2, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUPeakMajorNotBetween(String value1, String value2) {
            addCriterion("u_peak_major not between", value1, value2, "uPeakMajor");
            return (Criteria) this;
        }

        public Criteria andUOldAddressIsNull() {
            addCriterion("u_old_address is null");
            return (Criteria) this;
        }

        public Criteria andUOldAddressIsNotNull() {
            addCriterion("u_old_address is not null");
            return (Criteria) this;
        }

        public Criteria andUOldAddressEqualTo(String value) {
            addCriterion("u_old_address =", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressNotEqualTo(String value) {
            addCriterion("u_old_address <>", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressGreaterThan(String value) {
            addCriterion("u_old_address >", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_old_address >=", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressLessThan(String value) {
            addCriterion("u_old_address <", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressLessThanOrEqualTo(String value) {
            addCriterion("u_old_address <=", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressLike(String value) {
            addCriterion("u_old_address like", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressNotLike(String value) {
            addCriterion("u_old_address not like", value, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressIn(List<String> values) {
            addCriterion("u_old_address in", values, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressNotIn(List<String> values) {
            addCriterion("u_old_address not in", values, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressBetween(String value1, String value2) {
            addCriterion("u_old_address between", value1, value2, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUOldAddressNotBetween(String value1, String value2) {
            addCriterion("u_old_address not between", value1, value2, "uOldAddress");
            return (Criteria) this;
        }

        public Criteria andUContentIsNull() {
            addCriterion("u_content is null");
            return (Criteria) this;
        }

        public Criteria andUContentIsNotNull() {
            addCriterion("u_content is not null");
            return (Criteria) this;
        }

        public Criteria andUContentEqualTo(String value) {
            addCriterion("u_content =", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentNotEqualTo(String value) {
            addCriterion("u_content <>", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentGreaterThan(String value) {
            addCriterion("u_content >", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentGreaterThanOrEqualTo(String value) {
            addCriterion("u_content >=", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentLessThan(String value) {
            addCriterion("u_content <", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentLessThanOrEqualTo(String value) {
            addCriterion("u_content <=", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentLike(String value) {
            addCriterion("u_content like", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentNotLike(String value) {
            addCriterion("u_content not like", value, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentIn(List<String> values) {
            addCriterion("u_content in", values, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentNotIn(List<String> values) {
            addCriterion("u_content not in", values, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentBetween(String value1, String value2) {
            addCriterion("u_content between", value1, value2, "uContent");
            return (Criteria) this;
        }

        public Criteria andUContentNotBetween(String value1, String value2) {
            addCriterion("u_content not between", value1, value2, "uContent");
            return (Criteria) this;
        }

        public Criteria andUFileIsNull() {
            addCriterion("u_file is null");
            return (Criteria) this;
        }

        public Criteria andUFileIsNotNull() {
            addCriterion("u_file is not null");
            return (Criteria) this;
        }

        public Criteria andUFileEqualTo(String value) {
            addCriterion("u_file =", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileNotEqualTo(String value) {
            addCriterion("u_file <>", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileGreaterThan(String value) {
            addCriterion("u_file >", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileGreaterThanOrEqualTo(String value) {
            addCriterion("u_file >=", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileLessThan(String value) {
            addCriterion("u_file <", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileLessThanOrEqualTo(String value) {
            addCriterion("u_file <=", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileLike(String value) {
            addCriterion("u_file like", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileNotLike(String value) {
            addCriterion("u_file not like", value, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileIn(List<String> values) {
            addCriterion("u_file in", values, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileNotIn(List<String> values) {
            addCriterion("u_file not in", values, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileBetween(String value1, String value2) {
            addCriterion("u_file between", value1, value2, "uFile");
            return (Criteria) this;
        }

        public Criteria andUFileNotBetween(String value1, String value2) {
            addCriterion("u_file not between", value1, value2, "uFile");
            return (Criteria) this;
        }

        public Criteria andUNumber1IsNull() {
            addCriterion("u_number1 is null");
            return (Criteria) this;
        }

        public Criteria andUNumber1IsNotNull() {
            addCriterion("u_number1 is not null");
            return (Criteria) this;
        }

        public Criteria andUNumber1EqualTo(Integer value) {
            addCriterion("u_number1 =", value, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1NotEqualTo(Integer value) {
            addCriterion("u_number1 <>", value, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1GreaterThan(Integer value) {
            addCriterion("u_number1 >", value, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1GreaterThanOrEqualTo(Integer value) {
            addCriterion("u_number1 >=", value, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1LessThan(Integer value) {
            addCriterion("u_number1 <", value, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1LessThanOrEqualTo(Integer value) {
            addCriterion("u_number1 <=", value, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1In(List<Integer> values) {
            addCriterion("u_number1 in", values, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1NotIn(List<Integer> values) {
            addCriterion("u_number1 not in", values, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1Between(Integer value1, Integer value2) {
            addCriterion("u_number1 between", value1, value2, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber1NotBetween(Integer value1, Integer value2) {
            addCriterion("u_number1 not between", value1, value2, "uNumber1");
            return (Criteria) this;
        }

        public Criteria andUNumber2IsNull() {
            addCriterion("u_number2 is null");
            return (Criteria) this;
        }

        public Criteria andUNumber2IsNotNull() {
            addCriterion("u_number2 is not null");
            return (Criteria) this;
        }

        public Criteria andUNumber2EqualTo(Integer value) {
            addCriterion("u_number2 =", value, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2NotEqualTo(Integer value) {
            addCriterion("u_number2 <>", value, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2GreaterThan(Integer value) {
            addCriterion("u_number2 >", value, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2GreaterThanOrEqualTo(Integer value) {
            addCriterion("u_number2 >=", value, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2LessThan(Integer value) {
            addCriterion("u_number2 <", value, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2LessThanOrEqualTo(Integer value) {
            addCriterion("u_number2 <=", value, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2In(List<Integer> values) {
            addCriterion("u_number2 in", values, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2NotIn(List<Integer> values) {
            addCriterion("u_number2 not in", values, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2Between(Integer value1, Integer value2) {
            addCriterion("u_number2 between", value1, value2, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUNumber2NotBetween(Integer value1, Integer value2) {
            addCriterion("u_number2 not between", value1, value2, "uNumber2");
            return (Criteria) this;
        }

        public Criteria andUDate1IsNull() {
            addCriterion("u_date1 is null");
            return (Criteria) this;
        }

        public Criteria andUDate1IsNotNull() {
            addCriterion("u_date1 is not null");
            return (Criteria) this;
        }

        public Criteria andUDate1EqualTo(Date value) {
            addCriterionForJDBCDate("u_date1 =", value, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1NotEqualTo(Date value) {
            addCriterionForJDBCDate("u_date1 <>", value, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1GreaterThan(Date value) {
            addCriterionForJDBCDate("u_date1 >", value, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_date1 >=", value, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1LessThan(Date value) {
            addCriterionForJDBCDate("u_date1 <", value, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_date1 <=", value, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1In(List<Date> values) {
            addCriterionForJDBCDate("u_date1 in", values, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1NotIn(List<Date> values) {
            addCriterionForJDBCDate("u_date1 not in", values, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("u_date1 between", value1, value2, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_date1 not between", value1, value2, "uDate1");
            return (Criteria) this;
        }

        public Criteria andUDate2IsNull() {
            addCriterion("u_date2 is null");
            return (Criteria) this;
        }

        public Criteria andUDate2IsNotNull() {
            addCriterion("u_date2 is not null");
            return (Criteria) this;
        }

        public Criteria andUDate2EqualTo(Date value) {
            addCriterionForJDBCDate("u_date2 =", value, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2NotEqualTo(Date value) {
            addCriterionForJDBCDate("u_date2 <>", value, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2GreaterThan(Date value) {
            addCriterionForJDBCDate("u_date2 >", value, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_date2 >=", value, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2LessThan(Date value) {
            addCriterionForJDBCDate("u_date2 <", value, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_date2 <=", value, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2In(List<Date> values) {
            addCriterionForJDBCDate("u_date2 in", values, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2NotIn(List<Date> values) {
            addCriterionForJDBCDate("u_date2 not in", values, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("u_date2 between", value1, value2, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUDate2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_date2 not between", value1, value2, "uDate2");
            return (Criteria) this;
        }

        public Criteria andUString1IsNull() {
            addCriterion("u_string1 is null");
            return (Criteria) this;
        }

        public Criteria andUString1IsNotNull() {
            addCriterion("u_string1 is not null");
            return (Criteria) this;
        }

        public Criteria andUString1EqualTo(String value) {
            addCriterion("u_string1 =", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1NotEqualTo(String value) {
            addCriterion("u_string1 <>", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1GreaterThan(String value) {
            addCriterion("u_string1 >", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1GreaterThanOrEqualTo(String value) {
            addCriterion("u_string1 >=", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1LessThan(String value) {
            addCriterion("u_string1 <", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1LessThanOrEqualTo(String value) {
            addCriterion("u_string1 <=", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1Like(String value) {
            addCriterion("u_string1 like", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1NotLike(String value) {
            addCriterion("u_string1 not like", value, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1In(List<String> values) {
            addCriterion("u_string1 in", values, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1NotIn(List<String> values) {
            addCriterion("u_string1 not in", values, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1Between(String value1, String value2) {
            addCriterion("u_string1 between", value1, value2, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString1NotBetween(String value1, String value2) {
            addCriterion("u_string1 not between", value1, value2, "uString1");
            return (Criteria) this;
        }

        public Criteria andUString2IsNull() {
            addCriterion("u_string2 is null");
            return (Criteria) this;
        }

        public Criteria andUString2IsNotNull() {
            addCriterion("u_string2 is not null");
            return (Criteria) this;
        }

        public Criteria andUString2EqualTo(String value) {
            addCriterion("u_string2 =", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2NotEqualTo(String value) {
            addCriterion("u_string2 <>", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2GreaterThan(String value) {
            addCriterion("u_string2 >", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2GreaterThanOrEqualTo(String value) {
            addCriterion("u_string2 >=", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2LessThan(String value) {
            addCriterion("u_string2 <", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2LessThanOrEqualTo(String value) {
            addCriterion("u_string2 <=", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2Like(String value) {
            addCriterion("u_string2 like", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2NotLike(String value) {
            addCriterion("u_string2 not like", value, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2In(List<String> values) {
            addCriterion("u_string2 in", values, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2NotIn(List<String> values) {
            addCriterion("u_string2 not in", values, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2Between(String value1, String value2) {
            addCriterion("u_string2 between", value1, value2, "uString2");
            return (Criteria) this;
        }

        public Criteria andUString2NotBetween(String value1, String value2) {
            addCriterion("u_string2 not between", value1, value2, "uString2");
            return (Criteria) this;
        }

        public Criteria andUTextarea1IsNull() {
            addCriterion("u_textarea1 is null");
            return (Criteria) this;
        }

        public Criteria andUTextarea1IsNotNull() {
            addCriterion("u_textarea1 is not null");
            return (Criteria) this;
        }

        public Criteria andUTextarea1EqualTo(String value) {
            addCriterion("u_textarea1 =", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1NotEqualTo(String value) {
            addCriterion("u_textarea1 <>", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1GreaterThan(String value) {
            addCriterion("u_textarea1 >", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1GreaterThanOrEqualTo(String value) {
            addCriterion("u_textarea1 >=", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1LessThan(String value) {
            addCriterion("u_textarea1 <", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1LessThanOrEqualTo(String value) {
            addCriterion("u_textarea1 <=", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1Like(String value) {
            addCriterion("u_textarea1 like", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1NotLike(String value) {
            addCriterion("u_textarea1 not like", value, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1In(List<String> values) {
            addCriterion("u_textarea1 in", values, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1NotIn(List<String> values) {
            addCriterion("u_textarea1 not in", values, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1Between(String value1, String value2) {
            addCriterion("u_textarea1 between", value1, value2, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea1NotBetween(String value1, String value2) {
            addCriterion("u_textarea1 not between", value1, value2, "uTextarea1");
            return (Criteria) this;
        }

        public Criteria andUTextarea2IsNull() {
            addCriterion("u_textarea2 is null");
            return (Criteria) this;
        }

        public Criteria andUTextarea2IsNotNull() {
            addCriterion("u_textarea2 is not null");
            return (Criteria) this;
        }

        public Criteria andUTextarea2EqualTo(String value) {
            addCriterion("u_textarea2 =", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2NotEqualTo(String value) {
            addCriterion("u_textarea2 <>", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2GreaterThan(String value) {
            addCriterion("u_textarea2 >", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2GreaterThanOrEqualTo(String value) {
            addCriterion("u_textarea2 >=", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2LessThan(String value) {
            addCriterion("u_textarea2 <", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2LessThanOrEqualTo(String value) {
            addCriterion("u_textarea2 <=", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2Like(String value) {
            addCriterion("u_textarea2 like", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2NotLike(String value) {
            addCriterion("u_textarea2 not like", value, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2In(List<String> values) {
            addCriterion("u_textarea2 in", values, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2NotIn(List<String> values) {
            addCriterion("u_textarea2 not in", values, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2Between(String value1, String value2) {
            addCriterion("u_textarea2 between", value1, value2, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUTextarea2NotBetween(String value1, String value2) {
            addCriterion("u_textarea2 not between", value1, value2, "uTextarea2");
            return (Criteria) this;
        }

        public Criteria andUWorkYearIsNull() {
            addCriterion("u_work_year is null");
            return (Criteria) this;
        }

        public Criteria andUWorkYearIsNotNull() {
            addCriterion("u_work_year is not null");
            return (Criteria) this;
        }

        public Criteria andUWorkYearEqualTo(String value) {
            addCriterion("u_work_year =", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearNotEqualTo(String value) {
            addCriterion("u_work_year <>", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearGreaterThan(String value) {
            addCriterion("u_work_year >", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearGreaterThanOrEqualTo(String value) {
            addCriterion("u_work_year >=", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearLessThan(String value) {
            addCriterion("u_work_year <", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearLessThanOrEqualTo(String value) {
            addCriterion("u_work_year <=", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearLike(String value) {
            addCriterion("u_work_year like", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearNotLike(String value) {
            addCriterion("u_work_year not like", value, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearIn(List<String> values) {
            addCriterion("u_work_year in", values, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearNotIn(List<String> values) {
            addCriterion("u_work_year not in", values, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearBetween(String value1, String value2) {
            addCriterion("u_work_year between", value1, value2, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUWorkYearNotBetween(String value1, String value2) {
            addCriterion("u_work_year not between", value1, value2, "uWorkYear");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUTelIsNull() {
            addCriterion("u_tel is null");
            return (Criteria) this;
        }

        public Criteria andUTelIsNotNull() {
            addCriterion("u_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUTelEqualTo(String value) {
            addCriterion("u_tel =", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotEqualTo(String value) {
            addCriterion("u_tel <>", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThan(String value) {
            addCriterion("u_tel >", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThanOrEqualTo(String value) {
            addCriterion("u_tel >=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThan(String value) {
            addCriterion("u_tel <", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThanOrEqualTo(String value) {
            addCriterion("u_tel <=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLike(String value) {
            addCriterion("u_tel like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotLike(String value) {
            addCriterion("u_tel not like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelIn(List<String> values) {
            addCriterion("u_tel in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotIn(List<String> values) {
            addCriterion("u_tel not in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelBetween(String value1, String value2) {
            addCriterion("u_tel between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotBetween(String value1, String value2) {
            addCriterion("u_tel not between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUPostcodeIsNull() {
            addCriterion("u_postcode is null");
            return (Criteria) this;
        }

        public Criteria andUPostcodeIsNotNull() {
            addCriterion("u_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andUPostcodeEqualTo(String value) {
            addCriterion("u_postcode =", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeNotEqualTo(String value) {
            addCriterion("u_postcode <>", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeGreaterThan(String value) {
            addCriterion("u_postcode >", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("u_postcode >=", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeLessThan(String value) {
            addCriterion("u_postcode <", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeLessThanOrEqualTo(String value) {
            addCriterion("u_postcode <=", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeLike(String value) {
            addCriterion("u_postcode like", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeNotLike(String value) {
            addCriterion("u_postcode not like", value, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeIn(List<String> values) {
            addCriterion("u_postcode in", values, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeNotIn(List<String> values) {
            addCriterion("u_postcode not in", values, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeBetween(String value1, String value2) {
            addCriterion("u_postcode between", value1, value2, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUPostcodeNotBetween(String value1, String value2) {
            addCriterion("u_postcode not between", value1, value2, "uPostcode");
            return (Criteria) this;
        }

        public Criteria andUSubsidyIsNull() {
            addCriterion("u_subsidy is null");
            return (Criteria) this;
        }

        public Criteria andUSubsidyIsNotNull() {
            addCriterion("u_subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andUSubsidyEqualTo(String value) {
            addCriterion("u_subsidy =", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyNotEqualTo(String value) {
            addCriterion("u_subsidy <>", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyGreaterThan(String value) {
            addCriterion("u_subsidy >", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyGreaterThanOrEqualTo(String value) {
            addCriterion("u_subsidy >=", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyLessThan(String value) {
            addCriterion("u_subsidy <", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyLessThanOrEqualTo(String value) {
            addCriterion("u_subsidy <=", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyLike(String value) {
            addCriterion("u_subsidy like", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyNotLike(String value) {
            addCriterion("u_subsidy not like", value, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyIn(List<String> values) {
            addCriterion("u_subsidy in", values, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyNotIn(List<String> values) {
            addCriterion("u_subsidy not in", values, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyBetween(String value1, String value2) {
            addCriterion("u_subsidy between", value1, value2, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUSubsidyNotBetween(String value1, String value2) {
            addCriterion("u_subsidy not between", value1, value2, "uSubsidy");
            return (Criteria) this;
        }

        public Criteria andUPrizeIsNull() {
            addCriterion("u_prize is null");
            return (Criteria) this;
        }

        public Criteria andUPrizeIsNotNull() {
            addCriterion("u_prize is not null");
            return (Criteria) this;
        }

        public Criteria andUPrizeEqualTo(String value) {
            addCriterion("u_prize =", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeNotEqualTo(String value) {
            addCriterion("u_prize <>", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeGreaterThan(String value) {
            addCriterion("u_prize >", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeGreaterThanOrEqualTo(String value) {
            addCriterion("u_prize >=", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeLessThan(String value) {
            addCriterion("u_prize <", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeLessThanOrEqualTo(String value) {
            addCriterion("u_prize <=", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeLike(String value) {
            addCriterion("u_prize like", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeNotLike(String value) {
            addCriterion("u_prize not like", value, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeIn(List<String> values) {
            addCriterion("u_prize in", values, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeNotIn(List<String> values) {
            addCriterion("u_prize not in", values, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeBetween(String value1, String value2) {
            addCriterion("u_prize between", value1, value2, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUPrizeNotBetween(String value1, String value2) {
            addCriterion("u_prize not between", value1, value2, "uPrize");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceIsNull() {
            addCriterion("u_expect_place is null");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceIsNotNull() {
            addCriterion("u_expect_place is not null");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceEqualTo(String value) {
            addCriterion("u_expect_place =", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceNotEqualTo(String value) {
            addCriterion("u_expect_place <>", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceGreaterThan(String value) {
            addCriterion("u_expect_place >", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("u_expect_place >=", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceLessThan(String value) {
            addCriterion("u_expect_place <", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceLessThanOrEqualTo(String value) {
            addCriterion("u_expect_place <=", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceLike(String value) {
            addCriterion("u_expect_place like", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceNotLike(String value) {
            addCriterion("u_expect_place not like", value, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceIn(List<String> values) {
            addCriterion("u_expect_place in", values, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceNotIn(List<String> values) {
            addCriterion("u_expect_place not in", values, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceBetween(String value1, String value2) {
            addCriterion("u_expect_place between", value1, value2, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectPlaceNotBetween(String value1, String value2) {
            addCriterion("u_expect_place not between", value1, value2, "uExpectPlace");
            return (Criteria) this;
        }

        public Criteria andUExpectJobIsNull() {
            addCriterion("u_expect_job is null");
            return (Criteria) this;
        }

        public Criteria andUExpectJobIsNotNull() {
            addCriterion("u_expect_job is not null");
            return (Criteria) this;
        }

        public Criteria andUExpectJobEqualTo(String value) {
            addCriterion("u_expect_job =", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobNotEqualTo(String value) {
            addCriterion("u_expect_job <>", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobGreaterThan(String value) {
            addCriterion("u_expect_job >", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobGreaterThanOrEqualTo(String value) {
            addCriterion("u_expect_job >=", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobLessThan(String value) {
            addCriterion("u_expect_job <", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobLessThanOrEqualTo(String value) {
            addCriterion("u_expect_job <=", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobLike(String value) {
            addCriterion("u_expect_job like", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobNotLike(String value) {
            addCriterion("u_expect_job not like", value, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobIn(List<String> values) {
            addCriterion("u_expect_job in", values, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobNotIn(List<String> values) {
            addCriterion("u_expect_job not in", values, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobBetween(String value1, String value2) {
            addCriterion("u_expect_job between", value1, value2, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectJobNotBetween(String value1, String value2) {
            addCriterion("u_expect_job not between", value1, value2, "uExpectJob");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeIsNull() {
            addCriterion("u_expect_trade is null");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeIsNotNull() {
            addCriterion("u_expect_trade is not null");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeEqualTo(String value) {
            addCriterion("u_expect_trade =", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeNotEqualTo(String value) {
            addCriterion("u_expect_trade <>", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeGreaterThan(String value) {
            addCriterion("u_expect_trade >", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeGreaterThanOrEqualTo(String value) {
            addCriterion("u_expect_trade >=", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeLessThan(String value) {
            addCriterion("u_expect_trade <", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeLessThanOrEqualTo(String value) {
            addCriterion("u_expect_trade <=", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeLike(String value) {
            addCriterion("u_expect_trade like", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeNotLike(String value) {
            addCriterion("u_expect_trade not like", value, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeIn(List<String> values) {
            addCriterion("u_expect_trade in", values, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeNotIn(List<String> values) {
            addCriterion("u_expect_trade not in", values, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeBetween(String value1, String value2) {
            addCriterion("u_expect_trade between", value1, value2, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUExpectTradeNotBetween(String value1, String value2) {
            addCriterion("u_expect_trade not between", value1, value2, "uExpectTrade");
            return (Criteria) this;
        }

        public Criteria andUCometimeIsNull() {
            addCriterion("u_cometime is null");
            return (Criteria) this;
        }

        public Criteria andUCometimeIsNotNull() {
            addCriterion("u_cometime is not null");
            return (Criteria) this;
        }

        public Criteria andUCometimeEqualTo(String value) {
            addCriterion("u_cometime =", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeNotEqualTo(String value) {
            addCriterion("u_cometime <>", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeGreaterThan(String value) {
            addCriterion("u_cometime >", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_cometime >=", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeLessThan(String value) {
            addCriterion("u_cometime <", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeLessThanOrEqualTo(String value) {
            addCriterion("u_cometime <=", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeLike(String value) {
            addCriterion("u_cometime like", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeNotLike(String value) {
            addCriterion("u_cometime not like", value, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeIn(List<String> values) {
            addCriterion("u_cometime in", values, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeNotIn(List<String> values) {
            addCriterion("u_cometime not in", values, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeBetween(String value1, String value2) {
            addCriterion("u_cometime between", value1, value2, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUCometimeNotBetween(String value1, String value2) {
            addCriterion("u_cometime not between", value1, value2, "uCometime");
            return (Criteria) this;
        }

        public Criteria andUJobTypeIsNull() {
            addCriterion("u_job_type is null");
            return (Criteria) this;
        }

        public Criteria andUJobTypeIsNotNull() {
            addCriterion("u_job_type is not null");
            return (Criteria) this;
        }

        public Criteria andUJobTypeEqualTo(String value) {
            addCriterion("u_job_type =", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeNotEqualTo(String value) {
            addCriterion("u_job_type <>", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeGreaterThan(String value) {
            addCriterion("u_job_type >", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("u_job_type >=", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeLessThan(String value) {
            addCriterion("u_job_type <", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeLessThanOrEqualTo(String value) {
            addCriterion("u_job_type <=", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeLike(String value) {
            addCriterion("u_job_type like", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeNotLike(String value) {
            addCriterion("u_job_type not like", value, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeIn(List<String> values) {
            addCriterion("u_job_type in", values, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeNotIn(List<String> values) {
            addCriterion("u_job_type not in", values, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeBetween(String value1, String value2) {
            addCriterion("u_job_type between", value1, value2, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUJobTypeNotBetween(String value1, String value2) {
            addCriterion("u_job_type not between", value1, value2, "uJobType");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalIsNull() {
            addCriterion("u_self_appraisal is null");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalIsNotNull() {
            addCriterion("u_self_appraisal is not null");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalEqualTo(String value) {
            addCriterion("u_self_appraisal =", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalNotEqualTo(String value) {
            addCriterion("u_self_appraisal <>", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalGreaterThan(String value) {
            addCriterion("u_self_appraisal >", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalGreaterThanOrEqualTo(String value) {
            addCriterion("u_self_appraisal >=", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalLessThan(String value) {
            addCriterion("u_self_appraisal <", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalLessThanOrEqualTo(String value) {
            addCriterion("u_self_appraisal <=", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalLike(String value) {
            addCriterion("u_self_appraisal like", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalNotLike(String value) {
            addCriterion("u_self_appraisal not like", value, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalIn(List<String> values) {
            addCriterion("u_self_appraisal in", values, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalNotIn(List<String> values) {
            addCriterion("u_self_appraisal not in", values, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalBetween(String value1, String value2) {
            addCriterion("u_self_appraisal between", value1, value2, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUSelfAppraisalNotBetween(String value1, String value2) {
            addCriterion("u_self_appraisal not between", value1, value2, "uSelfAppraisal");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceIsNull() {
            addCriterion("u_work_experience is null");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceIsNotNull() {
            addCriterion("u_work_experience is not null");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceEqualTo(String value) {
            addCriterion("u_work_experience =", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceNotEqualTo(String value) {
            addCriterion("u_work_experience <>", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceGreaterThan(String value) {
            addCriterion("u_work_experience >", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("u_work_experience >=", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceLessThan(String value) {
            addCriterion("u_work_experience <", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceLessThanOrEqualTo(String value) {
            addCriterion("u_work_experience <=", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceLike(String value) {
            addCriterion("u_work_experience like", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceNotLike(String value) {
            addCriterion("u_work_experience not like", value, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceIn(List<String> values) {
            addCriterion("u_work_experience in", values, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceNotIn(List<String> values) {
            addCriterion("u_work_experience not in", values, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceBetween(String value1, String value2) {
            addCriterion("u_work_experience between", value1, value2, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUWorkExperienceNotBetween(String value1, String value2) {
            addCriterion("u_work_experience not between", value1, value2, "uWorkExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceIsNull() {
            addCriterion("u_project_experience is null");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceIsNotNull() {
            addCriterion("u_project_experience is not null");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceEqualTo(String value) {
            addCriterion("u_project_experience =", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceNotEqualTo(String value) {
            addCriterion("u_project_experience <>", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceGreaterThan(String value) {
            addCriterion("u_project_experience >", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("u_project_experience >=", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceLessThan(String value) {
            addCriterion("u_project_experience <", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceLessThanOrEqualTo(String value) {
            addCriterion("u_project_experience <=", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceLike(String value) {
            addCriterion("u_project_experience like", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceNotLike(String value) {
            addCriterion("u_project_experience not like", value, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceIn(List<String> values) {
            addCriterion("u_project_experience in", values, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceNotIn(List<String> values) {
            addCriterion("u_project_experience not in", values, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceBetween(String value1, String value2) {
            addCriterion("u_project_experience between", value1, value2, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUProjectExperienceNotBetween(String value1, String value2) {
            addCriterion("u_project_experience not between", value1, value2, "uProjectExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceIsNull() {
            addCriterion("u_school_experience is null");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceIsNotNull() {
            addCriterion("u_school_experience is not null");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceEqualTo(String value) {
            addCriterion("u_school_experience =", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceNotEqualTo(String value) {
            addCriterion("u_school_experience <>", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceGreaterThan(String value) {
            addCriterion("u_school_experience >", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("u_school_experience >=", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceLessThan(String value) {
            addCriterion("u_school_experience <", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceLessThanOrEqualTo(String value) {
            addCriterion("u_school_experience <=", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceLike(String value) {
            addCriterion("u_school_experience like", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceNotLike(String value) {
            addCriterion("u_school_experience not like", value, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceIn(List<String> values) {
            addCriterion("u_school_experience in", values, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceNotIn(List<String> values) {
            addCriterion("u_school_experience not in", values, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceBetween(String value1, String value2) {
            addCriterion("u_school_experience between", value1, value2, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolExperienceNotBetween(String value1, String value2) {
            addCriterion("u_school_experience not between", value1, value2, "uSchoolExperience");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorIsNull() {
            addCriterion("u_school_honor is null");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorIsNotNull() {
            addCriterion("u_school_honor is not null");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorEqualTo(String value) {
            addCriterion("u_school_honor =", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorNotEqualTo(String value) {
            addCriterion("u_school_honor <>", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorGreaterThan(String value) {
            addCriterion("u_school_honor >", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorGreaterThanOrEqualTo(String value) {
            addCriterion("u_school_honor >=", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorLessThan(String value) {
            addCriterion("u_school_honor <", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorLessThanOrEqualTo(String value) {
            addCriterion("u_school_honor <=", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorLike(String value) {
            addCriterion("u_school_honor like", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorNotLike(String value) {
            addCriterion("u_school_honor not like", value, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorIn(List<String> values) {
            addCriterion("u_school_honor in", values, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorNotIn(List<String> values) {
            addCriterion("u_school_honor not in", values, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorBetween(String value1, String value2) {
            addCriterion("u_school_honor between", value1, value2, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolHonorNotBetween(String value1, String value2) {
            addCriterion("u_school_honor not between", value1, value2, "uSchoolHonor");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyIsNull() {
            addCriterion("u_school_duty is null");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyIsNotNull() {
            addCriterion("u_school_duty is not null");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyEqualTo(String value) {
            addCriterion("u_school_duty =", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyNotEqualTo(String value) {
            addCriterion("u_school_duty <>", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyGreaterThan(String value) {
            addCriterion("u_school_duty >", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyGreaterThanOrEqualTo(String value) {
            addCriterion("u_school_duty >=", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyLessThan(String value) {
            addCriterion("u_school_duty <", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyLessThanOrEqualTo(String value) {
            addCriterion("u_school_duty <=", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyLike(String value) {
            addCriterion("u_school_duty like", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyNotLike(String value) {
            addCriterion("u_school_duty not like", value, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyIn(List<String> values) {
            addCriterion("u_school_duty in", values, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyNotIn(List<String> values) {
            addCriterion("u_school_duty not in", values, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyBetween(String value1, String value2) {
            addCriterion("u_school_duty between", value1, value2, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSchoolDutyNotBetween(String value1, String value2) {
            addCriterion("u_school_duty not between", value1, value2, "uSchoolDuty");
            return (Criteria) this;
        }

        public Criteria andUSkillIsNull() {
            addCriterion("u_skill is null");
            return (Criteria) this;
        }

        public Criteria andUSkillIsNotNull() {
            addCriterion("u_skill is not null");
            return (Criteria) this;
        }

        public Criteria andUSkillEqualTo(String value) {
            addCriterion("u_skill =", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillNotEqualTo(String value) {
            addCriterion("u_skill <>", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillGreaterThan(String value) {
            addCriterion("u_skill >", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillGreaterThanOrEqualTo(String value) {
            addCriterion("u_skill >=", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillLessThan(String value) {
            addCriterion("u_skill <", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillLessThanOrEqualTo(String value) {
            addCriterion("u_skill <=", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillLike(String value) {
            addCriterion("u_skill like", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillNotLike(String value) {
            addCriterion("u_skill not like", value, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillIn(List<String> values) {
            addCriterion("u_skill in", values, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillNotIn(List<String> values) {
            addCriterion("u_skill not in", values, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillBetween(String value1, String value2) {
            addCriterion("u_skill between", value1, value2, "uSkill");
            return (Criteria) this;
        }

        public Criteria andUSkillNotBetween(String value1, String value2) {
            addCriterion("u_skill not between", value1, value2, "uSkill");
            return (Criteria) this;
        }

        public Criteria andULanguageIsNull() {
            addCriterion("u_language is null");
            return (Criteria) this;
        }

        public Criteria andULanguageIsNotNull() {
            addCriterion("u_language is not null");
            return (Criteria) this;
        }

        public Criteria andULanguageEqualTo(String value) {
            addCriterion("u_language =", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotEqualTo(String value) {
            addCriterion("u_language <>", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageGreaterThan(String value) {
            addCriterion("u_language >", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageGreaterThanOrEqualTo(String value) {
            addCriterion("u_language >=", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageLessThan(String value) {
            addCriterion("u_language <", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageLessThanOrEqualTo(String value) {
            addCriterion("u_language <=", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageLike(String value) {
            addCriterion("u_language like", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotLike(String value) {
            addCriterion("u_language not like", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageIn(List<String> values) {
            addCriterion("u_language in", values, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotIn(List<String> values) {
            addCriterion("u_language not in", values, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageBetween(String value1, String value2) {
            addCriterion("u_language between", value1, value2, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotBetween(String value1, String value2) {
            addCriterion("u_language not between", value1, value2, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andUCredentialIsNull() {
            addCriterion("u_credential is null");
            return (Criteria) this;
        }

        public Criteria andUCredentialIsNotNull() {
            addCriterion("u_credential is not null");
            return (Criteria) this;
        }

        public Criteria andUCredentialEqualTo(String value) {
            addCriterion("u_credential =", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialNotEqualTo(String value) {
            addCriterion("u_credential <>", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialGreaterThan(String value) {
            addCriterion("u_credential >", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialGreaterThanOrEqualTo(String value) {
            addCriterion("u_credential >=", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialLessThan(String value) {
            addCriterion("u_credential <", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialLessThanOrEqualTo(String value) {
            addCriterion("u_credential <=", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialLike(String value) {
            addCriterion("u_credential like", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialNotLike(String value) {
            addCriterion("u_credential not like", value, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialIn(List<String> values) {
            addCriterion("u_credential in", values, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialNotIn(List<String> values) {
            addCriterion("u_credential not in", values, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialBetween(String value1, String value2) {
            addCriterion("u_credential between", value1, value2, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUCredentialNotBetween(String value1, String value2) {
            addCriterion("u_credential not between", value1, value2, "uCredential");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceIsNull() {
            addCriterion("u_train_experience is null");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceIsNotNull() {
            addCriterion("u_train_experience is not null");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceEqualTo(String value) {
            addCriterion("u_train_experience =", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceNotEqualTo(String value) {
            addCriterion("u_train_experience <>", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceGreaterThan(String value) {
            addCriterion("u_train_experience >", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("u_train_experience >=", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceLessThan(String value) {
            addCriterion("u_train_experience <", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceLessThanOrEqualTo(String value) {
            addCriterion("u_train_experience <=", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceLike(String value) {
            addCriterion("u_train_experience like", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceNotLike(String value) {
            addCriterion("u_train_experience not like", value, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceIn(List<String> values) {
            addCriterion("u_train_experience in", values, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceNotIn(List<String> values) {
            addCriterion("u_train_experience not in", values, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceBetween(String value1, String value2) {
            addCriterion("u_train_experience between", value1, value2, "uTrainExperience");
            return (Criteria) this;
        }

        public Criteria andUTrainExperienceNotBetween(String value1, String value2) {
            addCriterion("u_train_experience not between", value1, value2, "uTrainExperience");
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