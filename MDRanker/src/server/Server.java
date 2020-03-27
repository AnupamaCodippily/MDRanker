package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Vector;

import server.reviewables.Doctor;
import server.reviewables.Hospital;
import server.utils.Hash;

public class Server extends UnicastRemoteObject implements ReviewHandler, DataHandler{

	protected Server() throws RemoteException {
		super();
	}


	@Override
	public Vector<Review> fetchAllReviewsOfType(HashMap type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<HashMap<String, String>> fetchAllDataOfType(String request) {
		
		return new ReviewableFactory().buildAll(request);
	}
	
	@Override
	public Review fetchReview(Review temp) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, String> fetchData(Reviewable temp) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteData(Review review) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean deleteReview(Review review) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
