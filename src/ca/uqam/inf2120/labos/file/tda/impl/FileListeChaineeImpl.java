/**
 * FileListeChaineeImpl.java
 */
package ca.uqam.inf2120.labos.file.tda.impl;

import ca.uqam.inf2120.exemplesvusenclasse.listechainee.Noeud;
import ca.uqam.inf2120.exemplesvusenclasse.tda.File;
import ca.uqam.inf2120.exemplesvusenclasse.tda.FileVideException;


/**
 * @author Victor Piron
 * PIRV11026606
 * INF2120 Groupe 30 (Isma�l Doukoure)
 * piron.victor@courrier.uqam.ca  
 * @version 2014-03-13
 * @param <T>
 */
public class FileListeChaineeImpl<T> implements File<T> {
	
	private Noeud<T> debut; // La r�f�rence vers le premier de la file
	private Noeud<T> fin;   // La r�f�rence vers le dernier de la file
	private int nbElements;  // Nombre d'�lements dans la file
	
	/**
	 * Constructeur sans argument permet
	 * de cr�er une nouvelle file sous forme 
	 * de liste cha�n�e. 
	 */
	public FileListeChaineeImpl() {
		debut = null;
		fin = null;
		nbElements = 0;
	}
	
	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.labos.file.tda.File#enfiler(java.lang.Object)
	 */
	@Override
	public void enfiler(T nouveauElement) {
		
		// Cr�er un nouveau noeud avec le nouveau �l�ment
		Noeud<T> unNoeud = new Noeud<T>(nouveauElement); 
		
		if (debut==null){
			
			debut = fin = unNoeud; 
			
		}else{
			// Initialiser la variable suivant du dernier objet avec le noveau element
			fin.setSuivant(unNoeud); 
			// Remplacer la r�f�rence par le nouveau fin (nouveau noeud)
			fin = unNoeud; 			
		}
		
		// Incr�mente le nombre d'�l�ments
		nbElements++; 		
	}

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.labos.file.tda.File#defiler()
	 */
	@Override
	public T defiler() {
		// V�rification si la file est vide
		if (estVide()) { 
			throw new FileVideException();
		}
		
		// Obtenir la r�ference vers l'�lement du 1er noeud
		T element = debut.getElement();  		
		// D�placer le debut sur le noeud suivant
		debut = debut.getSuivant();
		// D�cr�menter le nombre d'�l�ments
		nbElements--; 
		
		return element;
	}

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.labos.file.tda.File#estVide()
	 */
	@Override
	public boolean estVide() {
		return (debut == null);
	}

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.labos.file.tda.File#taille()
	 */
	@Override
	public int taille() {

		return nbElements;
	}

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.exemplesvusenclasse.tda.File#debut()
	 */
	@Override
	public T debut() throws FileVideException {
		if (estVide()) {
			throw new FileVideException();
		}
		
	   return debut.getElement(); 
	   
	}

}
