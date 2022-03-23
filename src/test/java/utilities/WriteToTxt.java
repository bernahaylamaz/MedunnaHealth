package utilities;

import pojos.Appointment;

import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriteToTxt {



    public static void saveRegistrantData(Registrant registrant){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void saveAppointData(Appointment appointment){

        try{

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment +"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }



    public static void saveRegistrantData(List<Object> SSNIds){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for(Object eachSSN: SSNIds) {
                writer.append(eachSSN + ",\n");
            }

            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void saveAppointmentDataDB(List<Object> AppIDs){
        try{
            //src/test/resources/testdata/DatabaseAppointmentsData.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_appointments_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for(Object eachID: AppIDs) {
                writer.append(eachID + ",\n");
            }

            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }


    public static void saveRegistrantData(Registrant [] registrants){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_all_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            for(int i=0; i< registrants.length;i++) {
                writer.append(registrants[i].getFirstName()+","+ registrants[i].getLastName()+","+registrants[i].getSsn()+","+ registrants[i].getLogin()+
                        ","+ registrants[i].getId()+","+registrants[i].getEmail()+ "\n");
            }

            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void savePhysiciansDataDB(List<Object> PhysicianIDs){
        try{
            //src/test/resources/testdata/DatabaseAppointmentsData.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_physician_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for(Object eachID: PhysicianIDs) {
                writer.append(eachID + ",\n");
            }

            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void DB_Patient_All_info(List<Object> allPatient_info){
        try{
            //src/test/resources/testdata/DatabaseAppointmentsData.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_patient_info"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for(Object eachID: allPatient_info) {
                writer.append(eachID + ",\n");
            }

            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }
}