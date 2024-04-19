package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class HomePage {
    private WebDriver driver ;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //elements
    private By newAccountlink = By.xpath("//a[text()='Open New Account']");
    private By transferFundsLink =By.xpath("//a[text()='Transfer Funds']");
    private By billPayLink =By.xpath("//a[text()=' Bill Pay']");
    private By updateContactInfoLink =By.xpath("//a[@href=\"/parabank/updateprofile.htm\"]");
    private By requestLoanLink =By.xpath("//a[@href=\"/parabank/requestloan.htm\"]");
    private static By accountsOverviewSentence =By.xpath("//h1[text()='Accounts Overview']");
    private static By successfulRegistrationMessgae = By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");
    public static By getAccountsOverviewSentence(){
        return accountsOverviewSentence;
    }
    public static  By getSuccessfulRegistrationMessgae(){
        return successfulRegistrationMessgae;
    }

    //methods
    public OpenNewAccountPage selectNewAccountLink (){
        driver.findElement(newAccountlink).click();
        return new OpenNewAccountPage(driver);
    }
    public TransferFundsPage selectTransferFundsLink (){
        driver.findElement(transferFundsLink).click();
        return new TransferFundsPage(driver);
    }

    public BillPayPage selectBillPayLink (){
        driver.findElement(billPayLink).click();
        return new BillPayPage(driver);
    }
    public  UpdateContactInfoPage selectUpdateContactInfoLink (){
        driver.findElement(updateContactInfoLink).click();
        return new UpdateContactInfoPage(driver);
    }
    public RequestLoanPage selectRequestLoanLink (){
        driver.findElement(requestLoanLink).click();
        return new RequestLoanPage(driver);
    }









    }
