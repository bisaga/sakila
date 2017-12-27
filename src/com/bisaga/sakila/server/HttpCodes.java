package com.bisaga.sakila.server;

import spark.Response;

public class HttpCodes
{
    // 2xx Success
    public static final int OK = 200;
    public static final int CREATED = 201;
    public static final int ACCEPTED = 202;
    public static final int NO_CONTENT = 204;

    // 3xx Redirect
    public static final int NOT_MODIFIED = 304;

    // 4xx Client Error
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int CONFLICT = 409;

    // 5xx Server Error
    public static final int INTERNAL_SERVER_ERROR = 500;


    // Content Type
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION_XML = "application/xml";

    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String PATCH = "PATCH";
    public static final String DELETE = "DELETE";




    public static void setStatus(Response response, int status, String contentType) {
        response.status(status);
        response.type(contentType);
    }

    public static void setStatus(Response response, int status) {
        HttpCodes.setStatus(response, status, HttpCodes.APPLICATION_JSON );
    }

}
