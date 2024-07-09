package com.tbe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.tbe.driver.DriverManager;
import com.tbe.utils.ActionHelper;

public class LoginPage {

	private final By loginIcon = By.xpath("//span[@title='Login']");
	private final By userNameTextField = By.id("login-email");
	private final By passwordTextField = By.id("login-password");
	private final By loginButton = By.xpath("//button[text()='LOGIN']");
	private final By userLoggedInIcon = By.className("user-drop-down");
	private final By logoutButton = By.xpath("//li[contains(text(),'Logout')]");

	public void clickOnLoginIcon() {
		ActionHelper.click(loginIcon);
	}

	public void enterUserName(String value) {
		ActionHelper.sendKeys(userNameTextField,value);
	}

	public void enterPassword(String value) {
		ActionHelper.sendKeys(passwordTextField,value);
	}

	public void clickOnLoginButton() {
		ActionHelper.click(loginButton);
	}

	public void clickOnLogout() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Actions a = new Actions(DriverManager.getDriver());
		a.moveToElement(DriverManager.getDriver().findElement(userLoggedInIcon)).build();
//		waitForElementVisibility(userLoggedInIcon);
//		moveToElement(userLoggedInIcon);
//		waitForElementClickable(loginButton);
//		click(logoutButton);
		DriverManager.getDriver().findElement(logoutButton).click();
	}

}
