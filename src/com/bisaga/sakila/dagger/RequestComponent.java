package com.bisaga.sakila.dagger;

import com.bisaga.sakila.resource.ActorResource;
import dagger.Subcomponent;


@RequestScope
@Subcomponent(modules = {RequestModule.class})
public interface RequestComponent {


    // return always new instance
    ActorResource actorResource();
}
