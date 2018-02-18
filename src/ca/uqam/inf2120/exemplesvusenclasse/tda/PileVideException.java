package ca.uqam.inf2120.exemplesvusenclasse.tda;

/**
 * Classe pour g�rer les exceptions lors
 * de la gestion de la file 
 * 
 * @author Ismael Doukoure
 * @version 2008-01-27
 * Modifi� le 08 f�vrier 2014
 */
@SuppressWarnings("serial")
public class PileVideException extends RuntimeException {

	/**
	 * Constructeur sans argument
	 */	
	public PileVideException() {
        super();
    }
	
	/**
	 * Permet d'initialiser le message
	 * @param message Message � afficher
	 */
	public PileVideException(String message) {
        super(message);
    }


}
