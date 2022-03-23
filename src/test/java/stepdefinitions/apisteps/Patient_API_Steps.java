package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import pojos.Patient_Info;
import utilities.ConfigurationReader;

import java.io.IOException;

import static Hooks.Hooks.spec;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;

public class Patient_API_Steps {
Response response;
Patient_Info [] patientInfo ;

    @Given("user sets the necessary path params for patient")
    public void user_sets_the_necessary_path_params_for_patient() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "patients");

    }
    @Given("user sends the get request for patient data")
    public void user_sends_the_get_request_for_patient_data() {
        response = getRequest(generateToken(), ConfigurationReader.getProperty("patients_endpoint"));
        //response.prettyPrint();

    }
    @Given("user deserializes patient data to Java")
    public void user_deserializes_patient_data_to_java() throws IOException {

        ObjectMapper obj = new ObjectMapper();
       // patientInfo = obj.readValue(response.asString(), Patient_Info[].class);
        response.prettyPrint();
        System.out.println("#########");
        System.out.println("size: " + patientInfo.length);
        for (int i = 0; i < patientInfo.length; i++) {
            if (patientInfo[i].getUser() != null) {//to ignore the null ones
                System.out.println("Name: " + patientInfo[i].getFirstName());
                System.out.println("LastName: " + patientInfo[i].getLastname());
                System.out.println("Ssn: " + patientInfo[i].getSsn());


            }

        }
    }
    @Given("user saves the users patient data to correspondent files")
    public void user_saves_the_users_patient_data_to_correspondent_files () {


    }
    @Then("user validates api patient data {string}")
    public void user_validates_api_patient_data (String string){


    }
}