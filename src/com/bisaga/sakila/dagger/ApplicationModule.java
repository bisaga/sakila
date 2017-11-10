package com.bisaga.sakila.dagger;

import com.bisaga.sakila.server.GsonTransformer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import spark.ResponseTransformer;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
@Singleton
public class ApplicationModule {

    // Gson constructor is not available to be annotated with inject, instead we provide method for constructing the object
    @Provides
    public Gson provideGson(){
        return new GsonBuilder().setPrettyPrinting().create();
    }

    // Here we provide an instance of the ResponseTransformer interface. If we do not define implementation nowhere there is no way
    // to determine which implementation is meant to be injected to the ResourceRegistry constructor.
    // If we have more then one possible implementation, we put on "named" annotation and associate constructor variable with the name
    @Provides
    public ResponseTransformer provideResponseTransformer(GsonTransformer gsonTransformer){
        return gsonTransformer;
    }


    // return String instance, we need provide method. Because many "String" objects are possible we use "Named"
    // annotation be able to request this specific one
    @Provides
    @Named("api_key")
    public String provideApiKey(){
        return "01657172-ecc0-4cb6-8486-5e7e05a0876f";
    }

}
