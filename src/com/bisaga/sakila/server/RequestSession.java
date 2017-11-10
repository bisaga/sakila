package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.RequestComponent;
import com.bisaga.sakila.dagger.RequestScope;
import spark.Request;
import spark.Response;
import spark.Route;

import javax.inject.Inject;
import java.util.UUID;

@RequestScope
public class RequestSession {
    private final UUID instanceId;

    @Inject
    public RequestSession(){
        instanceId = UUID.randomUUID();
    }

    public String getSessionId() {
        return instanceId.toString();
    }

}
