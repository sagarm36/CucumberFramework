package StepDefinations;

import com.tbe.driver.Driver;
import com.tbe.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage loginPage = new LoginPage();
	
	@Given("User is on login page")
	public void verifyUserOnLoginPage() {
		loginPage.clickOnLoginIcon();
	}
	
	@When("User enters {string} and {string}")
	public void enterUserNameAndPassword(String userName, String password) {
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
	}
	
	@And("User clicks on login button")
	public void clickOnLoginButton() {
		loginPage.clickOnLoginButton();
	}
	
	@Then("User is navigated to home page")
	public void verifyHomePage() {
		System.out.println("User is navigated to home page");
	}
	
	@And("User close the browser")
	public void closeBrowser() {
		System.out.println("User close the browser");
		Driver.quiteDriver();
	}
	

}
