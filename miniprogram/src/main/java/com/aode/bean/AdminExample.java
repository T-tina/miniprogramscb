package com.aode.bean;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminYearIsNull() {
            addCriterion("admin_year is null");
            return (Criteria) this;
        }

        public Criteria andAdminYearIsNotNull() {
            addCriterion("admin_year is not null");
            return (Criteria) this;
        }

        public Criteria andAdminYearEqualTo(String value) {
            addCriterion("admin_year =", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearNotEqualTo(String value) {
            addCriterion("admin_year <>", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearGreaterThan(String value) {
            addCriterion("admin_year >", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearGreaterThanOrEqualTo(String value) {
            addCriterion("admin_year >=", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearLessThan(String value) {
            addCriterion("admin_year <", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearLessThanOrEqualTo(String value) {
            addCriterion("admin_year <=", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearLike(String value) {
            addCriterion("admin_year like", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearNotLike(String value) {
            addCriterion("admin_year not like", value, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearIn(List<String> values) {
            addCriterion("admin_year in", values, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearNotIn(List<String> values) {
            addCriterion("admin_year not in", values, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearBetween(String value1, String value2) {
            addCriterion("admin_year between", value1, value2, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminYearNotBetween(String value1, String value2) {
            addCriterion("admin_year not between", value1, value2, "adminYear");
            return (Criteria) this;
        }

        public Criteria andAdminDepartIsNull() {
            addCriterion("admin_depart is null");
            return (Criteria) this;
        }

        public Criteria andAdminDepartIsNotNull() {
            addCriterion("admin_depart is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDepartEqualTo(String value) {
            addCriterion("admin_depart =", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartNotEqualTo(String value) {
            addCriterion("admin_depart <>", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartGreaterThan(String value) {
            addCriterion("admin_depart >", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartGreaterThanOrEqualTo(String value) {
            addCriterion("admin_depart >=", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartLessThan(String value) {
            addCriterion("admin_depart <", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartLessThanOrEqualTo(String value) {
            addCriterion("admin_depart <=", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartLike(String value) {
            addCriterion("admin_depart like", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartNotLike(String value) {
            addCriterion("admin_depart not like", value, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartIn(List<String> values) {
            addCriterion("admin_depart in", values, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartNotIn(List<String> values) {
            addCriterion("admin_depart not in", values, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartBetween(String value1, String value2) {
            addCriterion("admin_depart between", value1, value2, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminDepartNotBetween(String value1, String value2) {
            addCriterion("admin_depart not between", value1, value2, "adminDepart");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIsNull() {
            addCriterion("admin_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIsNotNull() {
            addCriterion("admin_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTimeEqualTo(String value) {
            addCriterion("admin_time =", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotEqualTo(String value) {
            addCriterion("admin_time <>", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeGreaterThan(String value) {
            addCriterion("admin_time >", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeGreaterThanOrEqualTo(String value) {
            addCriterion("admin_time >=", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLessThan(String value) {
            addCriterion("admin_time <", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLessThanOrEqualTo(String value) {
            addCriterion("admin_time <=", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeLike(String value) {
            addCriterion("admin_time like", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotLike(String value) {
            addCriterion("admin_time not like", value, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeIn(List<String> values) {
            addCriterion("admin_time in", values, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotIn(List<String> values) {
            addCriterion("admin_time not in", values, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeBetween(String value1, String value2) {
            addCriterion("admin_time between", value1, value2, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminTimeNotBetween(String value1, String value2) {
            addCriterion("admin_time not between", value1, value2, "adminTime");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(String value) {
            addCriterion("admin_state =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(String value) {
            addCriterion("admin_state <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(String value) {
            addCriterion("admin_state >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(String value) {
            addCriterion("admin_state >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(String value) {
            addCriterion("admin_state <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(String value) {
            addCriterion("admin_state <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLike(String value) {
            addCriterion("admin_state like", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotLike(String value) {
            addCriterion("admin_state not like", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<String> values) {
            addCriterion("admin_state in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<String> values) {
            addCriterion("admin_state not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(String value1, String value2) {
            addCriterion("admin_state between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(String value1, String value2) {
            addCriterion("admin_state not between", value1, value2, "adminState");
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