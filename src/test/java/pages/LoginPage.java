package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private SelenideElement emailInput = $(By.xpath("//input[@type = 'text']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@type = 'password']"));
    private SelenideElement loginButton = $(By.cssSelector("button.button"));

    public MainPage login(String email, String password) {
        open(Urls.LOGIN_URL);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.shouldBe(Condition.enabled, Duration.ofSeconds(5));
        loginButton.click();
        return new MainPage();
    }
}
