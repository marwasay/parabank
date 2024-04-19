package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateContactInfoPage {
    private WebDriver driver ;
    public UpdateContactInfoPage(WebDriver driver){
        this.driver=driver;
    }
    //elements
    private By firstNameField = By.id("customer.firstName");
    private By lastNameField = By.id("customer.lastName");
    private By addressField = By.id("customer.address.street");
    private By cityField = By.id("customer.address.city");
    private By stateField = By.id("customer.address.state");
    private By zipCodeField = By.id("customer.address.zipCode");
    private By phoneField = By.id("customer.phoneNumber");
    private By updateProfileButton = By.xpath("//input[@value='Update Profile']");
    private static By profileUpdatedSentence =By.xpath("//h1[text()='Profile Updated']");
    //private By updateProfileTitle = By.xpath("//h1[text()='Update Profile']");
    public static By getProfileUpdatedSentence(){
        return profileUpdatedSentence;
    }
    //methods
    public void updateInfo(String firstname,String lastname,String address,String city,String state,String zipcode,String phone){
        driver.findElement(firstNameField).sendKeys(firstname);
        driver.findElement(lastNameField).sendKeys(lastname);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(zipCodeField).sendKeys(zipcode);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(updateProfileButton).click();
    }



}
