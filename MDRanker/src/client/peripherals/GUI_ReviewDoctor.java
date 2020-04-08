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

public class GUI_ReviewDoctor {
	private JFrame frame;
	private JTextField Dreviewname;
	private JTextField Dreviewemail;
	private JTextField Dreviewmobile;
	private JTextField Dreviewdate;
	private JTextField Dreviewdoctor;
	private JTextField dreview;
	private JRadioButton dr1;
	private JRadioButton dr2;
	private JRadioButton dr3;
	private JRadioButton dr4;
	private JRadioButton dr5;
	private JLabel lblNewLabel_10;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ReviewDoctor window = new GUI_ReviewDoctor();
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
	public GUI_ReviewDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 781, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MDRanker");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		lblNewLabel.setBounds(271, 0, 233, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor Review");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(21, 78, 137, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Name");
		lblNewLabel_2.setBounds(45, 139, 137, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your Email");
		lblNewLabel_3.setBounds(45, 190, 137, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Your mobile number");
		lblNewLabel_4.setBounds(45, 245, 104, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date of the Appointment");
		lblNewLabel_5.setBounds(45, 294, 124, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Name of the doctor");
		lblNewLabel_6.setBounds(45, 346, 124, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Overall Rating");
		lblNewLabel_7.setBounds(45, 396, 88, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Review");
		lblNewLabel_8.setBounds(45, 459, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		Dreviewname = new JTextField();
		Dreviewname.setBounds(192, 136, 431, 34);
		frame.getContentPane().add(Dreviewname);
		Dreviewname.setColumns(10);
		
		Dreviewemail = new JTextField();
		Dreviewemail.setBounds(192, 194, 431, 34);
		frame.getContentPane().add(Dreviewemail);
		Dreviewemail.setColumns(10);
		
		Dreviewmobile = new JTextField();
		Dreviewmobile.setBounds(192, 244, 215, 34);
		frame.getContentPane().add(Dreviewmobile);
		Dreviewmobile.setColumns(10);
		
		Dreviewdate = new JTextField();
		Dreviewdate.setBounds(192, 291, 215, 34);
		frame.getContentPane().add(Dreviewdate);
		Dreviewdate.setColumns(10);
		
		Dreviewdoctor = new JTextField();
		Dreviewdoctor.setBounds(192, 343, 431, 34);
		frame.getContentPane().add(Dreviewdoctor);
		Dreviewdoctor.setColumns(10);
		
		dr1 = new JRadioButton("1");
		dr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dr1.isSelected())
				{
					dr2.setSelected(false);
					dr3.setSelected(false);
					dr4.setSelected(false);
					dr5.setSelected(false);
				}
			}
		});
		dr1.setBounds(192, 392, 54, 23);
		frame.getContentPane().add(dr1);
		
		dr2 = new JRadioButton("2");
		dr2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dr2.isSelected())
				{
					dr1.setSelected(false);
					dr3.setSelected(false);
					dr4.setSelected(false);
					dr5.setSelected(false);
				}
			}
		});
		dr2.setBounds(271, 392, 54, 23);
		frame.getContentPane().add(dr2);
		
		dr3 = new JRadioButton("3");
		dr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dr3.isSelected())
				{
					dr2.setSelected(false);
					dr1.setSelected(false);
					dr4.setSelected(false);
					dr5.setSelected(false);
				}
			}
		});
		dr3.setBounds(345, 392, 54, 23);
		frame.getContentPane().add(dr3);
		
		dr4 = new JRadioButton("4");
		dr4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dr4.isSelected())
				{
					dr2.setSelected(false);
					dr3.setSelected(false);
					dr1.setSelected(false);
					dr5.setSelected(false);
				}
			}
		});
		dr4.setBounds(420, 392, 54, 23);
		frame.getContentPane().add(dr4);
		
		dr5 = new JRadioButton("5");
		dr5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dr5.isSelected())
				{
					dr2.setSelected(false);
					dr3.setSelected(false);
					dr4.setSelected(false);
					dr1.setSelected(false);
				}
			}
		});
		dr5.setBounds(491, 392, 54, 23);
		frame.getContentPane().add(dr5);
		
		dreview = new JTextField();
		dreview.setBounds(192, 438, 471, 62);
		frame.getContentPane().add(dreview);
		dreview.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Higher the better");
		lblNewLabel_9.setBounds(577, 396, 118, 19);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton docRewSubmit = new JButton("Submit");
		docRewSubmit.setBounds(666, 438, 89, 62);
		frame.getContentPane().add(docRewSubmit);
		
		lblNewLabel_10 = new JLabel("DD/MM/YYYY");
		lblNewLabel_10.setBounds(417, 294, 118, 14);
		frame.getContentPane().add(lblNewLabel_10);
	}
}
