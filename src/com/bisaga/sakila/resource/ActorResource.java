package com.bisaga.sakila.resource;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.records.ActorRecord;
import com.bisaga.sakila.errors.ResourceNotFoundException;
import com.bisaga.sakila.server.QueryBuildParams;
import com.bisaga.sakila.server.RecordsAffected;
import com.bisaga.sakila.server.Transaction;
import com.bisaga.sakila.domain.ActorQueryService;
import com.bisaga.sakila.domain.ActorService;
import com.bisaga.sakila.service.TableQueryService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import java.util.Map;

import static com.bisaga.sakila.dbmodel.tables.Actor.ACTOR;

@RequestScope
public class ActorResource {
    private static final Logger LOG = LoggerFactory.getLogger(ActorResource.class);
    private final DSLContext db;
    private final Transaction transaction;
    private final ActorService actorService;
    private final ActorQueryService actorQueryService;
    private final TableQueryService tableQueryService;
    private final Gson gson;
    private final JsonParser parser;

    @Inject
    public ActorResource(
            DSLContext db,
            Transaction transaction,
            Gson gson,
            JsonParser parser,
            TableQueryService tableQueryService,
            ActorService actorService,
            ActorQueryService actorQueryService
    ) {
        this.db = db;
        this.transaction = transaction;
        this.gson = gson;
        this.parser= parser;
        this.tableQueryService = tableQueryService;
        this.actorService = actorService;
        this.actorQueryService = actorQueryService;
    }

    public RecordsAffected putActor(Request request, Response response) {
        int ret = 0;
        String action = "";

        transaction.begin();

        JsonObject obj = parser.parse(request.body()).getAsJsonObject();

        if(obj.has("action"))
            action = gson.fromJson(obj.get("action"), String.class);

        Map mapValues = gson.fromJson(obj.get("actor"), Map.class);
        ActorRecord actorRecord = db.newRecord(ACTOR);
        actorRecord.from(mapValues);

        switch (action) {
            case "update":
                ret = actorService.updateActor( actorRecord );
                break;
            case "insert":
                ret = actorService.insertActor( actorRecord );
                break;
        }

        // Commit an open transaction and release the underline connection to the connection pool
        transaction.commit();

        return new RecordsAffected(ret);
    }

    public ActorRecord getActor(Request request, Response response) {

        int id = Integer.parseInt( request.params(":id") );

        // Call to service layer (domain logic)
        ActorRecord actor = actorService.getActor(id);

        if(actor == null)
            throw new ResourceNotFoundException(String.format("Actor: %d not found.", id));

        return actor;
    }

    // Get all records, why would we do that ? Maybe just for very small rowsets
    public Result<ActorRecord> getAllActors(Request request, Response response) {
        return actorService.findAllActors();
    }


    // Query with paging support
    public Result viewActors(Request request, Response response) {
        QueryBuildParams qbp = QueryBuildParams.deserialize(request.body());
        return tableQueryService.execute(qbp);
    }

}
