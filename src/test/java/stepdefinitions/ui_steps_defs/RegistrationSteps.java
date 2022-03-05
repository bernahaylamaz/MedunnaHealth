package stepdefinitions.ui_steps_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class RegistrationSteps {

    Registrant registrant = new Registrant();//SAVE DATA AND REUSE DATA
    Faker faker = new Faker();
    RegistrationPage rp = new RegistrationPage();//INITIALIZED WEBELEMENTS


    @Given("user provides ssn {string}")
    public void user_provides_ssn(String ssn) {

        ssn = faker.idNumber().ssnValid();
        registrant.setSsn(ssn);
        Driver.waitAndSendText(rp.ssnTextBox,ssn);


    }
    @Given("user sends firstname and lastname {string} and {string}")
    public void user_sends_firstname_and_lastname_and(String firstname, String lastname) {

        firstname = faker.name().firstName();
        lastname = faker.name().lastName();

        registrant.setFirstname(firstname);
        registrant.setLastname(lastname);

        Driver.waitAndSendText(rp.firstnameTextBox,firstname);
        Driver.waitAndSendText(rp.lastnameTextBox,lastname);


    }
    @Then("user provides username {string}")
    public void user_provides_username(String username) {
        username = registrant.getFirstname() + registrant.getLastname();
        registrant.setUsername(username);
        Driver.waitAndSendText(rp.usernameTextBox,username);

    }
    @Then("user provides email as {string}")
    public void user_provides_email_as(String email) {

        email = faker.internet().emailAddress();
        registrant.setEmail(email);
        Driver.waitAndSendText(rp.emailTextbox,email);
    }
    @Then("user provides password {string}")
    public void user_provides_password(String password) {

        password = faker.internet().password(8,20, true,true);
        registrant.setPassword(password);
        Driver.waitAndSendText(rp.firstPasswordTextBox,password);
        Driver.waitAndSendText(rp.newPasswordTextBox,password);
    }
    @Then("user registers and validates data generation")
    public void user_registers_and_validates_data_generation() {
        Driver.waitAndClick(rp.registerButton);
        Assert.assertTrue(Driver.waitForVisibility(rp.successMessageToastContainer, 5).isDisplayed());
    }
    @Then("user sets the data in correspondent files")
    public void user_sets_the_data_in_correspondent_files() {

        saveRegistrantData(registrant);
    }

}