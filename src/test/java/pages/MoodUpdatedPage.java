package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedPage {
    private SelenideElement homeButton = $(By.xpath("//p[4]/a[1]"));

    public void clickHomeButton(){
        homeButton.click();
    }
}
