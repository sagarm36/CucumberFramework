package com.tbe.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tbe.constants.FrameWorkConstants;
import com.tbe.driver.DriverManager;
import com.tbe.reports.ExtentLogger;

public class ActionHelper {

	public static void click(By by) {
		waitForElementClickable(by);
		DriverManager.getDriver().findElement(by).click();
		//ExtentLogger.info("Clicked on - " + by.toString());
	}

	public static void sendKeys(By by, String value) {
		waitForElementVisibility(by);
		DriverManager.getDriver().findElement(by).clear();
		//ExtentLogger.info("Cleared field - " + by.toString());
		DriverManager.getDriver().findElement(by).sendKeys(value);
		//ExtentLogger.info("Entered value - " +"<b>"+ value + "</b"+" on -" + by.toString());
	}

	public static String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	public static void waitForElementClickable(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(FrameWorkConstants.getExplicitWait()));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		//ExtentLogger.info("Waiting of element to be clickable - " + by.toString());
	}

	public static void waitForElementVisibility(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(FrameWorkConstants.getExplicitWait()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		//ExtentLogger.info("Waiting of element to be visible - " + by.toString());
	}

	public static void moveToElement(By by) {
		Actions actions = new Actions(DriverManager.getDriver());
		actions.moveToElement(DriverManager.getDriver().findElement(by)).build().perform();
		//ExtentLogger.info("Moved to element - " + by.toString());
	}
}
