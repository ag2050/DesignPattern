package com.org.singleton;

import java.util.Map;

public class AppConfig {

	private static volatile AppConfig appConfig = null;
	private Map<String, String> configurations = null;

	private AppConfig() throws Exception {
		if (AppConfig.appConfig != null) {
			throw new Exception("can not be instantiated.");
		}
		AppConfig.appConfig = this;
		loadConfigurations();
	}

	public static AppConfig getInstance() throws Exception {
		if (appConfig == null) {
			synchronized (AppConfig.class) {
				if (appConfig == null) {
					appConfig = new AppConfig();
					return appConfig;
				}
			}
		}
		return appConfig;
	}

	public String getProperty(String key) {
		return configurations.get(key);
	}

	private void loadConfigurations() {
		this.configurations = new AppConfigRepo().loadConfigurations();
	}

}
