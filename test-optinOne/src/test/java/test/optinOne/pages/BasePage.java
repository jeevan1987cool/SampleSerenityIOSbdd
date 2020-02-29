package test.optinOne.pages;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicate;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class BasePage extends PageObject {
	public BasePage(final WebDriver driver) {
		super(driver, new Predicate<PageObject>() {
			private WebDriver driver;

			@Override
			public boolean apply(PageObject page) {
				PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
				return true;

//				PageFactory.initElements(new AppiumFieldDecorator(
//						((WebDriverFacade) page.getDriver()).getProxiedDriver(), page.getImplicitWaitTimeout()), page);
//						((WebDriverFacade) page.getDriver()).getProxiedDriver(), page.getImplicitWaitTimeout()), page);
//				return true;
			}

		});

	}
	
}
