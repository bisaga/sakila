package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.RequestScope;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.sql.Connection;

@RequestScope
public final class JooqConfigBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(JooqConfigBuilder.class);

    private final ConfigProperties configProperties;
    private final Connection connection;

    @Inject
    public JooqConfigBuilder(
            ConfigProperties configProperties,
            Connection connection) {

        this.configProperties = configProperties;
        this.connection = connection;
    }

    public final Configuration build() {
        Configuration configuration = new DefaultConfiguration();

        String sDialect = configProperties.getProperty("sakila.database.sqldialect");
        SQLDialect dialect = SQLDialect.valueOf(sDialect);

        configuration.set(connection);
        configuration.set(dialect);

        // TODO default listeners
        // configuration.set(new DefaultRecordListenerProvider(new InsertListener()));

        return configuration;
    }
}
