package com.bisaga.sakila.service;

import com.bisaga.sakila.server.QueryBuildParams;
import com.google.gson.Gson;
import org.jooq.*;
import org.jooq.impl.DSL;

import static com.bisaga.sakila.dbmodel.Public.PUBLIC;

import java.util.List;

public abstract class QueryService {
    protected QueryBuildParams queryBuildParams;
    protected SelectQuery query;
    protected DSLContext db;

    public QueryService(DSLContext db) {
        this.db = db;
    }

    // build query based on received parameters
    protected void buildQuery() {
        Table table = PUBLIC.getTable(queryBuildParams.name());
        if(table != null) {
            query = db.selectQuery();
            query.addFrom(table);
        }
    }

    public Result execute(QueryBuildParams queryBuildParams) {
        // receive query parameters in the form of string
        this.queryBuildParams =  queryBuildParams;

        // create the query
        this.buildQuery();

        // this add pagging based on parameters
        this.addPaging();

        // TODO Debug
        String sql = query.toString();

        // execute query and return the result
        return query.fetch();
    }

    private void addPaging() {
        if(queryBuildParams.getRows() > 0) {
            this.queryBuildParams.getSortFields().forEach(sortField -> {
                Table table = PUBLIC.getTable(sortField.getTableName());
                Field field = table.field(sortField.getFieldName());

                // direction
                if(queryBuildParams.getDirection() == QueryBuildParams.Directions.FORWARD) {
                    if (sortField.getOrder() == QueryBuildParams.SortOrder.ASC)
                        query.addOrderBy(field.asc());
                    else
                        query.addOrderBy(field.desc());

                    query.addSeekAfter(DSL.value(sortField.getValue()));
                } else {
                    if (sortField.getOrder() == QueryBuildParams.SortOrder.ASC)
                        query.addOrderBy(field.desc());
                    else
                        query.addOrderBy(field.asc());

                    query.addSeekBefore(DSL.value(sortField.getValue()));
                }
            });
            query.addLimit(this.queryBuildParams.getRows());
        }
    }

}
