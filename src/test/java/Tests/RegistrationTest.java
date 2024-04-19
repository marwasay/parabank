package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void successfulRegistration(){
        new LoginPage(driver).accessToRegistrationPage().register("marwa","sayed","maadi","cairo", "egypt","11742","12345","01142118723","ms","123456","123456");

        boolean successfulRegistrationMessageDisplayed = driver.findElement(HomePage.getSuccessfulRegistrationMessgae()).isDisplayed();
        Assert.assertTrue(successfulRegistrationMessageDisplayed);

    }
}
