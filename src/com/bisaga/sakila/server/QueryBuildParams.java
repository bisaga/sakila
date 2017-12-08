package com.bisaga.sakila.server;

import com.google.gson.Gson;

import java.util.List;

public class QueryBuildParams {
    public enum SortOrder{ASC, DESC}
    public enum ExpressionOperator{LIKE, EQ, NEQ, GT, LT, GEQ, LEQ}
    public enum Directions {FORWARD, BACKWARD}

    public static class SortField {
        private String tableName;
        private String fieldName;
        private SortOrder order;
        private String value;

        public SortField(String tableName, String fieldName, SortOrder order, String value) {
            this.tableName = tableName;
            this.fieldName = fieldName;
            this.order = order;
            this.value = value;
        }

        public String getTableName() {
            return tableName;
        }
        public String getFieldName() {
            return fieldName;
        }
        public SortOrder getOrder() {
            return order;
        }
        public String getValue() {
            return value;
        }
    }

    public static class ExpressionField {
        private String tableName;
        private String fieldName;
        private ExpressionOperator operator;
        private String value;

        public ExpressionField(String tableName, String fieldName, ExpressionOperator operator, String value) {
            this.tableName = tableName;
            this.fieldName = fieldName;
            this.operator = operator;
            this.value = value;
        }

        public String getTableName() {
            return tableName;
        }
        public String getFieldName() {
            return fieldName;
        }
        public ExpressionOperator getOperator() {
            return operator;
        }
        public String getValue() {
            return value;
        }
    }

    // member variables
    private String queryName;
    private QueryBuildParams.Directions direction = QueryBuildParams.Directions.FORWARD;
    private int rows = 25;
    private List<QueryBuildParams.SortField> sortFields;
    private List<QueryBuildParams.ExpressionField> expressionFields;


    public static QueryBuildParams deserialize(String json) {
        Gson gson = new Gson();
        QueryBuildParams newInstance = gson.fromJson(json, QueryBuildParams.class);
        return newInstance;
    }

    public QueryBuildParams(String queryName, List<QueryBuildParams.SortField> sortFields,
                            List<QueryBuildParams.ExpressionField> expressionFields, int rows,
                            QueryBuildParams.Directions direction) {
        this.queryName = queryName;
        this.sortFields = sortFields;
        this.expressionFields = expressionFields;
        this.rows = rows;
        this.direction = direction;
    }

    public String name() {return queryName;}
    public List<QueryBuildParams.SortField> getSortFields() {return sortFields;}
    public List<QueryBuildParams.ExpressionField> getExpressionFields() {return expressionFields;}
    public int getRows() {return rows;}
    public Directions getDirection() {return direction;}

}
