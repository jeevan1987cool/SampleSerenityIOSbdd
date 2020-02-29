package testUtils;

//import static com.serenity.appium.poc.Property.*;
import static io.appium.java_client.service.local.AppiumDriverLocalService.buildService;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public final class AppiumEnvSetup {

	static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

	private static final AppiumDriverLocalService service;

	 static {
		service = buildService(new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingPort(Integer.parseInt("4723"))
				.withAppiumJS(new File(getSerenityProperty("appium.mainJS")))
				.withArgument(GeneralServerFlag.LOG_LEVEL, "info"));
	}

	public static void startAppiumServer() {
//		DesiredCapabilities caps = new DesiredCapabilities();

//        capabilities.setCapability("deviceName", "EM1");
//        capabilities.setCapability("platformVersion", "6.0");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("appPackage", "com.thlonline.telme");
//        capabilities.setCapability("appActivity", "com.thlonline.telme.MainActivity");
        
//        caps.setCapability("waitForQuietness", false);
//        caps.setCapability("waitForQuiescence", false);
//        caps.setCapability("wdaEventloopIdleDelay", 7);
//        caps.setCapability("eventLoopIdleDelaySec", 4);
//        caps.setCapability("startIWDP", true);
//        
//		final AppiumServiceBuilder builder;
//		builder = new AppiumServiceBuilder();
//		builder.usingPort(4723);
//		builder.withCapabilities(caps);
//		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
//		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
//		service = AppiumDriverLocalService.buildService(builder);
		service.start();
//		this.appiumServiceUrl = service.getUrl().toString();
//		logger.info("Appium Service started at " + this.appiumServiceUrl);
		try {
			service.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void stopAppiumServer() {
		try {
			if (service.isRunning()) {
				service.stop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getSerenityProperty(String propertyKey) {
		return variables.getProperty(propertyKey);
	}
}
