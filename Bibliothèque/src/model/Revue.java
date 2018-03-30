package model;

// TO DO ...
public class Revue extends Document{

	private int mois;
	private int annee;

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Revue(String titre, int mois, int annee) {

		super(titre);
		this.mois = mois;
		this.annee = annee;
	}


//	public int compare(Revue document1, Revue document2) {
//        return -2;
//	}
//    public int compare(Document document1, Document document2) {
//        return -2;
//    }

    public int compareTo(Document document) {
        return this.getTitre().compareTo(document.getTitre());
    }

    public int getClass(Document document) {
        return 3;
    }

	@Override
	public String toString() {
		return "Revue{" +
				"Mois = " + mois +
				", Annee = " + annee +
                ", Titre = " + getTitre()+
                ", Num enregistre = " + getNumEnreg() +'}';
	}
}
