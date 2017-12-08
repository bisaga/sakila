package com.bisaga.sakila.spark;

import com.bisaga.sakila.server.RestCodes;
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
                case RestCodes.GET:
                    RestCodes.setStatus(response, RestCodes.OK);
                    break;

                case RestCodes.PUT:
                    RestCodes.setStatus(response, RestCodes.OK);
                    break;

                case RestCodes.POST:
                    RestCodes.setStatus(response, RestCodes.OK);
                    break;

                case RestCodes.PATCH:
                    RestCodes.setStatus(response, RestCodes.OK);
                    break;

            }
        }

        if(response.type() == null) {
            response.type(RestCodes.APPLICATION_JSON);
        }
    }
}
