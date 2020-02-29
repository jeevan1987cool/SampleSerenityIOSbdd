package test.optinOne.pages;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='login']")
	private MobileElement loginBtn;
//  private WebElement loginBtn;

	public void clickOnlogin_btn() {
		loginBtn.click();
	}

}