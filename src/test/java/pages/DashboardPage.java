package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private SelenideElement deletePostButton = $(By.xpath("//td[4]/div/button[2]"));

    private SelenideElement textInputArea = $(By.xpath("//tr[1]/td[3]/textarea"));

    private SelenideElement editProfileButton = $(By.xpath("(//ul[last()]/li[1]/a[1])[3]"));


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
