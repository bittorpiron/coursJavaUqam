package ca.uqam.inf2120.exemplesvusenclasse.heritage.tests;

import ca.uqam.inf2120.exemplesvusenclasse.heritage.Employe;
import ca.uqam.inf2120.exemplesvusenclasse.heritage.Enseignant;
import ca.uqam.inf2120.exemplesvusenclasse.heritage.Etudiant;


/**
 *  Titre : Notion d'h�ritage
 * 	Description: Classe pour tester Personne et ses sous-classes
 * 
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version Septembre 2008
 * Modifi� en Janvier 2014
 */

public final class ProgrammePrincipal {
	
    public static void main(String [] arguments) {
    	
       // d�claration des constantes
       final String DESCRIPTION_ETUDIANT   = "\n �tudiant " ;
       final String DESCRIPTION_EMPLOYE    = "\n Employ�  " ;
       final String DESCRIPTION_ENSEIGNANT = "\n Enseignant  " ;
       


       //d�claration et initialisation des instances des diff�rentes classes
       Etudiant unEtudiant     = new Etudiant ("Fred","Pinto", "PINF15029901", 2);
       Employe unEmploye       = new Employe ("Danielle","Champ", "CHA01", 75000.70f);
       Enseignant unEnseignant = new Enseignant ("Nanou", "Heraux", "HER02", 65000.55f, 2);
       

      // affichage de la description des diff�rents personnes
      System.out.println("---------------------------------------------------------------------") ;
      System.out.println("                VOICI LA DESCRIPTION DES DIFF�RENTS PERSONNES          ") ;
      System.out.println("---------------------------------------------------------------------") ;
      System.out.println(DESCRIPTION_ETUDIANT + unEtudiant) ;
      System.out.println("********************************************************") ;
      System.out.println(DESCRIPTION_EMPLOYE + unEmploye) ;
      System.out.println("********************************************************") ;
      System.out.println(DESCRIPTION_ENSEIGNANT + unEnseignant) ;
      System.out.println("---------------------------------------------------------------------") ;
      
     }
}
