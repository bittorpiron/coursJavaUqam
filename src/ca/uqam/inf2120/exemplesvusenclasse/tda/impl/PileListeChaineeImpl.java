package ca.uqam.inf2120.exemplesvusenclasse.tda.impl;

import java.util.EmptyStackException;

import ca.uqam.inf2120.exemplesvusenclasse.listechainee.Noeud;
import ca.uqam.inf2120.exemplesvusenclasse.tda.Pile;



/**
 * Impl�mentation du tda Pile avec une liste cha�n�e.
 * 
 * @author Ismael Doukoure
 * @version 2008-02-03
 * Modifi� le 12 mars 2014
 */
public class PileListeChaineeImpl<T> implements Pile<T> {
	
	private Noeud<T> sommet; // La r�f�rence vers le sommet de la pile
	private int nbElements;  // Nombre d'�lements dans la pile
	
	/**
	 * Constructeur sans argument permet
	 * de cr�er une nouvelle pile sous forme 
	 * de liste cha�n�e. 
	 */
	public PileListeChaineeImpl() {
		sommet = null;
		nbElements = 0;
	}

	/* (non-Javadoc)
	 * @see adt.pile.Pile#empiler(java.lang.Object)
	 */
	public void empiler(T nouveauElement) {

		// Cr�er un nouveau noeud avec le nouveau �l�ment
		Noeud<T> unNoeud = new Noeud<T>(nouveauElement); 
		// Initialiser la variable suivant du nouvel objet avec leSommet
		unNoeud.setSuivant(sommet); 
		// Remplacer la r�f�rence par le nouveau sommet (nouveau noeud)
		sommet = unNoeud; 
		// Incr�mente le nombre d'�l�ments
		nbElements++;     

	}

	/* (non-Javadoc)
	 * @see adt.pile.Pile#depiler()
	 */
	public T depiler() {
		
		// V�rification si la pile est vide
		if (estVide()) { 
			throw new EmptyStackException();
		}
		
		// Obtenir la r�ference vers l'�lement du 1er noeud
		T element = sommet.getElement();  
		// D�placer le sommet sur le noeud suivant
		sommet = sommet.getSuivant();
		// D�cr�menter le nombre d'�l�ments
		nbElements--; 
		
		return element; 
	}

	/* (non-Javadoc)
	 * @see adt.pile.Pile#estVide()
	 */
	public boolean estVide() {
		return (sommet == null);
	}

	/* (non-Javadoc)
	 * @see adt.pile.Pile#taille()
	 */
	public int taille() {
		return nbElements;
	}

	/* (non-Javadoc)
	 * @see adt.pile.Pile#sommet()
	 */
	public T sommet() {
		
		if (estVide()) {
			throw new EmptyStackException();
		}
		
	   return sommet.getElement(); 
	}

	/* (non-Javadoc)
	 * @see adt.pile.Pile#vider()
	 */
	public void vider() {
		sommet = null;
		// Reinitialiser le nombre d'�l�ments � 0
		nbElements = 0; 

	}


}
