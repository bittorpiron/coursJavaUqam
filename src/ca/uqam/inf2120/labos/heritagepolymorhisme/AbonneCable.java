package ca.uqam.inf2120.labos.heritagepolymorhisme;

/**
 * AbonneCable: h�rite de la classe Abonne avec un 
 * attribut de plus : nombre de t�l�visions.
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public class AbonneCable extends Abonne {
	
	// D�claration des constantes
    // Chaque constante de classe est partag�e entre toutes les instances
    // Chaque constante est invariable (final pas modifiable)
    private final static String NOMBRE_TELEVISIONS = "\n Nonbre de t�l�visions : " ;
	
	private int nbTelevisions;

	/**
	 * Constructeur sans argument.
	 */
	public AbonneCable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec tous les param�tres requis.
	 * 
	 * @param nom
	 * @param numeroCompte
	 * @param adresse
	 * @param solde
	 * @param nbTelevisions
	 */
	public AbonneCable(String nom, long numeroCompte, String adresse,
			float solde, int nbTelevisions) {
		super(nom, numeroCompte, adresse, solde);
		this.nbTelevisions = nbTelevisions;
	}

	/**
	 * Obtenir le nombre de t�l�visions.
	 * 
	 * @return nbTelevisions
	 */
	public int getNbTelevisions() {
		return nbTelevisions;
	}

	/**
	 * Initialise ou modifie le nombre de t�l�visions.
	 * 
	 * @param nbTelevisions 
	 */
	public void setNbTelevisions(int nbTelevisions) {
		this.nbTelevisions = nbTelevisions;
	}
	
	/**
	 * Affiche toutes les informations.
	 */
	public void afficher() {
		
		super.afficher();
		System.out.print(NOMBRE_TELEVISIONS + getNbTelevisions());
		
	}
	
		

}
