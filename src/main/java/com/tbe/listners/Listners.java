package com.tbe.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tbe.reports.ExtentLogger;
import com.tbe.reports.ExtentReport;
import com.tbe.reports.ExtentReportManager;
import com.tbe.utils.Screenshot;

public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + " - Test case is pass.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentReportManager.getExtentTest().addScreenCaptureFromPath(Screenshot.takeScreenshot(result.getMethod().getMethodName()), result.getMethod().getMethodName());
		ExtentLogger.fail(result.getMethod().getMethodName() + " - Test case is failed.");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() + " - Test case is skipped.");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentReport.initialiseReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReport.flushExtentReport();
	}
}
