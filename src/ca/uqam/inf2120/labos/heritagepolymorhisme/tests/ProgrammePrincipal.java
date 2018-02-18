package ca.uqam.inf2120.labos.heritagepolymorhisme.tests;

import ca.uqam.inf2120.labos.heritagepolymorhisme.Abonne;
import ca.uqam.inf2120.labos.heritagepolymorhisme.AbonneCable;
import ca.uqam.inf2120.labos.heritagepolymorhisme.AbonneIllico;
import ca.uqam.inf2120.labos.heritagepolymorhisme.AbonneInternet;

/**
 * 	ProgrammePrincipal: Classe pour tester Abonne et ses sous-classes
 * 
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version F�vrier 2014
 */
public class ProgrammePrincipal {

	
	public static void main(String[] args) {
		
		// Cr�ation d'un tableau d'abonn�s de taille = 3
		Abonne[] lesAbonnes = new Abonne[3];
		
		// Cr�er des objets d'abonn�s
		lesAbonnes[0] = new AbonneInternet(" Fred Costin", 12345678, 
				        "222 Levesque, Montreal, Qu�bec", 95.0f, "fred.costin@tvpourtous.ca");	
		
		lesAbonnes[1] = new AbonneCable(" Isi Bref", 98745645, 
		        		"222 Levesque, St-Eustache, Qu�bec", 90.0f, 5);	
		
		lesAbonnes[2] = new AbonneIllico(" Conakry Guinee", 52896320, 
        		"222 Levesque, St-Eustache, Qu�bec", 70.0f, 5, 2);	
		
		// Afficher les abonn�s
		for (Abonne a : lesAbonnes) {
			a.afficher();
			System.out.println("\n----------------------------------");
		}
		

	}

}
