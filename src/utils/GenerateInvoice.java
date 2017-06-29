package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateInvoice {

    public static ArrayList<String[]> data = new ArrayList<>();
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ";";
    
    public GenerateInvoice(int a)
    {
    	
    }

    public GenerateInvoice() {
    	System.out.println("*********************************************** constructor");
        String csvFile = "invoice.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] tempdata = line.split(cvsSplitBy);

                GenerateInvoice.data.add(tempdata);
                System.out.println("tempdata: " + tempdata);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean updateData() {


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("invoice.csv");

            // Add a new line separator after the header

System.out.println("GenerateInvoice.data:  "+GenerateInvoice.data.size());
            // Write a new student object list to the CSV file
            for (String temp[] : GenerateInvoice.data) {
                fileWriter.append(temp[0]);// invoice id
                fileWriter.append(GenerateInvoice.COMMA_DELIMITER);
                fileWriter.append(temp[1]);// pickup client
                fileWriter.append(GenerateInvoice.COMMA_DELIMITER);
                fileWriter.append(temp[2]);// drop client address
                fileWriter.append(GenerateInvoice.COMMA_DELIMITER);
                fileWriter.append(temp[3]);// current date
                fileWriter.append(GenerateInvoice.COMMA_DELIMITER);
                fileWriter.append(temp[4]);// ticket id
                fileWriter.append(GenerateInvoice.NEW_LINE_SEPARATOR);
            }


            System.out.println("CSV file was created successfully !!!");
            return true;

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
            return false;
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}
