package page.signinpage;

import static page.signinpage.SignYandexMusicPageLocators.*;
import org.openqa.selenium.WebElement;
import page.BaseYandexPage;

public class SignYandexMusicPage extends BaseYandexPage {
    private String padgeURL = "https://music.yandex.by/home";

    public void clickLoginButton() {
	lookForElement(SIGN_IN_BUTTON).click();
	window();
    }

    public void clearLogin() {
	lookForElement(USER_NAME_LOGIN).clear();
    }

    public void insertLogin(String login) {
	lookForElement(USER_NAME_LOGIN).sendKeys(login);
    }

    public void insertPassword(String password) {
	lookForElement(USER_NAME_PASSWD).sendKeys(password);
    }

    public void clickLoginButtonWindowLogin() {
	lookForElementJs(SIGN_JS_LOGIN);
    }

    public void clickLoginButtonWindowPasswd() {
	lookForElementJs(SIGN_JS_PASSWD);
    }

    public void isIconClick() {
	window();
	lookForElement(USER_ICON).click();

    }

    public WebElement isLogin() {
	return lookForElement(USER_LOGIN_SUCCESSFULL);

    }
    public WebElement messageErrorAuthorization() {
	return lookForElement(USER_DATA_IS_WRONG);

    }

    public void open() {
	super.open(padgeURL);

    }

}
