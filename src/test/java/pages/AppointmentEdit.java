package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentEdit {

    public AppointmentEdit(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="account-menu")
    public WebElement loginDropdown;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[3]/button[2]/span")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancel;

    @FindBy(xpath = "//*[text()='Remember me']")
    public WebElement rememberMe;



}
