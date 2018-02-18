package ca.uqam.inf2120.tp2.adt;

import java.util.Iterator;
import java.util.List;


/**
 * UQAM - Hiver 2014 - INF2120 - Groupe 30 - TP2 
 * 
 * ListeAdt : Cette interface d�finit les services d'une liste dans laquelle 
 * un �l�ment peut apparaitre plusieurs fois. Le nombre de fois qu'un �l�ment
 * apparait dans la liste est appel� nombre de copie et support� par l'interface
 * NombreCopie. Le nombre de copies de tout �l�ment pr�sent dans la liste doit
 * �tre sup�rieur � 0.    
 *    
 * @author Ismael Doukoure
 * @version 12 mars 2014
 */
public interface Catalogue<T extends NombreCopies> extends Iterable<T>, Iterator<T>{

	/**
     * Ajoute "elt" dans la liste s'il n'existe pas, sinon, augmente son nombre de
     * copie (nombre de copies de "elt" dans la liste  + nombre de copies de "elt"
     * pass� en param�tre). Aucun ajout si "elt" est nul ou son nombre de copie 
     * est inf�rieur � 1. L'�l�ment est ajout� � la fin de la liste.
     * 
     * @param elt L'�l�ment � ajouter
     * @return true si "elt" est ajout�, sinon false.
     */
     public boolean ajouter(T elt);
    
     /**
      * Ajoute tous les �l�ments de la liste pass�e en param�tre dans la liste existante.
      * Si l'�l�ment � ajouter existe d�j� dans la liste courante, son nombre de copie est
      * augment� (nombre de copies de l'�l�ment dans la liste courante  + nombre de copies de
      * l'�l�ment de la liste pass�e en param�tre). Les �l�ments sont ajout�s � la fin de 
      * la liste.
      * 
      * Aucun ajout :
      *   - si la liste est vide ou nulle.
      *   - si l'�l�ment est nul ou son nombre de copie est inf�rieur � 1.
      *   
      * @param liste La liste dont les �l�ments doivent �tre ajout�s
      */
     public void ajouter(List<T> liste);
    
         
     /**
      * Supprime "elt" dans la liste existante en diminuant son nombre de copies
      * (nombre de copies de "elt" dans la liste  - nombre de copies de "elt" pass� en
      * param�tre). L'�l�ment doit �tre retir� de la liste si son nombre de copies apr�s
      * diminution est inf�rieur � 1. Aucune suppression si "elt" est nul, s'il n'existe 
      * pas dans la liste ou son nombre de copies est inf�rieur � 1. 
      * 
      * @param elt L'�l�ment � supprimer
      * @return Vrai si l'�l�ment est supprim�, sinon faux 
      */
      public boolean supprimer(T elt);
    
      /**
       * Supprime tous les �l�ments de la liste pass�e en param�tre dans la liste existante
       * en diminuant leur nombre de copies (nombre de copies de "elt" dans la liste 
       * existante - nombre de copies de "elt" de la liste pass�e en param�tre). L'�l�ment
       * doit �tre retir� de la liste existante si son nombre de copies apr�s diminution est
       * inf�rieur � 1. Tous les �l�ments non supprim�s de la liste pass�e en param�tre sont
       * retourn�s dans une autre liste (ArrayList).
       * 
       * @param liste La liste dont les �l�ments doivent �tre supprim�s
       * @return La liste des �l�ments non supprim�s, nul si tous les �l�ments sont supprim�s.
       */
      public List<T> supprimer(List<T> liste);
    
    /**
     * Remplace "eltARemplacer" dans la liste existante par "nouveauElt". 
     * Aucun remplacement ne doit �tre fait :
     *   - si "eltARemplacer" n'existe pas dans la liste
     *   - si "nouveauElt" est nul, s'il existe d�j� dans la liste ou son nombre de copies est
     *     inf�rieur � 1. 
     * 
     * @param eltARemplacer L'�lement de la liste � remplacer
     * @param nouveauElt Le nouveau �l�ment
     * @return Vrai si le remplacement est fait, sinon faux
     */
     public boolean remplacer(T eltARemplacer, T nouveauelt);
    
     /**
      * v�rifie si l'�l�ment pass� en param�tre existe dans la liste.
      * 
      * @param elt L'�l�ment dont l'existence doit �tre v�rifi�e.
      * @return true si "elt" existe, sinon false
      */
      public boolean existe(T elt);
      
    /**
     * Retourne le nombre de copies de "elt" dans la liste existante.
     * 
     * @param elt L'�lement dont le nombre de copies doit �tre retourn�
     * @return Le nombre de copies
     */
     public int nbCopies(T elt);
     
     /**
      * Retourne le nombre total de copies de tous les �l�ments dans la liste existante.
      * 
      * @return Le nombre total de copies
      */
      public int nbTotalCopies();
    
    /**
     * V�rifie si la liste pass�e en param�tre contient les m�mes �l�ments (m�me nombre
     * de copies) que la liste existante.
     *          
     * @param liste  La liste dont l'existence des �l�ments doit �tre v�rifi�e
     * @return Vrai si les deux (2) listes sont �gales, sinon faux
     */
     public boolean estEgale(Catalogue<T> liste);
    
	 /**
     * V�rifie si la liste existante est vide.
     * 
     * @return Vrai si la liste est vide, sinon faux
     */
     public boolean estVide();
     

    /**
     * vide la liste en supprimant tous les �lements de la liste.
     */
     public void vider();
     
     /* INFORMATIONS IMPORTANTES : �tant donn� que ListeAdt h�rite des interfaces
      * Iterable<T>, Iterator<T>, vous devez d�finir toutes les m�thodes qui sont
      * d�clar�es dans ces interfaces (SAUF la m�thode remove de l'interface Iterator<T>)
      * dans votre classe ListeAdtImpl qui impl�mente l'interface ListeAdt. Voir
      * ci-dessous pour les d�tails :
      *
      *
      * Iterable<T>
      * Cette interface contient une seule m�thode "public Iterator<T> iterator()"
      * qui retourne un iterator sur la liste courante. Vous devez implanter cette
      * methode dans votre classe
      *
      *
      * Iterator<T>
      * Cette interface contient trois m�thodes:
      *
      *   - public boolean hasNext() : V�rifie s'il y a un �l�ment � partir de la
      *     position courante dans la liste
      *
      *   - public T next() : Retourner l'�l�ment � la position courante et
      *     repositionne le curseur (l'it�rateur) sur l'�l�ment suivant.
      *
      *   - public void remove () : � NE PAS D�FINIR. Donc cette m�thode sera vide avec
      *     juste les accolades ouvrante et fermante.
      *
      */
    
}


