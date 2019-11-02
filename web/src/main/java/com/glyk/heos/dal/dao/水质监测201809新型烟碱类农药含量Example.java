package com.glyk.heos.dal.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class 水质监测201809新型烟碱类农药含量Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public 水质监测201809新型烟碱类农药含量Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria and编号IsNull() {
            addCriterion("编号 is null");
            return (Criteria) this;
        }

        public Criteria and编号IsNotNull() {
            addCriterion("编号 is not null");
            return (Criteria) this;
        }

        public Criteria and编号EqualTo(String value) {
            addCriterion("编号 =", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotEqualTo(String value) {
            addCriterion("编号 <>", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThan(String value) {
            addCriterion("编号 >", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThanOrEqualTo(String value) {
            addCriterion("编号 >=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThan(String value) {
            addCriterion("编号 <", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThanOrEqualTo(String value) {
            addCriterion("编号 <=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Like(String value) {
            addCriterion("编号 like", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotLike(String value) {
            addCriterion("编号 not like", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号In(List<String> values) {
            addCriterion("编号 in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotIn(List<String> values) {
            addCriterion("编号 not in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Between(String value1, String value2) {
            addCriterion("编号 between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotBetween(String value1, String value2) {
            addCriterion("编号 not between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and采样点位IsNull() {
            addCriterion("采样点位 is null");
            return (Criteria) this;
        }

        public Criteria and采样点位IsNotNull() {
            addCriterion("采样点位 is not null");
            return (Criteria) this;
        }

        public Criteria and采样点位EqualTo(String value) {
            addCriterion("采样点位 =", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位NotEqualTo(String value) {
            addCriterion("采样点位 <>", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位GreaterThan(String value) {
            addCriterion("采样点位 >", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位GreaterThanOrEqualTo(String value) {
            addCriterion("采样点位 >=", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位LessThan(String value) {
            addCriterion("采样点位 <", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位LessThanOrEqualTo(String value) {
            addCriterion("采样点位 <=", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位Like(String value) {
            addCriterion("采样点位 like", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位NotLike(String value) {
            addCriterion("采样点位 not like", value, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位In(List<String> values) {
            addCriterion("采样点位 in", values, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位NotIn(List<String> values) {
            addCriterion("采样点位 not in", values, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位Between(String value1, String value2) {
            addCriterion("采样点位 between", value1, value2, "采样点位");
            return (Criteria) this;
        }

        public Criteria and采样点位NotBetween(String value1, String value2) {
            addCriterion("采样点位 not between", value1, value2, "采样点位");
            return (Criteria) this;
        }

        public Criteria and日期IsNull() {
            addCriterion("日期 is null");
            return (Criteria) this;
        }

        public Criteria and日期IsNotNull() {
            addCriterion("日期 is not null");
            return (Criteria) this;
        }

        public Criteria and日期EqualTo(Date value) {
            addCriterionForJDBCDate("日期 =", value, "日期");
            return (Criteria) this;
        }

        public Criteria and日期NotEqualTo(Date value) {
            addCriterionForJDBCDate("日期 <>", value, "日期");
            return (Criteria) this;
        }

        public Criteria and日期GreaterThan(Date value) {
            addCriterionForJDBCDate("日期 >", value, "日期");
            return (Criteria) this;
        }

        public Criteria and日期GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("日期 >=", value, "日期");
            return (Criteria) this;
        }

        public Criteria and日期LessThan(Date value) {
            addCriterionForJDBCDate("日期 <", value, "日期");
            return (Criteria) this;
        }

        public Criteria and日期LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("日期 <=", value, "日期");
            return (Criteria) this;
        }

        public Criteria and日期In(List<Date> values) {
            addCriterionForJDBCDate("日期 in", values, "日期");
            return (Criteria) this;
        }

        public Criteria and日期NotIn(List<Date> values) {
            addCriterionForJDBCDate("日期 not in", values, "日期");
            return (Criteria) this;
        }

        public Criteria and日期Between(Date value1, Date value2) {
            addCriterionForJDBCDate("日期 between", value1, value2, "日期");
            return (Criteria) this;
        }

        public Criteria and日期NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("日期 not between", value1, value2, "日期");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量IsNull() {
            addCriterion("新型烟碱类农药含量 is null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量IsNotNull() {
            addCriterion("新型烟碱类农药含量 is not null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量EqualTo(String value) {
            addCriterion("新型烟碱类农药含量 =", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量NotEqualTo(String value) {
            addCriterion("新型烟碱类农药含量 <>", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量GreaterThan(String value) {
            addCriterion("新型烟碱类农药含量 >", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量GreaterThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量 >=", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量LessThan(String value) {
            addCriterion("新型烟碱类农药含量 <", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量LessThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量 <=", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量Like(String value) {
            addCriterion("新型烟碱类农药含量 like", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量NotLike(String value) {
            addCriterion("新型烟碱类农药含量 not like", value, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量In(List<String> values) {
            addCriterion("新型烟碱类农药含量 in", values, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量NotIn(List<String> values) {
            addCriterion("新型烟碱类农药含量 not in", values, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量Between(String value1, String value2) {
            addCriterion("新型烟碱类农药含量 between", value1, value2, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量NotBetween(String value1, String value2) {
            addCriterion("新型烟碱类农药含量 not between", value1, value2, "新型烟碱类农药含量");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1IsNull() {
            addCriterion("新型烟碱类农药含量1 is null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1IsNotNull() {
            addCriterion("新型烟碱类农药含量1 is not null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1EqualTo(String value) {
            addCriterion("新型烟碱类农药含量1 =", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1NotEqualTo(String value) {
            addCriterion("新型烟碱类农药含量1 <>", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1GreaterThan(String value) {
            addCriterion("新型烟碱类农药含量1 >", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1GreaterThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量1 >=", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1LessThan(String value) {
            addCriterion("新型烟碱类农药含量1 <", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1LessThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量1 <=", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1Like(String value) {
            addCriterion("新型烟碱类农药含量1 like", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1NotLike(String value) {
            addCriterion("新型烟碱类农药含量1 not like", value, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1In(List<String> values) {
            addCriterion("新型烟碱类农药含量1 in", values, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1NotIn(List<String> values) {
            addCriterion("新型烟碱类农药含量1 not in", values, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1Between(String value1, String value2) {
            addCriterion("新型烟碱类农药含量1 between", value1, value2, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量1NotBetween(String value1, String value2) {
            addCriterion("新型烟碱类农药含量1 not between", value1, value2, "新型烟碱类农药含量1");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2IsNull() {
            addCriterion("新型烟碱类农药含量2 is null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2IsNotNull() {
            addCriterion("新型烟碱类农药含量2 is not null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2EqualTo(String value) {
            addCriterion("新型烟碱类农药含量2 =", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2NotEqualTo(String value) {
            addCriterion("新型烟碱类农药含量2 <>", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2GreaterThan(String value) {
            addCriterion("新型烟碱类农药含量2 >", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2GreaterThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量2 >=", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2LessThan(String value) {
            addCriterion("新型烟碱类农药含量2 <", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2LessThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量2 <=", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2Like(String value) {
            addCriterion("新型烟碱类农药含量2 like", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2NotLike(String value) {
            addCriterion("新型烟碱类农药含量2 not like", value, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2In(List<String> values) {
            addCriterion("新型烟碱类农药含量2 in", values, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2NotIn(List<String> values) {
            addCriterion("新型烟碱类农药含量2 not in", values, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2Between(String value1, String value2) {
            addCriterion("新型烟碱类农药含量2 between", value1, value2, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量2NotBetween(String value1, String value2) {
            addCriterion("新型烟碱类农药含量2 not between", value1, value2, "新型烟碱类农药含量2");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3IsNull() {
            addCriterion("新型烟碱类农药含量3 is null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3IsNotNull() {
            addCriterion("新型烟碱类农药含量3 is not null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3EqualTo(String value) {
            addCriterion("新型烟碱类农药含量3 =", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3NotEqualTo(String value) {
            addCriterion("新型烟碱类农药含量3 <>", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3GreaterThan(String value) {
            addCriterion("新型烟碱类农药含量3 >", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3GreaterThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量3 >=", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3LessThan(String value) {
            addCriterion("新型烟碱类农药含量3 <", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3LessThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量3 <=", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3Like(String value) {
            addCriterion("新型烟碱类农药含量3 like", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3NotLike(String value) {
            addCriterion("新型烟碱类农药含量3 not like", value, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3In(List<String> values) {
            addCriterion("新型烟碱类农药含量3 in", values, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3NotIn(List<String> values) {
            addCriterion("新型烟碱类农药含量3 not in", values, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3Between(String value1, String value2) {
            addCriterion("新型烟碱类农药含量3 between", value1, value2, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量3NotBetween(String value1, String value2) {
            addCriterion("新型烟碱类农药含量3 not between", value1, value2, "新型烟碱类农药含量3");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4IsNull() {
            addCriterion("新型烟碱类农药含量4 is null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4IsNotNull() {
            addCriterion("新型烟碱类农药含量4 is not null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4EqualTo(String value) {
            addCriterion("新型烟碱类农药含量4 =", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4NotEqualTo(String value) {
            addCriterion("新型烟碱类农药含量4 <>", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4GreaterThan(String value) {
            addCriterion("新型烟碱类农药含量4 >", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4GreaterThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量4 >=", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4LessThan(String value) {
            addCriterion("新型烟碱类农药含量4 <", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4LessThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量4 <=", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4Like(String value) {
            addCriterion("新型烟碱类农药含量4 like", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4NotLike(String value) {
            addCriterion("新型烟碱类农药含量4 not like", value, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4In(List<String> values) {
            addCriterion("新型烟碱类农药含量4 in", values, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4NotIn(List<String> values) {
            addCriterion("新型烟碱类农药含量4 not in", values, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4Between(String value1, String value2) {
            addCriterion("新型烟碱类农药含量4 between", value1, value2, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量4NotBetween(String value1, String value2) {
            addCriterion("新型烟碱类农药含量4 not between", value1, value2, "新型烟碱类农药含量4");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5IsNull() {
            addCriterion("新型烟碱类农药含量5 is null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5IsNotNull() {
            addCriterion("新型烟碱类农药含量5 is not null");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5EqualTo(String value) {
            addCriterion("新型烟碱类农药含量5 =", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5NotEqualTo(String value) {
            addCriterion("新型烟碱类农药含量5 <>", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5GreaterThan(String value) {
            addCriterion("新型烟碱类农药含量5 >", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5GreaterThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量5 >=", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5LessThan(String value) {
            addCriterion("新型烟碱类农药含量5 <", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5LessThanOrEqualTo(String value) {
            addCriterion("新型烟碱类农药含量5 <=", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5Like(String value) {
            addCriterion("新型烟碱类农药含量5 like", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5NotLike(String value) {
            addCriterion("新型烟碱类农药含量5 not like", value, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5In(List<String> values) {
            addCriterion("新型烟碱类农药含量5 in", values, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5NotIn(List<String> values) {
            addCriterion("新型烟碱类农药含量5 not in", values, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5Between(String value1, String value2) {
            addCriterion("新型烟碱类农药含量5 between", value1, value2, "新型烟碱类农药含量5");
            return (Criteria) this;
        }

        public Criteria and新型烟碱类农药含量5NotBetween(String value1, String value2) {
            addCriterion("新型烟碱类农药含量5 not between", value1, value2, "新型烟碱类农药含量5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table 水质监测201809新型烟碱类农药含量
     *
     * @mbg.generated
     */
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