package driver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utils.WebDriverListner;

public class DriverSingletion {
//    private static WebDriver driver;
    private static EventFiringWebDriver driver;
    static Logger log = Logger.getRootLogger();

    private DriverSingletion() {
    }
    public static WebDriver getDriver() {
	if (driver == null) {
	    driver = new EventFiringWebDriver(new ChromeDriver());
	    driver.register(new WebDriverListner());
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	log.info("Get driver");
	return driver;

    }
    public static void closeDriver() {
	if (driver != null) {
	    driver.quit();
	    log.info("Close driver");
	    driver = null;
	}
    }
}
