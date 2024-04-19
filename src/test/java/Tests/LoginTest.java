package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin(){
        new LoginPage(driver).login("ms","123456");

     boolean isAccountOverviewSentenceDisplayed = driver.findElement(HomePage.getAccountsOverviewSentence()).isDisplayed();
        Assert.assertTrue(isAccountOverviewSentenceDisplayed);
    }

    @Test
    public void invalidLogin() {
        new LoginPage(driver).login("mm","12345");

        boolean isWordErrorDisplayed = driver.findElement(LoginPage.getWordError()).isDisplayed();
    }
}
