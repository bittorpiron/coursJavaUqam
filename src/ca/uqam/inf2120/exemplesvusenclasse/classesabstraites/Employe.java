package ca.uqam.inf2120.exemplesvusenclasse.classesabstraites;


/**
 *  Titre : Classes abstraites
 * 	Description: Classe Employe repr�sente un employ� avec les attributs suivants : 
 *               le nom, le pr�nom, le matricule, le salaire.
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version Septembre 2008
 * Modifi� en Janvier 2014
 */
public class Employe extends Personne {
    
    // D�claration des constantes
    // Chaque constante de classe est partag�e entre toutes les instances
    // Chaque constante est invariable (final pas modifiable)
     private final static String DESCRPTION_MATRICULE = "\n Matricule  : " ;
     private final static String DESCRPTION_SALAIRE = "\n Salaire      : " ;

     // les variables d'instance sont g�n�r�es pour chaque
     // chaque objet de la classe
     private String matricule ;   // Matricule de l'employ�
     private float salaire;   // Salaire de l'employ�

     /**
      * Constructeur sans argument.
      * Cr�e un objet en initialisant les attributs 
      * aux valeurs par d�faut 
      */
     public Employe() {
    	 
     }
     
     
     /**
      * Permet d'initialiser les attributs prenom, nom,
      * matricule et salaire  
      * 
      * @param prenom Pr�nom de l'employ�
      * @param nom Nom de l'employ�
      * @param matricule Matricule de l'employ�
      * @param salaire Salaire de l'employ�
      */
     public Employe(String prenom, String nom, 
                    String matricule, float salaire){
              super(prenom,nom);
              this.matricule = matricule;
              this.salaire = salaire;
     }

     /**
      * Permet d'initialiser ou modifier le matricule
      * 
      * @param matricule
      */
      public void setMatricule (String matricule) {
        this.matricule = matricule;
      }
      
      /**
       * Permet d'initialiser ou modifier le salaire
       * 
       * @param salaire
       */
       public void setSalaire (float salaire) {
           this.salaire = salaire;
      }

      /**
       * Obtenir le matricule
       * 
       * @return le matricule
       */
       public String getMatricule (){
           return matricule;
       }

       /**
        * Obtenir le salaire
        * 
        * @return le salaire
        */
        public float getSalaire () {
            return salaire ;
        }

        /**
         * Retourne tous les attributs de l'instance courante dans une 
         * cha�ne de caract�res
         * 
         * @return pr�nom, nom, matricule et salaire
         */
         public String toString () {
             return (super.toString()
                    + DESCRPTION_MATRICULE + getMatricule() 
                    + DESCRPTION_SALAIRE + getSalaire());
         }


 		@Override
 		public String obtenirDescription() {
 			
 			return " Je suis un employ�";
 		}
          
}  //fin de la classe Employe
