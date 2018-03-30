package model;

public class Livre extends Document implements InterfaceAuteur {

	private String auteur;
	private int nbPages;

	public Livre(String titre, String auteur, int nbPages) {
		super(titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}

	@Override
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

    public int compareTo(Document document) {
        return this.getTitre().compareTo(document.getTitre());
    }

//    public int compare(Document document1, Document document2) {
//        return document1.getTitre().compareTo(document2.getTitre());
//    }

    public int getClass(Document document) {
	    return 1;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "Auteur = '" + auteur + '\'' +
                ", nbPages = " + nbPages +
                ", Titre = " + getTitre()+
                ", Num enregistre = " + getNumEnreg() +'}';
    }
}
