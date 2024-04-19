package Tests;

import Pages.LoginPage;
import Pages.RequestLoanPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestALoanTest extends BaseTest{

    @Test
    public void requestALoanTest (){
        new LoginPage(driver).login("ms","123456")
                .selectRequestLoanLink()
                .requestLoan("100000","30000","14676");

        boolean isLoanRequestProcessedDisplayed=driver.findElement(RequestLoanPage.getLoanRequestProcessedSentence()).isDisplayed();
        Assert.assertTrue(isLoanRequestProcessedDisplayed);

    }
}
