package ca.uqam.inf2120.labos.file;

import ca.uqam.inf2120.labos.file.tda.File;
import ca.uqam.inf2120.labos.file.tda.impl.FileArrayListImpl;
import ca.uqam.inf2120.labos.pile.tda.Pile;
import ca.uqam.inf2120.labos.pile.tda.impl.PileArrayListImpl;


/**
 * 	Utilisation des services de manipulation de File<T>, et de Pile<T>.
 *               
 * 	UQAM  - INF2120
 * 
 * @author Gloire Lomani / Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public class UtilisationDesFiles {

	/**
	 * En utilisant les services de manipulation de File<T>, et de Pile<T>, vus en 
	 * classe et leurs impl�mentations en ArrayList (FileArrayListImpl <T>, PileArrayListImpl<T>), 
	 * �crire la m�thode inverser qui re�oit en param�tre une file et  retourne une nouvelle file 
	 * qui correspond � la file pass�e en param�tre invers�e. La file pass�e en param�tre doit rester 
	 * inchang�e apr�s l�appel.
	 *  
	 * @param file La file � inverser.
	 * @return La file invers�e.
	 */
	public static File<String> inverser(File<String> file) {

		File<String> fileRetour = null;

		if (file != null) {

			fileRetour = new FileArrayListImpl<String>();
//			File<String> clone = new FileArrayListImpl<String>();

			Pile<String> temp = new PileArrayListImpl<String>();
			
			//version 2
			int fileTaille = file.taille();
			for ( int i =0; i< fileTaille; i++){
				temp.empiler(file.debut());
				file.enfiler(file.defiler());
			}

//			while (!file.estVide()) {
//				clone.enfiler(file.debut());
//				temp.empiler(file.defiler());
//			}
//
			while (!temp.estVide()) {
				fileRetour.enfiler(temp.depiler());
//				file.enfiler(clone.defiler());
			}

		}

		return fileRetour;
	}

	
	/**
	 * Tester la m�thode inverser.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		File<String> file = new FileArrayListImpl<String>();

		file.enfiler("A");
		file.enfiler("B");
		file.enfiler("C");
		file.enfiler("D");

		File<String> retour = inverser(file);

		System.out.print("File Initial : ");
		while (!file.estVide()) {
			System.out.print(file.defiler() + " ");
		}

		System.out.print("\n\nFile retour : ");
		while (!retour.estVide()) {
			System.out.print(retour.defiler() + " ");
		}

	}

}
