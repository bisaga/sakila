package com.bisaga.sakila.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConfigProperties {
    private static final Logger LOG = LoggerFactory.getLogger(ConfigProperties.class);

    private Properties properties = new Properties();

    public ConfigProperties() {
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
        InputStream in = getClass().getResourceAsStream("/config.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            LOG.error("File 'config.properties' missing.", e);
        }
    }

}
