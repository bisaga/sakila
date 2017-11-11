package com.bisaga.sakila.dagger;

import dagger.Module;

@Module
public class RequestModule {

    // provides @RequestScope instance of any object without default inject constructor
    // for example: RequestSession provideRequestSession() {return new RequestSession();}
}
