package ca.uqam.inf2120.labos.file.tda.impl;

/**
 * Classe pour g�rer les exceptions lors
 * de la gestion de la file 
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 */
@SuppressWarnings("serial")
public class FilePleineException extends RuntimeException {

	/**
	 * Constructeur sans argument
	 */	
	public FilePleineException() {
        super();
    }
	
	/**
	 * Permet d'initialiser le message
	 * @param message Message � afficher
	 */
	public FilePleineException(String message) {
        super(message);
    }


}
