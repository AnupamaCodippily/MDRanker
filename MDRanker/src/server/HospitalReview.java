package server;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.function.Consumer;


import server.reviewables.Hospital;


public class HospitalReview extends Review{

	private static final long serialVersionUID = 1L;
	private String hospitalName;
	
	private Hospital hospital;
	
	protected HospitalReview(int appointmentNum,String review,Date appointmentDate,int rating ,String hospitalName) throws RemoteException {
		super(rating, review, appointmentDate, rating);
			
		// Connect to MongoDB database
		
		// Check if doctor exists
		
		// Assign values
		
		// Close connection
		
	}

	@Override
	public void save() {

		
	}

	@Override
	public boolean verify() {
      
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
