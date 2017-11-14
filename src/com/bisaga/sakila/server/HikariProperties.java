package com.bisaga.sakila.server;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Properties;

@Singleton
public class HikariProperties extends Properties {

    @Inject
    public HikariProperties(ConfigProperties configProperties) {

        this.setProperty("dataSourceClassName", configProperties.getProperty("dataSourceClassName"));
        this.setProperty("dataSource.user", configProperties.getProperty("dataSource.user"));
        this.setProperty("dataSource.password", configProperties.getProperty("dataSource.password"));
        this.setProperty("dataSource.databaseName", configProperties.getProperty("dataSource.databaseName"));
        this.setProperty("dataSource.portNumber", configProperties.getProperty("dataSource.portNumber"));
        this.setProperty("dataSource.serverName", configProperties.getProperty("dataSource.serverName"));
    }

}
