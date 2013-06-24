package tn.edu.espritCs.gab.domain;


public class Mail {
	
	private String source;
    private String dest;
    private String objet;
    private String corps;

    public Mail(){}
    public Mail(String source,String dest,String objet,String corps)
    {
     this.source=source;
     this.dest=dest;
     this.objet=objet;
     this.corps=corps;

    }
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
    
    
}
