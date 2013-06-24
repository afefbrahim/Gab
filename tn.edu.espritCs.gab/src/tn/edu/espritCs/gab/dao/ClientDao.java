package tn.edu.espritCs.gab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import tn.edu.espritCs.gab.domain.Client;
import tn.edu.espritCs.gab.technical.UtilJdbc;


public class ClientDao {
	private UtilJdbc utiljdbc = new UtilJdbc();
	
	public boolean addClient(Client client) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "insert into client (cin,nom,prenom,num_compt,num_tel,email,solde) values('"
					+ client.getCin() + "','" + client.getNom() + "','" + client.getPrenom() + "','" + client.getNum_compt() + "','" + client.getNum_tel() + "','" + client.getEmail() +  "','" + client.getSolde() + "')";
			statement.executeUpdate(sql);
			System.out.println("Client added ..");
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public Client findClientByCin(long cin) {
		
		Client clienttmp = new Client();
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "select * from client where cin=" + cin;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				clienttmp.setCin(resultSet.getString("cin"));
				clienttmp.setNom(resultSet.getString("nom"));
				clienttmp.setPrenom(resultSet.getString("prenom"));
				clienttmp.setNum_compt(resultSet.getString("num_compt"));
				clienttmp.setNum_tel(resultSet.getString("num_tel"));
				clienttmp.setEmail(resultSet.getString("email"));
				clienttmp.setSolde(resultSet.getString("solde"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clienttmp;
	}

	public boolean updateClient(Client client) {


		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "update client set nom ='" + client.getNom()
					+ "' , prenom='" + client.getPrenom() 
					+ "' , num_compt='" + client.getNum_compt() 
					+ "' , num_tel='" + client.getNum_tel() 
					+ "' , email='" + client.getEmail()  
					+ "' , solde='" + client.getSolde() + 
					"'"
					+ "where cin=" + client.getCin() + " ";
			b = true;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	public boolean deleteClient(long cin) {
		boolean b = false;

		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "delete from client where cin=" + cin;
			statement.executeUpdate(sql);
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}
}
