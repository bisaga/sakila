package com.bisaga.sakila;

import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.dagger.ApplicationModule;
import com.bisaga.sakila.dagger.DaggerApplicationComponent;
import com.bisaga.sakila.server.RuntimeEnvironment;

public class Main {

    public static void main(String[] args) {

        // initialize dagger dependency graph
        ApplicationComponent applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(RuntimeEnvironment.DEVELOPMENT))
                .build();

        // allow access trough the Application class static member
        Application.applicationComponent = applicationComponent;

        // create new application instance and start it
        Application app = applicationComponent.application();
        app.start();

    }
}
