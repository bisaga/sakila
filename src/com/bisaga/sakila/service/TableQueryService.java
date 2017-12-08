package com.bisaga.sakila.service;

import org.jooq.DSLContext;
import javax.inject.Inject;

public class TableQueryService  extends QueryService {

    @Inject
    public TableQueryService(DSLContext db) {
        super(db);
    }

}
