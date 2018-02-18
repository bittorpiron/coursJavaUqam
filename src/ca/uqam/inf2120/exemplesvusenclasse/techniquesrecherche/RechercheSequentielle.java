package ca.uqam.inf2120.exemplesvusenclasse.techniquesrecherche;

import java.util.Arrays;


/**
 * RechercheSequentielle.
 * 
 * Universit� du Qu�bec � Montr�al 
 * 
 * INF2120 - Programmation II
 * 
 * @author Ismael Doukoure
 * @version Avril 2008 
 * Modifi� en Avril 2014
 * 
 */
public class RechercheSequentielle<T extends Comparable<T>> {
	
	/**
	 * Recherche s�quentielle dans un tableau non ordonn�.
	 * @param tableau Tableau d'�l�ments
	 * @param valeurRecherche Valeur recherch�e
	 * @return Positon de l'�l�ment recherch� ou -1 si non trouv�
	 */
	public int rechercheSeqNonOrdonnee(T tableau[], T valeurRecherche ) {

		int position  = -1;
		for( int i = 0 ; i < tableau.length && position == -1 ; i++ ) {
			if( tableau[i].compareTo(valeurRecherche) == 0) {
				position =  i; 
			}
				
		}
		
		return position;
   }
	
	/**
	 * Recherche s�quentielle dans un tableau ordonn�.
	 * @param tableau Tableau d'�l�ments
	 * @param valeurRecherche Valeur recherch�e
	 * @return Positon de l'�l�ment recherch� ou -1 si non trouv�
	 */
	public int rechercheSeqOrdonnee (T tableau[], T valeurRecherche ) {

		int position  = -1;
		boolean existePas = false;
		
		for( int i = 0 ; i < tableau.length && position == -1 && !existePas ; i++ ) {
			if(tableau[i].compareTo(valeurRecherche) == 0 ) {
				position  = i; 
			} else if(tableau[i].compareTo(valeurRecherche)  >  0) {
				existePas = true; 
			}
			
		}
		
		return position;
   } 
	

	public static void main(String[] args) {
		
		Integer[] tableauDesordonne = {2,5,10,4,7,1,8,3,6,9};
		Integer[] tableauOrdonne =  {1,2,3,4,5,6,7,8,9,10};
		
		RechercheSequentielle<Integer> rechercheSequentielle = new RechercheSequentielle<Integer>();
		
		System.out.print(Arrays.asList(tableauOrdonne));
		System.out.print(Arrays.asList(tableauDesordonne));

		System.out.println();
		System.out.println();
		System.out.println("Indice est " + rechercheSequentielle.rechercheSeqNonOrdonnee(tableauDesordonne, 8));
		System.out.println("Indice est " + rechercheSequentielle.rechercheSeqOrdonnee(tableauOrdonne, 8));
		
	}


}
