package ca.uqam.inf2120.exemplesvusenclasse.junit;

/**
 * I N F 2 1 2 0
 * 
 * Tester des m�htodes avec les arguments variables.
 * 
 * @author Doukoure Ismael
 * @since 16/01/2011 - Derni�re modification : 26/01/2014
 *
 */
public class OperationsAvecNbArgumentsVariables {

	/**
	 * Additionne un nombre variable d'entiers de type long
	 * @param pNombres les entiers de type long
	 * 
	 * @return le r�sultat de l'op�ration.
	 */
	public static long additionner(final long... pNombres) {
		long lRetour = 0;
		for (final long lNombre : pNombres) {
			lRetour += lNombre;
		}
		return lRetour;
	}

	/**
	 * Multiplie un nombre variable d'entiers de type long
	 * @param pNombres
	 * @return
	 */
	public static long multiplier(final long... pNombres) {
		long lRetour = 1;
		for (final long lNombre : pNombres) {
			lRetour *= lNombre;
		}
		return lRetour;
	}

}
