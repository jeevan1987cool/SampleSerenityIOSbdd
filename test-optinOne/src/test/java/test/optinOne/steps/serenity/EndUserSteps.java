package test.optinOne.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import test.optinOne.pages.LoginPage;

public class EndUserSteps extends ScenarioSteps{

    LoginPage loginPage;

    @Step
	public void clickLogin_btn() {
    	loginPage.clickOnlogin_btn();
	}
}