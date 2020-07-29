package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.signinpage.SignYandexMusicPage;

public class LoginTest extends BaseTest {
    private String login = "varfolomeevann";
    private String passwd = "26112011na";
    SignYandexMusicPage signPadge;

    @BeforeMethod
    public void setup() {
	signPadge = new SignYandexMusicPage();
	signPadge.open();

    }

    @Test(description = "Форма авторизации. Все поля валидные")
    public void successfullLogin() {
	signPadge.clickLoginButton();
	signPadge.insertLogin(login);
	signPadge.clickLoginButtonWindowLogin();
	signPadge.insertPassword(passwd);
	signPadge.clickLoginButtonWindowPasswd();
	signPadge.isIconClick();
	Assert.assertEquals(signPadge.isLogin().getText(), login);

    }

    @Test(description = "Форма авторизации. Поле логин пустое")
    public void fieldLoginisEmpty() {
	signPadge.clickLoginButton();
	signPadge.clickLoginButtonWindowLogin();
	Assert.assertEquals(signPadge.messageErrorAuthorization().getText(), "Логин не указан");

    }
    @Test(description = "Форма авторизации. Неверный пароль")
    public void fieldPasswordIsWrong() {
	signPadge.clickLoginButton();
	signPadge.insertLogin(login);
	signPadge.clickLoginButtonWindowLogin();
	signPadge.insertPassword("1111");
	signPadge.clickLoginButtonWindowPasswd();
	Assert.assertEquals(signPadge.messageErrorAuthorization().getText(), "Неверный пароль");

    }
    @Test(description = "Форма авторизации. Несуществующий пользователь")
    public void nonExistUser() {
	signPadge.clickLoginButton();
	signPadge.insertLogin("natdjssoeeoe");
	signPadge.clickLoginButtonWindowLogin();
	Assert.assertEquals(signPadge.messageErrorAuthorization().getText(), "Такого аккаунта нет");

    }

    @Override
    @AfterMethod
    public void tearDown() {
	super.tearDown();
	signPadge = null;
    }

}
