package com.bisaga.sakila.errors;

import java.sql.SQLException;

public class DatabaseException extends SakilaException  {

    public DatabaseException(SQLException ex) {
        super(String.format("SQL ERROR: %s\n SQL STATE: %s\n MESSAGE: %s", ex.getErrorCode(), ex.getSQLState(), ex.toString()));
    }

}
