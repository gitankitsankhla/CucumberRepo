package com.ic.utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyFileReader {

	static Properties property;

	public static void readData() throws Exception {

		property = new Properties();
		File file = new File("D:\\RISI\\workspace\\CucumberLearning\\src\\configuration.properties");
		FileReader reader = new FileReader(file);
		property.load(reader);
	}

	public static String getData(String Data) throws Exception {

		readData();
		String data = property.getProperty(Data).trim();
		return data;
	}

}
