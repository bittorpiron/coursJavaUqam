/**
 * Constants.java
 */
package ca.uqam.inf2120.tp3.interfacegraphiques;

/**
 * �tiquettes en fran�ais d'usage g�n�rale pour l'interface graphique
 * 
 * @author Victor Piron
 * PIRV11026606
 * INF2120 Groupe 30 (Isma�l Doukoure)
 * piron.victor@courrier.uqam.ca  
 * @version 2014-04-13
 */
public class ChainesDeTexte {
	
	static final String TITRE_FENETRE_PRINCIPALE = "Nordic Pneus - Syst�me de Gestion d'Inventaire (SGI)";
	static final String TITRE_PANNEAU_TYPE_DE_RECHERCHE = 	"Type de recherche";
	static final String TITRE_PANNEAU_SELECTION_SAISON = "Saison des pneus recherch�s";
	static final String TITRE_AJOUT = "Nordic Pneus (SGI) - Ajout";
	static final String TITRE_MODIFICATION = "Nordic Pneus (SGI) - Modification";
	static final String TITRE_SUPPRESSION = "Nordic Pneus (SGI) - Suppression";
	static final String TITRE_AFFICHAGE = "Nordic Pneus (SGI) - Affichage";
	static final String TITRE_INFORMATION = "Informations du pneu";
	
	static final String ETIQUETTE_DIAMETRE = "Diam�tre de la roue";
	static final String ETIQUETTE_NOMBRE_INFERIEUR = "<= Nombre de pneus";
	static final String ETIQUETTE_TOUS = "Tous les pneus";
	static final String ETIQUETTE_NOMBRE_SUPERIEUR = "> Nombre de pneus";
	static final String ETIQUETTE_SAISON_HIVER = "Hiver";
	static final String ETIQUETTE_SAISON_ETE = "�t�";
	static final String ETIQUETTE_RECHERCHER = "Rechercher";
	static final String ETIQUETTE_AJOUTER = "Ajouter";
	static final String ETIQUETTE_MODIFIER = "Modifier";
	static final String ETIQUETTE_SUPPRIMER = "Supprimer";
	static final String ETIQUETTE_AFFICHER = "Afficher";
	static final String ETIQUETTE_FERMER = "Fermer";	
	static final String ETIQUETTE_ANNULER = "Annuler";
	
	static final String ETIQUETTE_CHOIX_SAISON = "Saison: ";
	static final String ETIQUETTE_CHOIX_LARGUEUR = "Largueur: ";
	static final String ETIQUETTE_CHOIX_DIAMETRE = "Diam�tre: ";
	static final String ETIQUETTE_CHOIX_HAUTEUR = "Hauteur: ";
	static final String ETIQUETTE_CHOIX_PRIX = "Prix: ";
	static final String ETIQUETTE_CHOIX_NBR_PNEUS = "Nombre de pneus: ";
	static final String ETIQUETTE_CHOIX_DESCRIPTION = "Description: ";
	
	static final String[] ENTETE_TABLEAU = {"Description", "Prix", "Nombre de pneus"};
	
	//ComboBox
	static final String[] LARGEURS = {"165", "175", "185", "215", "225", "265", "275", "285", "295"};
	static final String[] HAUTEURS = {"50", "55", "60", "65", "70", "75", "80", "85"};
	static final String[] DIAMETRES = {"14", "15", "16", "17", "18", "19", "20", "21"};	
	static final String[] SAISON_PNEAU = { "d\'hiver ", "d\'�t� ", "" };
	
	static final String MESSAGE_ERREUR_PRIX = "Le prix doit �tre un nombre r�el sup�rieur � 0";
	static final String MESSAGE_ERREUR_SAISON = "Aucune saison n'a pas �t� s�lectionn�e";
	static final String MESSAGE_AUCUN_PNEAU_TROUVE = "Aucun pneu $1trouv�";
	static final String MESSAGE_ERREUR_NBR_PNEUS = "Le nombre de pneus doit �tre un nombre entier sup�rieur � 0";
	static final String MESSAGE_ERREUR_RECHERCHE = "Le nombre pour la recherche doit �tre un nombre entier sup�rieur � 0";
	static final String MESSAGE_RECHERCHE_VIDEE = "Vous venez d'effacer le dernier pneau trouv� pour la recherche";
	static final String MESSAGE_ERREUR_DIAMETRE = "Diam�tres disponibles de 14 � 21";
	
	//
	static final String PANNEAU_MESSAGE = "Message";
}
