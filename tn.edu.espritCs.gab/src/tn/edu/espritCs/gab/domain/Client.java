package tn.edu.espritCs.gab.domain;

public class Client {

	private String cin;
	private String nom;
	private String prenom;
	private String num_compt;
	private String num_tel;
	private String email;
	private String solde;
	
	public Client(String cin, String nom, String prenom, String num_compt, String num_tel,
			String email, String solde) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.num_compt = num_compt;
		this.num_tel = num_tel;
		this.email = email;
		this.solde = solde;
		
	}


	public Client() {
		
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


	public String getNum_compt() {
		return num_compt;
	}


	public void setNum_compt(String num_compt) {
		this.num_compt = num_compt;
	}


	public String getNum_tel() {
		return num_tel;
	}


	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSolde() {
		return solde;
	}


	public void setSolde(String solde) {
		this.solde = solde;
	}


	
	
}
