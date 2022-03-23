package stepdefinitions.ui_steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class View_Edit_Impatients_by_Physician {

    View_Edit_Impatients_by_Physician view_edit_impatients_by_physician = new View_Edit_Impatients_by_Physician();


    @Given("Physician Go to Medunna web site")
    public void physician_go_to_medunna_web_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Given("Physician Navigate and sign in with doctor credentials with username {string} and {string}")
    public void physician_navigate_and_sign_in_with_doctor_credentials_with_username_and(String username, String password) {

    }
    @Given("Physician Click on My Pages tab and choose My Patients")
    public void physician_click_on_my_pages_tab_and_choose_my_patients() {

    }
    @Then("Physician verify patient info")
    public void physician_verify_patient_info() {

    }

}
