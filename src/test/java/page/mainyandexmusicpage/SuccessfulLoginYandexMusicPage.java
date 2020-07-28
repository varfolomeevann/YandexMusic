package page.mainyandexmusicpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static page.mainyandexmusicpage.SuccessfulLoginYandexMusicLcatorsPage.*;
import page.BaseYandexMusicPage;

public class SuccessfulLoginYandexMusicPage extends BaseYandexMusicPage{
    public WebElement lookForElement(By by) {
   	return super.lookForElement(by);
       }
    
    public boolean isDispalyed() {
	WebDriver h = windowMain();
	System.out.println(h);
	return lookForElement(USER_LOGIN).isDisplayed();
	
    }

}
