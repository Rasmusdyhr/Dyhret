package BCBS.ui;

import BCBS.data.DBCon;
import BCBS.logic.BCBSapp;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


import javax.swing.JLabel;

import BCBS.ui.Screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;

public class Login extends JPanel {
	
	private JTextField tfUsername;
	private JPasswordField tfPassword;
	private JLabel label_1;
	private JLabel lblPing;
	private JButton btnLogin;
	private JButton btnAfslut;
	
	private DBCon dbcon;

	/**
	 * Create the Login Panel.
	 */
	public Login() {
		
		dbcon = new DBCon();
		
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 600, 500);

		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(200, 312, 200, 26);
		add(tfUsername);

		tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(200, 359, 200, 26);
		add(tfPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(200, 414, 89, 23);
		add(btnLogin);

		btnAfslut = new JButton("Afslut");
		btnAfslut.setBounds(313, 414, 89, 23);
		add(btnAfslut);

		label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		
		// Shit vi er retarerede at lave en .jpg.png
		Image img  = new ImageIcon(this.getClass().getResource("/BCBS_LOGO.jpg")).getImage();
		label_1.setIcon(new ImageIcon(img));
		label_1.setBounds(117, 11, 366, 290);
		add(label_1);
		
		lblPing = new JLabel("Connection: Succesful");
		lblPing.setBounds(10, 11, 563, 23);
		add(lblPing);
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public JTextField getTfPassword() {
		return tfPassword;
	}

	public void setTfPassword(JPasswordField tfPassword) {
		this.tfPassword = tfPassword;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public JButton getBtnAfslut() {
		return btnAfslut;
	}
	
	public JLabel getLblPing() {
		return lblPing;
	}
	
	public void addActionListener(ActionListener l) {
		btnLogin.addActionListener(l);
		btnAfslut.addActionListener(l);
	}
}
