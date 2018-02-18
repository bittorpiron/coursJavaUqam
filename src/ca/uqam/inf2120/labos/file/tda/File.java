package ca.uqam.inf2120.labos.file.tda;

/**
 * Interface File<T> contenant des �l�ments de type T.
 * 
 * @author Ismael Doukoure
 * @version 2008-01-27
 * Modifi� le 08 f�vrier 2014
 */
public interface File<T> {

	/**
	 * Ajoute e � la queue de la file.
	 * 
	 * @param e l'�l�ment � ajouter.
	 */
	public void enfiler(T e);

	/**
	 * Retire l'�l�ment au d�but de la file.
	 * 
	 * @return L'�l�ment retir�.
	 * @throws FileVideException Si la file est vide.
	 */
	public T defiler() throws FileVideException;

	/**
	 * Retourne vrai si et seulement si la file est vide.
	 * 
	 * @return true si la file est vide, sinon false.
	 */
	public boolean estVide();

	/**
	 * Retorune le nombre d'�l�ments dans la file.
	 * 
	 * @return Le nombre d'�l�ments.
	 */
	public int taille();

	/**
	 * Retourne l'�l�ment en t�te de file sans le retirer.
	 * 
	 * @return L'�l�ment au d�but.
	 * @throws FileVideException Si la pile est vide.
	 */
	public T debut() throws FileVideException;
	

}
