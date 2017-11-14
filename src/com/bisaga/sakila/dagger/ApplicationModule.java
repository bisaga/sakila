package com.bisaga.sakila.dagger;

import com.bisaga.sakila.server.ConfigProperties;
import com.bisaga.sakila.server.HikariProperties;
import com.bisaga.sakila.server.RuntimeEnvironment;
import com.bisaga.sakila.server.GsonTransformer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import dagger.Module;
import dagger.Provides;
import spark.ResponseTransformer;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Properties;


@Module
public class ApplicationModule {
    // this is a parameter member variable
    private RuntimeEnvironment runtimeEnvironment;

    // we need an constructor to take parameter in
    public ApplicationModule(RuntimeEnvironment runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment;
    }


    // This provide method at the creation of the instance of ConfigProperties object take the parameter from the local member variable.
    @Provides
    @Singleton
    public ConfigProperties provideConfigProperties() {
        return new ConfigProperties(runtimeEnvironment);
    }

    // All provide methods should be static, generated dagger code is much simpler and smaller,
    // except when module member variables are needed to create new instances
    // Gson constructor is not available to be annotated with inject (not our source), instead we write provider method
    // the method is static, because we do not need any module member variable to build new instance
    @Provides
    @Singleton
    public static Gson provideGson(){
        return new GsonBuilder().setPrettyPrinting().create();
    }


    // Here we provide an instance of the ResponseTransformer interface. Because we didn't define which implementation
    // we need at injecting place we write provide method with the injected parameter expressed with a required interface type
    // If we have more then one possible implementation, we put on "Named" annotation and associate the same name at
    // injected constructor variable
    @Provides
    @Singleton
    public static ResponseTransformer provideResponseTransformer(GsonTransformer gsonTransformer){
        return gsonTransformer;
    }

    // here we provide a String instance. We need the provide method, because many "String" objects are possible.
    // We use "Named" annotation to be able to differentiate this one from other possible provide methods.
    // At injecting place we also define same "Named" annotation to connect the proper one
    // The method could be static, because is independent of local member variables
    @Provides
    @Singleton
    @Named("api_key")
    public static String provideApiKey(){
        return "01657172-ecc0-4cb6-8486-5e7e05a0876f";
    }


    // Here we provide external library class as singleton with our extended properties class as constructor parameter
    @Provides
    @Singleton
    public static HikariConfig provideHikariConfig(HikariProperties properties) {
        return new HikariConfig(properties);
    }

    // Here we provide external library class as singleton (Hikari Connection Pool Data source, holder of pooled connections)
    @Provides
    @Singleton
    public static HikariDataSource provideHikariDataSource(HikariConfig config) {
        return new HikariDataSource(config);
    }


}
