package com.bisaga.sakila.spark;

import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.server.RequestSession;
import com.bisaga.sakila.spark.RequestStatistics;
import spark.Filter;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class StatisticsAfterAfterFilter implements Filter {

    @Inject
    public StatisticsAfterAfterFilter(){
    }

    @Override
    public void handle(Request request, Response response) throws Exception {
        RequestSession requestSession = request.attribute(ApplicationComponent.REQUEST_SESSION_ATTR_NAME);
        RequestStatistics requestStatistics = requestSession.getRequestStatistics();
        long requestTotalTime = requestStatistics.getTotalRequestTime();

        response.header("requestSessionId", String.valueOf(requestSession.getSessionId()));
        response.header("requestTime", String.valueOf(requestTotalTime));
        response.header("requestCount", String.valueOf(RequestStatistics.requestCount.get()));
    }
}
