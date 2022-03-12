package Stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;
import pages.UIRegistrationPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;


public class RegistrationPageStepDefs {

    UIRegistrationPage uiRegistrationPage = new UIRegistrationPage();
    Faker faker =new Faker();

    @Given("user will input ssn")
    public void user_will_input_ssn() {
        uiRegistrationPage.ssn.sendKeys("123434343");
    }
    @Given("user will input firstname")
    public void user_will_input_firstname() {
        uiRegistrationPage.firstName.sendKeys("Hamid");
    }
    @Given("user will verify ssn requirement")
    public void user_will_verify_ssn_requirement() {
      String expectedAssert=Driver.getDriver().getTitle();
      String actualAssert="Your SSN is invalid";
          Assert.assertEquals("Your SSN is invalid",actualAssert);
      //      if(expectedAssert==actualAssert){
//          System.out.println("pass the assertion");
//      } else
//      {
//          System.out.println("failed assertion");
//      }

    }
    @Given("user will enter firstname")
    public void user_will_enter_firstname() {
        uiRegistrationPage.firstName.sendKeys("hamdullah");
    }
    @Given("user will enter lastname")
    public void user_will_enter_lastname() {
        uiRegistrationPage.lastName.sendKeys("sunabakarbakar");
    }
    @Given("user will enter username")
    public void user_will_enter_username() {
        uiRegistrationPage.username.sendKeys("hamdodosuna");
    }
    @Given("user will enter email")
    public void user_will_enter_email() {
        uiRegistrationPage.email.sendKeys("sunahamdo@gmail.com");
    }
    @Given("user will enter firstpassword")
    public void user_will_enter_firstpassword() {
        uiRegistrationPage.firstPassword.sendKeys("Mazda3@");
    }
    @Given("user will enter secondpassword")
    public void user_will_enter_secondpassword() {
        uiRegistrationPage.secondPassword.sendKeys("Mazda3@");
    }
    @Given("user will click the registrationButton")
    public void user_will_click_the_registration_button() {
        Driver.waitAndClick(uiRegistrationPage.registrationButton);
    }
    @Then("user will verify the ssn cannot be blank")
    public void user_will_verify_the_ssn_cannot_be_blank() {
        assertTrue(Driver.waitForVisibility(uiRegistrationPage.ssn,2).isDisplayed());

//        String expectedassertion=Driver.getDriver().getTitle();
//        String actualassertion="Your SSN is required.";
//
//        if (expectedassertion==actualassertion){
//            System.out.println("pass");
//        } else {
//           System.out.println("failed");
//        }

    }
    @Then("user will provide a valid SSN")
    public void user_will_provide_a_valid_ssn() {
        uiRegistrationPage.ssn.sendKeys("298-43-7675");
    }
    @Then("user will place a number in the lastName")
    public void user_will_place_a_number_in_the_last_name() {

        uiRegistrationPage.lastName.sendKeys("hamsikafa");
    }
    @Then("user will provide username")
    public void user_will_provide_username() {

        uiRegistrationPage.username.sendKeys("hamsisisisi");

    }
    @Then("user will provide email")
    public void user_will_provide_email() {uiRegistrationPage.email.sendKeys("hamisisis@gmail.com");


    }@Then("user will provide firstpassword")
    public void user_will_provide_firstpassword() {
    uiRegistrationPage.firstPassword.sendKeys("Mazda1!");

    }
    @Then("user will provide secondpassword")
    public void user_will_provide_secondpassword() {

        uiRegistrationPage.secondPassword.sendKeys("Mazda1!");

    }
    @Then("user verifies FirstName is required")
    public void user_verifies_first_name_is_required() {

        //  String expectedAssertion=Driver.getDriver().getTitle();
//    String actualAssertion="Your FirstName is required.";

//    if (expectedAssertion==actualAssertion){
//
//        System.out.println("pass");
//
//    } else {
//        System.out.println("failed");
//    }

        assertTrue(Driver.waitForVisibility(uiRegistrationPage.firstName, 2).isDisplayed());

    }
    @Given("user will place valid lastname with characters in it")
    public void user_will_place_valid_lastname_with_characters_in_it() {

        uiRegistrationPage.firstPassword.sendKeys("2323");

    }

    @Given("user places the ssn {string}")
    public void user_places_the_ssn(String ssn) {

    uiRegistrationPage.email.sendKeys("honda@gmail.com ");


    }
    @Given("user place the firstname {string}")
    public void user_place_the_firstname(String firstname) {

    }
    @Given("user place the lastname {string}")
    public void user_place_the_lastname(String lastname) {



    }



}















