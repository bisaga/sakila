package com.bisaga.sakila.server;

import com.bisaga.sakila.Application;
import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.dagger.RequestComponent;
import com.bisaga.sakila.dagger.RequestModule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Filter;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RequestScopeInjectionFilter implements Filter {
    private static final Logger LOG = LoggerFactory.getLogger(RequestScopeInjectionFilter.class);

    @Inject
    public RequestScopeInjectionFilter(){}

    @Override
    public void handle(Request request, Response response) throws Exception {
        // for each request if not already created before, we create new instance of RequestScope component and save to the request
        RequestComponent requestComponent = Application.getRequestComponent();

        // put instance of the component to the attribute request storage
        request.attribute(RequestComponent.REQUEST_COMPONENT_ATTR_NAME, requestComponent);

        // start statistic timer on the request instance
        requestComponent.requestStatistics().setRequestStartTime(System.currentTimeMillis());
    }
}
