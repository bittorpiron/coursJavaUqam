package ca.uqam.inf2120.tp3.interfacegraphiques;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ca.uqam.inf2120.tp3.modele.GestionnaireInventairePneus;
import ca.uqam.inf2120.tp3.modele.Pneu;

/**
 * GestionnaireInventairePneusControleur: Le controleur (Controller) de la
 * fen�tre principale GestionnaireInventairePneusVue pour le pattern MVC
 * 
 * @author Victor Piron PIRV11026606 INF2120 Groupe 30 (Isma�l Doukoure)
 *         piron_mardones.victor@courrier.uqam.ca
 * @version 2014-04-20
 * 
 */
public class GestionnaireInventairePneusControleur implements ActionListener,
		ListSelectionListener {

	private GestionnaireInventairePneus modele;
	private GestionnaireInventairePneusVue vue;

	private List<Pneu> liste;

	// Constructeur avec la vue � controler comme param�tre
	GestionnaireInventairePneusControleur(GestionnaireInventairePneusVue uneVue) {
		this.modele = new GestionnaireInventairePneus();
		vue = uneVue;
		// vue.refresh(modele.getValeur());
	}

	/**
	 * @return the modele
	 */
	public GestionnaireInventairePneus getModele() {
		return modele;
	}

	/**
	 * @return the modele
	 */
	public GestionnaireInventairePneusVue getVue() {
		return vue;
	}

	/**
	 * @return the liste
	 */
	public List<Pneu> getListe() {
		return liste;
	}

	/**
	 * @param liste
	 *            the liste to set
	 */
	public void setListe(List<Pneu> liste) {
		this.liste = liste;
	}

	/*
	 * La red�finition de l'unique m�thode de l'interface
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent event) {

		// Obtenir la source de l'�v�nement.
		Object source = event.getSource();

		// �v�nement g�n�r� par le bouton "Ajouter"
		if (source == vue.getBtnAjouter()) {
			new AjoutModificationVue(this, source);
		} else if (source == vue.getBoutonRechercher()) {

			// �v�nement g�n�r� par le bouton "Rechercher"
			refreshTableResultats();

		} else if (source == vue.getBtnAfficher()) {

			// �v�nement g�n�r� par le bouton "Afficher"
			new AffichageVue(this);

		} else if (source == vue.getBtnModifier()) {

			new AjoutModificationVue(this, source);

		} else if (source == vue.getBtnSupprimer()) {

			new SupprimerVue(this);

		} else if (source == vue.getRdbtnTous()|| source == vue.getRdbtnDiametre() ||
				source == vue.getRdbtnNombreInferieur() || source == vue.getRdbtnNombreSuperieur()) {
			
			if (vue.getRdbtnTous().isSelected()){
				vue.getTextRechercher().setEditable(false);
				vue.getTextRechercher().setText("");
			}else{
				vue.getTextRechercher().setEditable(true);
			}

		} else{
			// if (source == vue.getBtnFermer()) {
			vue.dispose();
		}
	}

	/**
	 * 
	 */
	protected void refreshTableResultats() {

		recherchePneus(true);

	}

	/**
	 * Construit message d'erreur selon le type de recherche Lance la recherche
	 * selon le type de recherche
	 * 
	 * @param afficherMessage
	 *            faux: on n'affiche pas de message (apr�s dernier pneau effac�
	 *            pour cete s�lection ou Ajout)
	 */
	protected void recherchePneus(boolean afficherMessage) {

		liste = new ArrayList<Pneu>();
		boolean entreeValide = true;

		String message = "";

		int saison = (vue.getChckbxHiver().isSelected() ? 1 : 0)
				+ (vue.getChckbxEte().isSelected() ? 2 : 0);

		if (saison == 0) {

			message = ChainesDeTexte.MESSAGE_ERREUR_SAISON;

		} else {

			message = ChainesDeTexte.MESSAGE_AUCUN_PNEAU_TROUVE.replace("$1",
					ChainesDeTexte.SAISON_PNEAU[saison - 1]);

			if (vue.getRdbtnTous().isSelected()) {

				liste = modele.rechercherTousLesPneus(saison);

			} else {

				// valider la valeur entr�e pour la recherche
				try {

					int valeurRecherche = Integer.parseInt(vue
							.getTextRechercher().getText());

					// Pas des valeurs n�gatives
					if (valeurRecherche <= 0) {
						entreeValide = false;

					} else {
						message += " avec ";
						if (vue.getRdbtnDiametre().isSelected()) {
							
							if (valeurRecherche >=14 && valeurRecherche <=21){
								message += "le diam�tre " + valeurRecherche + "!";
								liste = modele.rechercherParDiametre(
										valeurRecherche, saison);
							}else{
								message = ChainesDeTexte.MESSAGE_ERREUR_DIAMETRE;
							}
							
						} else {
							message += "un nombre "
									+ (vue.getRdbtnNombreInferieur()
											.isSelected() ? "inf�rieur � "
											: "sup�rieur � ") + valeurRecherche + "!";
							liste = modele.rechercherParNombre(valeurRecherche,
									vue.getRdbtnNombreInferieur().isSelected(),
									saison);
						}
					}

				} catch (Exception e) {
					entreeValide = false;
				}

				// Entr�e non valide ( entier sup�rieur � 0)
				if (!entreeValide && afficherMessage) {
					vue.showMessageInfo(ChainesDeTexte.MESSAGE_ERREUR_RECHERCHE);
					vue.getTextRechercher().setText("");
				}
			}
		}

		// ne pas afficher apr�s ajouts ou suppression du dernier
		if (entreeValide && liste.isEmpty() && afficherMessage) {

			vue.showMessageInfo(message);

		}

		vue.mettreAJourTableResultats(liste);
		vue.permettreSelectionBoutons(!liste.isEmpty());
	}

	/*
	 * Si on change la selection de pneu
	 * 
	 * @see
	 * javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event
	 * .ListSelectionEvent)
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int rows = vue.getTableResultats().getSelectedRow();
		vue.permettreSelectionBoutons(rows > -1 ? true : false);
	}

}
