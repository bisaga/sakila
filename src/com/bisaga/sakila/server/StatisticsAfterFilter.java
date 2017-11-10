package com.bisaga.sakila.server;

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
        ((RequestComponent) request.attribute(RequestComponent.REQUEST_COMPONENT_ATTR_NAME))
                .requestStatistics()
                .setRequestEndTime(System.currentTimeMillis());
    }
}
