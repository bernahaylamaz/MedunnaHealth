package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianPage {

    public PhysicianPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myPages;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myAppointments;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id="toDate")
    public WebElement toDate;


    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div/div/table/tbody/tr/td[2]/span")
    public WebElement appDateTime;


//    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table")
//    public WebElement appTable;
}
