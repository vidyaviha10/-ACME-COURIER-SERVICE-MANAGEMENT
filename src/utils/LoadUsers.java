package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoadUsers {
	
	public static Map<String,String> users = new HashMap<>();
	public static Map<String,String> roles = new HashMap<>();
	public LoadUsers()
	{
		
	        String csvFile = "users.csv";
	        String line = "";
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	        	String[] data = null;
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                data = line.split(cvsSplitBy);

	                System.out.println("UserName: "+data[0]+" password: "+data[1]+" role: "+data[2]);
	                
	                users.put(data[0], data[1]);
	                roles.put(data[0], data[2]);

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	public static void main(String a[])
	{
		System.out.println(new File("").getAbsolutePath());
	}

}
