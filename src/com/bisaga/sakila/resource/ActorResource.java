package com.bisaga.sakila.resource;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.pojos.Actor;
import com.bisaga.sakila.service.ActorService;
import org.jooq.Configuration;
import org.jooq.DSLContext;
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
    private final ActorService actorService;
    private final Connection connection;

    @Inject
    public ActorResource(
            ActorService actorService,
            Connection connection
    ) {
        this.actorService = actorService;
        this.connection = connection;
    };

    public List<Actor> getActors(Request request, Response response)
    {
        List<Actor> actors = null;
        try {
            actors = actorService.getActors();
            connection.commit();
            connection.close();
        } catch (Exception ex) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return actors;
    }
}
