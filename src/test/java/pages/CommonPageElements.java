package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPageElements {

    public CommonPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement Administration;

    @FindBy(xpath = "//*[@id='account-menu']/a")
    public WebElement logoutDropdown;

    @FindBy(xpath = "//*[@id='account-menu']/div/a[3]")
    public WebElement signOut;

}
