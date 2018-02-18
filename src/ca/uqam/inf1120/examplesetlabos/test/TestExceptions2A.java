package ca.uqam.inf1120.examplesetlabos.test;

import ca.uqam.inf1120.examplesetlabos.Clavier;
import ca.uqam.inf1120.examplesetlabos.MonExcep;


/**
 * I N F 1 1 2 0
 *
 * Ce programme sert � faire la d�monstration du comportement d'un  programme
 * lors de la gestion d'exceptions "maison" et d'exception d�j� connue de Java.
 * Il est � noter que ce code n'est l� que comme d�monstrateur et qu'il y a place
 * � l'am�lioration sur le plan efficacit� (� vous de trouver :-)
 * 
 * @author (C�line Descheneaux) 
 * @version (10 d�cembre 2006)
 *
 * 
 * (uqam_inf1120@yahoo.ca)
 */
 
public class TestExceptions2A {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        
        //sentinelle servant � d�terminer si la division r�elle a �t� effectu�e
        //avec succ�s avec des valeurs valides
        boolean operationReussie = false;  
        
        //variables servant � contenir les valeurs du dividende, du diviseur 
        //et du r�sultat de l'op�ration de division
        double dividende = -1; //initialisation � une valeur bidon pour que �a compile...
        double diviseur = -1;  //initialisation � une valeur bidon pour que �a compile...
        double resultat = -1;  //initialisation � une valeur bidon pour que �a compile...
        
        //boucle servant � la gestion de 2 exceptions (dont 1 "maison") 
        do{
            try{
                System.out.print ("Entrer une valeur pour le dividende : ");
                dividende = Clavier.lireDouble();
                System.out.print ("Entrer une valeur pour le diviseur (diff�rent de 0) : ");
                diviseur = Clavier.lireDouble();
                
                //si le diviseur est 0, lancer une exception
                if (diviseur == 0) {
                    throw new MonExcep("Diviseur = 0 !");
                }//end if
                
                //si on arrive ici, c'est qu'aucune exception n'a �t� lev�e
                resultat = dividende/diviseur;
                operationReussie = true;
            } catch (NumberFormatException e){
                System.out.println("Vous devez entrer des NOMBRES\n");
            } catch (MonExcep e){
                System.out.println("Message = " + e.getMessage());
            }
                                          
        }while(!operationReussie);
        
        System.out.println(dividende + "/" + diviseur + " = " + resultat);
        System.out.println("FIN NORMALE DU PROGRAMME");
    
    } // main
    
} // TestExceptions2A
