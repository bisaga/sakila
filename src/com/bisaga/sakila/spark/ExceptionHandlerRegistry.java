package com.bisaga.sakila.spark;

import com.bisaga.sakila.errors.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static spark.Spark.exception;

@Singleton
public class ExceptionHandlerRegistry {

    private RuntimeExceptionHandler runtimeExceptionHandler;
    private ResourceNotFoundExceptionHandler resourceNotFoundExceptionHandler;

    @Inject
    public ExceptionHandlerRegistry(
            RuntimeExceptionHandler runtimeExceptionHandler,
            ResourceNotFoundExceptionHandler resourceNotFoundExceptionHandler){

        this.runtimeExceptionHandler = runtimeExceptionHandler;
        this.resourceNotFoundExceptionHandler = resourceNotFoundExceptionHandler;
    }

    public void registerHandlers(){
        exception(RuntimeException.class, runtimeExceptionHandler);
        exception(ResourceNotFoundException.class, resourceNotFoundExceptionHandler);
    }

}
