package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.mainyandexmusicpage.SuccessfulLoginYandexMusicPage;
import page.signinpage.SignYandexMusicPage;

public class LoginTest extends BaseTest {
//    ConfirmationPage confirmationPadge;
//    ErrorMessagePage errorMessagePage;
    SignYandexMusicPage signPadge;
    SuccessfulLoginYandexMusicPage succesfulLoginPage;

    @BeforeMethod
    public void setup() {
	signPadge = new SignYandexMusicPage();
	succesfulLoginPage = new SuccessfulLoginYandexMusicPage();
//	errorMessagePage = new ErrorMessagePage();
	signPadge.open();

    }

    @Test(description = "Все поля валидные")
    public void successfullLogin() {
	signPadge.clickLoginButton();
	signPadge.clearLogin();
	signPadge.insertLogin("varfolomeevann");
	signPadge.clickLoginButtonWindowLogin();
	signPadge.insertPassword("26112011na");
	signPadge.clickLoginButtonWindowPasswd();

	Assert.assertTrue(succesfulLoginPage.isDispalyed());

    }

//    @Test(description = "Все поля пустые")
//    public void emptyFields() {
//	signPadge.clickLoginButton();
//	
//	Assert.assertTrue(errorMessagePage.isDispalyed());
////	Assert.assertTrue(confirmationPadge.isDispalyed());
//    }
//    
//    @Test(description = "Поле пароль пустое")
//    public void oneEmptyFields() {
//	signPadge.insertLogin("demo");
//	signPadge.clickLoginButton();
//	
//	Assert.assertTrue(errorMessagePage.isDispalyed());
//	
//    }
//    @Test(description = "Логин, пароль несуществующего пользователя")
//    public void noExistUser() {
//	signPadge.insertLogin("1111");
//	signPadge.insertPassword("1111");
//	signPadge.clickLoginButton();
//	
//	Assert.assertTrue(errorMessagePage.isDispalyed());
//	
//    }
//        
    @Override
    @AfterTest
    public void tearDown() {
	super.tearDown();
	signPadge = null;
	succesfulLoginPage = null;
//	errorMessagePage = null;
    }

}
