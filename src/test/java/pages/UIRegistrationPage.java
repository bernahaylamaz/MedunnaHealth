package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UIRegistrationPage {

    public UIRegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public  WebElement lastName;

    @FindBy(id = "username")
    public  WebElement username;

    @FindBy(id = "email")
    public  WebElement email;

    @FindBy(id = "firstPassword")
    public  WebElement firstPassword;

    @FindBy(id = "secondPassword")
    public  WebElement secondPassword;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement registrationButton;

    @FindBy(className="btn btn-primary")
    public WebElement succeTMoastCont;

}
