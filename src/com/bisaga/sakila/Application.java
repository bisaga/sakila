package com.bisaga.sakila;

import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.dagger.DaggerApplicationComponent;
import com.bisaga.sakila.dagger.RequestComponent;
import com.bisaga.sakila.dagger.RequestModule;

public class Application {
    private static ApplicationComponent applicationComponent;

    public static ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }

    public static RequestComponent getRequestComponent() {
        return applicationComponent.requestComponent(new RequestModule());
    }
    public static RequestComponent acquire() {
        return Application.getRequestComponent();
    }


    public void start(){
        //initialize dagger
        initializeDagger();

        //register exception handlers
        registerExceptionHandlers();

        //register our filters
        registerFilters();

        //register routes
        registerRoutes();

    }

    private void initializeDagger() {
        applicationComponent = DaggerApplicationComponent.builder().build();
        applicationComponent.inject(this);
    }

    private void registerExceptionHandlers() {
        applicationComponent.exceptionHandlerRegistry().registerHandlers();
    }

    private void registerFilters() {
        applicationComponent.filterRegistry().registerFilters();
    }

    private void registerRoutes(){
        applicationComponent.resourceRegistry().registerRoutes();
    }
}
