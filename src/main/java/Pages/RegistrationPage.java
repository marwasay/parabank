package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;
    public RegistrationPage(WebDriver driver){
        this.driver=driver;

    }
    // elements
    private By firstNameField = By.xpath("//b[text()='First Name:']");
    private By lastNameField = By.xpath("//b[text()='Last Name:']");
    private By addressField =By.xpath("//b[text()='Address:']");
    private By cityField =By.xpath("//b[text()='City:']");
    private By stateField =By.xpath("//b[text()='State:']");
    private By zipCodeField =By.xpath("//b[text()='Zip Code:']");
    private By SSNField =By.xpath("//b[text()='SSN:']");
    private By PhoneField =By.xpath("//b[text()='Phone #:']");
    private By usernamee =By.xpath("//b[text()='Username:']");
    private By passwordd=By.xpath("//b[text()='Password:']");
    private By confirmPassword =By.xpath("//b[text()='Confirm:']");
    private By registerButoon =By.xpath("//input[@value=\"Register\"]");
    private By customerLookUp= By.xpath("//h1[text()='Customer Lookup']");

// methods
    public void register(String name , String lastname, String address , String city , String state , String zipcode,String SSN,String phoneNumber,String username , String password , String ConfirmPassword){
        driver.findElement(firstNameField).sendKeys(name);
        driver.findElement(lastNameField).sendKeys(lastname);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(zipCodeField).sendKeys(zipcode);
        driver.findElement(PhoneField).sendKeys(phoneNumber);
        driver.findElement(SSNField).sendKeys(SSN);
        driver.findElement(usernamee).sendKeys(username);
        driver.findElement(passwordd).sendKeys(password);
        driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
        driver.findElement(registerButoon).click();
    }



}
