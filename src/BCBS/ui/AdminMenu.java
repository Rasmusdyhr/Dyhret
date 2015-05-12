package BCBS.ui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminMenu extends JPanel {

	private JButton btnLogud;
	private JButton btnHjem;
	private JButton btnIndstBc;
	private JButton btnHvBc;
	private JButton btnOverfrBc;
	private JButton btnOpretBruger;
	private JButton btnSletBruger;
	private JButton btnVisBrugere;

	private JLabel	lblBruger;
	private JLabel	lblSaldo;
	

	/**
	 * Create the panel.
	 */
	public AdminMenu() {

		setBounds(100,100,600,500);
		setLayout(null);

		btnLogud = new JButton("Log ud");
		btnLogud.setBounds(475, 11, 89, 23);
		add(btnLogud);

		btnHjem = new JButton("Hjem");
		btnHjem.setBounds(20, 100, 89, 23);
		add(btnHjem);

		btnOpretBruger = new JButton("Opret Bruger");
		btnOpretBruger.setBounds(20, 134, 89, 23);
		add(btnOpretBruger);

		btnSletBruger = new JButton("Slet Bruger");
		btnSletBruger.setBounds(20, 202, 89, 23);
		add(btnSletBruger);

		btnVisBrugere = new JButton("Vis Brugere");
		btnVisBrugere.setBounds(20, 168, 89, 23);
		add(btnVisBrugere);

		lblBruger = new JLabel("Du er logget ind som:" + "");
		lblBruger.setBounds(20, 11, 238, 23);
		add(lblBruger);

		lblSaldo = new JLabel("Saldo:" + "");
		lblSaldo.setBounds(20, 40, 103, 23);
		add(lblSaldo);
	}
	
	public JButton getBtnLogUd() {
		return btnLogud;
	}
	
	public JButton getBtnHjem() {
		return btnHjem;
	}
	
	public void addActionListener(ActionListener l) {
		btnLogud.addActionListener(l);
		btnHjem.addActionListener(l);
	}

}
