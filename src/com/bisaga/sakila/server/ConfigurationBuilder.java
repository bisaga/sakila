package com.bisaga.sakila.server;

import com.bisaga.sakila.service.ActorService;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Singleton
public class ConfigurationBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationBuilder.class);

    private final ConfigProperties configProperties;

    @Inject
    public ConfigurationBuilder(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    public Configuration build() {
        Configuration configuration = new DefaultConfiguration();
        Connection connection;
        try {
            connection = DriverManager.getConnection(configProperties.getStringProperty("sakila.database.url"));

            String sDialect = configProperties.getStringProperty("sakila.database.sqldialect");
            SQLDialect dialect = SQLDialect.valueOf(sDialect);

            configuration.set(connection);
            configuration.set(dialect);

            // TODO default listeners
            // configuration.set(new DefaultRecordListenerProvider(new InsertListener()));

        } catch (SQLException ex) {
            LOG.error(ex.toString());
        }

        return configuration;
    }


}
