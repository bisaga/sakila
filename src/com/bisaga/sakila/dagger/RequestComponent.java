package com.bisaga.sakila.dagger;

import com.bisaga.sakila.resource.ActorResource;
import com.bisaga.sakila.server.*;
import dagger.Subcomponent;

import java.sql.Connection;

@RequestScope
@Subcomponent(modules = {RequestModule.class})
public interface RequestComponent {

    ActorResource actorResource();
}
