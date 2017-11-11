package com.bisaga.sakila.dagger;

import com.bisaga.sakila.resource.ActorResource;
import com.bisaga.sakila.server.ConfigProperties;
import com.bisaga.sakila.server.RequestSession;
import com.bisaga.sakila.server.RequestStatistics;
import dagger.Subcomponent;

@RequestScope
@Subcomponent(modules = {RequestModule.class})
public interface RequestComponent {
    ActorResource actorResource();
}
