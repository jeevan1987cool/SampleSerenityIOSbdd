package test.optinOne.steps;


import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import test.optinOne.steps.serenity.EndUserSteps;

public class ClickLoginButtonSteps {
	
	@Steps
    EndUserSteps endUserSteps;
	
	@Given("^I want to click login button$")
	public void i_want_to_click_login_button() {
		endUserSteps.clickLogin_btn();
	}

}
