package com.thinkgem.jeesite.modules.txzBusiness.entity;

import java.util.ArrayList;
import java.util.List;

public class TzxHomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TzxHomeExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgStatusIsNull() {
            addCriterion("img_status is null");
            return (Criteria) this;
        }

        public Criteria andImgStatusIsNotNull() {
            addCriterion("img_status is not null");
            return (Criteria) this;
        }

        public Criteria andImgStatusEqualTo(String value) {
            addCriterion("img_status =", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotEqualTo(String value) {
            addCriterion("img_status <>", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusGreaterThan(String value) {
            addCriterion("img_status >", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusGreaterThanOrEqualTo(String value) {
            addCriterion("img_status >=", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusLessThan(String value) {
            addCriterion("img_status <", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusLessThanOrEqualTo(String value) {
            addCriterion("img_status <=", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusLike(String value) {
            addCriterion("img_status like", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotLike(String value) {
            addCriterion("img_status not like", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusIn(List<String> values) {
            addCriterion("img_status in", values, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotIn(List<String> values) {
            addCriterion("img_status not in", values, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusBetween(String value1, String value2) {
            addCriterion("img_status between", value1, value2, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotBetween(String value1, String value2) {
            addCriterion("img_status not between", value1, value2, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgSortIsNull() {
            addCriterion("img_sort is null");
            return (Criteria) this;
        }

        public Criteria andImgSortIsNotNull() {
            addCriterion("img_sort is not null");
            return (Criteria) this;
        }

        public Criteria andImgSortEqualTo(String value) {
            addCriterion("img_sort =", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortNotEqualTo(String value) {
            addCriterion("img_sort <>", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortGreaterThan(String value) {
            addCriterion("img_sort >", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortGreaterThanOrEqualTo(String value) {
            addCriterion("img_sort >=", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortLessThan(String value) {
            addCriterion("img_sort <", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortLessThanOrEqualTo(String value) {
            addCriterion("img_sort <=", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortLike(String value) {
            addCriterion("img_sort like", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortNotLike(String value) {
            addCriterion("img_sort not like", value, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortIn(List<String> values) {
            addCriterion("img_sort in", values, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortNotIn(List<String> values) {
            addCriterion("img_sort not in", values, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortBetween(String value1, String value2) {
            addCriterion("img_sort between", value1, value2, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgSortNotBetween(String value1, String value2) {
            addCriterion("img_sort not between", value1, value2, "imgSort");
            return (Criteria) this;
        }

        public Criteria andImgDescIsNull() {
            addCriterion("img_desc is null");
            return (Criteria) this;
        }

        public Criteria andImgDescIsNotNull() {
            addCriterion("img_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImgDescEqualTo(String value) {
            addCriterion("img_desc =", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotEqualTo(String value) {
            addCriterion("img_desc <>", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescGreaterThan(String value) {
            addCriterion("img_desc >", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescGreaterThanOrEqualTo(String value) {
            addCriterion("img_desc >=", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLessThan(String value) {
            addCriterion("img_desc <", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLessThanOrEqualTo(String value) {
            addCriterion("img_desc <=", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLike(String value) {
            addCriterion("img_desc like", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotLike(String value) {
            addCriterion("img_desc not like", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescIn(List<String> values) {
            addCriterion("img_desc in", values, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotIn(List<String> values) {
            addCriterion("img_desc not in", values, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescBetween(String value1, String value2) {
            addCriterion("img_desc between", value1, value2, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotBetween(String value1, String value2) {
            addCriterion("img_desc not between", value1, value2, "imgDesc");
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