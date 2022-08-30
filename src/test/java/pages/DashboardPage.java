package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement deletePostButton = $(By.xpath("(//button[contains(text(),' Delete ')])[3]"));

    private SelenideElement textInputArea = $(By.xpath("(//td[contains(@class,'wrap')])[1]//textarea[contains(@class,'textarea is-smdall')]"));

    private SelenideElement editProfileButton = $(By.xpath("//aside[contains(@class, 'side-nav')]//a[text()='Edit profile ']"));



    public void clickDeletePostButton() {
        deletePostButton.shouldBe(Condition.visible).click();
    }

    public String getTextFromTextInputArea() {
        return textInputArea.getText();
    }

    public void clickEditProfileButton() {
        editProfileButton.shouldBe(Condition.interactable).click();
    }
}
