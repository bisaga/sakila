package com.bisaga.sakila.server;

import com.bisaga.sakila.dagger.RequestScope;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@RequestScope
public final class JooqConfigurationBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(JooqConfigurationBuilder.class);

    private final ConfigProperties configProperties;
    private final Transaction transaction;

    @Inject
    public JooqConfigurationBuilder(
            ConfigProperties configProperties,
            Transaction transaction) {

        this.configProperties = configProperties;
        this.transaction = transaction;
    }

    public final Configuration build() {
        Configuration configuration = new DefaultConfiguration();

        String sDialect = configProperties.getProperty("sakila.database.sqldialect");
        SQLDialect dialect = SQLDialect.valueOf(sDialect);

        configuration.set(transaction.getConnection());
        configuration.set(dialect);

        // TODO default listeners
        // configuration.set(new DefaultRecordListenerProvider(new InsertListener()));

        return configuration;
    }
}
