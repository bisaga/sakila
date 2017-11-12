package com.bisaga.sakila.resource;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.pojos.Actor;
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
    private final ActorService actorService;

    @Inject
    public ActorResource(
            ActorService actorService
    ){
        this.actorService = actorService;
    };

    public List<Actor> getActors(Request request, Response response)
    {
        return actorService.getActors();
    }
}
