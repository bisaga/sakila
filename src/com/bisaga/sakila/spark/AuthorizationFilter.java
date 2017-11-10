package com.bisaga.sakila.spark;

import com.bisaga.sakila.errors.ErrorMessage;
import com.google.gson.Gson;
import spark.Filter;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import static spark.Spark.halt;

@Singleton
public class AuthorizationFilter implements Filter {

    private String apiKey;
    private Gson gson;

    @Inject
    public AuthorizationFilter(@Named("api_key") String apiKey, Gson gson){
        this.apiKey = apiKey;
        this.gson = gson;
    }

    @Override
    public void handle(Request request, Response response) throws Exception {

        if(!apiKey.equals(request.headers("Authorization"))){
            // TODO implement authorization check and halt the request if not authorized
            // halt(401, gson.toJson(new ErrorMessage("You must provide a valid api key")));
        }

    }
}
