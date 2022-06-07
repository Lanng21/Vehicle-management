package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Register extends JFrame {

	private JPanel contentPane = new JPanel();
	private JTextField txtusername = new JTextField();
	private JTextField txtgmail = new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	private JPasswordField confirmPass = new JPasswordField();
	JLabel lblUsername = new JLabel("Username");
	JLabel lblgmail = new JLabel("Gmail");
	JLabel lblpassword = new JLabel("Password");
	JLabel lblNewLabel = new JLabel("Confirm Password");
	JButton btnlogin = new JButton("Login");
	JButton btnregister = new JButton("Register");
	
	
	public Login login;

	public Register(Login login) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.login = login;
		Init();
	}


	public void Init() {
		
		
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblUsername.setBounds(37, 54, 66, 14);
		contentPane.add(lblUsername);
		
		
		lblgmail.setBounds(37, 95, 46, 14);
		contentPane.add(lblgmail);
		
		txtusername = new JTextField();
		txtusername.setBounds(177, 51, 234, 20);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		txtgmail = new JTextField();
		txtgmail.setBounds(177, 92, 234, 20);
		contentPane.add(txtgmail);
		txtgmail.setColumns(10);
		
		
		lblpassword.setBounds(37, 132, 66, 14);
		contentPane.add(lblpassword);
		
		
		lblNewLabel.setBounds(37, 168, 116, 14);
		contentPane.add(lblNewLabel);
		
		
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnLoginAction(e);
				
			}
		});
		btnlogin.setForeground(new Color(255, 255, 255));
		btnlogin.setBackground(new Color(139, 0, 0));
		btnlogin.setBounds(77, 215, 89, 23);
		contentPane.add(btnlogin);
		
		
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnregister.setForeground(new Color(255, 255, 255));
		btnregister.setBackground(new Color(139, 0, 0));
		btnregister.setBounds(257, 215, 89, 23);
		contentPane.add(btnregister);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setBackground(Color.WHITE);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblRegister.setBounds(167, 11, 126, 29);
		contentPane.add(lblRegister);
		
		passwordField.setBounds(177, 129, 234, 20);
		contentPane.add(passwordField);
		
		confirmPass.setBounds(177, 165, 234, 20);
		contentPane.add(confirmPass);
	}
	
	public void btnLoginAction(ActionEvent e) {
		this.login.setVisible(true);
		this.dispose();
	}
	
}
