package tn.edu.espritCs.gab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import tn.edu.espritCs.gab.domain.Agent;
import tn.edu.espritCs.gab.technical.UtilJdbc;


public class AgentDao {
	private UtilJdbc utiljdbc = new UtilJdbc();
	
	public boolean addAgent(Agent agent) {
		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "insert into agent (cin,nom,prenom,login,pwd) values('"
					+ agent.getCin() + "','" + agent.getNom() + "','" + agent.getPrenom() + "','" + agent.getLogin() + "','" + agent.getPwd() + "')";
			statement.executeUpdate(sql);
			System.out.println("Agent added ..");
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public Agent findAgentByCin(String cin) {
		
		Agent agenttmp = new Agent();
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "select * from agent where cin=" + cin;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				agenttmp.setCin(resultSet.getString("cin"));
				agenttmp.setNom(resultSet.getString("nom"));
				agenttmp.setPrenom(resultSet.getString("prenom"));
				agenttmp.setLogin(resultSet.getString("login"));
				agenttmp.setPwd(resultSet.getString("Pwd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return agenttmp;
	}

	public boolean updateAgent(Agent agent) {


		boolean b = false;
		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "update agent set nom ='" + agent.getNom()
					+ "' , prenom='" + agent.getPrenom() 
					+ "' , login='" + agent.getLogin() 
					+ "' , pwd='" + agent.getPwd() + 
					"'"
					+ "where cin=" + agent.getCin() + " ";
			b = true;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	public boolean deleteAgent(String string) {
		boolean b = false;

		try {
			Statement statement = utiljdbc.nouveauconnexion().createStatement();
			String sql = "delete from agent where cin=" + string;
			statement.executeUpdate(sql);
			b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}
}
