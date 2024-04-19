package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RequestLoanPage {
    private WebDriver driver;
    public RequestLoanPage(WebDriver driver){
        this.driver=driver;

    }
    //elements
    private By loanAmountField = By.id("amount");
    private By downPaymentField = By.id("downPayment");
    private By fromAccountDropDownMenu = By.id("fromAccountId");
    private By applyNowButton = By.xpath("//input[@value=\"Apply Now\"]");
    private static By loanRequestProcessedSentence = By.xpath("//h1[text()='Loan Request Processed']");
    //private By applyForALoanTitle = By.xpath("//h1[@class=\"title\"]");
    public static By getLoanRequestProcessedSentence(){
        return loanRequestProcessedSentence;
    }

    //methods
    public void requestLoan(String amountofloan , String downpayment ,String accountID){
        driver.findElement(loanAmountField).sendKeys(amountofloan);
        driver.findElement(downPaymentField).sendKeys(downpayment);
        Select accountId = new Select(driver.findElement(fromAccountDropDownMenu));
        accountId.selectByVisibleText(accountID);
        driver.findElement(applyNowButton).click();
    }


}
