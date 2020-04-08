package server;

import java.rmi.Remote;
import java.util.HashMap;
import java.util.Vector;

public interface ToolsetHandler extends Remote {

	public Vector<HashMap<String, String>> ExecuteRawQuery(String rawQuery) ;
	public Vector<HashMap<String, String>> ExecuteRawUpdateQuery(String rawQuery) ;
	
}
