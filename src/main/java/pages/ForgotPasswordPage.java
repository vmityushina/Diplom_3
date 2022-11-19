package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends AbstractPage{
    public ForgotPasswordPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By signInLink = By.xpath("//a[text()='Войти']");

    @Step("click sign in")
    public void signInLinkClick() {
        webDriver.findElement(signInLink).click();
    }
}
