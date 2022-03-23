package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class View_Impatient_by_Physician {

    public View_Impatient_by_Physician(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement loginDropdownn;

    @FindBy (xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id=\"username\"]")
    public WebElement username;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement loginButton;









}
