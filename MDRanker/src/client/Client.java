package client;


import javax.swing.*;

import client.peripherals.ClientGUI;
import server.DataHandler;
import server.ReviewHandler;

public class Client  {
	
	DataHandler dataHandler;
	ReviewHandler reviewHandler;
	
	public Client () {
		new ClientGUI(dataHandler);
	}

}
