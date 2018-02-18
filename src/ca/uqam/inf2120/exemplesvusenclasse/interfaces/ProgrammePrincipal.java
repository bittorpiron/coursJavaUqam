package ca.uqam.inf2120.exemplesvusenclasse.interfaces;


/**
 * Test des classes LangueFrancaise, LangueAnglaise, LangueEspagnole et de
 * l'interface LangueParlee
 * 
 * @author Ismael Doukoure
 * @version F�vrier 2014
 * 
 */
public class ProgrammePrincipal {

	public static void main(String[] args) {
		
		// La variable doit �tre toujours du type de l'interface
		// qui pointe sur un objet d'une des classes qui l'impl�mente.
		LangueParlee francais = new LangueFrancaise();
		francais.direBonjour();
		francais.direMerci();
		francais.direAuRevoir();
		
		// La variable doit �tre toujours du type de l'interface
		// qui pointe sur un objet d'une des classes qui l'impl�mente.
		LangueParlee anglais = new LangueAnglaise();
		anglais.direBonjour();
		anglais.direMerci();
		anglais.direAuRevoir();
		
		// La variable doit �tre toujours du type de l'interface
		// qui pointe sur un objet d'une des classes qui l'impl�mente.
		LangueParlee espagnol = new LangueEspagnole();
		espagnol.direBonjour();
		espagnol.direMerci();
		espagnol.direAuRevoir();
		
	}

}
