package ca.uqam.inf2120.exemplesvusenclasse.heritage;


/**
 *  Titre : Notion d'h�ritage
 * 	Description: Classe Enseignant repr�sente un enseignant avec les attributs suivants : 
 *               le nom, le pr�nom, le matricule, le salaire, et le nombre de cours donn�s.
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version Septembre 2008
 * Modifi� en Janvier 2014
 */
public class Enseignant extends Employe {
    
    // D�claration des constantes
    // Chaque constante de classe est partag�e entre toutes les instances
    // Chaque constante est invariable (final pas modifiable)
     private final static String DESCRPTION_NOMBRE_COURS_DONNES = "\n Nombre de cours donn�es : " ;

     // les variables d'instance sont g�n�r�es pour chaque
     // chaque objet de la classe
     private int nombreCoursDonnes;   // salaire du Prof


     /**
      * Constructeur sans argument. Cr�e un objet en
      *  initialisant les attributs aux valeurs par d�faut 
      */
     public Enseignant(){
    	 
     }
     
     
     /**
      * Permet d'initialiser les attributs prenom, nom,
      * matricule, salaire et  nombreCoursDonnes
      * 
       * @param prenom Pr�nom de l'enseignant
      *  @param nom Nom de l'enseignant
      *  @param matricule Matricule de l'enseignant
      *  @param salaire Salaire de l'enseignant
      *  @param nombreCoursDonnes Nombre de cours donn�s par l'enseignant
      *  
      */
     public Enseignant(String prenom, String nom, 
             String matricule, float salaire, int nombreCoursDonnes) {    
    	 super(prenom,nom, matricule, salaire);
         this.nombreCoursDonnes = nombreCoursDonnes;
     }

     /**
      * Permet d'initialiser ou modifier le nombre de cours donn�s
      * 
      * @param nombreCoursDonnes 
      */
      public void setNombreCoursDonnes (int nombreCoursDonnes){
        this.nombreCoursDonnes = nombreCoursDonnes ;
      }
      
      /**
       * Obtenir le nombre de cours donn�s
       * 
       * @param nombreCoursDonnes 
       */
       public int getNombreCoursDonnes (){
         return nombreCoursDonnes ;
       }

    
       /**
        * Retourne tous les attributs de l'objet sous forme de
        * cha�ne de caract�res
        *  
        * @return pr�nom, nom, matricule, salaire et nombre de cours donn�s
        */
        public String toString () {
            return (super.toString() + 
            		DESCRPTION_NOMBRE_COURS_DONNES + getNombreCoursDonnes());
        }

}//fin de la classe Enseignant

