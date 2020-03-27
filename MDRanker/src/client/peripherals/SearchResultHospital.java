package client.peripherals;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class SearchResultHospital extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5097480650773544235L;

	/**
	 * Create the panel.
	 */
	public SearchResultHospital(String hospitalName, String location, String rating) {
		
		this.setSize(600, 60);
		
		setForeground(new Color(0, 0, 102));
		setBackground(new Color(51, 0, 102));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel hospital_name = new JPanel();
		hospital_name.setBackground(new Color(0, 0, 51));
		springLayout.putConstraint(SpringLayout.NORTH, hospital_name, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, hospital_name, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, hospital_name, 50, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, hospital_name, 147, SpringLayout.WEST, this);
		add(hospital_name);
		
		JPanel logo_location = new JPanel();
		logo_location.setBackground(new Color(0, 0, 51));
		springLayout.putConstraint(SpringLayout.NORTH, logo_location, 0, SpringLayout.NORTH, hospital_name);
		springLayout.putConstraint(SpringLayout.WEST, logo_location, 24, SpringLayout.EAST, hospital_name);
		springLayout.putConstraint(SpringLayout.SOUTH, logo_location, 0, SpringLayout.SOUTH, hospital_name);
		springLayout.putConstraint(SpringLayout.EAST, logo_location, 66, SpringLayout.EAST, hospital_name);
		add(logo_location);
		
		JPanel hospital_location = new JPanel();
		hospital_location.setBackground(new Color(0, 0, 51));
		springLayout.putConstraint(SpringLayout.NORTH, hospital_location, 0, SpringLayout.NORTH, hospital_name);
		springLayout.putConstraint(SpringLayout.WEST, hospital_location, 6, SpringLayout.EAST, logo_location);
		springLayout.putConstraint(SpringLayout.SOUTH, hospital_location, 0, SpringLayout.SOUTH, hospital_name);
		
		JLabel lbl_name = new JLabel(hospitalName);
		hospital_name.add(lbl_name);
		springLayout.putConstraint(SpringLayout.EAST, hospital_location, 131, SpringLayout.EAST, logo_location);
		add(hospital_location);
		
		JLabel lbl_location = new JLabel(location);
		hospital_location.add(lbl_location);
		
		JLabel lbl_rating = new JLabel("" + rating);
		lbl_rating.setFont(new Font("Dialog", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.NORTH, lbl_rating, 22, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lbl_rating, -34, SpringLayout.EAST, this);
		lbl_rating.setForeground(Color.GREEN);
		add(lbl_rating);
		
		this.setVisible(true);

	}
}
