package server;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.function.Consumer;



import server.reviewables.Doctor;

public class DoctorReview extends Review{

	private Doctor doctor;
	
	public DoctorReview(String doctorName, int appointmentNum, Date appointmentDate, int rating, String review) throws RemoteException {
		super(rating, review, appointmentDate, appointmentNum);
		// Connect to MongoDB database
		// Check if doctor exists
		

		
		// Assign values
		
		// Close connection
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean verify() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean verify(Doctor doctor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	

	
	


}
