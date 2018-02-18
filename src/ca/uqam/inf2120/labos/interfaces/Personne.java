package ca.uqam.inf2120.labos.interfaces;



/**
 *  Titre : Notion d'h�ritage
 * 	Description: Classe Personne repr�sente une personne avec les attributs suivants : 
 *               le nom, le pr�nom.
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version Septembre 2008
 * Modifi� en Janvier 2014
 */
public class Personne {
       
     // D�claration des constantes
     // Chaque constante de classe est partag�e entre toutes les instances
     // Chaque constante est invariable (final pas modifiable)
     private final static String DESCRPTION_PRENOM = "\n Pr�nom  : " ;
     private final static String DESCRPTION_NOM = "\n Nom     : " ;
     
      // les variables d'instance sont g�n�r�es pour chaque
     // chaque objet de la classe
     private String prenom ;    // Pr�nom de la personne
     private String nom ;       // Nom de la personne


     /**
      * Constructeur sans argument. Permet d'initialiser 
      * les attributs aux valeurs par d�faut 
      */
     public Personne(){

      }
      
     
     /**
      * Permet d'initialiser les attributs prenom et nom 
      * 
      * @param prenom Pr�nom de la personne
      * @param nom Nom de la personne
      */
     public Personne(String prenom, String nom){
              this.prenom = prenom;
              this.nom = nom;
      }

     /**
      * Permet d'initialiser ou modifier le pr�mon
      * 
      * @param prenom Pr�nom de la personne
      */
      public void setPrenom (String prenom){
        this.prenom = prenom ;
      }

      /**
       * Permet d'initialiser ou modifier le nom
       * 
       * @param nom Nom de la personne
       */
       public void setNom (String nom) {
           this.nom = nom ;
       }

       /**
        * Obtenir le pr�nom de la personne
        * 
        * @return Le pr�nom de la personne
        */
        public String getPrenom () {
            return prenom ;
        }

        /**
         * Obtenir le nom de la personne
         * 
         * @return Le nom de la personne
         */
         public String getNom () {
             return nom ;
         }

         /**
          * Obtenir les attributs de l'instance courante(pr�nom, nom)
          * sous forme de cha�ne de caract�res
          * 
          * @return le pr�nom et le nom
          */
          public String toString (){
              return(DESCRPTION_PRENOM + getPrenom() + DESCRPTION_NOM + getNom() );
          }


} //fin de la classe Personne

