package tn.edu.espritCs.gab.domain;

public class Gab {
	private int id;
	private String nom;
	private String solde;


	public Gab(String nom, String solde) {
		super();
		
		this.nom = nom;
		this.solde = solde;

	
		
	}


	public Gab() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getSolde() {
		return solde;
	}


	public void setSolde(String solde) {
		this.solde = solde;
	}


	

}
