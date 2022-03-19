package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.DoctorMyAppointment;
import utilities.ConfigurationReader;
import utilities.Driver;
import java.text.ParseException;
public class UIDoctor_My_Appointment {
    LoginPage loginPage = new LoginPage();
    DoctorMyAppointment doctorMyAppointment = new DoctorMyAppointment();
//    @Given("Go to Medunna web site")
//    public void go_to_medunna_web_site() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
//    }
//    @Given("Navigate and sign in with doctor credentials with username {string} and {string}")
//    public void navigate_and_sign_in_with_doctor_credentials_with_username_and(String username, String password) {
//        loginPage.loginDropdown.click();
//        loginPage.signInButton.click();
//        loginPage.username.sendKeys(username);
//        loginPage.password.sendKeys(password);
//        loginPage.loginButton.click();
//    }
//    @Given("Click on My Pages tab and choose My Appointments")
//    public void click_on_my_pages_tab_and_choose_my_appointments() throws ParseException {
//        Driver.waitAndClick(doctorMyAppointment.myPages);
//        Driver.waitAndClick(doctorMyAppointment.myAppointments);
//    }
    @Then("Verify that Physician can click edit button")
    public void verify_that_physician_can_click_edit_button() {
    }
    @Then("Physician Verify that user\\(doctor) can see patient id, start date, end date, status")
    public void physician_verify_that_user_doctor_can_see_patient_id_start_date_end_date_status() {
        Assert.assertTrue(doctorMyAppointment.textAppointment.isDisplayed());
    }
    @Given("Physician can click edit button")
    public void physician_can_click_edit_button() {
        Driver.waitAndClick(doctorMyAppointment.editButton);
    }
    @Then("Physician type in Anamnesis {string}, Treatment {string} and Diagnosis {string} as required fields and click save button")
    public void physician_type_in_anamnesis_treatment_and_diagnosis_as_required_fields_and_click_save_button(String anamnesis, String treatment, String diagnosis) {
        Driver.waitAndSendText(doctorMyAppointment.anamnesis,anamnesis);
        Driver.waitAndSendText(doctorMyAppointment.treatment,treatment);
        Driver.waitAndSendText(doctorMyAppointment.diagnosis,diagnosis);
        Driver.waitAndClick(doctorMyAppointment.saveButton);
    }
    @Then("Physician Verify Prescription and description")
    public void physician_verify_prescription_and_description() {
        Driver.wait(1);
        Assert.assertTrue(doctorMyAppointment.prescriptionLabel.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(doctorMyAppointment.descriptionLabel.isDisplayed());
    }
    @Then("Physician verify status")
    public void physician_verify_status() {
        Driver.wait(1);
        Assert.assertTrue(doctorMyAppointment.status.isDisplayed());
    }
    @Given("Physician Click on Request test button")
    public void physician_click_on_request_test_button() {
        Driver.waitAndClick(doctorMyAppointment.mayRequestButton);
        Driver.wait(1);
    }
    @Then("Physician verify Test Items")
    public void physician_verify_test_items() {
        Driver.wait(1);
        Assert.assertTrue(doctorMyAppointment.verifyTestItems.isDisplayed());
        Driver.wait(1);
    }
    @Then("Physician checkmark Glucose, Urea, Creatinine, Sodium")
    public void physician_checkmark_glucose_urea_creatinine_sodium() {
        Driver.waitAndClick(doctorMyAppointment.glucose);
        Driver.waitAndClick(doctorMyAppointment.urea);
        Driver.waitAndClick(doctorMyAppointment.creatinine);
        Driver.waitAndClick(doctorMyAppointment.sodium);
    }
    @Then("save")
    public void save() {
        Driver.waitAndClick(doctorMyAppointment.save);
    }
}
