package ca.uqam.inf2120.exemplesvusenclasse.tda;

/**
 * Interface Pile<T> contenant des �l�ments de type T.
 * 
 * @author Ismael Doukoure
 * @version 2008-01-22
 * Modifi� le 08 f�vrier 2014
 */
public interface Pile<T> {
	
	/**
     * Ajoute e au sommet de la pile.
     * 
     * @param e l'�l�ment � ajouter.
     */
      public void empiler(T e);
     
     /**
      * Retire l'�l�ment du sommet de la pile.
      * 
      * return L'�l�ment retir�.
      * @throws ExceptionPileVide Si la pile est vide.
      */
      public T depiler() throws PileVideException;
     
     /**
      * Retourne vrai si et seulement si la pile est vide.
      * 
      * @return true si la pile, sinon false.
      */
      public boolean estVide();
      
    
      /**
       * Retorune le nombre d'�l�ments dans la pile.
       * 
       * @return Le nombre d'�l�ments.
       */
       public int taille();
    
       /**
        * Retourne l'�l�ment au sommet de la pile sans le retirer.
        * 
        * @return L'�l�ment au sommet.
        * @throws ExceptionPileVide Si la pile est vide.
        */    
        public T sommet()  throws PileVideException;
    
    
}
