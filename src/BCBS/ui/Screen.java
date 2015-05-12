package BCBS.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BCBS.ui.Login;
import BCBS.ui.UserMenu;
import BCBS.ui.AdminMenu;
import BCBS.logic.BCBSapp;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Screen extends JFrame {
	public static final String LOGIN = "login";
	public static final String USERMENU = "usermenu";
	public static final String ADMINMENU = "adminmenu";
	public static final String INDSTBC = "indstbc";
	public static final String HVBC = "hvbc";
	public static final String TRANS = "trans";
		
	private Login login;
	private UserMenu usermenu;
	private AdminMenu adminmenu;
	private IndstBc indstbc;
	private HvBc hvbc;
	private TransBc trans;
	private JPanel contentPane;
	
	private CardLayout c;
	
	/**
	 * Create the frame.
	 */
	public Screen(){
		
		setTitle("CBS Bitcoin ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);

		login = new Login();
		login.getLblPing().setBounds(10, 10, 218, 23);
		login.setBackground(new Color(255, 255, 255));
		login.setBounds(100, 100, 600, 500);
		login.setLayout(null);
		contentPane.add(login, LOGIN);
		
		usermenu = new UserMenu();
		usermenu.setBackground(new Color(255, 255, 255));
		usermenu.setBounds(100, 100, 600, 500);
		usermenu.setLayout(null);
		contentPane.add(usermenu, USERMENU);
		
		adminmenu = new AdminMenu();
		adminmenu.setBackground(new Color(255, 255, 255));
		adminmenu.setBounds(100, 100, 600, 500);
		adminmenu.setLayout(null);
		contentPane.add(adminmenu, ADMINMENU);
		
		indstbc = new IndstBc();
		indstbc.setBackground(new Color(255, 255, 255));
		indstbc.setBounds(100, 100, 600, 500);
		indstbc.setLayout(null);
		contentPane.add(indstbc, INDSTBC);
		
		hvbc = new HvBc();
		hvbc.setBackground(new Color(255, 255, 255));
		hvbc.setBounds(100, 100, 600, 500);
		hvbc.setLayout(null);
		contentPane.add(hvbc,HVBC);
		
		trans = new TransBc();
		trans.setBackground(new Color(255, 255, 255));
		trans.setBounds(100, 100, 600, 500);
		trans.setLayout(null);
		contentPane.add(trans, TRANS);
				
		c = (CardLayout) getContentPane().getLayout();
		
	}
	
	
	public Login getLogin() {
		return login;
	}

	public UserMenu getUserMenu() {
		return usermenu;
	}

	public AdminMenu getAdminMenu() {
		return adminmenu;
	}
	
	public IndstBc getIndstBc() {
		return indstbc;
	}
	
	public HvBc getHvBc(){
		return hvbc;
	}
	
	public TransBc getTransBc(){
		return trans;
	}
	

	public void show(String card){
		c.show(this.getContentPane(), card);
	}

}
