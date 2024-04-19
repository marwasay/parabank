package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    // elements
    private By userNameField = By.xpath("//b[text()='Username']");
    private By PasswordField = By.xpath("//b[text()='Password']");
    private By LoginButton = By.xpath("//input[@value=\"Log In\"]");
    private By registerButton = By.xpath("//a[text()=\"Register\"]");
    private static By wordError = By.xpath("//h1[text()='Error!']");

    public static By getWordError() {
        return wordError;
    }


    //methods
    public HomePage login(String username, String password) {
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(PasswordField).sendKeys(password);
        driver.findElement(LoginButton).click();
        return new HomePage(driver);
    }

    public RegistrationPage accessToRegistrationPage() {
        driver.findElement(registerButton).click();
        return new RegistrationPage(driver);
    }
}
