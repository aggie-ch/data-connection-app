package io.github.aggie.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ConfigProperties {
    private static final Logger logger = LoggerFactory.getLogger(ConfigProperties.class);
    private static final String FILE = "application-prod.yml";

    private Properties properties;

    public static final String API_REST = "API_REST";
    public static final String AMOUNT_VALUE = "AMOUNT_VALUE";
    public static final String MINIMUM_VALUE = "MINIMUM_VALUE";
    public static final String MAXIMUM_VALUE = "MAXIMUM_VALUE";

    public ConfigProperties() {
        properties = new Properties();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE);
            properties.load(Objects.requireNonNull(inputStream));
            inputStream.close();
        } catch (IOException e) {
            logger.error("Property file '" + FILE + "' not found in the classpath");
        }
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
