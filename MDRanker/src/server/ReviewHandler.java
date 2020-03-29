package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

public interface ReviewHandler extends Remote{


	public Vector<HashMap<String, String>> fetchReview() throws RemoteException;
	public Vector<HashMap<String, String>> fetchAllReviewsOfType(HashMap type) throws RemoteException;
	boolean deleteReview(String id) throws RemoteException;
	Vector<HashMap<String, String>> fetchAllReviews(String table);
	
}
