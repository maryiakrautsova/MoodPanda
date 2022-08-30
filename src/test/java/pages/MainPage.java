package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private SelenideElement hugButton = $(By.xpath("(//a[contains(@class,'card-footer-item')])[1]"));

    private SelenideElement hugSentIndicator = $(By.xpath("(//a[contains(text(),'Hug sent')])[1]"));

    private SelenideElement youDashboardButton = $(By.xpath("//a[text()=' Your dashboard ']"));

    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public void clickSendHugButton() {
        hugButton.click();
    }

    public boolean isHugSent() {
        hugSentIndicator.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return hugSentIndicator.isDisplayed();
    }

    public void clickPostUpdateButton(){
        postUpdateButton.click();
    }

    public void clickYourDashboardButton(){
        youDashboardButton.shouldBe(Condition.interactable).click();
    }

}
