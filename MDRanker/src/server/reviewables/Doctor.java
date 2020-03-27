package server.reviewables;

import java.sql.*;
import java.util.HashMap;
import java.util.Vector;


import server.Reviewable;
import server.utils.Database;

public class Doctor extends Reviewable{
	
	public Doctor(HashMap<String, String> properties) {
//		super(properties);
		
	}

	private String specialization;
	
	public static void fetchAll_Specialization(){}
	
	
	
	// Fetches all records of Doctors
	
	public static Vector<HashMap<String, String>> fetchAll() {
		Connection connection = null;
		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>> ();

		String query = "SELECT * FROM doctors";

        try {
        	connection = Database.getConnection();

        	Statement stmt=connection.createStatement();  
        	ResultSet resultSet = stmt.executeQuery(query);
        	
           
	        while(resultSet.next()) {
	
	        	String name = resultSet.getString("name");
	        	String specialization = resultSet.getString("specialization");

	   			HashMap <String, String> map = new HashMap<String, String> ();
	   			
	   			map.put("name",name );
	   			map.put("specialization",specialization);
	   			
	   			vector.add(map);
	   		}	 
             
             
//           cursor.forEach(arg0);
           

        	 
        }catch (Exception ex) {
        	System.out.println("error fetching doctors from db");
        	ex.printStackTrace();
        } finally {
        	Database.closeDBConnection(connection);
        } 
        
		return vector;
	}


	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	
	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public HashMap<String, String> _hashMap() {
//		
//		if (this.checkVerified()) {
//			HashMap <String, String> map = new HashMap<String, String>();
//			this.getProperties().forEach((key, value) -> {
//				
//				map.put(key, value);
//				
//			} );
//			return map;
//		}
//		
//		return null;
//		
//
//	}
	

}
