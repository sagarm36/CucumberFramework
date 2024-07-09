package com.tbe.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tbe.constants.FrameWorkConstants;
import com.tbe.driver.DriverManager;

public class Screenshot {
	
	public static String takeScreenshot(String testCaseName) {
		
		TakesScreenshot ts = (TakesScreenshot)DriverManager.getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(FrameWorkConstants.getScreenshotPath()+testCaseName+".png");
		
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return FrameWorkConstants.getScreenshotPath()+testCaseName+".png";
		
	}

}
