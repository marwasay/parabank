package Pages;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BillPayPage {
    private WebDriver driver;

    public BillPayPage(WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By payeeNameField = By.xpath("//input[@ng-model=\"payee.name\"]");
    private By addressField = By.xpath("//input[@ng-model=\"payee.address.street\"]");
    private By cityField = By.xpath("//input[@ng-model=\"payee.address.city\"]");
    private By statField = By.xpath("//input[@ng-model=\"payee.address.state\"]");
    private By zipCodeField = By.xpath("//input[@ng-model=\"payee.address.zipCode\"]");
    private By phoneNumberField = By.xpath("//input[@ng-model=\"payee.phoneNumber\"]");
    private By accountField = By.xpath("//input[@ng-model=\"payee.accountNumber\"]");
    private By verifyAccountField = By.xpath("//input[@ng-model=\"verifyAccount\"]");
    private By amountField = By.xpath("//input[@ng-model=\"amount\"]");
    private By fromAccountDownDropMenu = By.xpath("//select[@ng-model=\"accountId\"]");
    private By sendPaymentButton = By.xpath("//input[@value=\"Send Payment\"]");
    private static By billPaymentComplete = By.xpath("//h1[text()='Bill Payment Complete']");
    private static By payeeNameIsRequired = By.xpath("//span[@ng-show=\"!validationModel.name\"]");

    private By billPaymentServiceTitle = By.xpath("//h1[text()='Bill Payment Service']");
   public static By getBillPaymentComplete() {
       return billPaymentComplete;
   }
       public static By getPayeeNameIsRequired(){
       return payeeNameIsRequired;
   }
    //methods
    public void sendPayment(String payeeName, String address, String city, String state, String zipCode, String phoneNumber, String account, String verifyAccount, String amount, String fromAccount, String accountID) {
        driver.findElement(payeeNameField).sendKeys(payeeName);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(statField).sendKeys(state);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        driver.findElement(accountField).sendKeys(account);
        driver.findElement(verifyAccountField).sendKeys(verifyAccount);
        driver.findElement(amountField).sendKeys(amount);
        Select selectId = new Select(driver.findElement(fromAccountDownDropMenu));
        selectId.selectByVisibleText(accountID);
        driver.findElement(sendPaymentButton).click();
    }
}
