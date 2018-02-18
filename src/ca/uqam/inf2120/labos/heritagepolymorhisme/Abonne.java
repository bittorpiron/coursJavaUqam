/**
 * 
 */
package ca.uqam.inf2120.labos.heritagepolymorhisme;

/**
 * Abonne: regroupe les informations communes des abonn�s
 * de la compagnie Internet & TV Pour Tous.
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public abstract class Abonne {
	
	// D�claration des constantes
    // Chaque constante de classe est partag�e entre toutes les instances
    // Chaque constante est invariable (final pas modifiable)
    private final static String NOM = "\n Nom et pr�nom : " ;
    private final static String NUMERO_COMPTE = "\n Num�ro de compte : " ;
    private final static String ADRESSE = "\n Adresse  : " ;
    private final static String SOLDE = "\n Solde : " ;
	
	// Attributs d'instance
	private String nom;
	private long numeroCompte;
	private String adresse;
	private float solde;
	
	/**
	 * Constructeur par d�faut.
	 */
	public Abonne() {
		
	}

	/**
	 * Constructeur avec les param�tres requis.
	 * 
	 * @param nom
	 * @param numeroCompte
	 * @param adresse
	 * @param solde
	 */
	public Abonne(String nom, long numeroCompte, String adresse, float solde) {
		super();
		this.nom = nom;
		this.numeroCompte = numeroCompte;
		this.adresse = adresse;
		this.solde = solde;
	}

	/**
	 * Obtenir le nom.
	 * 
	 * @return Le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Initialise ou modifie le nom.
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Obtenir le num�ro de compte.
	 * 
	 * @return Le numeroCompte
	 */
	public long getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * Initialise ou modifie le num�ro de compte.
	 * 
	 * @param numeroCompte
	 */
	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * Obtenir l'adresse.
	 * 
	 * @return L'adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Initialise ou modifie l'adresse.
	 * 
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Obtenir le solde.
	 * 
	 * @return Le solde
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * Intialise ou modifie le solde.
	 * 
	 * @param solde
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	/**
	 * Affiche toutes les informations.
	 */
	public void afficher() {
		
		System.out.print(NOM + getNom() 
				   		  + ADRESSE + getAdresse()
				   		  + NUMERO_COMPTE + getNumeroCompte()
				          + SOLDE + getSolde());
		
	}
	

}
