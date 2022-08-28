package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class DeletePostTest extends BaseTest {
    @Test
    public void postCanBeDeletedTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickPostUpdateButton();
        RateHappinessPage rateHappinessPage = new RateHappinessPage();
        rateHappinessPage.clickTimeSaverWork();
        rateHappinessPage.clickUpdateButton();
        MoodUpdatedPage moodUpdatedPage = new MoodUpdatedPage();
        moodUpdatedPage.clickHomeButton();
        mainPage.clickYourDashboardButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickDeletePostButton();
        String postRemoved = dashboardPage.getTextFromTextInputArea();
        Assert.assertEquals(postRemoved, "", "Post is not deleted.");


    }
}
