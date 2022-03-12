package stepdefinitions.ui_steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.PhysicianMyAppointment;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.text.ParseException;

public class UIPhysician_My_Appointment {

    LoginPage loginPage = new LoginPage();

    PhysicianMyAppointment physicianMyAppointment = new PhysicianMyAppointment();



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
        Driver.waitAndClick(physicianMyAppointment.myPages);
        Driver.waitAndClick(physicianMyAppointment.myAppointments);
    }

    @Then("Verify that Physician can click edit button")
    public void verify_that_physician_can_click_edit_button() {



    }

    @Then("Physician Verify that user\\(doctor) can see patient id, start date, end date, status")
    public void physician_verify_that_user_doctor_can_see_patient_id_start_date_end_date_status() {

        Assert.assertTrue(physicianMyAppointment.textAppointment.isDisplayed());
    }

    @Given("Physician can click edit button")
    public void physician_can_click_edit_button() {
        Driver.waitAndClick(physicianMyAppointment.editButton);


    }

    @Then("Physician type in Anamnesis {string}, Treatment {string} and Diagnosis {string} as required fields and click save button")
    public void physician_type_in_anamnesis_treatment_and_diagnosis_as_required_fields_and_click_save_button(String anamnesis, String treatment, String diagnosis) {

        Driver.waitAndSendText(physicianMyAppointment.anamnesis,anamnesis);
        Driver.waitAndSendText(physicianMyAppointment.treatment,treatment);
        Driver.waitAndSendText(physicianMyAppointment.diagnosis,diagnosis);
        Driver.waitAndClick(physicianMyAppointment.saveButton);
    }


    @Then("Physician Verify Prescription and description")
    public void physician_verify_prescription_and_description() {

        Assert.assertTrue(physicianMyAppointment.prescriptionLabel.isDisplayed());
        Assert.assertTrue(physicianMyAppointment.descriptionLabel.isDisplayed());
    }


    @Then("Physician verify status")
    public void physician_verify_status() {
       Assert.assertTrue(physicianMyAppointment.status.isDisplayed());
    }


    @Given("Physician Click on Request test button")
    public void physician_click_on_request_test_button() {
       Driver.waitAndClick(physicianMyAppointment.mayRequestButton);
       Driver.wait(2);
    }
    @Then("Physician verify Test Items")
    public void physician_verify_test_items() {
       Assert.assertTrue(physicianMyAppointment.verifyTestItems.isDisplayed());
        Driver.wait(2);
    }

    @Then("Physician checkmark Glucose, Urea, Creatinine, Sodium")
    public void physician_checkmark_glucose_urea_creatinine_sodium() {
        Driver.waitAndClick(physicianMyAppointment.glucose);
        Driver.waitAndClick(physicianMyAppointment.urea);
        Driver.waitAndClick(physicianMyAppointment.creatinine);
        Driver.waitAndClick(physicianMyAppointment.sodium);


    }
    @Then("save")
    public void save() {
       Driver.waitAndClick(physicianMyAppointment.save);
    }


}
