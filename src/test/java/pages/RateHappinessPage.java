package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RateHappinessPage {

    private SelenideElement timeSaverWork = $(By.xpath("//div[1]/button[7]"));

    private SelenideElement updateButton = $(By.xpath("//div[4]/div/div/a[2]"));

    public void clickTimeSaverWork() {
        timeSaverWork.click();
    }

    public void clickUpdateButton(){
        updateButton.click();
    }
}
