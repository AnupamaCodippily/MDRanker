package server;

import java.util.HashMap;

public abstract class Reviewable {


	private boolean isVerified = false;
	private  HashMap <String,HashMap<String, String>>  properties;
	
	public Reviewable () {
	}
	
	boolean verify () {
		
		
		
		return false;
	}
	
	public abstract boolean save();
	
//	public abstract HashMap<String, String> _hashMap();

	public  HashMap <String,HashMap<String, String>>  getProperties() {
		return properties;
	}

	public void setProperties( HashMap <String,HashMap<String, String>>  properties) {
		this.properties = properties;
	}

	public boolean checkVerified() {
		return isVerified;
	}

	public void setVerifiedStatus(boolean isVerified) {
		this.isVerified = isVerified;
	}


}
