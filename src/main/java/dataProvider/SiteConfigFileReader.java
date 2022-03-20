package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SiteConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//SiteConfiguration.properties";
	
	public SiteConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("SiteConfiguration.properties not found at " + propertyFilePath);
		}
	}
	
	public String getKey(String key) {
		String envKey = properties.getProperty(key);
		if (envKey != null)
			return envKey;
		else
			throw new RuntimeException("Key not specified in the SiteConfiguration.properties file.");
	}
}
