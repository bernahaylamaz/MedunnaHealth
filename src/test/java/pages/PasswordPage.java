package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordPage {

    public PasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "account-menu")
    public WebElement signInIcon;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement regSignIn;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[1]")
    public WebElement annaClara;

    @FindBy(xpath = "//a[@href='/account/password']")
    public WebElement accountPassword;

    @FindBy(name = "currentPassword")
    public WebElement currentPassword;

    @FindBy(name = "newPassword")
    public WebElement newPassword;

    @FindBy(name = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
}
