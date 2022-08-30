package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class EditProfilePage {
    private SelenideElement firstNameInput = $(By.xpath("//input[@placeholder='e.g Jake']"));
    private SelenideElement lastNameInitialInput = $(By.xpath("(//input[contains(@class,\"input\")])[2]"));
    private SelenideElement saveIdentityButton = $(By.xpath("(//div/button)[1]"));
    private SelenideElement memberName = $(By.xpath("//div[2]/p[1]"));

    public void changeFirstName() {
        firstNameInput.shouldBe(Condition.editable, Duration.ofSeconds(10));
        firstNameInput.clear();
        firstNameInput.sendKeys("TheKindestLion");
    }
    public void changeLastNameInitial() {
        lastNameInitialInput.shouldBe(Condition.editable, Duration.ofSeconds(10));
        lastNameInitialInput.clear();
        lastNameInitialInput.sendKeys("Peppa");
    }
    public void clickSaveIdentityButton() {
        saveIdentityButton.click();
    }

    public String getMemberName() {
        return memberName.getText();
    }
}
