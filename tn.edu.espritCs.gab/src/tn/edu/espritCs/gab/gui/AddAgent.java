package tn.edu.espritCs.gab.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import tn.edu.espritCs.gab.dao.AgentDao;
import tn.edu.espritCs.gab.domain.Agent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddAgent extends JFrame {

	private JPanel contentPane;
	private JTextField Nom;
	private JTextField Prenom;
	private JTextField Login;
	private JTextField Pwd;
	private JTextField CIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAgent frame = new AddAgent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddAgent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		Nom = new JTextField();
		Nom.setColumns(10);

		Prenom = new JTextField();
		Prenom.setColumns(10);

		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});

		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(new Color(0, 0, 204));
		lblNom.setFont(new Font("Times New Roman", Font.BOLD, 15));

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Agent agent = new Agent(CIN.getText(), Nom.getText(), Prenom
						.getText(), Login.getText(), Pwd.getText());
				AgentDao agentDao = new AgentDao();
				agentDao.addAgent(agent);
				clearFields();

			}
		});

		JLabel lblPassword = new JLabel("Prenom");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setForeground(new Color(0, 0, 204));

		Login = new JTextField();
		Login.setColumns(10);

		Pwd = new JTextField();
		Pwd.setColumns(10);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 0, 204));

		JLabel lblNom_1 = new JLabel("Password");
		lblNom_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNom_1.setForeground(new Color(0, 0, 204));

		CIN = new JTextField();
		CIN.setColumns(10);

		JLabel lblPrenom = new JLabel("CIN");
		lblPrenom.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrenom.setForeground(new Color(0, 0, 204));
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(423)
							.addComponent(btnNewButton)
							.addGap(31)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(46)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNom_1)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(48)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPassword)
										.addComponent(lblPrenom, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Pwd, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(Login, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(Prenom, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(Nom, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(CIN, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))))
					.addGap(35))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrenom)
						.addComponent(CIN, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(Nom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPassword)
						.addComponent(Prenom, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(Login, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNom_1)
						.addComponent(Pwd, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(54))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(331, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnNewButton))
					.addGap(61))
		);
		contentPane.setLayout(groupLayout);
	}
	
	private void clearFields()
	{
		Nom.setText("");
		Prenom.setText("");
		CIN.setText("");
		Pwd.setText("");
		Login.setText("");
	}
}
