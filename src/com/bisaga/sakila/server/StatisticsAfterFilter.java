package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.dagger.RequestComponent;
import spark.Filter;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class StatisticsAfterFilter implements Filter {

    @Inject
    public StatisticsAfterFilter(){

    }


    @Override
    public void handle(Request request, Response response) throws Exception {
        ((RequestSession) request.attribute(ApplicationComponent.REQUEST_SESSION_ATTR_NAME))
                .getRequestStatistics()
                .setRequestEndTime(System.currentTimeMillis());
    }
}
