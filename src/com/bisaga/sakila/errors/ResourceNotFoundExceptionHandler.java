package com.bisaga.sakila.errors;

import com.bisaga.sakila.server.RequestSession;
import com.bisaga.sakila.server.HttpCodes;
import com.google.gson.Gson;
import spark.ExceptionHandler;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ResourceNotFoundExceptionHandler implements ExceptionHandler {

    private Gson gson;

    @Inject
    public ResourceNotFoundExceptionHandler(Gson gson){
        this.gson = gson;
    }

    @Override
    public void handle(Exception exception, Request request, Response response) {
        RequestSession.getTransaction().rollback();

        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage());
        HttpCodes.setStatus(response, HttpCodes.NOT_FOUND);
        response.body(gson.toJson(errorMessage));
    }
}
