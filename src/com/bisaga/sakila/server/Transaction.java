package com.bisaga.sakila.server;

import com.bisaga.sakila.errors.DatabaseException;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

/*
    Most of the classes will be "final" and implements "final" methods which means we do not wan't to be able to create
    unpredictable behaviour implementations out of the framework class. If we will need something more flexible
    as it is we will change this implementation.
 */
public final class Transaction {
    private final Connection connection;
    private boolean txOpen = true;

    @Inject
    public Transaction(Connection connection) {
        this.connection = connection;
    }

    public final void begin() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final void setAutoCommit(boolean autoCommit) {
        try {
            connection.setAutoCommit(autoCommit);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }
    public final boolean isAutoCommit()
    {
        try {
            return connection.getAutoCommit();
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final void commit() {
        try {
            connection.commit();
            txOpen = false;
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final void rollback() {
        try {
            connection.rollback();
            txOpen = false;
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final void rollback(Savepoint savepoint) {
        try {
            connection.rollback(savepoint);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final Savepoint setSavepoint() {
        try {
            return connection.setSavepoint();
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final Savepoint setSavepoint(String savepointName) {
        try {
            return connection.setSavepoint(savepointName);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final void setTransactionIsolation(int level)
    {
        try {
            connection.setTransactionIsolation(level);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final void setReadOnly(boolean readOnly)
    {
        try {
            connection.setReadOnly(readOnly);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public final boolean isReadOnly()
    {
        try {
            return connection.isReadOnly();
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
    public boolean isClosed() {
        return !txOpen;
    }


}
