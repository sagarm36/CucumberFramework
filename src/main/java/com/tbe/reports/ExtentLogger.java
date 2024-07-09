package com.tbe.reports;

public class ExtentLogger {

	public static void pass(String message) {
		ExtentReportManager.getExtentTest().pass(message);
	}

	public static void fail(String message) {
		ExtentReportManager.getExtentTest().fail(message);
	}

	public static void skip(String message) {
		ExtentReportManager.getExtentTest().skip(message);
	}

	public static void warning(String message) {
		ExtentReportManager.getExtentTest().warning(message);
	}

	public static void info(String message) {
		ExtentReportManager.getExtentTest().info(message);
	}
}
