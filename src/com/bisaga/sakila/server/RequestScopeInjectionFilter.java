package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.ApplicationComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Filter;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Provider;

public class RequestScopeInjectionFilter implements Filter {
    private static final Logger LOG = LoggerFactory.getLogger(RequestScopeInjectionFilter.class);

    @Inject
    public Provider<RequestSession> requestSessionProvider;

    @Inject
    public RequestScopeInjectionFilter(){}

    @Override
    public void handle(Request request, Response response) throws Exception {

        // get new instance each time new request is handled
        RequestSession requestSession = requestSessionProvider.get();

        // put the instance of the request session to the spark request attributes storage
        request.attribute(ApplicationComponent.REQUEST_SESSION_ATTR_NAME, requestSession);

    }
}
