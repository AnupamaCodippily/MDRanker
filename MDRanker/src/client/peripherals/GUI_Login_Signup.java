package client.peripherals;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_Login_Signup {

	private JFrame frame;
	private JTextField LoginName;
	private JPasswordField LoginPassword;
	private JTextField SichnUpName;
	private JTextField SichnUpEmail;
	private JTextField SichnUpContactNo;
	private JTextField signUpPassword;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Login_Signup window = new GUI_Login_Signup();
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
	public GUI_Login_Signup() {
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
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(270, 11, 233, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(25, 121, 65, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		LoginName = new JTextField();
		LoginName.setBounds(25, 151, 291, 49);
		frame.getContentPane().add(LoginName);
		LoginName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(25, 202, 116, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton Loginbutton = new JButton("Login");
		Loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//Login inputs
				String loginname = LoginName.getText();
				String loginpassword = LoginPassword.getText();
				
				SichnUpName.setText(null);
				SichnUpEmail.setText(null);
				SichnUpContactNo.setText(null);
				signUpPassword.setText(null);
			}
		});
		Loginbutton.setBounds(115, 303, 107, 30);
		frame.getContentPane().add(Loginbutton);
		
		SichnUpName = new JTextField();
		SichnUpName.setBounds(419, 151, 291, 49);
		frame.getContentPane().add(SichnUpName);
		SichnUpName.setColumns(10);
		
		SichnUpEmail = new JTextField();
		SichnUpEmail.setBounds(419, 231, 291, 49);
		frame.getContentPane().add(SichnUpEmail);
		SichnUpEmail.setColumns(10);
		
		SichnUpContactNo = new JTextField();
		SichnUpContactNo.setBounds(419, 320, 291, 49);
		frame.getContentPane().add(SichnUpContactNo);
		SichnUpContactNo.setColumns(10);
		
		signUpPassword = new JTextField();
		signUpPassword.setBounds(419, 411, 291, 49);
		frame.getContentPane().add(signUpPassword);
		signUpPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Sighnup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//Registration inputs				
					LoginName.setText(null);
					LoginPassword.setText(null);
					
					String signupName = SichnUpName.getText();
					String signupEmail = SichnUpEmail.getText();
					String signupContact = SichnUpContactNo.getText();
					String signupPassword = signUpPassword.getText();
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(515, 466, 107, 30);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(419, 126, 84, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(419, 206, 107, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contact Number");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(419, 291, 160, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(419, 380, 186, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		LoginPassword = new JPasswordField();
		LoginPassword.setBounds(25, 243, 291, 49);
		frame.getContentPane().add(LoginPassword);
	}
}
