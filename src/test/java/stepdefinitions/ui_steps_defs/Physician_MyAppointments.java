package stepdefinitions.ui_steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.PhysicianPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import static utilities.DateUtils.getDate;

public class Physician_MyAppointments {

    LoginPage loginPage = new LoginPage();
    PhysicianPage physicianPage = new PhysicianPage();

    @Given("Go to Medunna web site")
    public void go_to_medunna_web_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }

    @Given("Navigate and sign in with doctor credentials with username {string} and {string}")
    public void navigate_and_sign_in_with_doctor_credentials_with_username_and(String username, String password) {
        loginPage.loginDropdown.click();
        loginPage.signInButton.click();
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();

    }

    @Given("Click on My Pages tab and choose My Appointments")
    public void click_on_my_pages_tab_and_choose_my_appointments() throws ParseException {
        Driver.waitAndClick(physicianPage.myPages);
        Driver.waitAndClick(physicianPage.myAppointments);
        LocalDateTime ldt = LocalDateTime.now();
        String fromDate = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(ldt);
        System.out.println(fromDate);
        //System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(ldt));
        Driver.waitAndSendText(physicianPage.fromDate, fromDate);
        Driver.waitAndSendText(physicianPage.toDate, "03/20/2022");

    }

    @Then("Verify that Physician can see the appointments list and time slots on My Appointments")
    public void verify_that_physician_can_see_the_appointments_list_and_time_slots_on_my_appointments() {
        String appDateTime="20/03/2022 20:00";
        String appDateTimeActual=physicianPage.appDateTime.getText();
        System.out.printf(appDateTime);
        System.out.println(appDateTimeActual);

        Assert.assertEquals(appDateTime,appDateTimeActual);
        //check the existing appointments....
    }

}
