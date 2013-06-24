package tn.edu.espritCs.gab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tn.edu.espritCs.gab.domain.Transaction;
import tn.edu.espritCs.gab.technical.UtilJdbc;

public class TransactionDao {
	private UtilJdbc utiljdbc = new UtilJdbc();

	public boolean addTransaction(Transaction transaction) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "insert into transaction (id,type,solde,date) values('"+ transaction.getId() + "','"
					+ transaction.getType() + "','" + transaction.getSolde() + "','" + transaction.getDate() + "')";
			statement.executeUpdate(sql);
			System.out.println("Transaction solde added ..");
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public Transaction findTransactionById(int id) {
		Transaction transactiontmp = new Transaction();
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "select * from gab where id=" + id;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactiontmp.setId(resultSet.getInt("id"));
				transactiontmp.setType(resultSet.getString("name"));
				transactiontmp.setSolde(resultSet.getString("solde"));
				transactiontmp.setDate(resultSet.getString("11/05/2013"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactiontmp;
	}

	public boolean deleteTransaction(int id) {
		boolean b = false;

		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "delete from Transaction where id=" + id;
			statement.executeUpdate(sql);
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	public boolean updateTransaction(Transaction transaction) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "update transaction set type ='" + transaction.getType()
					+ "' , solde='" + transaction.getSolde() 
					+ "' , date='" + transaction.getDate() + "'"
					+ "where id=" + transaction.getId() + " ";
			b = true;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	
}
