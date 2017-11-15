package com.bisaga.sakila.resource;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.pojos.Actor;
import com.bisaga.sakila.errors.SakilaException;
import com.bisaga.sakila.server.Transaction;
import com.bisaga.sakila.service.ActorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RequestScope
public class ActorResource {
    private static final Logger LOG = LoggerFactory.getLogger(ActorResource.class);
    private final Transaction transaction;
    private final ActorService actorService;

    @Inject
    public ActorResource(
            Transaction transaction,
            ActorService actorService
    ) {
        this.transaction = transaction;
        this.actorService = actorService;
    };

    public List<Actor> getActors(Request request, Response response) {
        try {

            List<Actor> actors = actorService.getActors();
            return actors;

        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
        finally {
            transaction.commit();
        }
    }
}
