package client;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.*;

import client.globals.Globals;
import client.peripherals.ClientGUI;
import server.DataHandler;
import server.ReviewHandler;

public class Client  {
	
	
	public Client () {
		
		try {
			Globals.dataHandler = (DataHandler) Naming.lookup("rmi://localhost:8081/MDRankerServer/Data");
			Globals.reviewHandler = (ReviewHandler) Naming.lookup("rmi://localhost:8081/MDRankerServer/Reviews");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new ClientGUI();
	}

}
