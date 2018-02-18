package ca.uqam.inf2120.exemplesvusenclasse.heritage;


/**
 *  Titre : Notion d'h�ritage
 * 	Description: Classe Etudiant repr�sente un �tudiant avec les attributs suivants: 
 *               le nom, le pr�nom, le code permanent, le nombre de cours suivis.
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version Septembre 2008
 * Modifi� en Janvier 2014
 */
public class Etudiant extends Personne {
    
    // D�claration des constantes
    // Chaque constante de classe est partag�e entre toutes les instances
    // Chaque constante est invariable (final pas modifiable)
     private final static String DESCRPTION_CODE_PERMANENT = "\n Code Permanent : " ;
     private final static String DESCRPTION_NOMBRE_COURS_SUIVIS = "\n Nombre de cours suivis : " ;

     // les variables d'instance sont g�n�r�es pour chaque
     // chaque objet de la classe
     private String codePermanent ;   // Code permanent de l'�tudiant
     private int nombreCoursSuivis ;  // Nombre de cours

     /**
      * Constructeur sans argument.
      * Cr�e un objet en initialisant les attributs 
      * aux valeurs par d�faut 
      */
     public Etudiant() {
    	 
     }
     
     
     /**
      * Permet d'initialiser les attributs prenom, nom, 
      * codePermanent et nombreCours 
      * 
      * @param prenom Pr�nom de l'�tudiant
      * @param nom Nom de de l'�tudiant
      * @param codePermanent Code Permanent de l'�tudiant
      * @param nombreCours Nombre de cours suivis par l'�tudiant
      */
     public Etudiant(String prenom, String nom, 
                    String codePermanent, int nombreCours){
              super(prenom,nom);
              this.codePermanent = codePermanent;
              this.nombreCoursSuivis = nombreCours;
     }

     /**
      * Permet d'initialiser ou modifier le code permanent
      * 
      * @param codePermanent Code permanent
      */
      public void setCodePermanent (String codePermanent) {
        this.codePermanent = codePermanent ;
      }
      
      /**
       * Permet d'initialiser ou modifier le nombre de cours
       * 
       * @param nombreCours
       */
       public void setNombreCoursSuivis (int nombreCours) {
           this.nombreCoursSuivis = nombreCours ;
      }

      /**
       * Obtenir le code permanent
       * 
       * @return codePermanent
       */
       public String getCodePermanent (){
           return codePermanent ;
       }

       /**
        * Obtenir le nombre de cours suivis
        * 
        * @return nombreCoursSuivis
        */
        public int getNombreCoursSuivis () {
            return nombreCoursSuivis ;
        }

        /**
         * Retourner tous les attributs de l'instance courante sous forme de 
         * cha�ne de caract�res
         * 
         * @return pr�nom, nom, code permanent et nombre de cours
         */
         public String toString () {
             return (super.toString()
                    + DESCRPTION_CODE_PERMANENT + getCodePermanent() 
                    + DESCRPTION_NOMBRE_COURS_SUIVIS + getNombreCoursSuivis() );
         }
        
         //redefinition (voir classe objet page 5)
         public boolean equals(Object unAutreObjet){
        	 boolean estEgal =false;
        	 if (this == unAutreObjet){
        		 estEgal = true;
        	 }else if (unAutreObjet != null && getClass() == unAutreObjet.getClass()){
        		 Etudiant unEtudiant = (Etudiant) unAutreObjet;
        		 estEgal = codePermanent.equals(unEtudiant.getCodePermanent());
        	 }
        	 return estEgal;        	 
         }         

}  //fin de la classe Etudiant
