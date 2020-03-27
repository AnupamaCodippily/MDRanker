package server;

import java.util.HashMap;
import java.util.Vector;

import server.reviewables.*;

public class ReviewableFactory {
	
	public ReviewableFactory () {
		
	}
	
	public Vector <HashMap<String, String>> buildAll (String request) {
		
		Vector <HashMap<String, String>> result = null;
		String category =  request;
		
		switch (category) {
		case "doctor" : result = Doctor.fetchAll(); break;
		case "hospital" : result = Hospital.fetchAll(); break;
		}
		
		return result;
	} 
	
	
}
