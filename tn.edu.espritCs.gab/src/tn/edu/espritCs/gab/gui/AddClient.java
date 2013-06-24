package tn.edu.espritCs.gab.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import tn.edu.espritCs.gab.dao.ClientDao;
import tn.edu.espritCs.gab.domain.Client;

public class AddClient extends JFrame {

	private JPanel contentPane;
	private JTextField cin;
	private JTextField nom;
	private JTextField prenom;
	private JLabel lblCountNumber;
	private JTextField num_compt;
	private JLabel lblPhoneNumber;
	private JTextField num_tel;
	private JLabel lblEmail;
	private JTextField email;
	private JLabel lblNewLabel_2;
	private JTextField solde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClient frame = new AddClient();
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
	public AddClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		cin = new JTextField();
		cin.setColumns(10);
		
		JLabel lblNom = new JLabel("Name");
		lblNom.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		nom = new JTextField();
		nom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Last Name");
		lblPrenom.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		prenom = new JTextField();
		prenom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblCountNumber = new JLabel("Account Number");
		lblCountNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		num_compt = new JTextField();
		num_compt.setColumns(10);
		
		lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		num_tel = new JTextField();
		num_tel.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		email = new JTextField();
		email.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Solde");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		solde = new JTextField();
		solde.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		
		JButton btnAdd = new JButton("Add");
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Client client = new Client(cin.getText(), nom.getText(), prenom.getText(), num_compt.getText(), num_tel.getText(), email.getText(), solde.getText());
				ClientDao clientDao = new ClientDao();
				clientDao.addClient(client);
				clearFields();
				
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCountNumber)
								.addComponent(lblNewLabel)
								.addComponent(lblNom)
								.addComponent(lblPrenom)
								.addComponent(lblPhoneNumber)
								.addComponent(lblEmail)
								.addComponent(lblNewLabel_2))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(solde)
								.addComponent(email)
								.addComponent(num_compt, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
								.addComponent(prenom)
								.addComponent(nom)
								.addComponent(cin, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(num_tel))))
					.addContainerGap(297, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(390, Short.MAX_VALUE)
					.addComponent(btnCancel)
					.addGap(18)
					.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(50))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNom)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrenom)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCountNumber)
							.addComponent(num_compt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhoneNumber)
						.addComponent(num_tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(solde, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnAdd))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

private void clearFields()
{
	cin.setText("");
	nom.setText("");
	prenom.setText("");
	num_compt.setText("");
	num_tel.setText("");
	email.setText("");
	solde.setText("");
}
}
