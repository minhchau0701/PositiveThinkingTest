package managers;

import dataProvider.*;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static SiteConfigFileReader siteConfigFileReader;
	
	
	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

	public SiteConfigFileReader getSiteConfigFileReader() {
		return (siteConfigFileReader == null) ? new SiteConfigFileReader() : siteConfigFileReader;
	}

}
