package StepDefinations;

import com.tbe.driver.Driver;
import io.cucumber.java.en.Given;

public class BackgroundSteps {
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		Driver.initializeDriver();
	}

}
