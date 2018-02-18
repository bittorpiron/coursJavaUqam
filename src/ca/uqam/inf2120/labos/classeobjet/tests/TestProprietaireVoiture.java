package ca.uqam.inf2120.labos.classeobjet.tests;

import ca.uqam.inf2120.labos.classeobjet.Proprietaire;
import ca.uqam.inf2120.labos.classeobjet.Voiture;

/**
 * TestProprietaireVoiture pour tester les classes Voiture et Proprietaire.
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public class TestProprietaireVoiture {

	public static void main(String[] args) {

		// Cr�ation d'une voiture
		Voiture voiture = new Voiture("Mazda Tribute", "Rouge Feu M�talis�", 
									  2005, 4);
		
		// Cr�ation d'un propri�taire
		Proprietaire prop = new Proprietaire("Propescu", "Daniel", 45, voiture);
		
		// Affichage des informations
		prop.afficher();
		
		
	}
}
