package com.bisaga.sakila.spark;

import com.bisaga.sakila.server.HttpCodes;
import spark.Filter;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ResponseStatusFilter implements Filter {

    @Inject
    public ResponseStatusFilter(){}

    @Override
    public void handle(Request request, Response response) throws Exception {

        if(response.status() == 0) {

            switch (request.requestMethod()) {
                case HttpCodes.GET:
                    HttpCodes.setStatus(response, HttpCodes.OK);
                    break;

                case HttpCodes.PUT:
                    HttpCodes.setStatus(response, HttpCodes.OK);
                    break;

                case HttpCodes.POST:
                    HttpCodes.setStatus(response, HttpCodes.OK);
                    break;

                case HttpCodes.PATCH:
                    HttpCodes.setStatus(response, HttpCodes.OK);
                    break;

            }
        }

        if(response.type() == null) {
            response.type(HttpCodes.APPLICATION_JSON);
        }
    }
}
