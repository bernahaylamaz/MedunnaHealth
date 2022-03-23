package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.createConnection;
import static utilities.ReadTxt.getAppIDs;
import static utilities.ReadTxt.getPhysiciansIDs;
import static utilities.WriteToTxt.saveAppointmentDataDB;
import static utilities.WriteToTxt.savePhysiciansDataDB;

public class DB_Physician_Steps {

    List<Object> allPhysicianIds;

    @Given("User sends the physician query {string} to DB with column names {string}")
    public void user_sends_the_physician_query_to_db_with_column_names(String query, String columnName) {

        createConnection(ConfigurationReader.getProperty("db_credentials_url"),
                ConfigurationReader.getProperty("db_username"),
                ConfigurationReader.getProperty("db_password"));

        allPhysicianIds = DatabaseUtility.getColumnData(query, columnName);
        System.out.println(allPhysicianIds);


    }
    @Given("User saves physician  data in correspondent files")
    public void user_saves_physician_data_in_correspondent_files() {

        savePhysiciansDataDB(allPhysicianIds);
    }
    @Then("User validates the physician data")
    public void user_validates_the_physician_data() {

        List<String> expectedPhysicianIDs = new ArrayList<>();
        expectedPhysicianIDs.add("3651");
        expectedPhysicianIDs.add("3653");
        expectedPhysicianIDs.add("10509");
        System.out.println(expectedPhysicianIDs);


        List<String> actualPhysicianIDs = getPhysiciansIDs();
        Assert.assertTrue(actualPhysicianIDs.containsAll(expectedPhysicianIDs));



    }


}
