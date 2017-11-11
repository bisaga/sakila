package com.bisaga.sakila.server;

import javax.inject.Inject;
import java.util.UUID;

public class RequestSession {
    private final UUID instanceId;
    private final RequestStatistics requestStatistics;

    @Inject
    public RequestSession(
            RequestStatistics requestStatistics
    ){
        instanceId = UUID.randomUUID();
        this.requestStatistics = requestStatistics;
    }

    public RequestStatistics getRequestStatistics() {
        return  requestStatistics;
    }

    public String getSessionId() {
        return instanceId.toString();
    }
}
