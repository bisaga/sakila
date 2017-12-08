package com.bisaga.sakila.service;
import org.jooq.DSLContext;

import javax.inject.Inject;


public class ActorQueryService extends QueryService {

    @Inject
    public ActorQueryService(DSLContext db) {
        super(db);
    }


}
