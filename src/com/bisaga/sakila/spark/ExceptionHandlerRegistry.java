package com.bisaga.sakila.spark;

import com.bisaga.sakila.errors.SakilaException;
import com.bisaga.sakila.errors.UnhandledRuntimeException;
import com.bisaga.sakila.errors.UnhandledRuntimeExceptionHandler;

import javax.inject.Inject;
import javax.inject.Singleton;

import static spark.Spark.exception;

@Singleton
public class ExceptionHandlerRegistry {

    private UnhandledRuntimeExceptionHandler unhandledRuntimeExceptionHandler;

    @Inject
    public ExceptionHandlerRegistry(UnhandledRuntimeExceptionHandler unhandledRuntimeExceptionHandler){
        this.unhandledRuntimeExceptionHandler = unhandledRuntimeExceptionHandler;
    }

    public void registerHandlers(){
        exception(UnhandledRuntimeException.class, unhandledRuntimeExceptionHandler);
//        exception(SakilaException.class, unhandledRuntimeExceptionHandler);
        exception(RuntimeException.class, unhandledRuntimeExceptionHandler);

    }

}
