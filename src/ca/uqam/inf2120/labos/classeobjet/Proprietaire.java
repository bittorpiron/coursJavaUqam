package ca.uqam.inf2120.labos.classeobjet;

public class Proprietaire {
	
	 // D�claration des constantes
    // Chaque constante de classe est partag�e entre toutes les instances
    // Chaque constante est invariable (final pas modifiable)
    private final static String PRENOM = "\n Pr�nom  : " ;
    private final static String NOM = "\n Nom     : " ;
    private final static String AGE = "\n Age     : " ;
    private final static String VOITURE = "\n -- Les information de sa voiture --" ;
	
	// Attrbiuts d'instance
	private  String prenom;
	private String nom;
	private int age;
	private Voiture voiture;
	
	/**
	 * Constructeur par d�faut
	 */
	public Proprietaire() {
		
	}


	/**
	 * Constructeur avec les param�tres requis.
	 * 
	 * @param prenom
	 * @param nom
	 * @param age
	 * @param voiture
	 */
	public Proprietaire(String prenom, String nom, int age, Voiture voiture) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.voiture = voiture;
	}


	/**
	 * Obtenir le pr�nom.
	 * 
	 * @return Le pr�nom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * Initialise ou modifie le pr�nom.
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	 * Obtenir l'�ge.
	 * 
	 * @return L'age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * Initialise ou modifie l'�ge.
	 * 
	 * @param age 
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * Obtenir la voiture.
	 * 
	 * @return La voiture
	 */
	public Voiture getVoiture() {
		return voiture;
	}


	/**
	 * Initialise ou modifie la voiture.
	 * 
	 * @param voiture
	 */
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	/**
	 * Affiche les informations du propr�taire.
	 */
	public void afficher() {
		System.out.println(PRENOM + getPrenom() 
						   + NOM + getNom()
						   + AGE + getAge()
						   + VOITURE);
		voiture.afficher();
		
		
	}
	
	
	

}
