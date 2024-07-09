package com.tbe.utils;

import java.io.FileInputStream;
import java.util.Properties;

import com.tbe.constants.FrameWorkConstants;

public class ReadPropertyFile {

	public static String readPropertyValue(String key) {
		FileInputStream fs;
		Properties prop = null;
		try {
			fs = new FileInputStream(FrameWorkConstants.getConfigFilePath());
			prop = new Properties();
			prop.load(fs);
		} catch (Exception e) {
		}
		return prop.getProperty(key);
	}
}
