package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.DriverSingletion;
import io.qameta.allure.Attachment;

public class ScreenShotServise {
    static Logger log = Logger.getRootLogger();
    
    @Attachment
    public static byte[] saveScreenshot() {
	log.error("Make screenshot");
        return ((TakesScreenshot) DriverSingletion.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
