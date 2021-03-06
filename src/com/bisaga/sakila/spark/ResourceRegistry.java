package com.bisaga.sakila.spark;

import com.bisaga.sakila.Application;
import com.bisaga.sakila.server.RecordTransformer;
import com.bisaga.sakila.server.HttpCodes;
import com.bisaga.sakila.server.ResultTransformer;
import spark.ResponseTransformer;
import javax.inject.Inject;
import javax.inject.Singleton;

import static spark.Spark.*;

/**
 * This singleton "ResourceRegistry" is responsible to acquire new instances of resource objects and call routes
 * All resources must reside in "RequestScope", each request should be represented by stateless object instance
 * We do not advise to use static objects because the separation of each user requests and possibility to leak state
 * between user sessions !
 *
 * Function "acquire()" is static method on the Application class. The method get dagger request scope component.
 * With the request component we acquire new instances of resources from the dagger DI graph.
 * Don't forget this router is on the top most (Application) scope (above the request scope) and automatic inject is not
 * possible in that direction. Only downward is injection automatic, in the upward direction is not supported.
 */
@Singleton
public class ResourceRegistry {

    // injected dependencies
    private final ResponseTransformer responseTransformer;      // default transformer is GsonTransformer
    private final ResultTransformer resultTransformer;
    private final RecordTransformer recordTransformer;

    @Inject
    ResourceRegistry(
            ResponseTransformer responseTransformer,
            ResultTransformer resultTransformer,
            RecordTransformer recordTransformer
    ){
        this.responseTransformer = responseTransformer;
        this.resultTransformer = resultTransformer;
        this.recordTransformer = recordTransformer;
    }

    public void registerRoutes(){

        get("/actor/:id", HttpCodes.APPLICATION_JSON,
                // the resource (actorResource) is from another scope (sub-component scope is not visible from the
                // parent scope). We really want to use new instance for each user request, no singletons here !
                (req, res) -> Application.applicationComponent.requestComponent().actorResource().getActor(req, res),
                recordTransformer);

        put("/actor", HttpCodes.APPLICATION_JSON,
                (req, res) -> Application.applicationComponent.requestComponent().actorResource().putActor(req, res),
                responseTransformer);

        post("/actors", HttpCodes.APPLICATION_JSON,
                (req, res) -> Application.applicationComponent.requestComponent().actorResource().viewActors(req, res),
                resultTransformer);

        get("/allactors", HttpCodes.APPLICATION_JSON,
                (req, res) -> Application.applicationComponent.requestComponent().actorResource().getAllActors(req, res),
                resultTransformer);

        /*
        post("/people", "application/json", peopleResource::createPerson, responseTransformer);
        get("/people/:id", "application/json", peopleResource::getPerson, responseTransformer);
        get("/people", "application/json", peopleResource::getAllPeople, responseTransformer);
        put("/people/:id", "application/json", peopleResource::updatePerson, responseTransformer);
        delete("/people/:id", "application/json", peopleResource::deletePerson, responseTransformer);
        */
    }
}
