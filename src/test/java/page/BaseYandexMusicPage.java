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
    private JavascriptExecutor jsExecutor;

    protected WebElement lookForElement(By by) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	jsExecutor = (JavascriptExecutor) driver;
	System.out.println(driver.findElement(by));
	return driver.findElement(by);
    }

    protected WebElement lookForElementJs(String clickSearchJS) {
	//jsExecutor = null;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	jsExecutor = (JavascriptExecutor) driver;
//	jsExecutor.executeScript(clickSearchJS);
	System.out.println("7777777777777777777777777777777777777");
//	System.out.println(jsExecutor);
	System.out.println(jsExecutor.executeScript(clickSearchJS));
	WebElement titleElement = (WebElement)jsExecutor.executeScript(clickSearchJS);
	System.out.println(titleElement);
	return titleElement;
    }
   

	    
    public void open(String padgeURL) {
	driver.get(padgeURL);
    }

    protected WebDriver window() {
	String currentWindow = driver.getWindowHandle();
	
	Set<String> handles = driver.getWindowHandles();
	System.out.println("-----------------------------");
	System.out.println(currentWindow);
	System.out.println(handles);
	for (String handl : handles) {
	    System.out.println(handl);
	    System.out.println(currentWindow);
	    if (!handl.equals(currentWindow)) {
		
		currentWindow = handl;
		break;
		
	    }
	}
	System.out.println(currentWindow);
	return driver.switchTo().window(currentWindow);

    }

//    protected WebDriver windowMain() {
//	System.out.println("99999999999999999999999999999999999999999999");
//	String currentWindow = driver.getWindowHandle();
//	System.out.println(currentWindow);
//	return driver.switchTo().window(" ");
//
//    }
}
