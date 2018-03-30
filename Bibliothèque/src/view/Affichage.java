package view;

import model.Document;
import model.Revue;

import java.util.Collection;


/**
 * Utilitaires d'affichage
 */
public class Affichage {


    public void afficherDocuments(Collection<Document> docs) {
        /* affiche tous les ouvrages reçus en parametres*/
        for ( Document doc : docs ) {
            System.out.println(doc);
        }
    }
/*
    public void afficherAuteurs(Collection<Document> docs) {
        /* affiche la liste des auteurs, par ordre alphabétique,
        de tous les ouvrages reçus en parametre qui ont un auteur */
        /*for (Document doc : docs) {
            if ((doc.getClass() == Document )) {
                continue;
            }
        }
    }*/
}
