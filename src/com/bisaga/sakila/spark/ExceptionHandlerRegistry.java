package com.bisaga.sakila.spark;

import com.bisaga.sakila.errors.EntityNotFoundException;
import com.bisaga.sakila.errors.EntityNotFoundExceptionHandler;

import javax.inject.Inject;
import javax.inject.Singleton;

import static spark.Spark.exception;

@Singleton
public class ExceptionHandlerRegistry {

    private EntityNotFoundExceptionHandler entityNotFoundExceptionHandler;

    @Inject
    public ExceptionHandlerRegistry(EntityNotFoundExceptionHandler entityNotFoundExceptionHandler){
        this.entityNotFoundExceptionHandler = entityNotFoundExceptionHandler;
    }

    public void registerHandlers(){
        exception(EntityNotFoundException.class, entityNotFoundExceptionHandler);
    }

}
