package com.tbe.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {

	}

	private static final ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver refDriver) {
		dr.set(refDriver);
	}
	
	public static void unloadDriver() {
		dr.remove();
	}

}
