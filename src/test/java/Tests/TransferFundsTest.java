package Tests;

import Pages.LoginPage;
import Pages.TransferFundsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest{

    @Test
    public void TransferFund(){
        new LoginPage(driver).login("ms","123456")
                .selectTransferFundsLink()
                .addAmount("1000","15897","15555");

        boolean isTransferCompleteSentenceDisplayed = driver.findElement(TransferFundsPage.getTransferCompleteSentence()).isDisplayed();
        Assert.assertTrue(isTransferCompleteSentenceDisplayed);
    }
}
