package com.tbe.driver;

import java.util.Objects;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.tbe.utils.ReadPropertyFile;

public final class Driver {

	private Driver() {

	}

	@Test
	public static void initializeDriver() {
		if (Objects.isNull(DriverManager.getDriver())) {
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			WebDriver driver = new ChromeDriver(options);
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(ReadPropertyFile.readPropertyValue("url"));
		}
	}

	public static void quiteDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unloadDriver();
		}
	}

}
