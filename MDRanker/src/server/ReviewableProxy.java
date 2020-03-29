package server;

import java.util.HashMap;
import java.util.Vector;

import server.reviewables.*;

public class ReviewableProxy {
	
	public ReviewableProxy () {
		
	}
	
	public Vector <HashMap<String, String>> buildAll (String request) {
		
		Vector <HashMap<String, String>> result = null;
		
		switch (request) {
		case "doctor" : result = Doctor.fetchAll(); break;
		case "hospital" : result = Hospital.fetchAll(); break;
		}
		
		return result;
	} 
	
	public Vector <HashMap<String, String>> fetchAllOfType (String table,String field) {
		Vector <HashMap<String, String>> result = null;
		
		switch (table) {
		case "doctor" : result = Doctor.fetchAllOfType(field); break;
		case "hospital" : result = Hospital.fetchAllOfType(field); break;
		}
		
		return result;
	}
	
	
}
