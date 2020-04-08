package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

public interface DataHandler extends Remote{

	public void makeData() throws RemoteException;
	public Vector<HashMap<String, String>> fetchData(String request) throws RemoteException;
	public Vector<HashMap<String, String>> fetchAllDataOfType(String table, String field) throws RemoteException;
	public boolean delete(String id) throws RemoteException;
	Vector<HashMap<String, String>> fetchDataByQuery_oneCondition(String column, String table, String queryColumn,
			String queryValue) throws RemoteException;
	
}
