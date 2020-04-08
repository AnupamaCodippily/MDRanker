package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

public interface ToolsetHandler extends Remote {

	public Vector<HashMap<String, String>> ExecuteRawFetchQuery(String rawQuery) throws RemoteException;
	public Vector<HashMap<String, String>> ExecuteRawUpdateQuery(String rawQuery) throws RemoteException;
	
}
