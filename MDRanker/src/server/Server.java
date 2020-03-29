package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Vector;

import server.reviewables.Doctor;
import server.reviewables.Hospital;

public class Server extends UnicastRemoteObject implements ReviewHandler, DataHandler{

	protected Server() throws RemoteException {
		super();
	}
	@Override
	public Vector<HashMap<String, String>> fetchAllReviews(String table) {
		return ReviewProxy.fetchAll(table);
	}

	@Override
	public Vector<HashMap<String, String>> fetchAllReviewsOfType(HashMap type) {
		return null;
	}

	@Override
	public Vector<HashMap<String, String>> fetchAllDataOfType(String table, String field) {
		return new ReviewableProxy().fetchAllOfType(table, field);
	}


	@Override
	public Vector<HashMap<String, String>> fetchData(String request) throws RemoteException {
		return new ReviewableProxy().buildAll(request);
	}

	@Override
	public Vector<HashMap<String, String>> fetchReview() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteReview(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void makeData() throws RemoteException {
		// TODO Auto-generated method stub
		
	}


}
