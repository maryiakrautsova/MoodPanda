package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.EditProfilePage;
import pages.LoginPage;
import pages.MainPage;

public class ChangeFirstNameTest extends BaseTest {
    @Test
    public void changeFirstName() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickYourDashboardButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickEditProfileButton();
        EditProfilePage editProfilePage = new EditProfilePage();
        editProfilePage.changeFirstName();
        editProfilePage.clickSaveIdentityButton();
        String changedFirstName = editProfilePage.getMemberName();
        Assert.assertEquals(changedFirstName,
                "TheKindestLion S",
                "First name has not been changed.");
    }
}
