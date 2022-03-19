package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorMyAppointment {

    public DoctorMyAppointment(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myPages;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myAppointments;

    @FindBy(id = "appointment-heading")
    public WebElement textAppointment;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[13]/div/a")
    public WebElement editButton;


    @FindBy(xpath = "//*[@id=\"appointment-anamnesis\"]")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@id=\"appointment-treatment\"]")
    public WebElement treatment;

    @FindBy(xpath = "//*[@id=\"appointment-diagnosis\"]")
    public  WebElement diagnosis;

    @FindBy(id = "save-entity")
    public  WebElement saveButton;

    @FindBy(id = "prescriptionLabel")
    public WebElement prescriptionLabel;

    @FindBy(id = "descriptionLabel")
    public  WebElement descriptionLabel;

    @FindBy(xpath = "//*[@id=\"statusLabel\"]")
    public  WebElement status;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div/div[1]/a")
    public  WebElement mayRequestButton;

    @FindBy(xpath = "//*[@id=\"c-test-item-heading\"]")
    public WebElement verifyTestItems;

    @FindBy(id = "1401")
    public WebElement glucose;

    @FindBy(id = "1402")
    public WebElement urea;

    @FindBy(id = "1403")
    public  WebElement creatinine;

    @FindBy(id = "1404")
    public  WebElement sodium;

    @FindBy(id = "save-entity")
    public WebElement save;






}