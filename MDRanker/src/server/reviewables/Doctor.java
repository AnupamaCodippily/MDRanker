package server.reviewables;

import java.sql.*;
import java.util.HashMap;
import java.util.Vector;

import server.utils.Database;

public class Doctor {


	// Fetches all records of Doctors
	public static Vector<HashMap<String, String>> fetchAll() {
		Connection connection = null;
		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>> ();

		String query = "SELECT * FROM doctors";

        try {
        	ResultSet resultSet = Database.getResultSet(query);
	        while(resultSet.next()) {
	        	String name = resultSet.getString("name");
	        	String specialization = resultSet.getString("specialization");
	   			HashMap <String, String> map = new HashMap<String, String> ();
	   			map.put("name",name );
	   			map.put("specialization",specialization);
	   			vector.add(map);
	   		}	  	 
        }catch (Exception ex) {
        	System.out.println("error fetching doctors from db");
        	ex.printStackTrace();
        } 
		return vector;
	}


	public static Vector<HashMap<String, String>> fetchAllOfType(String field) {
		// TODO Auto-generated method stub
		return null;
	}


}
