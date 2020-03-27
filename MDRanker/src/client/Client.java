package client;


import javax.swing.*;

import client.peripherals.ClientGUI;
import server.DataHandler;
import server.ReviewHandler;

public class Client  {
	
	DataHandler dataHandler;
	
	public Client () {
		new ClientGUI(dataHandler);
	}

}
