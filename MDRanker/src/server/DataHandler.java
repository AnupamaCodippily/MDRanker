package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

public interface DataHandler extends Remote{

	public static void makeData() throws RemoteException{
		
	}
	public HashMap <String, String> fetchData(Reviewable temp) throws RemoteException;
	public    Vector<HashMap<String, String>>    fetchAllDataOfType(String request) throws RemoteException;
	boolean deleteData(Review review) throws RemoteException;
	
}
