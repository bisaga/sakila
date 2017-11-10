package com.bisaga.sakila.spark;

import com.bisaga.sakila.server.RequestScopeInjectionFilter;
import com.bisaga.sakila.server.StatisticsAfterAfterFilter;
import com.bisaga.sakila.server.StatisticsAfterFilter;

import javax.inject.Inject;
import javax.inject.Singleton;

import static spark.Spark.after;
import static spark.Spark.afterAfter;
import static spark.Spark.before;

@Singleton
public class FilterRegistry {

    private final AuthorizationFilter authorizationFilter;
    private final RequestScopeInjectionFilter requestScopeInjectionFilter;
    private final StatisticsAfterFilter statisticsAfterFilter;
    private final StatisticsAfterAfterFilter statisticsAfterAfterFilter;

    @Inject
    public FilterRegistry(AuthorizationFilter authorizationFilter,
                          RequestScopeInjectionFilter requestScopeInjectionFilter,
                          StatisticsAfterFilter statisticsAfterFilter,
                          StatisticsAfterAfterFilter statisticsAfterAfterFilter){

        this.authorizationFilter = authorizationFilter;
        this.requestScopeInjectionFilter = requestScopeInjectionFilter;
        this.statisticsAfterFilter = statisticsAfterFilter;
        this.statisticsAfterAfterFilter = statisticsAfterAfterFilter;
    }

    public void registerFilters(){

        before(requestScopeInjectionFilter);    // this is running once for each request

        before(authorizationFilter);

        after(statisticsAfterFilter);

        afterAfter(statisticsAfterAfterFilter);
    }

}
