package page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverSingletion;

public class BaseYandexMusicPage {
    private WebDriver driver = DriverSingletion.getDriver();
    private JavascriptExecutor jsExecutor;

    protected WebElement lookForElement(By by) {
	return driver.findElement(by);
    }

    protected WebElement lookForElementJs(String clickSearchJS) {
	jsExecutor = (JavascriptExecutor) driver;
	WebElement titleElement = (WebElement) jsExecutor.executeScript(clickSearchJS);
	return titleElement;
    }

    protected void open(String padgeURL) {
	driver.get(padgeURL);
    }

    protected WebDriver window() {
	String currentWindow = driver.getWindowHandle();
	Set<String> handles = driver.getWindowHandles();
	for (String handl : handles) {
	    if (!handl.equals(currentWindow)) {
		currentWindow = handl;
		break;

	    }
	}
	return driver.switchTo().window(currentWindow);

    }

}
