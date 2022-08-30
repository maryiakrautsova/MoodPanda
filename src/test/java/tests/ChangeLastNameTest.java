package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.EditProfilePage;
import pages.LoginPage;
import pages.MainPage;

public class ChangeLastNameTest extends BaseTest {
    @Test
    public void changeLastNameInitial() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickYourDashboardButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickEditProfileButton();
        EditProfilePage editProfilePage = new EditProfilePage();
        editProfilePage.changeLastNameInitial();
        editProfilePage.clickSaveIdentityButton();
        String changedLastName = editProfilePage.getMemberName();
        Assert.assertEquals(changedLastName,
                "TheKindestLion Peppa",
                "Last name has not been changed.");
    }
}
