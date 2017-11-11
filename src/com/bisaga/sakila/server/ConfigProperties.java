package com.bisaga.sakila.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ConfigProperties {
    private static final Logger LOG = LoggerFactory.getLogger(ConfigProperties.class);
    private final RuntimeEnvironment runtimeEnvironment;
    private Properties properties = new Properties();

    @Inject
    public ConfigProperties(RuntimeEnvironment runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment;

        // load resource file config.properties which is in src/main/resources of current project folder
        loadFromResource();
    }

    protected String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    public Integer getIntProperty(String propertyName) {
        String value = this.getProperty(propertyName);
        int numVal = Integer.parseInt(value);
        return numVal;
    }

    public Short getShortProperty(String propertyName) {
        String value = this.getProperty(propertyName);
        short numVal = Short.parseShort(value);
        return numVal;
    }

    public String getStringProperty(String propertyName) {
        return this.getProperty(propertyName);
    }

    private void loadFromResource() {
        // read production, development or test configuration from the resources
        String resourceName = String.format("/config.%s.properties", runtimeEnvironment.toString().toLowerCase());
        InputStream in = getClass().getResourceAsStream(resourceName);
        try {
            properties.load(in);
        } catch (IOException e) {
            LOG.error(String.format("File %s not found.", resourceName), e);
        }
    }

    private final UUID instanceId = UUID.randomUUID();
    public UUID getInstanceId(){return instanceId;}
}
