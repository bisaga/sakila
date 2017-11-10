package com.bisaga.sakila.errors;

import com.google.gson.Gson;
import spark.ExceptionHandler;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class EntityNotFoundExceptionHandler implements ExceptionHandler {

    private Gson gson;

    @Inject
    public EntityNotFoundExceptionHandler(Gson gson){
        this.gson = gson;
    }

    @Override
    public void handle(Exception exception, Request request, Response response) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage());
        response.status(404);
        response.type("application/json");
        response.body(gson.toJson(errorMessage));
    }
}
