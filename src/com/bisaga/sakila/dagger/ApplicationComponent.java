package com.bisaga.sakila.dagger;

import com.bisaga.sakila.Application;
import com.bisaga.sakila.server.ConfigProperties;
import com.bisaga.sakila.server.RequestSession;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    // we first need to create instance of Application on which we will inject dagger into
    Application application();

    // Parent component is obliged to declare sub components getters inside its interface (RequestScope component)
    RequestComponent requestComponent();

    ConfigProperties configProperties();

    // We will need new instance of RequestSession for each user request (save instance to the request attributes)
    String REQUEST_SESSION_ATTR_NAME = "requestSession";
    RequestSession requestSession();

}
