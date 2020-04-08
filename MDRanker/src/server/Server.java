package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Vector;


public class Server extends UnicastRemoteObject implements ReviewHandler, DataHandler,ToolsetHandler{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Server() throws RemoteException {

	}
	@Override
	public Vector<HashMap<String, String>> fetchAllReviews(String table) {
		return ReviewProxy.fetchAll(table);
	}

	@Override
	public Vector<HashMap<String, String>> fetchAllReviewsOfType(String table, String field) {
		return ReviewProxy.fetchAllOfType(table, field);
	}

	
	@Override
	public Vector<HashMap<String, String>> fetchAllDataOfType(String table, String field) {
		return ReviewableProxy.fetchAllOfType(table, field);
	}


	@Override
	public Vector<HashMap<String, String>> fetchData(String request) throws RemoteException {
		return  ReviewableProxy.buildAll(request);
	}

	@Override
	public Vector<HashMap<String, String>> fetchReview(String column, String table, String field, String fieldValue) throws RemoteException {
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
	@Override
	public Vector<HashMap<String, String>> fetchDataByQuery_oneCondition(String column, String table, String queryColumn,
			String queryValue) throws RemoteException {
		return ReviewableProxy.fetchByQuery_OneCondition(column, table, queryColumn, queryValue);
	}
	@Override
	public Vector<HashMap<String, String>> fetchAllReviewsByQuery(String column, String table, String field,
			String fieldValue) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Vector<HashMap<String, String>> ExecuteRawFetchQuery(String rawQuery) {
		
		return null;
	}
	@Override
	public Vector<HashMap<String, String>> ExecuteRawUpdateQuery(String rawQuery) {
		
		return null;
	}


}
