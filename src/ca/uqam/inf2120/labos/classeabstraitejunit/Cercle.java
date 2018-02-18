package ca.uqam.inf2120.labos.classeabstraitejunit;

/**
 * Classe Cercle h�rite de la classe abstraite FigureGeometrique
 * et red�finie les m�thodes : calculerSurface() et calculerPerimetre()
 * 
 * @author Gloire Lomani / Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public class Cercle  extends FigureGeometrique{
	
	private static final double PI = 3.14;
	private double rayon;
	
	/**
	 * Constructeur avec tous les param�tres requis.
	 * 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super(0.0, 0.0);
		this.rayon = rayon;
	}

	/**
	 * Calcule la surface.
	 */
	public void calculerSurface() {
		surface= PI * rayon * rayon;		
	}

	/**
	 * Calcule le p�rim�tre.
	 */
	public void calculerPerimetre() {
		perimetre = 2 * PI * rayon;
		
	}

	/**
	 * Obtenir le rayon.
	 * 
	 * @return Le rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * Initialise ou modifie le rayon.
	 * @param rayon
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
}
