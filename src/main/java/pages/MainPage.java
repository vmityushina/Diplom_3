package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage{
    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    //Кнопка личный кабинет
    private By personalAccountLink = By.xpath("//p[text()='Личный Кабинет']");
    private By signInBtn = By.xpath("//button[text()='Войти в аккаунт']");
    private By bunsSpan = By.xpath("//span[text()='Булки']");
    private By saucesSpan = By.xpath("//span[text()='Соусы']");
    private By fillingsSpan = By.xpath("//span[text()='Начинки']");
    private By bunsSection = By.xpath("//span[text()='Булки']/parent::div");
    private By saucesSection = By.xpath("//span[text()='Соусы']/parent::div");
    private By fillingsSection = By.xpath("//span[text()='Начинки']/parent::div");

    @Step("open main page")
    public void open() {
        webDriver.get("https://stellarburgers.nomoreparties.site/");
    }
    @Step("open user profile")
    public void personalAccountLinkClick() {
        webDriver.findElement(personalAccountLink).click();
    }
    @Step("click sign in")
    public void signInBtnClick() {
        webDriver.findElement(signInBtn).click();
    }
    @Step("get class value for buns")
    public String getBunClass() {
        return webDriver.findElement(bunsSection).getAttribute("class");
    }
    @Step("open all buns")
    public void bunsSectionClick() {
        webDriver.findElement(bunsSpan).click();
    }
    @Step("get class value for sauces")
    public String getSaucesClass() {
        return webDriver.findElement(saucesSection).getAttribute("class");
    }
    @Step("open all sauces")
    public void saucesSectionClick() {
        webDriver.findElement(saucesSpan).click();
    }
    @Step("get class value for fillings")
    public String getFillingsClass() {
        return webDriver.findElement(fillingsSection).getAttribute("class");
    }
    @Step("open all fillings")
    public void fillingsSectionClick() {
        webDriver.findElement(fillingsSpan).click();
    }
}
