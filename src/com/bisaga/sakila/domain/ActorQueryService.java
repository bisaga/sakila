package com.bisaga.sakila.domain;
import com.bisaga.sakila.service.QueryService;
import org.jooq.DSLContext;

import javax.inject.Inject;


public class ActorQueryService extends QueryService {

    @Inject
    public ActorQueryService(DSLContext db) {
        super(db);
    }


}
