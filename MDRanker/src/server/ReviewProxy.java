package server;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

import server.reviews.*;

public class ReviewProxy {
	
	public static Vector<HashMap<String, String>> fetchAll(String table) {
		Vector<HashMap<String, String>> results = null;
		
		switch (table) {
		case "doctor" : results = DoctorReview.fetchAll(); break;
		case "hospital" : results = HospitalReview.fetchAll(); break;
		}
		
		return results;
	}
	
	public static Vector<HashMap<String, String>> fetchAllOfType(String table, String type) {
		Vector<HashMap<String, String>> results = null;
		
		switch (table) {
		case "doctor" : results = DoctorReview.fetchAllOfType(type); break;
		case "hospital" : results = HospitalReview.fetchAllOfType(type); break;
		}
		
		return results;
	}
	
	
	// Under Construction
	public static Vector<HashMap<String, String>> fetchAllByQuery(String column, String table, String field, String fieldValue) {
		Vector<HashMap<String, String>> results = null;
		switch (table) {
		case "doctor" : results = DoctorReview.fetchAll(); break;
		case "hospital" : results = HospitalReview.fetchAll(); break;
		}
		
		return results;
	}
	
}
