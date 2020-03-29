package server.reviews;

import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import server.utils.Database;

public class DoctorReview{

	public static Vector<HashMap<String, String>> fetchAll() {

		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>>();
		String query = "SELECT * FROM doctorReviews";
		
		try {
			
			ResultSet results = Database.getResultSet(query);
			
			while(results.next()) {
				
				HashMap<String, String> map = new HashMap<String, String>();
				
				map.put("name", results.getString("name"));
				map.put("rating", results.getInt("rating") + "");
				map.put("body", results.getString("review"));
				
				vector.add(map);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return vector;

	}

	public static Vector<HashMap<String, String>> fetchAllOfType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
