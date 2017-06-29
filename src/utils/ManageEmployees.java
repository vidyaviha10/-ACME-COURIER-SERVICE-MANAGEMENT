package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManageEmployees {

    public static ArrayList<String[]> data = new ArrayList<>();
    public static ArrayList<String[]> driverData = new ArrayList<>();
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";

    public ManageEmployees() {
        String csvFile = "employeeData.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] tempdata = line.split(cvsSplitBy);

                ManageEmployees.data.add(tempdata);
                System.out.println("tempdata: " + tempdata);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        csvFile = "DriverAvailability.csv";
        line = "";
        cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] tempdata = line.split(cvsSplitBy);

                ManageEmployees.driverData.add(tempdata);
                System.out.println("tempdata: " + tempdata);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean updateData() {


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("employeeData.csv");

            // Add a new line separator after the header


            // Write a new student object list to the CSV file
            for (String temp[] : ManageEmployees.data) {
                fileWriter.append(temp[0]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[1]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[2]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[3]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[4]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[5]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[6]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[7]);
                fileWriter.append(ManageEmployees.NEW_LINE_SEPARATOR);


                if (temp[6].equals("Driver")) {
                    FileWriter fileWriter1 = new FileWriter("DriverAvailability.csv");
                    fileWriter1.append(temp[0]);
                    fileWriter1.append(ManageEmployees.COMMA_DELIMITER);
                    fileWriter1.append(temp[6]);
                    fileWriter1.append(ManageEmployees.COMMA_DELIMITER);
                    if (temp[7].equals("Inactive")) {
                        fileWriter1.append("unavailable");
                    } else {
                        fileWriter1.append("available");
                    }

                    fileWriter1.append(ManageEmployees.NEW_LINE_SEPARATOR);

                    fileWriter1.flush();
                    fileWriter1.close();
                }

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

    public static boolean updateDataDriver() {


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("DriverAvailability.csv");

            // Add a new line separator after the header


            // Write a new student object list to the CSV file
            for (String temp[] : ManageEmployees.driverData) {
                fileWriter.append(temp[0]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[1]);
                fileWriter.append(ManageEmployees.COMMA_DELIMITER);
                fileWriter.append(temp[2]);
                fileWriter.append(ManageEmployees.NEW_LINE_SEPARATOR);

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
