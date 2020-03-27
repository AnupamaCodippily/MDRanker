package client.peripherals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import server.ReviewHandler;
import server.DataHandler;

public class ClientGUI extends JFrame{

	public ClientGUI (DataHandler dataHandler) {

		JButton  btnReviewHospital = new JButton("Review Hospital");
		JPanel panelChooseReview = new JPanel();
		btnReviewHospital.addActionListener(new ReviewClickListener(dataHandler,this, panelChooseReview));
		
		this.add(panelChooseReview);
		
		panelChooseReview.add(btnReviewHospital);
		
		this.setSize(600, 600);
		
		this.setVisible(true);
	}
	
}

class ReviewClickListener implements ActionListener {

	DataHandler handler;
	
	JFrame frame;
	JPanel panelOld;
	
	public ReviewClickListener (DataHandler handler, JFrame frame, JPanel panelOld) {
		this.handler = handler;
		this.frame = frame;
		this.panelOld = panelOld;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			handler = (DataHandler) Naming.lookup("rmi://localhost:8081/MDRankerServer/Data");

		} catch (Exception ex) {
			System.out.println("Error connecting to server : " + ex.toString());
			ex.printStackTrace();
		} 
		
		new ReviewHospital_Panel(handler).setVisible(true);
		frame.setVisible(false);
	}

}
