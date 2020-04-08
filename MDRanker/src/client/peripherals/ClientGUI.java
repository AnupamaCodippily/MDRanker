package client.peripherals;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import server.DataHandler;
import server.ReviewHandler;

public class ClientGUI{

	public ClientGUI () {

		buildClientGUI();

	}

	private void buildClientGUI() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 780, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("MDRanker");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 54));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("REVIEW ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GUI_Review nw = new GUI_Review();
				nw.NewScreen();
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GUI_Search nw = new GUI_Search();
				nw.NewScreen();
			}
		});
		
		JButton btnNewButton_2 = new JButton("LOGIN/SIGHNUP");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GUI_Login_Signup nw = new GUI_Login_Signup();
				nw.NewScreen();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(122)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
					.addGap(113))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(242)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
					.addGap(248))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		frame.setVisible(true);
	}
	
}
/*
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
*/