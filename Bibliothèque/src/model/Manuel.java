package model;

// TO DO ...
public class Manuel  extends Livre{

	private int niveau;

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public Manuel(String titre, String auteur, int nbPages, int niveau) {

		super(titre, auteur, nbPages);
		this.niveau = niveau;
	}


//	public int compare(Manuel document1, Manuel document2) {
//		return document1.getAuteur().compareTo(document2.getAuteur());
//	}
//
//    public int compare(Document document1, Document document2) {
//        return document1.getTitre().compareTo(document2.getTitre());
//    }

    public int compareTo(Document document) {
        return this.getTitre().compareTo(document.getTitre());
    }
    public int getClass(Document document) {
        return 2;
    }

	@Override
    public String toString() {
        return "Manuel{" +
                "Niveau = " + niveau +
                ", Auteur = " + getAuteur() +
                ", Nombre de pages = " + getNbPages() +
                ", Titre = " + getTitre()+
                ", Num enregistre = " + getNumEnreg() +'}';
    }
}
