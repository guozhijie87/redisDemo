package com.guo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCoutryIsNull() {
            addCriterion("coutry is null");
            return (Criteria) this;
        }

        public Criteria andCoutryIsNotNull() {
            addCriterion("coutry is not null");
            return (Criteria) this;
        }

        public Criteria andCoutryEqualTo(String value) {
            addCriterion("coutry =", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryNotEqualTo(String value) {
            addCriterion("coutry <>", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryGreaterThan(String value) {
            addCriterion("coutry >", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryGreaterThanOrEqualTo(String value) {
            addCriterion("coutry >=", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryLessThan(String value) {
            addCriterion("coutry <", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryLessThanOrEqualTo(String value) {
            addCriterion("coutry <=", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryLike(String value) {
            addCriterion("coutry like", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryNotLike(String value) {
            addCriterion("coutry not like", value, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryIn(List<String> values) {
            addCriterion("coutry in", values, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryNotIn(List<String> values) {
            addCriterion("coutry not in", values, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryBetween(String value1, String value2) {
            addCriterion("coutry between", value1, value2, "coutry");
            return (Criteria) this;
        }

        public Criteria andCoutryNotBetween(String value1, String value2) {
            addCriterion("coutry not between", value1, value2, "coutry");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCTime("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCTime("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCTime("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeIsNull() {
            addCriterion("lastupgradetime is null");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeIsNotNull() {
            addCriterion("lastupgradetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeEqualTo(Date value) {
            addCriterionForJDBCTime("lastupgradetime =", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lastupgradetime <>", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lastupgradetime >", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lastupgradetime >=", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeLessThan(Date value) {
            addCriterionForJDBCTime("lastupgradetime <", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lastupgradetime <=", value, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeIn(List<Date> values) {
            addCriterionForJDBCTime("lastupgradetime in", values, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lastupgradetime not in", values, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lastupgradetime between", value1, value2, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andLastupgradetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lastupgradetime not between", value1, value2, "lastupgradetime");
            return (Criteria) this;
        }

        public Criteria andCreateipIsNull() {
            addCriterion("createip is null");
            return (Criteria) this;
        }

        public Criteria andCreateipIsNotNull() {
            addCriterion("createip is not null");
            return (Criteria) this;
        }

        public Criteria andCreateipEqualTo(String value) {
            addCriterion("createip =", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotEqualTo(String value) {
            addCriterion("createip <>", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipGreaterThan(String value) {
            addCriterion("createip >", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipGreaterThanOrEqualTo(String value) {
            addCriterion("createip >=", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipLessThan(String value) {
            addCriterion("createip <", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipLessThanOrEqualTo(String value) {
            addCriterion("createip <=", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipLike(String value) {
            addCriterion("createip like", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotLike(String value) {
            addCriterion("createip not like", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipIn(List<String> values) {
            addCriterion("createip in", values, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotIn(List<String> values) {
            addCriterion("createip not in", values, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipBetween(String value1, String value2) {
            addCriterion("createip between", value1, value2, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotBetween(String value1, String value2) {
            addCriterion("createip not between", value1, value2, "createip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipIsNull() {
            addCriterion("lastupgradeip is null");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipIsNotNull() {
            addCriterion("lastupgradeip is not null");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipEqualTo(String value) {
            addCriterion("lastupgradeip =", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipNotEqualTo(String value) {
            addCriterion("lastupgradeip <>", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipGreaterThan(String value) {
            addCriterion("lastupgradeip >", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipGreaterThanOrEqualTo(String value) {
            addCriterion("lastupgradeip >=", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipLessThan(String value) {
            addCriterion("lastupgradeip <", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipLessThanOrEqualTo(String value) {
            addCriterion("lastupgradeip <=", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipLike(String value) {
            addCriterion("lastupgradeip like", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipNotLike(String value) {
            addCriterion("lastupgradeip not like", value, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipIn(List<String> values) {
            addCriterion("lastupgradeip in", values, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipNotIn(List<String> values) {
            addCriterion("lastupgradeip not in", values, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipBetween(String value1, String value2) {
            addCriterion("lastupgradeip between", value1, value2, "lastupgradeip");
            return (Criteria) this;
        }

        public Criteria andLastupgradeipNotBetween(String value1, String value2) {
            addCriterion("lastupgradeip not between", value1, value2, "lastupgradeip");
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