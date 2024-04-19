package Tests;

import Pages.BillPayPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillPayTest extends BaseTest{

    @Test
    public void successfulBillPayment (){
        new LoginPage(driver).login("ms","123456")
                .selectBillPayLink()
                .sendPayment("marwa","maadi","cairo","egypt","11742","01142118723","11111","11111","1000","13566","13566");

        boolean isBillPaymentCompleteDisplayed= driver.findElement(BillPayPage.getBillPaymentComplete()).isDisplayed();
        Assert.assertTrue(isBillPaymentCompleteDisplayed);
    }
    @Test
    public void unsuccessfulBillPayment(){
        new LoginPage(driver).login("ms","123456")
                .selectBillPayLink()
                .sendPayment("","maadi","cairo","egypt","11742","01142118723","11111","11111","1000","13566","13566");
      boolean isPayeeNameRequiredDisplayed = driver.findElement(BillPayPage.getPayeeNameIsRequired()).isDisplayed();
      Assert.assertTrue(isPayeeNameRequiredDisplayed);
    }
}
