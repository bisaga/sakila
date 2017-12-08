package com.bisaga.sakila.errors;

import java.sql.SQLException;

public class DatabaseException extends RuntimeException  {

    public DatabaseException(SQLException ex) {
        super(String.format("SQL ERROR: %s SQL STATE: %s MESSAGE: %s", ex.getErrorCode(), ex.getSQLState(), ex.toString()));
    }

}
