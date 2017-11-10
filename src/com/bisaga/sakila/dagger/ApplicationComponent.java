package com.bisaga.sakila.dagger;

import com.bisaga.sakila.Application;
import com.bisaga.sakila.spark.ExceptionHandlerRegistry;
import com.bisaga.sakila.spark.FilterRegistry;
import com.bisaga.sakila.spark.ResourceRegistry;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(Application application);

    ResourceRegistry resourceRegistry();
    ExceptionHandlerRegistry exceptionHandlerRegistry();
    FilterRegistry filterRegistry();

    // Parent component is obliged to declare Subcomponents getters inside its interface.
    // RequestComponent is subcomponent with limited scope (RequestScope)
    RequestComponent requestComponent(RequestModule requestModule);
}
