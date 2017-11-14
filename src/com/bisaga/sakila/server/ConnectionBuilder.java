package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.RequestScope;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RequestScope
public final class ConnectionBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(ConnectionBuilder.class);
    private HikariDataSource dataSource;        // Hikari Connection Pool

    @Inject
    public ConnectionBuilder(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final Connection create(boolean autoCommit) {
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(autoCommit);
        } catch (SQLException ex) {
            LOG.error(ex.toString());
        }

        return connection;
    }
}
