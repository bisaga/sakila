package com.bisaga.sakila.errors;

import com.bisaga.sakila.dagger.ApplicationComponent;
import com.bisaga.sakila.server.RequestSession;
import com.bisaga.sakila.server.Transaction;
import com.google.gson.Gson;
import spark.ExceptionHandler;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.SQLException;

@Singleton
public class UnhandledRuntimeExceptionHandler implements ExceptionHandler {

    private Gson gson;

    @Inject
    public UnhandledRuntimeExceptionHandler(Gson gson){
        this.gson = gson;
    }

    @Override
    public void handle(Exception exception, Request request, Response response) {
        // static transaction ThreadLocal variable
        Transaction tx = RequestSession.getTransaction();
        if(tx != null && !tx.isClosed()) {
            tx.rollback();
        }

        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage());
        response.status(404);
        response.type("application/json");
        response.body(gson.toJson(errorMessage));
    }
}
