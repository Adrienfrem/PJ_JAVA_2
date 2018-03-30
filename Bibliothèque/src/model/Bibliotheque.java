package model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Bibliotheque {

	// Liste des documents de la bibliotheque
	private List<Document> documents;

	/**
	 * Constructeur d'une bibliotheque dont la liste de documents est vide.
	 */

	public Bibliotheque() {
		this.documents = new ArrayList<Document>();
	}

	/**
	 * Renvoie la liste des documents de la bibliotheque.
	 */
	public List<Document> getDocuments() {
		return this.documents;
	}

	/**
	 * Renvoie le i �me document de la liste des documents, s�il existe,
	 * ou null sinon.
	 */

	public Document getDocument(int i) {
		try {
			return (documents.get(i));
		} catch (IndexOutOfBoundsException e) {
			return (null);
		}
	}

	/**
	 * Si doc est non null et n'appartient pas d�j� � la liste des documents,
	 * alors ajoute doc � cette liste et renvoie true ;
	 * sinon renvoie faux.
	 */
	public boolean addDocument(Document doc) {
		if (doc == null)
			return (false);
		if (!documents.contains(doc)) {
			documents.add(doc);
			return true;
		}
		return false;
	}

	/**
	 * Si doc est dans la liste des documents, alors l'y supprime et renvoie true;
	 * sinon renvoie false.
	 */
	public boolean removeDocument(Document doc) {
		if (documents.contains(doc)) {
			System.out.println("test1");
			documents.remove(doc);
			return true;
		}
		System.out.println("test2");
		return false;
	}


	@Override
	public String toString() {
		return "Bibliotheque de " + documents.size() + " documents";
	}


	public void sort() {
		Collections.sort(this.getDocuments());
	}
}
/*
    public void sortAutor() {
	    Document d = new Document();
        Collection.sort(this.getDocuments(), d.com);
    }
}*/
