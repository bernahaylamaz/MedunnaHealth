package utilities;

import pojos.Appointment;
import pojos.Appointment_API;
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

public static void saveAppointmentAPIData(String fileName, Appointment_API[] appointment_apis) {
    try {
        FileWriter fileWriter = new FileWriter(fileName, false);
        BufferedWriter writer = new BufferedWriter(fileWriter);


        for (int i = 0; i < appointment_apis.length; i++) {
            if (appointment_apis[i].getPatient() != null) {//to ignore the null ones
                writer.append(appointment_apis[i].getPatient().getFirstName() + ","
                        + appointment_apis[i].getPatient().getLastName() + ","
                        + appointment_apis[i].getPatient().getId()+ ","
                        + appointment_apis[i].getStartDate()+ ","
                        + appointment_apis[i].getEndDate()+ ","
                        + appointment_apis[i].getStatus()+",");
                if (appointment_apis[i].getPatient().getUser() != null) {//to ignore the null ones
                    writer.append(appointment_apis[i].getPatient().getUser().getSsn() + "\n");
                }else {
                    writer.append("\n");
                }
            }
        }


        writer.close();
       //?? Registrant registrant1 = new Registrant();

    } catch (Exception e) {
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

}