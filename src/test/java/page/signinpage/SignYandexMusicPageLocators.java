package page.signinpage;

import org.openqa.selenium.By;

public class SignYandexMusicPageLocators {

    protected static final By SIGN_IN_BUTTON = By.className("button__label");
    protected static final By USER_NAME_LOGIN = By.id("passp-field-login");
    protected static final By USER_NAME_PASSWD = By.id("passp-field-passwd");
    protected static final String SIGN_JS_LOGIN = "document.querySelector(\"#root > div > div > div.passp-flex-wrapper > div > div >"
		+ " div.passp-auth-content > div:nth-child(2) > div > div > div.passp-login-form > form > "
		+ "div.passp-button.passp-sign-in-button > button\")\r\n" + 
		  "" +".click()";
    
    protected static final String SIGN_JS_PASSWD ="document.querySelector(\"#root > div > div > div.passp-flex-wrapper > div > div >"
    	+ " div.passp-auth-content > div.passp-route-forward > div > div > form >"
    	+ " div.passp-button.passp-sign-in-button > button\")\r\n" + ".click()";
}
