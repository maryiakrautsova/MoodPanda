package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class SendHugTest extends BaseTest {
    @Test
    public void hugCanBeSentTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickSendHugButton();
        boolean isHugSent = mainPage.isHugSent();
        Assert.assertTrue(isHugSent, "Hug is not sent.");
    }
}
