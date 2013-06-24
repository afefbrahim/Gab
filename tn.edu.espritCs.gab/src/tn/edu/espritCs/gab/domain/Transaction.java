package tn.edu.espritCs.gab.domain;


public class Transaction {
	private int id;
	private String type;
	private String solde;
	private String date;


	public Transaction(int id, String type, String solde, String date) {
		super();
		
		this.id = id;
		this.type = type;
		this.solde = solde;
		this.date = date;

			
	}


	public Transaction() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSolde() {
		return solde;
	}


	public void setSolde(String solde) {
		this.solde = solde;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


}
