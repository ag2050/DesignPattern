package com.org.test;

import java.lang.reflect.Constructor;

import com.org.singleton.AppConfig;

public class AppConfigTest {

	public static void main(String[] args) throws Exception {
		/*
		 * No matter how many times you call AppConfig.getInstance(). 
		 * This will create AppConfig instance once and always same instance will be returned.
		 */
		AppConfig instanceOne = AppConfig.getInstance();
		AppConfig instanceTwo = AppConfig.getInstance();
		
		System.out.println("HashCode of InstanceOne: " + instanceOne.hashCode());
		System.out.println("HashCode of InstanceTwo: " + instanceTwo.hashCode());
		
		/*
		 * access configuration properties
		 */
		System.out.println(instanceOne.getProperty("key1"));
		System.out.println(instanceOne.getProperty("key2"));

		/*
		 * we can create instance of a class using java reflection API even though
		 * constructor is private. But we have taken care of this in our AppConfig.class
		 * and ensured only one instance always.
		 */
		
		AppConfig instanceThree = null;
		Constructor<?> constructors[] = AppConfig.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			// this will throw exception
			instanceThree = (AppConfig) constructor.newInstance();
			break;
		}

		System.out.println("HashCode of instanceThree: " + instanceThree.hashCode());
	}

}
