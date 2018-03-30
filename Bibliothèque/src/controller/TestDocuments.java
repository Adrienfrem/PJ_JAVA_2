package controller;

import model.Bibliotheque;
import model.Document;
import model.Livre;
import model.Manuel;
import model.Revue;
import model.Roman;
import view.Affichage;

public class TestDocuments {

	/**
	 * Programme de test.
	 */
	public static void main(String[] args) {

		Document[] documents = {
			new Livre("L'archipel du Goulag", "Soljenitsyne", 250),
			new Roman("Rouge Bresil", "Rufin", 120, Roman.GONCOURT),
			new Revue("Le point", 03, 2014),
			new Roman("Le mendiant", "Wiesel", 150, Roman.MEDICIS),
			new Livre("La condition humaine", "Malraux", 130),
			new Manuel("Manuel qualite ISO 9001", "AFNOR", -1, 3)
		};
/*
        for ( Document doc : documents ) {
            System.out.println(doc);
        }
*/
        Bibliotheque bibli1 = new Bibliotheque();
        bibli1.addDocument(documents[0]);
        bibli1.addDocument(documents[1]);
        bibli1.addDocument(documents[2]);
        bibli1.addDocument(documents[3]);
        Affichage Affichage = new Affichage();
        Affichage.afficherDocuments(bibli1.getDocuments());
        bibli1.sort();
        Affichage.afficherDocuments(bibli1.getDocuments());

    }

}
