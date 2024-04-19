package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage {

    private WebDriver driver;

    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;

    }

    // elements
    private By accountTypeDownDropMenu = By.id("type");
    private By accountIdDownDroMenu = By.id("fromAccountId");
    private By openNewAccountButton = By.xpath("//input[@value=\"Open New Account\"]");
    private static By accountOpenedSentence= By.xpath("//h1[text()='Account Opened!']");
    //private By OpenNewAccountTitle = By.xpath("//h1[text()=\"Open New Account\"]");
    public static By getAccountOpenedSentence(){
        return accountOpenedSentence;
    }


    //methods
    public void openNewAccount(String accountType , String accountId) {
        Select accountTypee = new Select(driver.findElement(accountTypeDownDropMenu));
        accountTypee.selectByVisibleText(accountType);
        Select accountIdd = new Select(driver.findElement(accountIdDownDroMenu));
        accountIdd.selectByVisibleText(accountId);
        driver.findElement(openNewAccountButton).click();

    }




}