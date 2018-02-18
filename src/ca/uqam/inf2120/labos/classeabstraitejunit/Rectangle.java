package ca.uqam.inf2120.labos.classeabstraitejunit;

/**
 * Classe Rectangle h�rite de la classe abstraite FigureGeometrique
 * et red�finie les m�thodes : calculerSurface() et calculerPerimetre()
 * 
 * @author Gloire Lomani / Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public class Rectangle  extends FigureGeometrique{
	
	private double longueur;
	private double largeur;
	
	/**
	 * Constructeur avec tous les param�tres requis.
	 * 
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super(0.0, 0.0);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	/**
	 * Calcule la surface.
	 */
	public void calculerSurface() {
		surface = longueur * largeur;
		
	}

	/**
	 * Calcule le perim�tre.
	 */
	public void calculerPerimetre() {
		perimetre = (longueur + largeur) * 2;		
	}
	
	/**
	 * Obtenir la longueur.
	 * 
	 * @return La longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * Initialise ou modifie la longueur.
	 * 
	 * @param longueur
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * Obtenir la largueur.
	 * 
	 * @return La largueur.
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * Initialise ou modifie la largeur.
	 * 
	 * @param largeur
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	
}
