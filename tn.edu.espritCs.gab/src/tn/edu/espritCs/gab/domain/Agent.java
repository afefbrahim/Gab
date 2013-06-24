package tn.edu.espritCs.gab.domain;

public class Agent {
	private String cin;
	private String nom;
	private String prenom;
	private String login;
	private String pwd;

	public Agent(String cin, String nom, String prenom, String login, String pwd) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
	
		
	}


	public Agent() {
		
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	

}
