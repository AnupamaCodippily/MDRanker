package server;

import java.io.Serializable;
//import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public abstract class Review extends UnicastRemoteObject implements Serializable{

	private int rating;
	private String review;
	private int appointmentNum;
	private Date appointmentDate;
	protected boolean verifiedDoesExist = false;
	
	public Review(int rating, String review,Date appointmentDate, int appointmentNum) throws RemoteException {
		super();
		this.rating = rating;
		this.review = review;
		this.appointmentDate = appointmentDate;
		this.appointmentNum = appointmentNum;
	}
	
	public abstract boolean verify ();

	public abstract void delete(int id);
	
	public abstract void save();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
