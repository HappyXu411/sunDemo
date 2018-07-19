package com.brain.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        public Criteria andDocidIsNull() {
            addCriterion("docId is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docId is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docId =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docId <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docId >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docId >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docId <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docId <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<Integer> values) {
            addCriterion("docId in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<Integer> values) {
            addCriterion("docId not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docId between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docId not between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocchannelIsNull() {
            addCriterion("docChannel is null");
            return (Criteria) this;
        }

        public Criteria andDocchannelIsNotNull() {
            addCriterion("docChannel is not null");
            return (Criteria) this;
        }

        public Criteria andDocchannelEqualTo(Integer value) {
            addCriterion("docChannel =", value, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelNotEqualTo(Integer value) {
            addCriterion("docChannel <>", value, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelGreaterThan(Integer value) {
            addCriterion("docChannel >", value, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("docChannel >=", value, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelLessThan(Integer value) {
            addCriterion("docChannel <", value, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelLessThanOrEqualTo(Integer value) {
            addCriterion("docChannel <=", value, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelIn(List<Integer> values) {
            addCriterion("docChannel in", values, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelNotIn(List<Integer> values) {
            addCriterion("docChannel not in", values, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelBetween(Integer value1, Integer value2) {
            addCriterion("docChannel between", value1, value2, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocchannelNotBetween(Integer value1, Integer value2) {
            addCriterion("docChannel not between", value1, value2, "docchannel");
            return (Criteria) this;
        }

        public Criteria andDocversionIsNull() {
            addCriterion("docVersion is null");
            return (Criteria) this;
        }

        public Criteria andDocversionIsNotNull() {
            addCriterion("docVersion is not null");
            return (Criteria) this;
        }

        public Criteria andDocversionEqualTo(Integer value) {
            addCriterion("docVersion =", value, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionNotEqualTo(Integer value) {
            addCriterion("docVersion <>", value, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionGreaterThan(Integer value) {
            addCriterion("docVersion >", value, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("docVersion >=", value, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionLessThan(Integer value) {
            addCriterion("docVersion <", value, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionLessThanOrEqualTo(Integer value) {
            addCriterion("docVersion <=", value, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionIn(List<Integer> values) {
            addCriterion("docVersion in", values, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionNotIn(List<Integer> values) {
            addCriterion("docVersion not in", values, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionBetween(Integer value1, Integer value2) {
            addCriterion("docVersion between", value1, value2, "docversion");
            return (Criteria) this;
        }

        public Criteria andDocversionNotBetween(Integer value1, Integer value2) {
            addCriterion("docVersion not between", value1, value2, "docversion");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNull() {
            addCriterion("docType is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNotNull() {
            addCriterion("docType is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeEqualTo(Integer value) {
            addCriterion("docType =", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotEqualTo(Integer value) {
            addCriterion("docType <>", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThan(Integer value) {
            addCriterion("docType >", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("docType >=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThan(Integer value) {
            addCriterion("docType <", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThanOrEqualTo(Integer value) {
            addCriterion("docType <=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeIn(List<Integer> values) {
            addCriterion("docType in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotIn(List<Integer> values) {
            addCriterion("docType not in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeBetween(Integer value1, Integer value2) {
            addCriterion("docType between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotBetween(Integer value1, Integer value2) {
            addCriterion("docType not between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctitleIsNull() {
            addCriterion("docTitle is null");
            return (Criteria) this;
        }

        public Criteria andDoctitleIsNotNull() {
            addCriterion("docTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDoctitleEqualTo(String value) {
            addCriterion("docTitle =", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotEqualTo(String value) {
            addCriterion("docTitle <>", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleGreaterThan(String value) {
            addCriterion("docTitle >", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleGreaterThanOrEqualTo(String value) {
            addCriterion("docTitle >=", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleLessThan(String value) {
            addCriterion("docTitle <", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleLessThanOrEqualTo(String value) {
            addCriterion("docTitle <=", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleLike(String value) {
            addCriterion("docTitle like", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotLike(String value) {
            addCriterion("docTitle not like", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleIn(List<String> values) {
            addCriterion("docTitle in", values, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotIn(List<String> values) {
            addCriterion("docTitle not in", values, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleBetween(String value1, String value2) {
            addCriterion("docTitle between", value1, value2, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotBetween(String value1, String value2) {
            addCriterion("docTitle not between", value1, value2, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameIsNull() {
            addCriterion("docSourceName is null");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameIsNotNull() {
            addCriterion("docSourceName is not null");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameEqualTo(String value) {
            addCriterion("docSourceName =", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameNotEqualTo(String value) {
            addCriterion("docSourceName <>", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameGreaterThan(String value) {
            addCriterion("docSourceName >", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("docSourceName >=", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameLessThan(String value) {
            addCriterion("docSourceName <", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameLessThanOrEqualTo(String value) {
            addCriterion("docSourceName <=", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameLike(String value) {
            addCriterion("docSourceName like", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameNotLike(String value) {
            addCriterion("docSourceName not like", value, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameIn(List<String> values) {
            addCriterion("docSourceName in", values, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameNotIn(List<String> values) {
            addCriterion("docSourceName not in", values, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameBetween(String value1, String value2) {
            addCriterion("docSourceName between", value1, value2, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocsourcenameNotBetween(String value1, String value2) {
            addCriterion("docSourceName not between", value1, value2, "docsourcename");
            return (Criteria) this;
        }

        public Criteria andDocstatusIsNull() {
            addCriterion("docStatus is null");
            return (Criteria) this;
        }

        public Criteria andDocstatusIsNotNull() {
            addCriterion("docStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDocstatusEqualTo(Integer value) {
            addCriterion("docStatus =", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotEqualTo(Integer value) {
            addCriterion("docStatus <>", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusGreaterThan(Integer value) {
            addCriterion("docStatus >", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("docStatus >=", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusLessThan(Integer value) {
            addCriterion("docStatus <", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusLessThanOrEqualTo(Integer value) {
            addCriterion("docStatus <=", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusIn(List<Integer> values) {
            addCriterion("docStatus in", values, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotIn(List<Integer> values) {
            addCriterion("docStatus not in", values, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusBetween(Integer value1, Integer value2) {
            addCriterion("docStatus between", value1, value2, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("docStatus not between", value1, value2, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocabstractIsNull() {
            addCriterion("docAbstract is null");
            return (Criteria) this;
        }

        public Criteria andDocabstractIsNotNull() {
            addCriterion("docAbstract is not null");
            return (Criteria) this;
        }

        public Criteria andDocabstractEqualTo(String value) {
            addCriterion("docAbstract =", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractNotEqualTo(String value) {
            addCriterion("docAbstract <>", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractGreaterThan(String value) {
            addCriterion("docAbstract >", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractGreaterThanOrEqualTo(String value) {
            addCriterion("docAbstract >=", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractLessThan(String value) {
            addCriterion("docAbstract <", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractLessThanOrEqualTo(String value) {
            addCriterion("docAbstract <=", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractLike(String value) {
            addCriterion("docAbstract like", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractNotLike(String value) {
            addCriterion("docAbstract not like", value, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractIn(List<String> values) {
            addCriterion("docAbstract in", values, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractNotIn(List<String> values) {
            addCriterion("docAbstract not in", values, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractBetween(String value1, String value2) {
            addCriterion("docAbstract between", value1, value2, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDocabstractNotBetween(String value1, String value2) {
            addCriterion("docAbstract not between", value1, value2, "docabstract");
            return (Criteria) this;
        }

        public Criteria andDockeywordsIsNull() {
            addCriterion("docKeywords is null");
            return (Criteria) this;
        }

        public Criteria andDockeywordsIsNotNull() {
            addCriterion("docKeywords is not null");
            return (Criteria) this;
        }

        public Criteria andDockeywordsEqualTo(String value) {
            addCriterion("docKeywords =", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsNotEqualTo(String value) {
            addCriterion("docKeywords <>", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsGreaterThan(String value) {
            addCriterion("docKeywords >", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("docKeywords >=", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsLessThan(String value) {
            addCriterion("docKeywords <", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsLessThanOrEqualTo(String value) {
            addCriterion("docKeywords <=", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsLike(String value) {
            addCriterion("docKeywords like", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsNotLike(String value) {
            addCriterion("docKeywords not like", value, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsIn(List<String> values) {
            addCriterion("docKeywords in", values, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsNotIn(List<String> values) {
            addCriterion("docKeywords not in", values, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsBetween(String value1, String value2) {
            addCriterion("docKeywords between", value1, value2, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDockeywordsNotBetween(String value1, String value2) {
            addCriterion("docKeywords not between", value1, value2, "dockeywords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsIsNull() {
            addCriterion("docRelwords is null");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsIsNotNull() {
            addCriterion("docRelwords is not null");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsEqualTo(String value) {
            addCriterion("docRelwords =", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsNotEqualTo(String value) {
            addCriterion("docRelwords <>", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsGreaterThan(String value) {
            addCriterion("docRelwords >", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsGreaterThanOrEqualTo(String value) {
            addCriterion("docRelwords >=", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsLessThan(String value) {
            addCriterion("docRelwords <", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsLessThanOrEqualTo(String value) {
            addCriterion("docRelwords <=", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsLike(String value) {
            addCriterion("docRelwords like", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsNotLike(String value) {
            addCriterion("docRelwords not like", value, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsIn(List<String> values) {
            addCriterion("docRelwords in", values, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsNotIn(List<String> values) {
            addCriterion("docRelwords not in", values, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsBetween(String value1, String value2) {
            addCriterion("docRelwords between", value1, value2, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocrelwordsNotBetween(String value1, String value2) {
            addCriterion("docRelwords not between", value1, value2, "docrelwords");
            return (Criteria) this;
        }

        public Criteria andDocpeopleIsNull() {
            addCriterion("docPeople is null");
            return (Criteria) this;
        }

        public Criteria andDocpeopleIsNotNull() {
            addCriterion("docPeople is not null");
            return (Criteria) this;
        }

        public Criteria andDocpeopleEqualTo(String value) {
            addCriterion("docPeople =", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleNotEqualTo(String value) {
            addCriterion("docPeople <>", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleGreaterThan(String value) {
            addCriterion("docPeople >", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("docPeople >=", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleLessThan(String value) {
            addCriterion("docPeople <", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleLessThanOrEqualTo(String value) {
            addCriterion("docPeople <=", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleLike(String value) {
            addCriterion("docPeople like", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleNotLike(String value) {
            addCriterion("docPeople not like", value, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleIn(List<String> values) {
            addCriterion("docPeople in", values, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleNotIn(List<String> values) {
            addCriterion("docPeople not in", values, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleBetween(String value1, String value2) {
            addCriterion("docPeople between", value1, value2, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocpeopleNotBetween(String value1, String value2) {
            addCriterion("docPeople not between", value1, value2, "docpeople");
            return (Criteria) this;
        }

        public Criteria andDocplaceIsNull() {
            addCriterion("docPlace is null");
            return (Criteria) this;
        }

        public Criteria andDocplaceIsNotNull() {
            addCriterion("docPlace is not null");
            return (Criteria) this;
        }

        public Criteria andDocplaceEqualTo(String value) {
            addCriterion("docPlace =", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceNotEqualTo(String value) {
            addCriterion("docPlace <>", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceGreaterThan(String value) {
            addCriterion("docPlace >", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceGreaterThanOrEqualTo(String value) {
            addCriterion("docPlace >=", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceLessThan(String value) {
            addCriterion("docPlace <", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceLessThanOrEqualTo(String value) {
            addCriterion("docPlace <=", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceLike(String value) {
            addCriterion("docPlace like", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceNotLike(String value) {
            addCriterion("docPlace not like", value, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceIn(List<String> values) {
            addCriterion("docPlace in", values, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceNotIn(List<String> values) {
            addCriterion("docPlace not in", values, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceBetween(String value1, String value2) {
            addCriterion("docPlace between", value1, value2, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocplaceNotBetween(String value1, String value2) {
            addCriterion("docPlace not between", value1, value2, "docplace");
            return (Criteria) this;
        }

        public Criteria andDocauthorIsNull() {
            addCriterion("docAuthor is null");
            return (Criteria) this;
        }

        public Criteria andDocauthorIsNotNull() {
            addCriterion("docAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andDocauthorEqualTo(String value) {
            addCriterion("docAuthor =", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorNotEqualTo(String value) {
            addCriterion("docAuthor <>", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorGreaterThan(String value) {
            addCriterion("docAuthor >", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorGreaterThanOrEqualTo(String value) {
            addCriterion("docAuthor >=", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorLessThan(String value) {
            addCriterion("docAuthor <", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorLessThanOrEqualTo(String value) {
            addCriterion("docAuthor <=", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorLike(String value) {
            addCriterion("docAuthor like", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorNotLike(String value) {
            addCriterion("docAuthor not like", value, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorIn(List<String> values) {
            addCriterion("docAuthor in", values, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorNotIn(List<String> values) {
            addCriterion("docAuthor not in", values, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorBetween(String value1, String value2) {
            addCriterion("docAuthor between", value1, value2, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDocauthorNotBetween(String value1, String value2) {
            addCriterion("docAuthor not between", value1, value2, "docauthor");
            return (Criteria) this;
        }

        public Criteria andDoceditorIsNull() {
            addCriterion("docEditor is null");
            return (Criteria) this;
        }

        public Criteria andDoceditorIsNotNull() {
            addCriterion("docEditor is not null");
            return (Criteria) this;
        }

        public Criteria andDoceditorEqualTo(String value) {
            addCriterion("docEditor =", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorNotEqualTo(String value) {
            addCriterion("docEditor <>", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorGreaterThan(String value) {
            addCriterion("docEditor >", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorGreaterThanOrEqualTo(String value) {
            addCriterion("docEditor >=", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorLessThan(String value) {
            addCriterion("docEditor <", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorLessThanOrEqualTo(String value) {
            addCriterion("docEditor <=", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorLike(String value) {
            addCriterion("docEditor like", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorNotLike(String value) {
            addCriterion("docEditor not like", value, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorIn(List<String> values) {
            addCriterion("docEditor in", values, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorNotIn(List<String> values) {
            addCriterion("docEditor not in", values, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorBetween(String value1, String value2) {
            addCriterion("docEditor between", value1, value2, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDoceditorNotBetween(String value1, String value2) {
            addCriterion("docEditor not between", value1, value2, "doceditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorIsNull() {
            addCriterion("docAuditor is null");
            return (Criteria) this;
        }

        public Criteria andDocauditorIsNotNull() {
            addCriterion("docAuditor is not null");
            return (Criteria) this;
        }

        public Criteria andDocauditorEqualTo(String value) {
            addCriterion("docAuditor =", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorNotEqualTo(String value) {
            addCriterion("docAuditor <>", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorGreaterThan(String value) {
            addCriterion("docAuditor >", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorGreaterThanOrEqualTo(String value) {
            addCriterion("docAuditor >=", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorLessThan(String value) {
            addCriterion("docAuditor <", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorLessThanOrEqualTo(String value) {
            addCriterion("docAuditor <=", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorLike(String value) {
            addCriterion("docAuditor like", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorNotLike(String value) {
            addCriterion("docAuditor not like", value, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorIn(List<String> values) {
            addCriterion("docAuditor in", values, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorNotIn(List<String> values) {
            addCriterion("docAuditor not in", values, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorBetween(String value1, String value2) {
            addCriterion("docAuditor between", value1, value2, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocauditorNotBetween(String value1, String value2) {
            addCriterion("docAuditor not between", value1, value2, "docauditor");
            return (Criteria) this;
        }

        public Criteria andDocoutupidIsNull() {
            addCriterion("docOutupid is null");
            return (Criteria) this;
        }

        public Criteria andDocoutupidIsNotNull() {
            addCriterion("docOutupid is not null");
            return (Criteria) this;
        }

        public Criteria andDocoutupidEqualTo(Integer value) {
            addCriterion("docOutupid =", value, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidNotEqualTo(Integer value) {
            addCriterion("docOutupid <>", value, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidGreaterThan(Integer value) {
            addCriterion("docOutupid >", value, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docOutupid >=", value, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidLessThan(Integer value) {
            addCriterion("docOutupid <", value, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidLessThanOrEqualTo(Integer value) {
            addCriterion("docOutupid <=", value, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidIn(List<Integer> values) {
            addCriterion("docOutupid in", values, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidNotIn(List<Integer> values) {
            addCriterion("docOutupid not in", values, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidBetween(Integer value1, Integer value2) {
            addCriterion("docOutupid between", value1, value2, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocoutupidNotBetween(Integer value1, Integer value2) {
            addCriterion("docOutupid not between", value1, value2, "docoutupid");
            return (Criteria) this;
        }

        public Criteria andDocvalidIsNull() {
            addCriterion("docValid is null");
            return (Criteria) this;
        }

        public Criteria andDocvalidIsNotNull() {
            addCriterion("docValid is not null");
            return (Criteria) this;
        }

        public Criteria andDocvalidEqualTo(Date value) {
            addCriterion("docValid =", value, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidNotEqualTo(Date value) {
            addCriterion("docValid <>", value, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidGreaterThan(Date value) {
            addCriterion("docValid >", value, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidGreaterThanOrEqualTo(Date value) {
            addCriterion("docValid >=", value, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidLessThan(Date value) {
            addCriterion("docValid <", value, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidLessThanOrEqualTo(Date value) {
            addCriterion("docValid <=", value, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidIn(List<Date> values) {
            addCriterion("docValid in", values, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidNotIn(List<Date> values) {
            addCriterion("docValid not in", values, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidBetween(Date value1, Date value2) {
            addCriterion("docValid between", value1, value2, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocvalidNotBetween(Date value1, Date value2) {
            addCriterion("docValid not between", value1, value2, "docvalid");
            return (Criteria) this;
        }

        public Criteria andDocpuburlIsNull() {
            addCriterion("docPuburl is null");
            return (Criteria) this;
        }

        public Criteria andDocpuburlIsNotNull() {
            addCriterion("docPuburl is not null");
            return (Criteria) this;
        }

        public Criteria andDocpuburlEqualTo(String value) {
            addCriterion("docPuburl =", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlNotEqualTo(String value) {
            addCriterion("docPuburl <>", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlGreaterThan(String value) {
            addCriterion("docPuburl >", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlGreaterThanOrEqualTo(String value) {
            addCriterion("docPuburl >=", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlLessThan(String value) {
            addCriterion("docPuburl <", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlLessThanOrEqualTo(String value) {
            addCriterion("docPuburl <=", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlLike(String value) {
            addCriterion("docPuburl like", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlNotLike(String value) {
            addCriterion("docPuburl not like", value, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlIn(List<String> values) {
            addCriterion("docPuburl in", values, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlNotIn(List<String> values) {
            addCriterion("docPuburl not in", values, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlBetween(String value1, String value2) {
            addCriterion("docPuburl between", value1, value2, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpuburlNotBetween(String value1, String value2) {
            addCriterion("docPuburl not between", value1, value2, "docpuburl");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeIsNull() {
            addCriterion("docPubtime is null");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeIsNotNull() {
            addCriterion("docPubtime is not null");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeEqualTo(Date value) {
            addCriterion("docPubtime =", value, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeNotEqualTo(Date value) {
            addCriterion("docPubtime <>", value, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeGreaterThan(Date value) {
            addCriterion("docPubtime >", value, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("docPubtime >=", value, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeLessThan(Date value) {
            addCriterion("docPubtime <", value, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeLessThanOrEqualTo(Date value) {
            addCriterion("docPubtime <=", value, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeIn(List<Date> values) {
            addCriterion("docPubtime in", values, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeNotIn(List<Date> values) {
            addCriterion("docPubtime not in", values, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeBetween(Date value1, Date value2) {
            addCriterion("docPubtime between", value1, value2, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocpubtimeNotBetween(Date value1, Date value2) {
            addCriterion("docPubtime not between", value1, value2, "docpubtime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeIsNull() {
            addCriterion("docReltime is null");
            return (Criteria) this;
        }

        public Criteria andDocreltimeIsNotNull() {
            addCriterion("docReltime is not null");
            return (Criteria) this;
        }

        public Criteria andDocreltimeEqualTo(Date value) {
            addCriterion("docReltime =", value, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeNotEqualTo(Date value) {
            addCriterion("docReltime <>", value, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeGreaterThan(Date value) {
            addCriterion("docReltime >", value, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("docReltime >=", value, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeLessThan(Date value) {
            addCriterion("docReltime <", value, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeLessThanOrEqualTo(Date value) {
            addCriterion("docReltime <=", value, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeIn(List<Date> values) {
            addCriterion("docReltime in", values, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeNotIn(List<Date> values) {
            addCriterion("docReltime not in", values, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeBetween(Date value1, Date value2) {
            addCriterion("docReltime between", value1, value2, "docreltime");
            return (Criteria) this;
        }

        public Criteria andDocreltimeNotBetween(Date value1, Date value2) {
            addCriterion("docReltime not between", value1, value2, "docreltime");
            return (Criteria) this;
        }

        public Criteria andCruserIsNull() {
            addCriterion("cruser is null");
            return (Criteria) this;
        }

        public Criteria andCruserIsNotNull() {
            addCriterion("cruser is not null");
            return (Criteria) this;
        }

        public Criteria andCruserEqualTo(String value) {
            addCriterion("cruser =", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserNotEqualTo(String value) {
            addCriterion("cruser <>", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserGreaterThan(String value) {
            addCriterion("cruser >", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserGreaterThanOrEqualTo(String value) {
            addCriterion("cruser >=", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserLessThan(String value) {
            addCriterion("cruser <", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserLessThanOrEqualTo(String value) {
            addCriterion("cruser <=", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserLike(String value) {
            addCriterion("cruser like", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserNotLike(String value) {
            addCriterion("cruser not like", value, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserIn(List<String> values) {
            addCriterion("cruser in", values, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserNotIn(List<String> values) {
            addCriterion("cruser not in", values, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserBetween(String value1, String value2) {
            addCriterion("cruser between", value1, value2, "cruser");
            return (Criteria) this;
        }

        public Criteria andCruserNotBetween(String value1, String value2) {
            addCriterion("cruser not between", value1, value2, "cruser");
            return (Criteria) this;
        }

        public Criteria andCrtimeIsNull() {
            addCriterion("crtime is null");
            return (Criteria) this;
        }

        public Criteria andCrtimeIsNotNull() {
            addCriterion("crtime is not null");
            return (Criteria) this;
        }

        public Criteria andCrtimeEqualTo(Date value) {
            addCriterion("crtime =", value, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeNotEqualTo(Date value) {
            addCriterion("crtime <>", value, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeGreaterThan(Date value) {
            addCriterion("crtime >", value, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crtime >=", value, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeLessThan(Date value) {
            addCriterion("crtime <", value, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeLessThanOrEqualTo(Date value) {
            addCriterion("crtime <=", value, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeIn(List<Date> values) {
            addCriterion("crtime in", values, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeNotIn(List<Date> values) {
            addCriterion("crtime not in", values, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeBetween(Date value1, Date value2) {
            addCriterion("crtime between", value1, value2, "crtime");
            return (Criteria) this;
        }

        public Criteria andCrtimeNotBetween(Date value1, Date value2) {
            addCriterion("crtime not between", value1, value2, "crtime");
            return (Criteria) this;
        }

        public Criteria andDocwordscountIsNull() {
            addCriterion("docwordscount is null");
            return (Criteria) this;
        }

        public Criteria andDocwordscountIsNotNull() {
            addCriterion("docwordscount is not null");
            return (Criteria) this;
        }

        public Criteria andDocwordscountEqualTo(Integer value) {
            addCriterion("docwordscount =", value, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountNotEqualTo(Integer value) {
            addCriterion("docwordscount <>", value, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountGreaterThan(Integer value) {
            addCriterion("docwordscount >", value, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("docwordscount >=", value, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountLessThan(Integer value) {
            addCriterion("docwordscount <", value, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountLessThanOrEqualTo(Integer value) {
            addCriterion("docwordscount <=", value, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountIn(List<Integer> values) {
            addCriterion("docwordscount in", values, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountNotIn(List<Integer> values) {
            addCriterion("docwordscount not in", values, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountBetween(Integer value1, Integer value2) {
            addCriterion("docwordscount between", value1, value2, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocwordscountNotBetween(Integer value1, Integer value2) {
            addCriterion("docwordscount not between", value1, value2, "docwordscount");
            return (Criteria) this;
        }

        public Criteria andDocproIsNull() {
            addCriterion("docpro is null");
            return (Criteria) this;
        }

        public Criteria andDocproIsNotNull() {
            addCriterion("docpro is not null");
            return (Criteria) this;
        }

        public Criteria andDocproEqualTo(Integer value) {
            addCriterion("docpro =", value, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproNotEqualTo(Integer value) {
            addCriterion("docpro <>", value, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproGreaterThan(Integer value) {
            addCriterion("docpro >", value, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproGreaterThanOrEqualTo(Integer value) {
            addCriterion("docpro >=", value, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproLessThan(Integer value) {
            addCriterion("docpro <", value, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproLessThanOrEqualTo(Integer value) {
            addCriterion("docpro <=", value, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproIn(List<Integer> values) {
            addCriterion("docpro in", values, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproNotIn(List<Integer> values) {
            addCriterion("docpro not in", values, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproBetween(Integer value1, Integer value2) {
            addCriterion("docpro between", value1, value2, "docpro");
            return (Criteria) this;
        }

        public Criteria andDocproNotBetween(Integer value1, Integer value2) {
            addCriterion("docpro not between", value1, value2, "docpro");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIsNull() {
            addCriterion("titleColor is null");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIsNotNull() {
            addCriterion("titleColor is not null");
            return (Criteria) this;
        }

        public Criteria andTitlecolorEqualTo(String value) {
            addCriterion("titleColor =", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotEqualTo(String value) {
            addCriterion("titleColor <>", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorGreaterThan(String value) {
            addCriterion("titleColor >", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorGreaterThanOrEqualTo(String value) {
            addCriterion("titleColor >=", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLessThan(String value) {
            addCriterion("titleColor <", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLessThanOrEqualTo(String value) {
            addCriterion("titleColor <=", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLike(String value) {
            addCriterion("titleColor like", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotLike(String value) {
            addCriterion("titleColor not like", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIn(List<String> values) {
            addCriterion("titleColor in", values, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotIn(List<String> values) {
            addCriterion("titleColor not in", values, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorBetween(String value1, String value2) {
            addCriterion("titleColor between", value1, value2, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotBetween(String value1, String value2) {
            addCriterion("titleColor not between", value1, value2, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNull() {
            addCriterion("templateId is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("templateId is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(Integer value) {
            addCriterion("templateId =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(Integer value) {
            addCriterion("templateId <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(Integer value) {
            addCriterion("templateId >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("templateId >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(Integer value) {
            addCriterion("templateId <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(Integer value) {
            addCriterion("templateId <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<Integer> values) {
            addCriterion("templateId in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<Integer> values) {
            addCriterion("templateId not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(Integer value1, Integer value2) {
            addCriterion("templateId between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(Integer value1, Integer value2) {
            addCriterion("templateId not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andAttributeIsNull() {
            addCriterion("attribute is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIsNotNull() {
            addCriterion("attribute is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeEqualTo(String value) {
            addCriterion("attribute =", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotEqualTo(String value) {
            addCriterion("attribute <>", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeGreaterThan(String value) {
            addCriterion("attribute >", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("attribute >=", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLessThan(String value) {
            addCriterion("attribute <", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLessThanOrEqualTo(String value) {
            addCriterion("attribute <=", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLike(String value) {
            addCriterion("attribute like", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotLike(String value) {
            addCriterion("attribute not like", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeIn(List<String> values) {
            addCriterion("attribute in", values, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotIn(List<String> values) {
            addCriterion("attribute not in", values, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeBetween(String value1, String value2) {
            addCriterion("attribute between", value1, value2, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotBetween(String value1, String value2) {
            addCriterion("attribute not between", value1, value2, "attribute");
            return (Criteria) this;
        }

        public Criteria andHiscountIsNull() {
            addCriterion("hiscount is null");
            return (Criteria) this;
        }

        public Criteria andHiscountIsNotNull() {
            addCriterion("hiscount is not null");
            return (Criteria) this;
        }

        public Criteria andHiscountEqualTo(Integer value) {
            addCriterion("hiscount =", value, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountNotEqualTo(Integer value) {
            addCriterion("hiscount <>", value, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountGreaterThan(Integer value) {
            addCriterion("hiscount >", value, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("hiscount >=", value, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountLessThan(Integer value) {
            addCriterion("hiscount <", value, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountLessThanOrEqualTo(Integer value) {
            addCriterion("hiscount <=", value, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountIn(List<Integer> values) {
            addCriterion("hiscount in", values, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountNotIn(List<Integer> values) {
            addCriterion("hiscount not in", values, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountBetween(Integer value1, Integer value2) {
            addCriterion("hiscount between", value1, value2, "hiscount");
            return (Criteria) this;
        }

        public Criteria andHiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("hiscount not between", value1, value2, "hiscount");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleIsNull() {
            addCriterion("subdoctitle is null");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleIsNotNull() {
            addCriterion("subdoctitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleEqualTo(String value) {
            addCriterion("subdoctitle =", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleNotEqualTo(String value) {
            addCriterion("subdoctitle <>", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleGreaterThan(String value) {
            addCriterion("subdoctitle >", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleGreaterThanOrEqualTo(String value) {
            addCriterion("subdoctitle >=", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleLessThan(String value) {
            addCriterion("subdoctitle <", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleLessThanOrEqualTo(String value) {
            addCriterion("subdoctitle <=", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleLike(String value) {
            addCriterion("subdoctitle like", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleNotLike(String value) {
            addCriterion("subdoctitle not like", value, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleIn(List<String> values) {
            addCriterion("subdoctitle in", values, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleNotIn(List<String> values) {
            addCriterion("subdoctitle not in", values, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleBetween(String value1, String value2) {
            addCriterion("subdoctitle between", value1, value2, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andSubdoctitleNotBetween(String value1, String value2) {
            addCriterion("subdoctitle not between", value1, value2, "subdoctitle");
            return (Criteria) this;
        }

        public Criteria andAttachpicIsNull() {
            addCriterion("attachpic is null");
            return (Criteria) this;
        }

        public Criteria andAttachpicIsNotNull() {
            addCriterion("attachpic is not null");
            return (Criteria) this;
        }

        public Criteria andAttachpicEqualTo(Integer value) {
            addCriterion("attachpic =", value, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicNotEqualTo(Integer value) {
            addCriterion("attachpic <>", value, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicGreaterThan(Integer value) {
            addCriterion("attachpic >", value, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicGreaterThanOrEqualTo(Integer value) {
            addCriterion("attachpic >=", value, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicLessThan(Integer value) {
            addCriterion("attachpic <", value, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicLessThanOrEqualTo(Integer value) {
            addCriterion("attachpic <=", value, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicIn(List<Integer> values) {
            addCriterion("attachpic in", values, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicNotIn(List<Integer> values) {
            addCriterion("attachpic not in", values, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicBetween(Integer value1, Integer value2) {
            addCriterion("attachpic between", value1, value2, "attachpic");
            return (Criteria) this;
        }

        public Criteria andAttachpicNotBetween(Integer value1, Integer value2) {
            addCriterion("attachpic not between", value1, value2, "attachpic");
            return (Criteria) this;
        }

        public Criteria andDoclinkIsNull() {
            addCriterion("doclink is null");
            return (Criteria) this;
        }

        public Criteria andDoclinkIsNotNull() {
            addCriterion("doclink is not null");
            return (Criteria) this;
        }

        public Criteria andDoclinkEqualTo(String value) {
            addCriterion("doclink =", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkNotEqualTo(String value) {
            addCriterion("doclink <>", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkGreaterThan(String value) {
            addCriterion("doclink >", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkGreaterThanOrEqualTo(String value) {
            addCriterion("doclink >=", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkLessThan(String value) {
            addCriterion("doclink <", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkLessThanOrEqualTo(String value) {
            addCriterion("doclink <=", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkLike(String value) {
            addCriterion("doclink like", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkNotLike(String value) {
            addCriterion("doclink not like", value, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkIn(List<String> values) {
            addCriterion("doclink in", values, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkNotIn(List<String> values) {
            addCriterion("doclink not in", values, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkBetween(String value1, String value2) {
            addCriterion("doclink between", value1, value2, "doclink");
            return (Criteria) this;
        }

        public Criteria andDoclinkNotBetween(String value1, String value2) {
            addCriterion("doclink not between", value1, value2, "doclink");
            return (Criteria) this;
        }

        public Criteria andDocfilenameIsNull() {
            addCriterion("docFilename is null");
            return (Criteria) this;
        }

        public Criteria andDocfilenameIsNotNull() {
            addCriterion("docFilename is not null");
            return (Criteria) this;
        }

        public Criteria andDocfilenameEqualTo(String value) {
            addCriterion("docFilename =", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameNotEqualTo(String value) {
            addCriterion("docFilename <>", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameGreaterThan(String value) {
            addCriterion("docFilename >", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("docFilename >=", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameLessThan(String value) {
            addCriterion("docFilename <", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameLessThanOrEqualTo(String value) {
            addCriterion("docFilename <=", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameLike(String value) {
            addCriterion("docFilename like", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameNotLike(String value) {
            addCriterion("docFilename not like", value, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameIn(List<String> values) {
            addCriterion("docFilename in", values, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameNotIn(List<String> values) {
            addCriterion("docFilename not in", values, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameBetween(String value1, String value2) {
            addCriterion("docFilename between", value1, value2, "docfilename");
            return (Criteria) this;
        }

        public Criteria andDocfilenameNotBetween(String value1, String value2) {
            addCriterion("docFilename not between", value1, value2, "docfilename");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNull() {
            addCriterion("opertime is null");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNotNull() {
            addCriterion("opertime is not null");
            return (Criteria) this;
        }

        public Criteria andOpertimeEqualTo(Date value) {
            addCriterion("opertime =", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotEqualTo(Date value) {
            addCriterion("opertime <>", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThan(Date value) {
            addCriterion("opertime >", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opertime >=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThan(Date value) {
            addCriterion("opertime <", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThanOrEqualTo(Date value) {
            addCriterion("opertime <=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeIn(List<Date> values) {
            addCriterion("opertime in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotIn(List<Date> values) {
            addCriterion("opertime not in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeBetween(Date value1, Date value2) {
            addCriterion("opertime between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotBetween(Date value1, Date value2) {
            addCriterion("opertime not between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andOperuserIsNull() {
            addCriterion("operuser is null");
            return (Criteria) this;
        }

        public Criteria andOperuserIsNotNull() {
            addCriterion("operuser is not null");
            return (Criteria) this;
        }

        public Criteria andOperuserEqualTo(String value) {
            addCriterion("operuser =", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserNotEqualTo(String value) {
            addCriterion("operuser <>", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserGreaterThan(String value) {
            addCriterion("operuser >", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserGreaterThanOrEqualTo(String value) {
            addCriterion("operuser >=", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserLessThan(String value) {
            addCriterion("operuser <", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserLessThanOrEqualTo(String value) {
            addCriterion("operuser <=", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserLike(String value) {
            addCriterion("operuser like", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserNotLike(String value) {
            addCriterion("operuser not like", value, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserIn(List<String> values) {
            addCriterion("operuser in", values, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserNotIn(List<String> values) {
            addCriterion("operuser not in", values, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserBetween(String value1, String value2) {
            addCriterion("operuser between", value1, value2, "operuser");
            return (Criteria) this;
        }

        public Criteria andOperuserNotBetween(String value1, String value2) {
            addCriterion("operuser not between", value1, value2, "operuser");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNull() {
            addCriterion("videoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(String value) {
            addCriterion("videoId =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(String value) {
            addCriterion("videoId <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(String value) {
            addCriterion("videoId >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(String value) {
            addCriterion("videoId >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(String value) {
            addCriterion("videoId <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(String value) {
            addCriterion("videoId <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLike(String value) {
            addCriterion("videoId like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotLike(String value) {
            addCriterion("videoId not like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<String> values) {
            addCriterion("videoId in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<String> values) {
            addCriterion("videoId not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(String value1, String value2) {
            addCriterion("videoId between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(String value1, String value2) {
            addCriterion("videoId not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andDocclassIsNull() {
            addCriterion("docClass is null");
            return (Criteria) this;
        }

        public Criteria andDocclassIsNotNull() {
            addCriterion("docClass is not null");
            return (Criteria) this;
        }

        public Criteria andDocclassEqualTo(Integer value) {
            addCriterion("docClass =", value, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassNotEqualTo(Integer value) {
            addCriterion("docClass <>", value, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassGreaterThan(Integer value) {
            addCriterion("docClass >", value, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("docClass >=", value, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassLessThan(Integer value) {
            addCriterion("docClass <", value, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassLessThanOrEqualTo(Integer value) {
            addCriterion("docClass <=", value, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassIn(List<Integer> values) {
            addCriterion("docClass in", values, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassNotIn(List<Integer> values) {
            addCriterion("docClass not in", values, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassBetween(Integer value1, Integer value2) {
            addCriterion("docClass between", value1, value2, "docclass");
            return (Criteria) this;
        }

        public Criteria andDocclassNotBetween(Integer value1, Integer value2) {
            addCriterion("docClass not between", value1, value2, "docclass");
            return (Criteria) this;
        }

        public Criteria andIsrecIsNull() {
            addCriterion("isRec is null");
            return (Criteria) this;
        }

        public Criteria andIsrecIsNotNull() {
            addCriterion("isRec is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecEqualTo(Short value) {
            addCriterion("isRec =", value, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecNotEqualTo(Short value) {
            addCriterion("isRec <>", value, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecGreaterThan(Short value) {
            addCriterion("isRec >", value, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecGreaterThanOrEqualTo(Short value) {
            addCriterion("isRec >=", value, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecLessThan(Short value) {
            addCriterion("isRec <", value, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecLessThanOrEqualTo(Short value) {
            addCriterion("isRec <=", value, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecIn(List<Short> values) {
            addCriterion("isRec in", values, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecNotIn(List<Short> values) {
            addCriterion("isRec not in", values, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecBetween(Short value1, Short value2) {
            addCriterion("isRec between", value1, value2, "isrec");
            return (Criteria) this;
        }

        public Criteria andIsrecNotBetween(Short value1, Short value2) {
            addCriterion("isRec not between", value1, value2, "isrec");
            return (Criteria) this;
        }

        public Criteria andDocorderIsNull() {
            addCriterion("docOrder is null");
            return (Criteria) this;
        }

        public Criteria andDocorderIsNotNull() {
            addCriterion("docOrder is not null");
            return (Criteria) this;
        }

        public Criteria andDocorderEqualTo(Integer value) {
            addCriterion("docOrder =", value, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderNotEqualTo(Integer value) {
            addCriterion("docOrder <>", value, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderGreaterThan(Integer value) {
            addCriterion("docOrder >", value, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("docOrder >=", value, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderLessThan(Integer value) {
            addCriterion("docOrder <", value, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderLessThanOrEqualTo(Integer value) {
            addCriterion("docOrder <=", value, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderIn(List<Integer> values) {
            addCriterion("docOrder in", values, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderNotIn(List<Integer> values) {
            addCriterion("docOrder not in", values, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderBetween(Integer value1, Integer value2) {
            addCriterion("docOrder between", value1, value2, "docorder");
            return (Criteria) this;
        }

        public Criteria andDocorderNotBetween(Integer value1, Integer value2) {
            addCriterion("docOrder not between", value1, value2, "docorder");
            return (Criteria) this;
        }

        public Criteria andRecurlIsNull() {
            addCriterion("_recurl is null");
            return (Criteria) this;
        }

        public Criteria andRecurlIsNotNull() {
            addCriterion("_recurl is not null");
            return (Criteria) this;
        }

        public Criteria andRecurlEqualTo(String value) {
            addCriterion("_recurl =", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlNotEqualTo(String value) {
            addCriterion("_recurl <>", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlGreaterThan(String value) {
            addCriterion("_recurl >", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlGreaterThanOrEqualTo(String value) {
            addCriterion("_recurl >=", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlLessThan(String value) {
            addCriterion("_recurl <", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlLessThanOrEqualTo(String value) {
            addCriterion("_recurl <=", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlLike(String value) {
            addCriterion("_recurl like", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlNotLike(String value) {
            addCriterion("_recurl not like", value, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlIn(List<String> values) {
            addCriterion("_recurl in", values, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlNotIn(List<String> values) {
            addCriterion("_recurl not in", values, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlBetween(String value1, String value2) {
            addCriterion("_recurl between", value1, value2, "recurl");
            return (Criteria) this;
        }

        public Criteria andRecurlNotBetween(String value1, String value2) {
            addCriterion("_recurl not between", value1, value2, "recurl");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("thumb is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("thumb is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("thumb =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("thumb <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("thumb >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("thumb >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("thumb <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("thumb <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("thumb like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("thumb not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("thumb in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("thumb not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("thumb between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("thumb not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNull() {
            addCriterion("linkUrl is null");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNotNull() {
            addCriterion("linkUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLinkurlEqualTo(String value) {
            addCriterion("linkUrl =", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotEqualTo(String value) {
            addCriterion("linkUrl <>", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThan(String value) {
            addCriterion("linkUrl >", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThanOrEqualTo(String value) {
            addCriterion("linkUrl >=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThan(String value) {
            addCriterion("linkUrl <", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThanOrEqualTo(String value) {
            addCriterion("linkUrl <=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLike(String value) {
            addCriterion("linkUrl like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotLike(String value) {
            addCriterion("linkUrl not like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlIn(List<String> values) {
            addCriterion("linkUrl in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotIn(List<String> values) {
            addCriterion("linkUrl not in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlBetween(String value1, String value2) {
            addCriterion("linkUrl between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotBetween(String value1, String value2) {
            addCriterion("linkUrl not between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andTempidIsNull() {
            addCriterion("tempid is null");
            return (Criteria) this;
        }

        public Criteria andTempidIsNotNull() {
            addCriterion("tempid is not null");
            return (Criteria) this;
        }

        public Criteria andTempidEqualTo(Integer value) {
            addCriterion("tempid =", value, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidNotEqualTo(Integer value) {
            addCriterion("tempid <>", value, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidGreaterThan(Integer value) {
            addCriterion("tempid >", value, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tempid >=", value, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidLessThan(Integer value) {
            addCriterion("tempid <", value, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidLessThanOrEqualTo(Integer value) {
            addCriterion("tempid <=", value, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidIn(List<Integer> values) {
            addCriterion("tempid in", values, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidNotIn(List<Integer> values) {
            addCriterion("tempid not in", values, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidBetween(Integer value1, Integer value2) {
            addCriterion("tempid between", value1, value2, "tempid");
            return (Criteria) this;
        }

        public Criteria andTempidNotBetween(Integer value1, Integer value2) {
            addCriterion("tempid not between", value1, value2, "tempid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidIsNull() {
            addCriterion("trsDocID is null");
            return (Criteria) this;
        }

        public Criteria andTrsdocidIsNotNull() {
            addCriterion("trsDocID is not null");
            return (Criteria) this;
        }

        public Criteria andTrsdocidEqualTo(Integer value) {
            addCriterion("trsDocID =", value, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidNotEqualTo(Integer value) {
            addCriterion("trsDocID <>", value, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidGreaterThan(Integer value) {
            addCriterion("trsDocID >", value, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("trsDocID >=", value, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidLessThan(Integer value) {
            addCriterion("trsDocID <", value, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidLessThanOrEqualTo(Integer value) {
            addCriterion("trsDocID <=", value, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidIn(List<Integer> values) {
            addCriterion("trsDocID in", values, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidNotIn(List<Integer> values) {
            addCriterion("trsDocID not in", values, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidBetween(Integer value1, Integer value2) {
            addCriterion("trsDocID between", value1, value2, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andTrsdocidNotBetween(Integer value1, Integer value2) {
            addCriterion("trsDocID not between", value1, value2, "trsdocid");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNull() {
            addCriterion("parentPath is null");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNotNull() {
            addCriterion("parentPath is not null");
            return (Criteria) this;
        }

        public Criteria andParentpathEqualTo(String value) {
            addCriterion("parentPath =", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotEqualTo(String value) {
            addCriterion("parentPath <>", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThan(String value) {
            addCriterion("parentPath >", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThanOrEqualTo(String value) {
            addCriterion("parentPath >=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThan(String value) {
            addCriterion("parentPath <", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThanOrEqualTo(String value) {
            addCriterion("parentPath <=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLike(String value) {
            addCriterion("parentPath like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotLike(String value) {
            addCriterion("parentPath not like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathIn(List<String> values) {
            addCriterion("parentPath in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotIn(List<String> values) {
            addCriterion("parentPath not in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathBetween(String value1, String value2) {
            addCriterion("parentPath between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotBetween(String value1, String value2) {
            addCriterion("parentPath not between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andImglinksIsNull() {
            addCriterion("imgLinks is null");
            return (Criteria) this;
        }

        public Criteria andImglinksIsNotNull() {
            addCriterion("imgLinks is not null");
            return (Criteria) this;
        }

        public Criteria andImglinksEqualTo(String value) {
            addCriterion("imgLinks =", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksNotEqualTo(String value) {
            addCriterion("imgLinks <>", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksGreaterThan(String value) {
            addCriterion("imgLinks >", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksGreaterThanOrEqualTo(String value) {
            addCriterion("imgLinks >=", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksLessThan(String value) {
            addCriterion("imgLinks <", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksLessThanOrEqualTo(String value) {
            addCriterion("imgLinks <=", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksLike(String value) {
            addCriterion("imgLinks like", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksNotLike(String value) {
            addCriterion("imgLinks not like", value, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksIn(List<String> values) {
            addCriterion("imgLinks in", values, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksNotIn(List<String> values) {
            addCriterion("imgLinks not in", values, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksBetween(String value1, String value2) {
            addCriterion("imgLinks between", value1, value2, "imglinks");
            return (Criteria) this;
        }

        public Criteria andImglinksNotBetween(String value1, String value2) {
            addCriterion("imgLinks not between", value1, value2, "imglinks");
            return (Criteria) this;
        }

        public Criteria andParentlinkIsNull() {
            addCriterion("parentLink is null");
            return (Criteria) this;
        }

        public Criteria andParentlinkIsNotNull() {
            addCriterion("parentLink is not null");
            return (Criteria) this;
        }

        public Criteria andParentlinkEqualTo(String value) {
            addCriterion("parentLink =", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkNotEqualTo(String value) {
            addCriterion("parentLink <>", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkGreaterThan(String value) {
            addCriterion("parentLink >", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkGreaterThanOrEqualTo(String value) {
            addCriterion("parentLink >=", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkLessThan(String value) {
            addCriterion("parentLink <", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkLessThanOrEqualTo(String value) {
            addCriterion("parentLink <=", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkLike(String value) {
            addCriterion("parentLink like", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkNotLike(String value) {
            addCriterion("parentLink not like", value, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkIn(List<String> values) {
            addCriterion("parentLink in", values, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkNotIn(List<String> values) {
            addCriterion("parentLink not in", values, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkBetween(String value1, String value2) {
            addCriterion("parentLink between", value1, value2, "parentlink");
            return (Criteria) this;
        }

        public Criteria andParentlinkNotBetween(String value1, String value2) {
            addCriterion("parentLink not between", value1, value2, "parentlink");
            return (Criteria) this;
        }

        public Criteria andDocbakIsNull() {
            addCriterion("docbak is null");
            return (Criteria) this;
        }

        public Criteria andDocbakIsNotNull() {
            addCriterion("docbak is not null");
            return (Criteria) this;
        }

        public Criteria andDocbakEqualTo(Integer value) {
            addCriterion("docbak =", value, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakNotEqualTo(Integer value) {
            addCriterion("docbak <>", value, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakGreaterThan(Integer value) {
            addCriterion("docbak >", value, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakGreaterThanOrEqualTo(Integer value) {
            addCriterion("docbak >=", value, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakLessThan(Integer value) {
            addCriterion("docbak <", value, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakLessThanOrEqualTo(Integer value) {
            addCriterion("docbak <=", value, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakIn(List<Integer> values) {
            addCriterion("docbak in", values, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakNotIn(List<Integer> values) {
            addCriterion("docbak not in", values, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakBetween(Integer value1, Integer value2) {
            addCriterion("docbak between", value1, value2, "docbak");
            return (Criteria) this;
        }

        public Criteria andDocbakNotBetween(Integer value1, Integer value2) {
            addCriterion("docbak not between", value1, value2, "docbak");
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