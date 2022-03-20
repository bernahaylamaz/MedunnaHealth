package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import pages.PasswordPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Password_Editing_StepDefs {

        PasswordPage passwordPage = new PasswordPage();

        @Given("user goes to home page")
        public void user_goes_to_home_page() {
         Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_login_url"));
        }

        @Then("user click Sign in icon")
        public void user_click_sign_in_icon() {
            passwordPage.signInIcon.click();
        }

       @Then("user clik sign in button")
        public void user_clik_sign_in_button() {
           passwordPage.signInButton.click();
        }

        @Then("user enter Username")
        public void user_enter_username() {
            passwordPage.userName.sendKeys(ConfigurationReader.getProperty("passworUserdName"));
        }

        @Then("user enter Password")
        public void user_enter_password() {
           passwordPage.password.sendKeys(ConfigurationReader.getProperty("password1"));
        }

        @Then("user click Sign in")
        public void user_click_sign_in() {
           passwordPage.regSignIn.click();
        }

        @Then("user click username")
        public void user_click_username() {
            passwordPage.annaClara.click();
        }

        @Then("user enter password button")
        public void user_enter_password_button() {
            passwordPage.accountPassword.click();
            Driver.wait(3);
        }

        @Then("user enter current password")
        public void user_enter_current_password() {
            passwordPage.currentPassword.sendKeys(ConfigurationReader.getProperty("password1"));
        }

        @Then("user enter new password")
        public void user_enter_new_password() {
            passwordPage.newPassword.sendKeys("Techproed2022.");
        }

        @Then("user enter new password again")
        public void user_enter_new_password_again() {
            passwordPage.confirmPassword.sendKeys("Techproed2022.");
        }

        @Then("user click save button")
        public void user_click_save_button() {
            passwordPage.saveButton.click();
        }


}
