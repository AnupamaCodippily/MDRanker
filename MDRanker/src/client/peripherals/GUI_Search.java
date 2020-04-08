package client.peripherals;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import client.globals.Globals;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GUI_Search {
	private JFrame frame;
	private JTextField searchSpecializationTxt;
	private JTextField searchLocationtxt;

	private Vector<HashMap<String, String>> doctors = null;
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Search window = new GUI_Search();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Search For A Doctor by Specialization and Location");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 75, 288, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Specialization");
		lblNewLabel_2.setForeground(new Color(255, 250, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 122, 264, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		searchSpecializationTxt = new JTextField();
		searchSpecializationTxt.setBounds(10, 155, 254, 42);
		frame.getContentPane().add(searchSpecializationTxt);
		searchSpecializationTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Location");
		lblNewLabel_3.setForeground(new Color(255, 250, 240));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 224, 74, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		searchLocationtxt = new JTextField();
		searchLocationtxt.setBounds(10, 251, 254, 42);
		frame.getContentPane().add(searchLocationtxt);
		searchLocationtxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String specialization = searchSpecializationTxt.getText();
					String searchlocation = searchLocationtxt.getText();
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid entry",null, JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		btnNewButton.setBounds(10, 315, 254, 28);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 153));
		panel.setBounds(0, 0, 864, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MDRanker");
		lblNewLabel.setForeground(new Color(0, 102, 255));
		lblNewLabel.setBackground(new Color(0, 102, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel.setBounds(324, 21, 253, 47);
		panel.add(lblNewLabel);
		
		JPanel pnl_searchResults = new JPanel();
		pnl_searchResults.setBackground(new Color(0, 0, 153));
		pnl_searchResults.setBounds(322, 90, 516, 493);
		frame.getContentPane().add(pnl_searchResults);
		pnl_searchResults.setLayout(null);
		
//		JPanel panel_ResultSlot3 = new JPanel();
//		panel_ResultSlot3.setLayout(null);
//		panel_ResultSlot3.setBackground(new Color(51, 51, 51));
//		panel_ResultSlot3.setBounds(10, 244, 496, 65);
//		pnl_searchResults.add(panel_ResultSlot3);
//		
//		
//		JLabel lbl_DoctorLocation_1_1_1 = new JLabel("location");
//		lbl_DoctorLocation_1_1_1.setForeground(Color.WHITE);
//		lbl_DoctorLocation_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_DoctorLocation_1_1_1.setBounds(203, 28, 145, 26);
//		panel_ResultSlot3.add(lbl_DoctorLocation_1_1_1);
//		
//		JLabel lbl_Specialization_1_1_1 = new JLabel("specialization");
//		lbl_Specialization_1_1_1.setForeground(new Color(0, 255, 153));
//		lbl_Specialization_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Specialization_1_1_1.setBounds(20, 33, 139, 17);
//		panel_ResultSlot3.add(lbl_Specialization_1_1_1);
//		
//		JLabel lbl_rating_1_1_1 = new JLabel("unrated");
//		lbl_rating_1_1_1.setForeground(new Color(51, 255, 51));
//		lbl_rating_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lbl_rating_1_1_1.setBounds(391, 11, 95, 43);
//		panel_ResultSlot3.add(lbl_rating_1_1_1);
//		
//		JLabel lblHospital_1_1_1 = new JLabel("hospital");
//		lblHospital_1_1_1.setForeground(Color.WHITE);
//		lblHospital_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lblHospital_1_1_1.setBounds(204, 9, 144, 26);
//		panel_ResultSlot3.add(lblHospital_1_1_1);
//		
//		JLabel lbl_Name_1_1_1 = new JLabel("name");
//		lbl_Name_1_1_1.setForeground(Color.WHITE);
//		lbl_Name_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Name_1_1_1.setBounds(20, 14, 139, 17);
//		panel_ResultSlot3.add(lbl_Name_1_1_1);
//		
//		JPanel panel_ResultSlot4 = new JPanel();
//		panel_ResultSlot4.setLayout(null);
//		panel_ResultSlot4.setBackground(new Color(51, 51, 51));
//		panel_ResultSlot4.setBounds(10, 322, 496, 65);
//		pnl_searchResults.add(panel_ResultSlot4);
//		
//		JLabel lbl_DoctorLocation_1_1 = new JLabel("location");
//		lbl_DoctorLocation_1_1.setForeground(Color.WHITE);
//		lbl_DoctorLocation_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_DoctorLocation_1_1.setBounds(203, 28, 145, 26);
//		panel_ResultSlot4.add(lbl_DoctorLocation_1_1);
//		
//		JLabel lbl_Specialization_1_1 = new JLabel("specialization");
//		lbl_Specialization_1_1.setForeground(new Color(0, 255, 153));
//		lbl_Specialization_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Specialization_1_1.setBounds(20, 33, 139, 17);
//		panel_ResultSlot4.add(lbl_Specialization_1_1);
//		
//		JLabel lbl_rating_1_1 = new JLabel("unrated");
//		lbl_rating_1_1.setForeground(new Color(51, 255, 51));
//		lbl_rating_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lbl_rating_1_1.setBounds(391, 11, 95, 43);
//		panel_ResultSlot4.add(lbl_rating_1_1);
//		
//		JLabel lblHospital_1_1 = new JLabel("hospital");
//		lblHospital_1_1.setForeground(Color.WHITE);
//		lblHospital_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lblHospital_1_1.setBounds(204, 9, 144, 26);
//		panel_ResultSlot4.add(lblHospital_1_1);
//		
//		JLabel lbl_Name_1_1 = new JLabel("name");
//		lbl_Name_1_1.setForeground(Color.WHITE);
//		lbl_Name_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Name_1_1.setBounds(20, 14, 139, 17);
//		panel_ResultSlot4.add(lbl_Name_1_1);
//		
//		JPanel panel_ResultSlot2 = new JPanel();
//		panel_ResultSlot2.setLayout(null);
//		panel_ResultSlot2.setBackground(new Color(51, 51, 51));
//		panel_ResultSlot2.setBounds(10, 168, 496, 65);
//		pnl_searchResults.add(panel_ResultSlot2);
//		
//		JLabel lbl_DoctorLocation_1 = new JLabel("location");
//		lbl_DoctorLocation_1.setForeground(Color.WHITE);
//		lbl_DoctorLocation_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_DoctorLocation_1.setBounds(203, 28, 145, 26);
//		panel_ResultSlot2.add(lbl_DoctorLocation_1);
//		
//		JLabel lbl_Specialization_1 = new JLabel("specialization");
//		lbl_Specialization_1.setForeground(new Color(0, 255, 153));
//		lbl_Specialization_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Specialization_1.setBounds(20, 33, 139, 17);
//		panel_ResultSlot2.add(lbl_Specialization_1);
//		
//		JLabel lbl_rating_1 = new JLabel("unrated");
//		lbl_rating_1.setForeground(new Color(51, 255, 51));
//		lbl_rating_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lbl_rating_1.setBounds(391, 11, 95, 43);
//		panel_ResultSlot2.add(lbl_rating_1);
//		
//		JLabel lblHospital_1 = new JLabel("hospital");
//		lblHospital_1.setForeground(Color.WHITE);
//		lblHospital_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lblHospital_1.setBounds(204, 9, 144, 26);
//		panel_ResultSlot2.add(lblHospital_1);
//		
//		JLabel lbl_Name_1 = new JLabel("name");
//		lbl_Name_1.setForeground(Color.WHITE);
//		lbl_Name_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Name_1.setBounds(20, 14, 139, 17);
//		panel_ResultSlot2.add(lbl_Name_1);
//		
//		JPanel pnl_numResults = new JPanel();
//		pnl_numResults.setBackground(new Color(0, 204, 51));
//		pnl_numResults.setBounds(10, 11, 496, 65);
//		pnl_searchResults.add(pnl_numResults);
//		pnl_numResults.setLayout(null);
//		
//		JLabel lblNewLabel_4 = new JLabel("Results count");
//		lblNewLabel_4.setBounds(10, 21, 476, 20);
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
//		lblNewLabel_4.setForeground(new Color(255, 255, 255));
//		pnl_numResults.add(lblNewLabel_4);
//		
//		JPanel panel_ResultSlot1 = new JPanel();
//		panel_ResultSlot1.setBackground(new Color(51, 51, 51));
//		panel_ResultSlot1.setBounds(10, 92, 496, 65);
//		pnl_searchResults.add(panel_ResultSlot1);
//		panel_ResultSlot1.setLayout(null);
//		
//		JLabel lbl_DoctorLocation = new JLabel("location");
//		lbl_DoctorLocation.setForeground(new Color(255, 255, 255));
//		lbl_DoctorLocation.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_DoctorLocation.setBounds(203, 28, 145, 26);
//		panel_ResultSlot1.add(lbl_DoctorLocation);
//		
//		JLabel lbl_Specialization = new JLabel("specialization");
//		lbl_Specialization.setForeground(new Color(0, 255, 153));
//		lbl_Specialization.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Specialization.setBounds(20, 33, 139, 17);
//		panel_ResultSlot1.add(lbl_Specialization);
//		
//		JLabel lbl_rating = new JLabel("unrated");
//		lbl_rating.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lbl_rating.setForeground(new Color(51, 255, 51));
//		lbl_rating.setBounds(391, 11, 95, 43);
//		panel_ResultSlot1.add(lbl_rating);
//		
//		JLabel lblHospital = new JLabel("hospital");
//		lblHospital.setForeground(new Color(255, 255, 255));
//		lblHospital.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lblHospital.setBounds(204, 9, 144, 26);
//		panel_ResultSlot1.add(lblHospital);
//		
//		JLabel lbl_Name = new JLabel("name");
//		lbl_Name.setForeground(new Color(255, 255, 255));
//		lbl_Name.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Name.setBounds(20, 14, 139, 17);
//		panel_ResultSlot1.add(lbl_Name);
//		
//		JPanel panel_ResultSlot5 = new JPanel();
//		panel_ResultSlot5.setBounds(10, 398, 496, 65);
//		pnl_searchResults.add(panel_ResultSlot5);
//		panel_ResultSlot5.setLayout(null);
//		panel_ResultSlot5.setBackground(new Color(51, 51, 51));
//		
//		JLabel lbl_DoctorLocation_2 = new JLabel("location");
//		lbl_DoctorLocation_2.setForeground(Color.WHITE);
//		lbl_DoctorLocation_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_DoctorLocation_2.setBounds(203, 28, 145, 26);
//		panel_ResultSlot5.add(lbl_DoctorLocation_2);
//		
//		JLabel lbl_Specialization_2 = new JLabel("specialization");
//		lbl_Specialization_2.setForeground(new Color(0, 255, 153));
//		lbl_Specialization_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Specialization_2.setBounds(20, 33, 139, 17);
//		panel_ResultSlot5.add(lbl_Specialization_2);
//		
//		JLabel lbl_rating_2 = new JLabel("unrated");
//		lbl_rating_2.setForeground(new Color(51, 255, 51));
//		lbl_rating_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lbl_rating_2.setBounds(391, 11, 95, 43);
//		panel_ResultSlot5.add(lbl_rating_2);
//		
//		JLabel lblHospital_2 = new JLabel("hospital");
//		lblHospital_2.setForeground(Color.WHITE);
//		lblHospital_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lblHospital_2.setBounds(204, 9, 144, 26);
//		panel_ResultSlot5.add(lblHospital_2);
//		
//		JLabel lbl_Name_2 = new JLabel("name");
//		lbl_Name_2.setForeground(Color.WHITE);
//		lbl_Name_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_Name_2.setBounds(20, 14, 139, 17);
//		panel_ResultSlot5.add(lbl_Name_2);
		
		JButton btnNewButton_1 = new JButton("< PREVIOUS");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(322, 594, 198, 22);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn_next = new JButton("NEXT >");
		btn_next.setBackground(new Color(0, 0, 0));
		btn_next.setForeground(new Color(255, 255, 255));
		btn_next.setBounds(640, 594, 198, 22);
		frame.getContentPane().add(btn_next);
		frame.setBounds(100, 100, 880, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ResultSlot extends JPanel {
	
	JLabel nameLabel, specLabel, locLabel, hospitalLabel, ratingLabel ;
	int slotNumber;
	int xHeight = 496;
	int yHeight = 65;
	
	Color defaultColor= new Color(0, 0, 153);
	Color activated = new Color(51,51,51);
	
	int positionX = 10;
	
	int positionsY [] = {
		92,168,244,322,398	
	};
	
	public ResultSlot (String name, String specialization, String location, String hospital, String rating, int slotNumber) {
		nameLabel = new JLabel(name);
		specLabel = new JLabel(specialization);
		locLabel = new JLabel(location);
		hospitalLabel = new JLabel(hospital);
		ratingLabel = new JLabel(rating);
		
		nameLabel.setBounds(20, 14, 139, 17);
		specLabel.setBounds(20, 33, 139, 17);
		locLabel.setBounds(203, 28, 145, 26);
		hospitalLabel.setBounds(204, 9, 144, 26);
		ratingLabel.setBounds(391,11,95,43);
		
		this.slotNumber = slotNumber;
	}
	
	private void SetPosition () {
		this.setBounds(positionX, positionsY[slotNumber], xHeight, yHeight);
	}
	
}

