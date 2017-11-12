package com.bisaga.sakila.service;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.daos.ActorDao;
import com.bisaga.sakila.dbmodel.tables.pojos.Actor;
import com.bisaga.sakila.resource.ActorResource;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@RequestScope
public class ActorService {
    private static final Logger LOG = LoggerFactory.getLogger(ActorService.class);

    private final DSLContext db;
    private final ActorDao actorDao;

    @Inject
    public ActorService(DSLContext db, ActorDao actorDao) {
        this.db = db;
        this.actorDao = actorDao;
    }

    public List<Actor> getActors() {
        return actorDao.findAll();
    }

}
