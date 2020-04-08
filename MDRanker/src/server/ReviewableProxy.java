package server;

import java.util.HashMap;
import java.util.Vector;

import server.reviewables.*;
import server.reviews.DoctorReview;
import server.reviews.HospitalReview;

public class ReviewableProxy {
	
	public ReviewableProxy () {
		
	}
	
	public static Vector <HashMap<String, String>> buildAll (String request) {
		
		Vector <HashMap<String, String>> result = null;
		
		switch (request) {
		case "doctor" : result = Doctor.fetchAll(); break;
		case "hospital" : result = Hospital.fetchAll(); break;
		}
		
		return result;
	} 
	
	public static Vector <HashMap<String, String>> fetchAllOfType (String table,String field) {
		Vector <HashMap<String, String>> result = null;
		
		switch (table) {
		case "doctor" : result = Doctor.fetchAllOfType(field); break;
		case "hospital" : result = Hospital.fetchAllOfType(field); break;
		}
		
		return result;
	}
	// Under Construction
	public static Vector<HashMap<String, String>> fetchByQuery_OneCondition(String column, String table, String field, String fieldValue) {
		Vector<HashMap<String, String>> results = null;
		switch (table) {
		case "doctor" : results = DoctorReview.fetchAll(); break;
		case "hospital" : results = HospitalReview.fetchAll(); break;
		}
		
		return results;
	}
	
	
}
