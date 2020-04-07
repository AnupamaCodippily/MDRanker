package server.reviewables;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;

import server.utils.Database;

public class Hospital {

	public Hospital(HashMap <String, String> request) {
		super();
	}
	public static Vector<HashMap<String, String>> fetchAll() {
		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>> ();
		String query = "SELECT * FROM hospitals";
        try {
        	ResultSet resultSet = Database.getResultSet(query);
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
	        
	        Database.closeConnection(resultSet);
        }catch (Exception ex) {
        	System.out.println("error fetching hospitals from db");
        	ex.printStackTrace();
        } 
		return vector;
	}

	public static Vector<HashMap<String, String>> fetchAllOfType(String field) {
		
		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>> ();
		String _field = "";
		String query = "SELECT "+ field +" FROM hospitals";

        try {
        	
        	ResultSet resultSet = Database.getResultSet(query);
        	
	        while(resultSet.next()) {
	
	        	String value = resultSet.getString(_field);
	   			HashMap <String, String> map = new HashMap<String, String> ();
	   			
	   			map.put(_field, value );
	   			
	   			vector.add(map);
	   		}	 
        	 
        }catch (Exception ex) {
        	System.out.println("error fetching hospitals from db");
        	ex.printStackTrace();
        }
		return vector;
	}
}
