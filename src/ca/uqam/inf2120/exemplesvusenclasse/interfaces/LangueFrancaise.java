/**
 * 
 */
package ca.uqam.inf2120.exemplesvusenclasse.interfaces;

/**
 * La classe LangueFrancaise impl�mente l'interface LangueParlee.
 * 
 * UQAM - INF2120
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 */
public class LangueFrancaise implements LangueParlee {

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.exemplesvusenclasse.interfaces.LangueParlee#direBonjour()
	 */
	public void direBonjour() {
	      System.out.println("Bonjour");

	}

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.exemplesvusenclasse.interfaces.LangueParlee#direAuRevoir()
	 */
	public void direAuRevoir() {
		System.out.println("Au Revoir");

	}

	/* (non-Javadoc)
	 * @see ca.uqam.inf2120.exemplesvusenclasse.interfaces.LangueParlee#direMerci()
	 */
	public void direMerci() {
		System.out.println("Merci");

	}

}
