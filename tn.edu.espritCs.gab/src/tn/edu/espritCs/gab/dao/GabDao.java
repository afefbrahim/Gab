package tn.edu.espritCs.gab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tn.edu.espritCs.gab.domain.Gab;
import tn.edu.espritCs.gab.technical.UtilJdbc;

public class GabDao {
	private UtilJdbc utiljdbc = new UtilJdbc();

	public boolean addGab(Gab gab) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "insert into gab (id,nom,solde) values('"+ gab.getId() + "','"
					+ gab.getNom() + "','" + gab.getSolde() + "')";
			statement.executeUpdate(sql);
			System.out.println("Gab solde added ..");
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public Gab findGabById(int id) {
		Gab gabtmp = new Gab();
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "select * from gab where id=" + id;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				gabtmp.setId(resultSet.getInt("id"));
				gabtmp.setNom(resultSet.getString("nom"));
				gabtmp.setSolde(resultSet.getString("solde"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gabtmp;
	}

	public boolean deleteGab(int id) {
		boolean b = false;

		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "delete from gab where id=" + id;
			statement.executeUpdate(sql);
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	public boolean updateGab(Gab gab) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "update gab set nom ='" + gab.getNom()
					+ "' , solde='" + gab.getSolde() + "'"
					+ "where id=" + gab.getId() + " ";
			b = true;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	
}
