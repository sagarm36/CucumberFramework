package com.tbe.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {

	private ExtentReport() {

	}

	private static ExtentReports extent;

	public static void initialiseReport() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("index.html");
			extentSparkReporter.config().setDocumentTitle("Automation Report");
			extentSparkReporter.config().setTheme(Theme.DARK);
			extentSparkReporter.config().setReportName("Sagar");
			extent.attachReporter(extentSparkReporter);
		}
	}

	public static void flushExtentReport() {
		if (Objects.nonNull(extent)) {
			extent.flush();
			try {
				Desktop.getDesktop().browse(new File("index.html").toURI());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void createTest(String testCaseName) {
		ExtentReportManager.setExtentTest(extent.createTest(testCaseName));
	}

}
