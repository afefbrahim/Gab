package tn.edu.espritCs.gab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import tn.edu.espritCs.gab.domain.Carte;
import tn.edu.espritCs.gab.technical.UtilJdbc;


public class CarteDao {
	private UtilJdbc utiljdbc = new UtilJdbc();
	
	public boolean addCarte(Carte carte) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "insert into carte (num, pwd, date_validite, date_confiscation, etat) values('"
					+ carte.getNum() + "','" + carte.getPwd() + "','" + carte.getDate_validite() + "','" + carte.getDate_confiscation() + "','" + carte.getEtat() + "')";
			statement.executeUpdate(sql);
			System.out.println("Carte added ..");
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public Carte findCarteByNum(int num) {
		
		Carte cartetmp = new Carte();
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "select * from carte where num=" + num;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				cartetmp.setNum(resultSet.getInt("num"));
				cartetmp.setPwd(resultSet.getInt("pwd"));
				cartetmp.setDate_validite(resultSet.getString("date_validite"));
				cartetmp.setDate_confiscation(resultSet.getString("date_confiscation"));
				cartetmp.setEtat(resultSet.getString("etat"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cartetmp;
	}

	public boolean updateCarte(Carte carte) {


		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "update carte set pwd ='" + carte.getPwd()
					+ "' , date_validite='" + carte.getDate_validite()
					+ "' , date_confiscation='" + carte.getDate_confiscation() 
					+ "' , etat='" + carte.getEtat() + 
					"'"
					+ "where num=" + carte.getNum() + " ";
			b = true;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	public boolean deleteCarte(int num) {
		boolean b = false;

		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "delete from carte where num=" + num;
			statement.executeUpdate(sql);
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}
}
