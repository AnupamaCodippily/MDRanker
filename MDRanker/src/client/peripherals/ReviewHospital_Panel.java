package client.peripherals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import server.DataHandler;
import javax.swing.SpringLayout;
import java.awt.Dialog;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;

public class ReviewHospital_Panel extends JFrame {

	/**
	 * Create the panel.
	 */
	private JPanel searchResults;
	private JTextField tfSearchLocation;
	private GridBagConstraints gbc;
	public ReviewHospital_Panel (DataHandler dataHandler) {
		getContentPane().setBackground(new Color(0, 102, 255));
		setBackground(new Color(0, 102, 255));
		
		this.setSize(1066, 531);
		
		
		searchResults = new JPanel ();
		searchResults.setForeground(Color.WHITE);
		searchResults.setBackground(new Color(51, 51, 51));
		
		//tfSearchSpecial.setSize(100, 30);

		//Setup Spring Layout
		
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.SOUTH, searchResults, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, searchResults, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, searchResults, 367, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, searchResults, -10, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);
		getContentPane().add(searchResults);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 127, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 362, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblSearch = new JLabel("Hospital name");
		panel.add(lblSearch);
		lblSearch.setForeground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.WEST, lblSearch, 41, SpringLayout.WEST, getContentPane());
		JTextField tfSearchHospital = new JTextField();
		panel.add(tfSearchHospital);
		springLayout.putConstraint(SpringLayout.WEST, tfSearchHospital, 36, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tfSearchHospital, -788, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, tfSearchHospital, 81, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblSearch, -6, SpringLayout.NORTH, tfSearchHospital);
		
		JLabel lblLocation = new JLabel("Location");
		panel.add(lblLocation);
		springLayout.putConstraint(SpringLayout.WEST, lblLocation, 41, SpringLayout.WEST, getContentPane());
		lblLocation.setForeground(new Color(255, 255, 255));
		tfSearchLocation = new JTextField();
		panel.add(tfSearchLocation);
		springLayout.putConstraint(SpringLayout.WEST, tfSearchLocation, 36, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tfSearchLocation, -788, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, tfSearchLocation, 149, SpringLayout.NORTH, getContentPane());
		tfSearchLocation.setColumns(10);
		springLayout.putConstraint(SpringLayout.SOUTH, tfSearchHospital, -37, SpringLayout.NORTH, tfSearchLocation);
		springLayout.putConstraint(SpringLayout.SOUTH, lblLocation, -6, SpringLayout.NORTH, tfSearchLocation);
		
		JButton submitButton = new JButton("Search");
		panel.add(submitButton);
		submitButton.setBackground(new Color(0, 0, 153));
		submitButton.setForeground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.WEST, submitButton, 36, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, submitButton, -788, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, submitButton, 222, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, submitButton, -248, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tfSearchLocation, -42, SpringLayout.NORTH, submitButton);
		submitButton.addActionListener(new handleSearchType (tfSearchLocation,tfSearchHospital, searchResults, dataHandler, gbc, this));
		searchResults.setLayout(new GridLayout(0, 1, 0, 1));
		

	}
}

class handleSearchType implements ActionListener {
	
	JPanel panel;
	DataHandler dataHandler;
	Vector<HashMap <String, String>> hospitals = null; 
	GridBagConstraints gbc = null;
	
	JFrame frame = null;
	
	public handleSearchType (JTextField hospitalName,JTextField location, JPanel panel, DataHandler dataHandler, GridBagConstraints gbc, JFrame frame) {
		
		this.panel = panel;
		this.dataHandler = dataHandler;
		this.gbc = gbc;
		this.frame = frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent ex) {
		
		try {
			hospitals = dataHandler.fetchAllDataOfType("hospital");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		int i = 0;
		
		for (HashMap<String, String> hospital : hospitals) {
			SearchResultHospital result = new SearchResultHospital(
					hospital.get("name"),
					hospital.get("location"),
					hospital.get("rating")
					);

			panel.add(result);
			i++;
		}
		
		frame.revalidate();
		
	}

}
