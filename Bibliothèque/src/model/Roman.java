package model;

public class Roman extends Livre{

    public static final int GONCOURT = 1 ;
    public static final int MEDICIS = 2;

    private int prixLitteraire;

	public int getPrixLitteraire() {
		return prixLitteraire;
	}

	public void setPrixLitteraire(int prixLitteraire) {
		this.prixLitteraire = prixLitteraire;
	}

	public Roman(String titre, String auteur, int nbPages, int prixLitteraire) {

		super(titre, auteur, nbPages);
		this.prixLitteraire = prixLitteraire;
	}



//    public int compare(Roman document1, Roman document2) {
//        return document1.getAuteur().compareTo(document2.getAuteur());
//    }
//    public int compare(Document document1, Document document2) {
//        return document1.getTitre().compareTo(document2.getTitre());
//    }

    public int getClass(Document document) {
        return 4;
    }

    // to do afficher nom prix littéraire
    @Override
    public String toString() {
        return "Roman{" +
                "Prix Litteraire = " + prixLitteraire +
                ", Auteur = " + getAuteur() +
                ", Nombre de pages = " + getNbPages() +
                ", Titre = " + getTitre()+
                ", Num enregistre = " + getNumEnreg() +'}';
    }
}
