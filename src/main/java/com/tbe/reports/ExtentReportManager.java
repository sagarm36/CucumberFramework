package com.tbe.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReportManager {

	private ExtentReportManager() {

	}

	private static final ThreadLocal<ExtentTest> et = new ThreadLocal<ExtentTest>();

	public static ExtentTest getExtentTest() {
		return et.get();
	}

	public static void setExtentTest(ExtentTest extentTest) {
		et.set(extentTest);
	}

	public static void unloadExtentTest() {
		et.remove();
	}

}
