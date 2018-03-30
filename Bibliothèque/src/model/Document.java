package model;


import javax.print.Doc;
import java.util.Comparator;
import java.util.HashSet;

public abstract class Document implements Comparable<Document> {
	
	private int numEnreg;
	private String titre;

	public Document(String titre) {
		this.titre = titre;
	}

	public int getNumEnreg() {
		return numEnreg;
	}

	public void setNumEnreg(int numEnreg) {
		this.numEnreg = numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

    public int compare(Document document1, Document document2){
        return document1.getTitre().compareTo(document2.getTitre());
    }

    public static void compareAuteur(Document document1, Document document2) {

    }


    @Override
    public String toString() {
        return "Document{" +
                "numEnreg=" + numEnreg +
                ", titre='" + titre + '\'' +
                '}';
    }
}
