import helpers.Config;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;

public class TransitionsBetweenPageObjectsTest extends AbstractUITest{

    private static MainPage mainPage;

    @Test
    @DisplayName("checking that buns are selected by default")
    public void bunsAreSelectedByDefault() {
        mainPage = new MainPage(webDriver);
        mainPage.open();
        String expected = Config.getActiveSection();
        String actual = mainPage.getBunClass();
        Assert.assertTrue("active section should have a specific class", actual.contains(expected));
    }

    @Test
    @DisplayName("checking transition from buns to sauces")
    public void transitionFromBunsToSauces() {
        mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.saucesSectionClick();
        String actual = mainPage.getSaucesClass();
        String expected = Config.getActiveSection();
        Assert.assertTrue("active section should have a current class", actual.contains(expected));
    }

    @Test
    @DisplayName("checking transition from buns to sauces and then to fillings")
    public void transitionFromSaucesToFillings() {
        mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.saucesSectionClick();
        mainPage.fillingsSectionClick();
        String actual = mainPage.getFillingsClass();
        String expected = Config.getActiveSection();
        Assert.assertTrue("active section should have a current class", actual.contains(expected));

    }

    @Test
    @DisplayName("checking transition from buns to sauces then to fillings and then to buns")
    public void transitionFromFillingsToBuns() {
        mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.saucesSectionClick();
        mainPage.fillingsSectionClick();
        mainPage.bunsSectionClick();
        String actual = mainPage.getBunClass();
        String expected = Config.getActiveSection();
        Assert.assertTrue("active section should have a current class", actual.contains(expected));

    }
}
