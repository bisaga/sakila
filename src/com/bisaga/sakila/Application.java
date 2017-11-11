package com.bisaga.sakila;

import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.spark.ExceptionHandlerRegistry;
import com.bisaga.sakila.spark.FilterRegistry;
import com.bisaga.sakila.spark.ResourceRegistry;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application {
    // dagger application component instance
    public static ApplicationComponent applicationComponent;

    // instances injected in constructor
    private ResourceRegistry resourceRegistry;
    private ExceptionHandlerRegistry exceptionHandlerRegistry;
    private FilterRegistry filterRegistry;


    @Inject
    public Application(
            ResourceRegistry resourceRegistry,
            ExceptionHandlerRegistry exceptionHandlerRegistry,
            FilterRegistry filterRegistry
    ) {
        this.resourceRegistry = resourceRegistry;
        this.exceptionHandlerRegistry = exceptionHandlerRegistry;
        this.filterRegistry = filterRegistry;
    }

    public void start(){
        //register exception handlers
        exceptionHandlerRegistry.registerHandlers();

        //register our filters
        filterRegistry.registerFilters();

        //register routes
        resourceRegistry.registerRoutes();
    }



}
