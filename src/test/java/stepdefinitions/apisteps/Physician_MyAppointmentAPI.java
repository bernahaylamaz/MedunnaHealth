package stepdefinitions.apisteps;

import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import utilities.ConfigurationReader;
import io.restassured.response.Response;

import static Hooks.Hooks.spec;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;

public class Physician_MyAppointmentAPI {
    Response response;

    @Given("user sets the necessary path params for appointments")
    public void user_sets_the_necessary_path_params_for_appointments() {
        //spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "appointments");
    }

    @Given("user sends the get request for appointment data")
    public void user_sends_the_get_request_for_appointment_data() {
        response = getRequest(generateToken(), ConfigurationReader.getProperty("appointments_endpoint"));
        response.prettyPrint();
    }

    @Given("user deserializes appointment data to Java")
    public void user_deserializes_appointment_data_to_java() {

    }

    @Given("user saves the users appointment data to correspondent files")
    public void user_saves_the_users_appointment_data_to_correspondent_files() {

    }

}
