package client.peripherals;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_ReviewHospital {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JRadioButton hr1;
	private JRadioButton hr2;
	private JRadioButton hr3;
	private JRadioButton hr4;
	private JRadioButton hr5;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ReviewHospital window = new GUI_ReviewHospital();
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
	public GUI_ReviewHospital() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 780, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MDRanker");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		lblNewLabel.setBounds(262, 0, 233, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Your Name");
		lblNewLabel_2.setBounds(50, 124, 137, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Hospital Review");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 68, 175, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Your Email");
		lblNewLabel_3.setBounds(50, 178, 137, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Your mobile number");
		lblNewLabel_4.setBounds(50, 228, 104, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date of the Appointment");
		lblNewLabel_5.setBounds(50, 275, 124, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Name of the Hospital");
		lblNewLabel_6.setBounds(50, 320, 124, 19);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Location");
		lblNewLabel_7.setBounds(50, 369, 61, 19);
		frame.getContentPane().add(lblNewLabel_7);
		
		hr1 = new JRadioButton("1");
		hr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hr1.isSelected())
				{
					hr2.setSelected(false);
					hr3.setSelected(false);
					hr4.setSelected(false);
					hr5.setSelected(false);
				}
			}
		});
		hr1.setBounds(223, 405, 61, 23);
		frame.getContentPane().add(hr1);
		
		hr2 = new JRadioButton("2");
		hr2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hr2.isSelected())
				{
					hr1.setSelected(false);
					hr3.setSelected(false);
					hr4.setSelected(false);
					hr5.setSelected(false);
				}
			}
		});
		hr2.setBounds(303, 405, 55, 23);
		frame.getContentPane().add(hr2);
		
		hr3 = new JRadioButton("3");
		hr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hr3.isSelected())
				{
					hr2.setSelected(false);
					hr1.setSelected(false);
					hr4.setSelected(false);
					hr5.setSelected(false);
				}
			}
		});
		hr3.setBounds(385, 405, 55, 23);
		frame.getContentPane().add(hr3);
		
		hr4 = new JRadioButton("4");
		hr4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hr4.isSelected())
				{
					hr2.setSelected(false);
					hr3.setSelected(false);
					hr1.setSelected(false);
					hr5.setSelected(false);
				}
			}
		});
		hr4.setBounds(462, 405, 55, 23);
		frame.getContentPane().add(hr4);
		
		hr5 = new JRadioButton("5");
		hr5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hr5.isSelected())
				{
					hr2.setSelected(false);
					hr3.setSelected(false);
					hr4.setSelected(false);
					hr1.setSelected(false);
				}
			}
		});
		hr5.setBounds(540, 405, 55, 23);
		frame.getContentPane().add(hr5);
		
		textField = new JTextField();
		textField.setBounds(221, 119, 405, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 168, 405, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 218, 246, 33);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 262, 246, 34);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 310, 246, 33);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(221, 357, 219, 31);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Overall Rating");
		lblNewLabel_8.setBounds(50, 409, 104, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Review");
		lblNewLabel_9.setBounds(50, 443, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(226, 433, 412, 67);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton HosRewSubmit = new JButton("Submit");
		HosRewSubmit.setBounds(648, 433, 106, 67);
		frame.getContentPane().add(HosRewSubmit);
	}
}
