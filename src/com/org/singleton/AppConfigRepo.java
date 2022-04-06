package com.org.singleton;

import java.util.HashMap;
import java.util.Map;

public class AppConfigRepo {
	
	public Map<String, String> loadConfigurations() {
		Map<String, String> configurations = new HashMap<>();
		configurations.put("key1", "my config property");
		configurations.put("key2", "my another config property");
		return configurations;
	}

}
