package com.tbe.constants;

public final class FrameWorkConstants {
	private FrameWorkConstants(){
		
	}
	
	private final static String CONFIGFILEPATH=System.getProperty("user.dir")+"/src/main/resources/config.properties";
	private final static int IMPLICITWAIT = 30;
	private final static int EXPLICITWAIT = 30;
	
private final static String SCREENSHOTPATH = System.getProperty("user.dir")+"/screenshots";
	
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	
	public static int getImplicitWait() {
		return IMPLICITWAIT;
	}
	
	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}
	
	public static String getScreenshotPath() {
		return SCREENSHOTPATH;
	}

}
