/**
 * 
 */
package ca.uqam.inf2120.exemplesvusenclasse.interfaces;

/**
 * LangueParlee : Interface d�finissant les services pour dire "Bonjour",
 * "Au revoir" et "Merci" dans diff�rentes langues parl�es.
 * 
 * UQAM - INF2120
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 */

public interface LangueParlee {

	/**
	 * Dire "Bonjour" dans une langue
	 */
	public abstract void direBonjour();

	/**
	 * Dire "Au revoir" dans une langue
	 */
	public abstract void direAuRevoir();

	/**
	 * Dire "Merci" dans une langue
	 */
	public abstract void direMerci();

}
