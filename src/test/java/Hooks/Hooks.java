package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.DatabaseUtility.createConnection;

public class Hooks {
    @Before
    public void setUp() {
    }


    public static RequestSpecification spec;

    @Before(value = "@API_view_patient_info")
    public void setup() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
    }


    @Before(order = 1, value = "@View_Impatient_by_Physician")
    public void navigateToRegistrationPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));
    }

//UIRegistration

    @Before(order=0,value = "@DBUsers")
    public void createNewDBConnection() {
        createConnection(ConfigurationReader.getProperty("db_credentials_url"),
                ConfigurationReader.getProperty("db_username"),
                ConfigurationReader.getProperty("db_password"));
    }

   // @Before(order = 1, value = "@DBTest")
    //public void connectionDB() {
   // }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }
}