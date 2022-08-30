package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RateHappinessPage {

    private SelenideElement timeSaverWork = $(By.xpath("//button[text()=' work ']"));

    private SelenideElement updateButton = $(By.xpath("//a[text()=' Update to 5']"));

    public void clickTimeSaverWork() {
        timeSaverWork.click();
    }

    public void clickUpdateButton(){
        updateButton.click();
    }
}
