package BCBS.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import BCBS.data.Admin;
import BCBS.data.DBCon;
import BCBS.data.Users;
import BCBS.ui.Screen;
import BCBS.ui.Login;


public class BCBSapp {
	
	private Screen screen;
	private DBCon dbcon;	
	
	public BCBSapp(){
		//instansierer objekter
		
		screen = new Screen();
		dbcon = new DBCon();

		screen.setVisible(true);
	}
	
	public void run(){
		
		dbcon.DBCon();
		
		screen.getLogin().addActionListener(new LoginActionListener());
		
		screen.getUserMenu().addActionListener(new UserMenuActionListener());
		screen.getAdminMenu().addActionListener(new AdminMenuActionListener());
		
		
		screen.getIndstBc().addActionListener(new IndstActionListener());
		
		screen.getHvBc().addActionListener(new HvActionListener());
		
		screen.getTransBc().addActionListener(new TransActionListener());
			
		screen.show(Screen.LOGIN);
	}
	
	public boolean auth() {
		boolean UserAuth = false;
		
		String initials = screen.getLogin().getTfUsername().getText();
		String password = screen.getLogin().getTfPassword().getText();
		
		for (Users users: dbcon.getUsers()) {
			
			if (users.getInitials().equals(initials) && users.getPassword().equals(password)) {
				
				System.out.println("Welcome to the Bitcoin ATM");
				
				UserAuth = true;
			}
		
		}
	
		return UserAuth;
	}
	
	public boolean ad_auth() {
		boolean AdminAuth = false;
				
		String name = screen.getLogin().getTfUsername().getText();
		String password = screen.getLogin().getTfPassword().getText();
		
		for  (Admin admin : dbcon.getAdmin()) {
			
			if (admin.getName().equals(name) && admin.getPassword().equals(password)) {
				
				System.out.println("Welcome to the Bitcoin ATM");
				
				AdminAuth = true;
			}
			
		}
		
		return AdminAuth;
	}
	
	private class LoginActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == screen.getLogin().getBtnLogin()){
				
				if (auth()) {
					screen.show(Screen.USERMENU);
				}
				
				else if (ad_auth()) {
					screen.show(Screen.ADMINMENU);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Forkert Brugernavn/Password. Prøv igen!");
				}
				
			}
			
			else if (e.getSource() == screen.getLogin().getBtnAfslut()){
				System.exit(0);
			}
				
		}

	}
	
	private class AdminMenuActionListener implements ActionListener{
		
		public void actionPerformed (ActionEvent e ) {
			
			if (e.getSource() == screen.getAdminMenu().getBtnLogUd()) {
				screen.show(Screen.LOGIN);
			}	
		}
	}
	
	
	private class UserMenuActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == screen.getUserMenu().getBtnLogUd()){
				screen.show(Screen.LOGIN);				
			}
			
			else if (e.getSource() == screen.getUserMenu().getBtnIndstBc()){
				screen.show(Screen.INDSTBC);
			}
			
			else if (e.getSource() == screen.getUserMenu().getBtnHvBc()){
				screen.show(Screen.HVBC);
			}
			
		}
		
	}
		
	private class IndstActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == screen.getIndstBc().getBtnLogUd()){
				screen.show(Screen.LOGIN);
			}
			
			else if (e.getSource() == screen.getIndstBc().getBtnHjem()){
				screen.show(Screen.USERMENU);
			}
			
			else if (e.getSource() == screen.getIndstBc().getBtnIndst()){
				screen.show(Screen.LOGIN);
			}
				
		}
	
	}
	
	private class HvActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == screen.getHvBc().getBtnLogud()){
				screen.show(Screen.LOGIN);
			}
			
			else if (e.getSource() == screen.getHvBc().getBtnHjem()){
				screen.show(Screen.USERMENU);
			}
			
			else if (e.getSource() == screen.getHvBc().getBtnHvBc()){
				screen.show(Screen.USERMENU);
			}
		}
	}
	
	private class TransActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == screen.getTransBc().getBtnLogud()){
				screen.show(Screen.LOGIN);
			}
			
			else if (e.getSource() == screen.getTransBc().getBtnHjem()){
				screen.show(Screen.USERMENU);
			}
			
			else if (e.getSource() == screen.getTransBc().getBtnHvBc()){
				screen.show(Screen.USERMENU);
			}
			
		}
	}
		
}

