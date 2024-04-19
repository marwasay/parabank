package Tests;

import Pages.LoginPage;
import Pages.OpenNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest{
    @Test
    public void openNewAccountTest(){
        new LoginPage(driver).login("ms","123456")
                .selectNewAccountLink()
                .openNewAccount("Savings","14676");

        boolean isAccountOpenedSentenceDisplayed =driver.findElement(OpenNewAccountPage.getAccountOpenedSentence()).isDisplayed();
        Assert.assertTrue(isAccountOpenedSentenceDisplayed);
    }
}
