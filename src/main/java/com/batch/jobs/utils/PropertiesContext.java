package com.batch.jobs.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesContext {
	private static final Logger LOG = LoggerFactory.getLogger(PropertiesContext.class);
	private static PropertiesContext INSTANCE = new PropertiesContext();
	private final Properties CONFIG_PROPERTIES;


	private PropertiesContext() {
		CONFIG_PROPERTIES = loadProperties("config.properties");
	}

	private static Properties loadProperties(String url) {
		Properties properties = new Properties();
		try {
			InputStream in = PropertiesContext.class.getClassLoader().getResourceAsStream(url);
			properties.load(in);
		} catch (Throwable t) {
			LOG.error("Error in reading properties " + t.toString());
		}
		return properties;
	}

	public static final PropertiesContext getInstance() {
		return INSTANCE;
	}

	public Properties getConfigProperties() {
		return CONFIG_PROPERTIES;
	}

	public String getConfigProperty(String key) {
		return CONFIG_PROPERTIES.getProperty(key);
	}


}
