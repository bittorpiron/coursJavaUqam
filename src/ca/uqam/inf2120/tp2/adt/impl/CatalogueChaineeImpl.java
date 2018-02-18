/**
 * CatalogueChaineeImpl.java
 */
package ca.uqam.inf2120.tp2.adt.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ca.uqam.inf2120.tp2.adt.Catalogue;
import ca.uqam.inf2120.tp2.adt.NombreCopies;

/**
 * UQAM - Hiver 2014 - INF2120 - Groupe 30 - TP2 (Isma�l Doukour�)
 * 
 * CatalogueChaineeImpl : Impl�mentation en utilisant une liste cha�n�e de
 * l�interface Catalogue.
 * 
 * @author Victor Piron
 * PIRV11026606
 * INF2120 Groupe 30 (Isma�l Doukoure)
 * piron.victor@courrier.uqam.ca  
 * @version 2014-03-30
 * @param <T>
 */
public class CatalogueChaineeImpl<T extends NombreCopies> implements
		Catalogue<T> {

	private Noeud<T> tete; // La r�f�rence vers le premier �l�ment du catalogue
	private Noeud<T> iterateur; // La r�f�rence vers un it�rateur du catalogue

	/**
	 * Constructeur sans arguments de l'impl�mentation Liste Cha�n�e pour
	 * Catalogue
	 */
	public CatalogueChaineeImpl() {

		this.vider();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#ajouter(ca.uqam.inf2120.tp2.adt.
	 * NombreCopies)
	 */
	@Override
	public boolean ajouter(T elt) {

		boolean ajoute = false;

		// Valider le nouveau �l�ment � ajouter
		if (estValide(elt)) {

			// Si liste vide, ajouter en tant que t�te
			if (estVide()) {

				tete = new Noeud<T>(elt);
				ajoute = true;

			} else {

				// Parcourir la liste cha�n�e
				T eltCourant;
				Noeud<T> noeudCourant = tete;

				while (noeudCourant != null && !ajoute) {

					eltCourant = noeudCourant.getElement();

					// Augmenter le nb. de copies si existe
					if (eltCourant.equals(elt)) {

						eltCourant.augmenter(elt.obtenirNbCopies());
						ajoute = true;

					} else if (noeudCourant.getSuivant() != null) {

						// Avancer le parcours si pas dernier
						noeudCourant = noeudCourant.getSuivant();

					} else {

						// Si dernier, ajouter � la fin
						noeudCourant.setSuivant(new Noeud<T>(elt));
						ajoute = true;

					}
				}
			}
		}

		return ajoute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ca.uqam.inf2120.tp2.adt.Catalogue#ajouter(ca.uqam.inf2120.tp2.adt.Catalogue
	 * )
	 */
	@Override
	public void ajouter(List<T> liste) {

		// Valider la nouvelle liste
		if (estValide(liste)) {

			for (T elmt : liste) {

				ajouter(elmt);

			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#supprimer(ca.uqam.inf2120.tp2.adt.
	 * NombreCopies)
	 */
	@Override
	public boolean supprimer(T elt) {

		boolean supprime = false;

		// Valider la liste et l'�l�ment � supprimer
		if (!estVide() && estValide(elt)) {

			// Parcourir la liste cha�n�e
			Noeud<T> noeudCourant = tete;
			Noeud<T> noeudPrecedent = null;
			T eltCourant = noeudCourant.getElement();

			while (noeudCourant != null && !supprime) {

				eltCourant = noeudCourant.getElement();

				// Supprimer nb. de copies si trouv� et sortir
				if (eltCourant.equals(elt)) {

					eltCourant.diminuer(elt.obtenirNbCopies());
					supprime = true;

				} else {
					// Avancer le parcours
					noeudPrecedent = noeudCourant;
					noeudCourant = noeudCourant.getSuivant();
				}
			}

			// Retirer de la liste cha�n�e si nb de copies < 1
			if (supprime && eltCourant.obtenirNbCopies() < 1) {

				// Premier element (pointer la nouvelle tete)
				if (noeudPrecedent == null) {
					// Enl�ver l'unique �l�ment de la liste
					if (tete.getElement() == null) {
						tete = null;
					} else {
						tete = tete.getSuivant();
					}

				} else {

					noeudPrecedent.setSuivant(noeudCourant.getSuivant());

				}
			}
		}
		return supprime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ca.uqam.inf2120.tp2.adt.Catalogue#supprimer(ca.uqam.inf2120.tp2.adt.Catalogue
	 * )
	 */
	@Override
	public List<T> supprimer(List<T> liste) {

		List<T> listeNonSupprimes = new ArrayList<T>();

		// Valider les listes
		if (!estVide() && estValide(liste)) {

			for (T elmt : liste) {

				// Ajouter dans la liste de retour si non enlev� du catalogue
				if (!supprimer(elmt)) {

					listeNonSupprimes.add(elmt);

				}
			}
		}
		// Retourne nul si vide
		if (listeNonSupprimes.isEmpty()) {

			listeNonSupprimes = null;
		}

		return listeNonSupprimes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#remplacer(ca.uqam.inf2120.tp2.adt.
	 * NombreCopies, ca.uqam.inf2120.tp2.adt.NombreCopies)
	 */
	@Override
	public boolean remplacer(T eltARemplacer, T nouveauelt) {

		boolean remplace = false;

		// Valider si:
		// ma liste cha�n�e n'est pas vide
		// "eltARemplacer" existe dans la liste
		// "nouveauElt" n'est pas nul, il n'existe pas d�j� dans la liste et son
		// nombre de copies est sup�rieur � 0

		if (!estVide() && existe(eltARemplacer) && estValide(nouveauelt)
				&& !existe(nouveauelt)) {

			// Parcourir la liste cha�n�e
			Noeud<T> noeudCourant = tete;

			while (noeudCourant != null && !remplace) {

				// Si l'�l�ment � remplacer est trouv�, sortir
				if (noeudCourant.getElement().equals(eltARemplacer)) {

					noeudCourant.setElement(nouveauelt);
					remplace = true;

				} else {
					// Avancer le parcours
					noeudCourant = noeudCourant.getSuivant();
				}
			}
		}

		return remplace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ca.uqam.inf2120.tp2.adt.Catalogue#existe(ca.uqam.inf2120.tp2.adt.NombreCopies
	 * )
	 */
	@Override
	public boolean existe(T elt) {

		boolean eltExiste = false;

		// Valider liste et �l�ment
		if (!estVide() && (elt != null)) {

			// Parcourir la liste cha�n�e
			Noeud<T> noeudCourant = tete;

			while (noeudCourant != null && !eltExiste) {

				// Trouv� et sortir
				if (noeudCourant.getElement().equals(elt)) {

					eltExiste = true;

				} else {
					// Avancer le parcours
					noeudCourant = noeudCourant.getSuivant();
				}
			}
		}
		return eltExiste;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#nbCopies(ca.uqam.inf2120.tp2.adt.
	 * NombreCopies)
	 */
	@Override
	public int nbCopies(T elt) {

		int nbrCopies = 0;

		// Valider la liste et l'�l�ment
		if (!estVide() && estValide(elt)) {

			// Parcourir la liste cha�n�e
			Noeud<T> noeudCourant = tete;
			T eltCourant;

			// Tous les �l�ments de la liste ont un nbrCopies > 0
			while (noeudCourant != null && nbrCopies == 0) {

				eltCourant = noeudCourant.getElement();

				// Supprimer nb. de copies si trouv� et sortir
				if (eltCourant.equals(elt)) {

					nbrCopies = eltCourant.obtenirNbCopies();

				} else {
					// Avancer le parcours
					noeudCourant = noeudCourant.getSuivant();
				}
			}
		}

		return nbrCopies;

	}

	/**
	 * Valide l'�l�ment pass� ne soit pas nul ou avec un nombre de copies
	 * inf�rieur � 1
	 * 
	 * @param elt
	 *            �l�ment pass� en param�tre
	 * @return vrai si pas nul et avec un nombre de copies sup�rieur � 1
	 */
	private boolean estValide(T elt) {

		return elt != null && elt.obtenirNbCopies() > 0;
	}

	/**
	 * Valide que la liste pass� ne soit pas nul ou vide
	 * 
	 * @param liste
	 *            pass� en param�tre
	 * @return vrai si pas nul et pas vide
	 */
	private boolean estValide(List<T> liste) {

		return liste != null && !liste.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#nbTotalCopies()
	 */
	@Override
	public int nbTotalCopies() {

		int nbrTotalCopiesDansLaListe = 0;

		Noeud<T> noeudCourant = tete;

		// Parcourir la liste cha�n�e
		while (noeudCourant != null) {
			nbrTotalCopiesDansLaListe += noeudCourant.getElement()
					.obtenirNbCopies();
			noeudCourant = noeudCourant.getSuivant();
		}

		return nbrTotalCopiesDansLaListe;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ca.uqam.inf2120.tp2.adt.Catalogue#estEgale(ca.uqam.inf2120.tp2.adt.Catalogue
	 * )
	 */
	@Override
	public boolean estEgale(Catalogue<T> liste) {

		boolean egale = false;

		// Si liste nule, ne peuvent pas �tre �gales
		if (liste != null ) {

			// Les deux sont vides, pas besoin de parcourir 
			if (estVide() && liste.estVide()) {

				egale = true;

			} else {
				// Parcourir la liste re�ue jusqu'au moment de trover une diff�rence
				egale = true;

				Iterator<T> itListe = liste.iterator();
				while (itListe.hasNext() && egale) {

					// Si l'�l�ment ne se trouv� pas ou il a un nombre diff�rent
					// de copies, alors les liste sont diff�rentes
					if (!estEgale(itListe.next())) {

						egale = false;

					}
				}

				// V�rifier que le Catalogue actuel n'a pas plus d'�l�ments que
				// celui pass� en param�tre
				if (egale) {
					Noeud<T> noeudCourant = tete;
					while (noeudCourant != null && egale) {
						
						if (!liste.existe(noeudCourant
								.getElement())) {

							egale = false;

						} else {

							noeudCourant = noeudCourant.getSuivant();
						}
					}
				}
			}
		}
		return egale;
	}

	/**
	 * V�rifie si l'�l�ment pass�e existe dans la liste existante et qu'ils
	 * contiennent le m�me nombre de copies.
	 * 
	 * @param elt
	 *            �l�ment � v�rifier
	 * @return vrai si trouv� et m�me nombre des copies
	 */
	private boolean estEgale(T elt) {

		boolean egale = false;
		boolean trouve = false;

		// Parcourir la liste cha�n�e
		Noeud<T> noeudCourant = tete;

		while (noeudCourant != null && !trouve) {

			// Sortir si trouv�
			if (noeudCourant.getElement().equals(elt)) {

				trouve = true;

				// V�rifier le nombre de copies
				if (noeudCourant.getElement().obtenirNbCopies() == elt
						.obtenirNbCopies()) {

					egale = true;
				}
			} else {
				// Avancer le parcours
				noeudCourant = noeudCourant.getSuivant();
			}
		}

		return egale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#estVide()
	 */
	@Override
	public boolean estVide() {

		return tete == null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uqam.inf2120.tp2.adt.Catalogue#vider()
	 */
	@Override
	public void vider() {

		tete = null;

	}

	/*
	 * Initialise l�it�rateur pour pointer vers la t�te de la liste
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<T> iterator() {

		iterateur = new Noeud<T>(null, tete);
		return this;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {

		return iterateur != null && iterateur.getSuivant() != null;

	}

	/*
	 * La r�f�rence vers le n�ud suivant peut �tre nulle il faut v�rifier avant
	 * acc�der avec hasNext pour �viter NoSuchElementException
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public T next() {

		iterateur = iterateur.getSuivant();
		return iterateur.getElement();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {

		// Laisser vide

	}
}