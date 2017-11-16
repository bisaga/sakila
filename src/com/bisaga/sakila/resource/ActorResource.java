package com.bisaga.sakila.resource;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.pojos.Actor;
import com.bisaga.sakila.server.Transaction;
import com.bisaga.sakila.service.ActorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
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
            // Analyse & extract request parameters

            // Call services with parameters (if any)
            List<Actor> actors = actorService.getActors();

            // Commit transaction and release the underline connection to the pool
            transaction.commit();

            // Return list, it will be transformed by GsonTransformer and returned to the browser as Json
            return actors;

        // Catch expected business exceptions and throw them with meaningful messages and present them to the customer
        } catch (Exception e) {
            // Rollback transaction and release the underline connection to the pool
            transaction.rollback();
            // rethrow all exceptions to master exception handler which create response for the customer
            throw e;
        }
    }
}
