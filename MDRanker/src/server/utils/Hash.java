package server.utils;

import java.util.HashMap;

import server.Reviewable;

public  class Hash {
	public static  HashMap <String,HashMap<String, String>>  _hashMap(Reviewable reviewable) {
		
		if (reviewable.checkVerified()) {
			HashMap <String,HashMap<String, String>>  map = new  HashMap <String,HashMap<String, String>> ();
			reviewable.getProperties().forEach((key, value) -> {
				
				map.put(key, value);
				
			} );
			return map;
		}
		
		return null;
		

	}
}
