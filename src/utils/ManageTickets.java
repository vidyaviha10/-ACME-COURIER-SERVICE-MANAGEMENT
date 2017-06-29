package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import java.io.Writer;
import java.util.List;

public class ManageTickets {
	
	public static ArrayList<String[]> data = new ArrayList<>();
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String COMMA_DELIMITER = ";";

	public ManageTickets()
	{
		 String csvFile = "tickets.csv";
	        String line = "";
	        String cvsSplitBy = ";";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] tempdata = line.split(cvsSplitBy);

	               data.add(tempdata);
	               for(String temp:tempdata)
	               {
	            	   System.out.print(temp);
	               }
	               System.out.println();

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
public static boolean updateData() {
		

		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter("tickets.csv");

			//Add a new line separator after the header

			
			//Write a new student object list to the CSV file
			for (String temp[] : data) {
				fileWriter.append(temp[0]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[1]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[2]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[3]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[4]);
				
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[5]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[6]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[7]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[8]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[9]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[10]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[11]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[12]);
				
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[13]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[14]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[15]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[16]);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(temp[17]);
				fileWriter.append(NEW_LINE_SEPARATOR);
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
