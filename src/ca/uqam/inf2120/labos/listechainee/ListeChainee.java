package ca.uqam.inf2120.labos.listechainee;

import java.util.Scanner;

import ca.uqam.inf2120.labos.listechainee.utiles.Noeud;

/**
 * ListeChainee contient quelques m�thodes pour ins�rer dans une liste cha�n�e.
 * 
 * UQAM - INF2120
 * 
 * @author Ismael Doukoure
 * @version Mars 2014
 * 
 */

public class ListeChainee {

	/**
	 * Affiche tous les �l�ments d'une liste cha�n�e.
	 * 
	 * @param tete La r�f�rence du premier noeud dans la liste.
	 */
	public static void afficher(Noeud<String> tete) {
		
		if (tete != null) {
			Noeud<String> courant = tete;
			
			System.out.println("----Ma Liste----");
			while(courant != null && courant.getElement() != null) {				
				System.out.println(courant.getElement());
				courant = courant.getSuivant();
			}
		}

	}

	/**
	 * Ins�re l'�l�ment pass� en param�tre au d�but de la liste et
	 * retourne la r�f�rence du 1er noeud de la liste (tete).
	 * 
	 * @param tete La r�f�rence du premier noeud dans la liste.
	 * @param element L'�l�ment � ins�rer
	 * @return La r�f�rence du premier noeud dans la liste.
	 */
	public static Noeud<String> insererDebut(Noeud<String> tete, String element) {
		
		if (element != null) {
			tete = new Noeud<String>(element, tete);
		}

		return tete;

	}

	/**
	 * Ins�re l'�l�ment pass� en param�tre � la fin de la liste et
	 * retourne la r�f�rence du 1er noeud de la liste (tete).
	 * 
	 * @param tete La r�f�rence du premier noeud dans la liste.
	 * @param element L'�l�ment � ins�rer
	 * @return La r�f�rence du premier noeud dans la liste.
	 */
	public static Noeud<String> insererFin(Noeud<String> tete, String element) {
		
		if (element != null) {
			
			if (tete == null) {
				tete = new Noeud<String>(element);
			}
			else {
				Noeud<String> courant = tete;
				
				while (courant.getSuivant() != null) {
					courant = courant.getSuivant();
				}
				
				courant.setSuivant(new Noeud<String>(element));
			}
			
		}

		return tete;

	}

	// M�thode main
	public static void main(String[] args) {

		Noeud<String> tete = null; // reference vers le premier noeud de la liste
		String chaine; // contiendra la chaine lue au clavier et � inserer dans la liste
		boolean fin = false; // indicateur de controle de boucle
		Scanner clavier = new Scanner(System.in);
		
		do {

			System.out.print("Entrez une chaine :");
			chaine = clavier.nextLine();
			chaine = chaine.trim();


			System.out.println(); // Ligne vide
			if (chaine.isEmpty() ) { // fin de la boucle de lecture
				fin = true;
			} else {
				if (chaine.charAt(0) >= 'A' && chaine.charAt(0) <= 'Z') {
					tete = insererDebut(tete, chaine);
				}
				else {
					tete = insererFin(tete, chaine);
				}
			}
		} while (!fin); // tant que la lecture n'est pas finie
		clavier.close();

		afficher(tete);

	}
}
