package com.org.singleton;

import java.util.HashMap;
import java.util.Map;

public class AppConfigRepo {
	
	public Map<String, String> loadConfigurations() {
		Map<String, String> configurations = new HashMap<>();
		configurations.put("key", "value");
		return configurations;
	}

}
