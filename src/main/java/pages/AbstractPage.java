package pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected final WebDriver webDriver;

    protected AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
