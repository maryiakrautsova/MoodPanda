package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedPage {

    private SelenideElement homeButton = $(By.xpath("//a[text()='Home ']"));



    public void clickHomeButton(){
        homeButton.click();
    }
}
