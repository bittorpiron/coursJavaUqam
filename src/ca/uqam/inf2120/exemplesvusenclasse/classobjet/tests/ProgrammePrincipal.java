package ca.uqam.inf2120.exemplesvusenclasse.classobjet.tests;

import ca.uqam.inf2120.exemplesvusenclasse.classobjet.Personne;



/**
 * Test de la classe Personne
 * Date : Janvier 2014
 * @author Ismael Doukoure
 * @version 1.0
 *
 */
public class ProgrammePrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Cr�er et afficher l'objet personneUn
		Personne personneUn = new Personne("Heraux", "Daniel", 101);
		personneUn.afficher();
		
		// Cr�er et afficher l'objet personneDeux
		Personne personneDeux = new Personne("Dian�", "Mamady", 89);
		personneDeux.afficher();
		

	}

}
