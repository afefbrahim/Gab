package tn.edu.espritCs.gab.domain;


public class Carte {

	private int num;
	private int pwd;
	private String date_validite;
	private String date_confiscation;
	private String etat;
	
	
	public Carte(int num, int pwd, String date_validite, String date_confiscation,
			String etat) {
		super();
		this.num = num;
		this.pwd = pwd;
		this.date_validite = date_validite;
		this.date_confiscation = date_confiscation;
		this.etat = etat;
		
	}


	public Carte() {
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getPwd() {
		return pwd;
	}


	public void setPwd(int pwd) {
		this.pwd = pwd;
	}


	public String getDate_validite() {
		return date_validite;
	}


	public void setDate_validite(String date_validite) {
		this.date_validite = date_validite;
	}


	public String getDate_confiscation() {
		return date_confiscation;
	}


	public void setDate_confiscation(String date_confiscation) {
		this.date_confiscation = date_confiscation;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	
}
