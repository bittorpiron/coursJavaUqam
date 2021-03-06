package ca.uqam.inf2120.exemplesvusenclasse.interfacesgraphiques;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * FenetreEcouteurClasseInterneAnonyme: Exemple de gestion des �v�nements
 * avec la strat�gie "Classe interne anonyme".
 * 
 * Universit� du Qu�bec � Montr�al 
 * INF2120 - Programmation II
 * 
 * @author Ismael Doukoure
 * @version Mars 2008 
 * Modifi� en Mars 2014
 * 
 */
@SuppressWarnings("serial")
public class FenetreEcouteurClasseInterneAnonyme1 extends JFrame {

	private JLabel lblSaisie;
	private JLabel lblAfficher;
	private JTextField textFieldSaisie;
	private JTextField textFieldAfficher;
	private JButton btnAfficher;
	private JButton btnEffacer;

	
	// Main pour lancer l'application
	public static void main(String[] args) {
		
		FenetreEcouteurClasseInterneAnonyme1 frame = new FenetreEcouteurClasseInterneAnonyme1();
		frame.setVisible(true);
				
	}

	// Cr�er le conteneur et ses composants
	public FenetreEcouteurClasseInterneAnonyme1() {
		
		setTitle("Gestion des �v�nements : Classe Anonyme Interne");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 300, 150);

		
		JPanel panelHaut = construirePanneauHaut();
		// Ajouter le panneau du haut au conteneur
		add(panelHaut, BorderLayout.CENTER);
		
		JPanel panelBas = construirePanneauBas();
		// Ajouter le panneau du bas au conteneur
		add(panelBas, BorderLayout.SOUTH);
	}

	// Construire le panneau du haut
	private JPanel construirePanneauHaut() {
		
		// Cr�ation du panneau de haut et ses composants
		JPanel panelHaut = new JPanel();
		panelHaut.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelHaut.setLayout(new GridLayout(2, 2, 0, 8));
		lblSaisie = new JLabel("Saisir une information : ");
		panelHaut.add(lblSaisie);
		textFieldSaisie = new JTextField();
		
		// KeyAdapter() est une classe anonyme 
		textFieldSaisie.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				int key = evt.getKeyCode();
			    if (key == KeyEvent.VK_ENTER) {
			        textFieldAfficher.setText(textFieldSaisie.getText().toUpperCase()) ;
			    }
			}
		});
		
		textFieldSaisie.setColumns(10);
		panelHaut.add(textFieldSaisie);
		
		lblAfficher = new JLabel("Afficher l'information :    ");
		panelHaut.add(lblAfficher);
		
		textFieldAfficher = new JTextField();
		textFieldAfficher.setEditable(false);
		panelHaut.add(textFieldAfficher);
		
		
		return panelHaut;
	}
	
	// Construire le panneau du bas
	private JPanel construirePanneauBas() {
		
		// Cr�ation du panneau du bas et ses composants
		JPanel panelBas = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelBas.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		
		btnAfficher = new JButton("Afficher");
		// ActionListener() est une classe anonyme 
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  textFieldAfficher.setText(textFieldSaisie.getText()) ;
			}
		});
		panelBas.add(btnAfficher);
		
		btnEffacer = new JButton("Effacer");
		
		// ActionListener() est une classe anonyme 
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldSaisie.setText("");
			    textFieldAfficher.setText("");
			}
		});
		panelBas.add(btnEffacer);
		return panelBas;
	}


}
