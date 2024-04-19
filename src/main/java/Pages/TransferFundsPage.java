package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class TransferFundsPage {
    private WebDriver driver ;
    public TransferFundsPage(WebDriver driver){
        this.driver=driver;
    }
    //elements
    private By amountField = By.id("amount");
    private By fromAccountDownDropMenu =By.id("fromAccountId");
    private By toAccounDownDropMenu =By.id("toAccountId");
    private By tranferButton = By.xpath("//input[@value=\"Transfer\"]");
    private static By transferCompleteSentence = By.xpath("//h1[text()='Transfer Complete!']");

    //private By transferFundsTitle =By.xpath("//h1[text()='Transfer Funds']");

    public static By getTransferCompleteSentence(){
        return transferCompleteSentence;
    }

    //methods
    public void addAmount(String amount , String fromID , String toID  ){
        driver.findElement(amountField).sendKeys(amount);
        Select fromAccount =new Select(driver.findElement(fromAccountDownDropMenu));
        fromAccount.selectByVisibleText(fromID);
        Select toAccount = new Select(driver.findElement(toAccounDownDropMenu));
        toAccount.selectByVisibleText(toID);
        driver.findElement(tranferButton).click();

    }


}
