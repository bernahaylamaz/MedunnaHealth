package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.createConnection;
import static utilities.ReadTxt.getAllPatientInfo;
import static utilities.ReadTxt.getPhysiciansIDs;
import static utilities.WriteToTxt.DB_Patient_All_info;
import static utilities.WriteToTxt.savePhysiciansDataDB;

public class DB_Patient_All_info_steps {

    List<Object> allPatient_info;

    @Given("Admin sends the patient query {string} to DB with column names {string}")
    public void admin_sends_the_patient_query_to_db_with_column_names(String query, String columnName) {

        createConnection(ConfigurationReader.getProperty("db_credentials_url"),
                ConfigurationReader.getProperty("db_username"),
                ConfigurationReader.getProperty("db_password"));

        allPatient_info = DatabaseUtility.getColumnData(query, columnName);
        System.out.println(allPatient_info);


    }


    @Given("Admin can edit all patient information")
    public void admin_can_edit_all_patient_information() {

        DB_Patient_All_info(allPatient_info);


    }
    @Then("Admin validates the all patient info")
    public void admin_validates_the_all_patient_info() {

        List<String> actualPatientInfo = getAllPatientInfo();

        //System.out.println(actualPatientInfo);

        List<String> expectedPatientInfo = new ArrayList<>();

        expectedPatientInfo.add("BERK");
        System.out.println(expectedPatientInfo);
        Assert.assertTrue(actualPatientInfo.containsAll(expectedPatientInfo));




    }

}
