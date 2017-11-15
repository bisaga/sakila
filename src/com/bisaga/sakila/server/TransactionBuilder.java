package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.errors.DatabaseException;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;

@RequestScope
public final class TransactionBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(TransactionBuilder.class);
    private HikariDataSource dataSource;        // Hikari Connection Pool

    @Inject
    public TransactionBuilder(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final Transaction create(boolean autoCommit) {
        try {
            Connection connection = dataSource.getConnection();
            connection.setAutoCommit(autoCommit);
            return new Transaction(connection);
        } catch (SQLException e) {
            throw new DatabaseException(e);
        }
    }
}
