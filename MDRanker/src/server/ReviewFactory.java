package server;

import java.rmi.RemoteException;

public abstract class ReviewFactory {
	
	public abstract Review create() throws RemoteException;
	
}
