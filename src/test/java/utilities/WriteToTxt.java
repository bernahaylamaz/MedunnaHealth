package utilities;

import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTxt {



    public static void saveRegistrantData(Registrant registrant){



        try{




            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrantFile"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }




}