package com.bisaga.sakila.errors;

import java.sql.SQLException;

public class QueryException extends RuntimeException  {

    public QueryException(String message) {
        super(message);
    }

}
