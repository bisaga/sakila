package com.bisaga.sakila.dagger;

import com.bisaga.sakila.resource.ActorResource;
import com.bisaga.sakila.server.RequestSession;
import com.bisaga.sakila.server.RequestStatistics;
import dagger.Subcomponent;


@RequestScope
@Subcomponent(modules = {RequestModule.class})
public interface RequestComponent {
    // this is a name to store the instance of this component in the request attribute store after request is started
    String REQUEST_COMPONENT_ATTR_NAME = "requestComponent";
    RequestStatistics requestStatistics();
    RequestSession requestSession();

    ActorResource actorResource();
}
