package com.bisaga.sakila.resource;

import spark.Request;
import spark.Response;

import javax.inject.Inject;
import java.util.UUID;

public class GlobalResource {
    private final UUID instanceId;

    @Inject
    public GlobalResource(){
        instanceId = UUID.randomUUID();
    }

    public String id(Request request, Response response) {
        return instanceId.toString();
    }

}
