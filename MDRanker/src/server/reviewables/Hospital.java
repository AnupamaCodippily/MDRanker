package server.reviewables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;

import server.utils.*;

import server.Location;
import server.Reviewable;

public class Hospital extends Reviewable{

	private  HashMap <String,HashMap<String, String>>  temporary_properties;
	
	public Hospital(HashMap <String, String> request) {
		super();
//		this.setVerifiedStatus(Database.verify(this));
//		if (checkVerified()) {
//			
//		}
	}


	public static Vector<HashMap<String, String>> fetchAll() {
		Connection connection = null;
		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>> ();

		String query = "SELECT * FROM hospitals";

        try {
        	connection = Database.getConnection();

        	Statement stmt=connection.createStatement();  
        	ResultSet resultSet = stmt.executeQuery(query);
        	
           
	        while(resultSet.next()) {
	
	        	String name = resultSet.getString("name");
	        	String location = resultSet.getString("location");
	        	String rating = Float.toString(resultSet.getFloat("rating")) ;
	   			HashMap <String, String> map = new HashMap<String, String> ();
	   			
	   			map.put("name",name );
	   			map.put("location",location);
	   			map.put("rating", rating);
	   			
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
	



	@Override
	public boolean save() {
		return false;
	}





	
	

}
