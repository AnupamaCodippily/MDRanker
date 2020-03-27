package client.peripherals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.HashMap;

import javax.swing.JComponent;
import javax.swing.JLabel;

import server.DataHandler;


public class HospitalSearchResult extends JComponent implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 265064150441652745L;
	DataHandler handler;
	
	public HospitalSearchResult (DataHandler handler)  {
		super();
		
		this.handler = handler;
		
		try {
			setup();	
		} catch (Exception ex) {
			System.out.println("Error connecting to remote Server");
		}
		
		
		this.setVisible(true);
	}
	
	public void setup () throws RemoteException {
		

		
		this.setSize(20, 100);
		
//		this.add(lblHospitalName);		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("click")){
			
		}
	}
}
