package page;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverSingletion;

public class BaseYandexMusicPage {
    private WebDriver driver = DriverSingletion.getDriver();
    JavascriptExecutor jsExecutor;

    protected WebElement lookForElement(By by) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	jsExecutor = (JavascriptExecutor) driver;
	return driver.findElement(by);
    }

    protected void lookForElementJs(String clickSearchJS) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript(clickSearchJS);
	jsExecutor = null;
    }

    public void open(String padgeURL) {
	driver.get(padgeURL);
    }

    protected WebDriver window() {
	String currentWindow = driver.getWindowHandle();
	Set<String> handles = driver.getWindowHandles();
	System.out.println("-----------------------------");
	System.out.println(handles);
	for (String handl : handles) {
	    if (!handl.equals(currentWindow)) {
		currentWindow = handl;
	    }
	}
	System.out.println(currentWindow);
	return driver.switchTo().window(currentWindow);

    }

    protected WebDriver windowMain() {
	System.out.println("99999999999999999999999999999999999999999999");
	String currentWindow = driver.getWindowHandle();
	System.out.println(currentWindow);
	return driver.switchTo().window("");

    }
}
