package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends AbstractPage{
    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By nameInput = By.xpath(".//label[text()='Имя']/following-sibling::input");
    private By emailInput = By.xpath(".//label[text()='Email']/following-sibling::input");
    private By passwordInput = By.xpath(".//label[text()='Пароль']/following-sibling::input");
    private By registrationBtn = By.xpath("//button[text()='Зарегистрироваться']");
    private By wrongPasswordWarning = By.xpath("//p[text()='Некорректный пароль']");
    private By signInLink = By.xpath("//a[text()='Войти']");
    @Step("enter name")
    public void nameInputSendKeys(String name) {
        webDriver.findElement(nameInput).sendKeys(name);
    }
    @Step("enter email")
    public void emailInputSendKeys(String email) {
        webDriver.findElement(emailInput).sendKeys(email);
    }
    @Step("enter password")
    public void passwordInputSendKeys(String password) {
        webDriver.findElement(passwordInput).sendKeys(password);
    }
    @Step("click register")
    public void registrationBtnClick() {
        webDriver.findElement(registrationBtn).click();
    }

    @Step("click sign in")
    public void signInLinkClick() {
        webDriver.findElement(signInLink).click();
    }
    @Step("wait till warning is visible")
    public void waitWarningVisibility() {
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOf(webDriver.findElement(wrongPasswordWarning)));
    }
    @Step("check if warning is visible")
    public boolean checkWarningVisibility() {
        return webDriver.findElement(wrongPasswordWarning).isDisplayed();
    }

}
