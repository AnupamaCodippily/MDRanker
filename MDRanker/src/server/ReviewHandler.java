package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

public interface ReviewHandler extends Remote{

	public static void makeReview(Review review) throws RemoteException{
		
	}
	public Review fetchReview(Review temp) throws RemoteException;
	public Vector<Review> fetchAllReviewsOfType(HashMap type) throws RemoteException;
	boolean deleteReview(Review review) throws RemoteException;
	
}
