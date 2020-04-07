package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

public interface ReviewHandler extends Remote{


	public Vector<HashMap<String, String>> fetchAllReviewsOfType(String table, String field) throws RemoteException;
	boolean deleteReview(String id) throws RemoteException;
	Vector<HashMap<String, String>> fetchAllReviews(String table)throws RemoteException;
	Vector<HashMap<String, String>> fetchAllReviewsByQuery(String column, String table, String field,String fieldValue)throws RemoteException;
	Vector<HashMap<String, String>> fetchReview(String column, String table, String field, String fieldValue)throws RemoteException;
	
}
