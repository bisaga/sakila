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
public class ConfigProperties extends Properties {
    private static final Logger LOG = LoggerFactory.getLogger(ConfigProperties.class);

    @Inject
    public ConfigProperties(RuntimeEnvironment runtimeEnvironment) {

        // read production, development or test configuration from the resources
        String resourceName = String.format("/config.%s.properties", runtimeEnvironment.toString().toLowerCase());

        // load resource file config.properties which is in src/main/resources of current project folder
        loadFromResource(resourceName);
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

    private void loadFromResource(String resourceName) {
        InputStream in = getClass().getResourceAsStream(resourceName);
        try {
            this.load(in);
        } catch (IOException e) {
            LOG.error(String.format("File %s not found.", resourceName), e);
        }
    }

}
