package ca.uqam.inf2120.labos.classeabstraitejunit;

/**
 * Classe Carre h�rite de la classe abstraite FigureGeometrique
 * et red�finie les m�thodes : calculerSurface() et calculerPerimetre()
 * 
 * @author Gloire Lomani / Ismael Doukoure
 * @version F�vrier 2014
 *
 */

public class Carre extends FigureGeometrique{

	private double cote;
	
	/**
	 * Constructeur avec tous les param�tres requis.
	 * 
	 * @param cote
	 */
	public Carre(double cote) {
		super(0.0, 0.0);
		this.cote = cote;
	}
	
	/**
	 * Calcule la surface.
	 */
	public void calculerSurface() {
		surface = cote * cote;
		
	}
	
	/**
	 * Calcule le p�rim�tre.
	 */
	public void calculerPerimetre() {
		perimetre = (cote * 4);		
	}
	
	/**
	 * Obtenir le c�t�.
	 * 
	 * @return Le c�t�
	 */
	public double getCote() {
		return cote;
	}
	
	/**
	 * Initialiser ou modifier le c�t�.
	 * 
	 * @param cote Le c�t�
	 */
	public void setCote(double cote) {
		this.cote = cote;
	}
}
