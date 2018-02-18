package ca.uqam.inf2120.labos.pile;

import ca.uqam.inf2120.labos.pile.tda.Pile;
import ca.uqam.inf2120.labos.pile.tda.impl.PileArrayListImpl;


/**
 * 	Utilisation des services de manipulation de Pile<T>.
 *               
 * 	UQAM  - INF2120
 * 
 * @author Gloire Lomani / Ismael Doukoure
 * @version F�vrier 2014
 *
 */
public class UtilisationDesPiles {

	/**
	 * En utilisant les services de manipulation de Pile<T> vus en classe 
	 * et son impl�mentation en ArrayList (PileArrayListImpl<T>), �crire la m�thode 
	 * supprimer qui re�oit en param�tres une pile de String, et un �l�ment de type 
	 * String, et supprime l��l�ment de la pile.
	 *  - La m�thode doit retourner la nouvelle pile obtenue apr�s la suppression.
	 *  - Si l��l�ment � supprimer n�existe pas, la nouvelle pile retourn�e sera la m�me que 
	 *    celle pass�e en param�tre.
	 *  - Aucun doublon dans la pile pass�e en param�tre.
	 *  - La pile pass�e en param�tre doit rester inchang�e apr�s l�appel.
	 *  
	 * @param pile La pile dans laquelle la suppression doit se faire.
	 * @param s L'�l�ment � supprimer.
	 * 
	 * @return La pile � retourner apr�s suppression.
	 */
	public static Pile<String> supprimer(Pile<String> pile, String s) {
		
		Pile<String> pileRetour = null;

		if (pile != null && !pile.estVide() && s != null && !s.trim().isEmpty()) {

			Pile<String> temp = new PileArrayListImpl<String>();
			pileRetour = new PileArrayListImpl<String>();
			Pile<String> clone = new PileArrayListImpl<String>();
			String eltCourant;

			while (!pile.estVide()) {
				
				eltCourant = pile.depiler();
				clone.empiler(eltCourant);

				if (!eltCourant.equals(s)) {
					temp.empiler(eltCourant);
				} 

			}

			while (!temp.estVide()) {
				pileRetour.empiler(temp.depiler());
			}

			while (!clone.estVide()) {
				pile.empiler(clone.depiler());
			}
		}

		return pileRetour;

	}
	
	
	/**
	 * Tester la m�thode supprimer.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Pile<String> pile = new PileArrayListImpl<String>();
		pile.empiler("A");
		pile.empiler("B");
		pile.empiler("C");
		pile.empiler("D");
		
		Pile<String> retour = supprimer(pile, "B");
		

		System.out.print("Pile Initial : ");
		while(!pile.estVide()) {
			System.out.print(pile.depiler() + " ");
		}
		
		System.out.print("\n\nPile retour : ");
		while(!retour.estVide()) {
			System.out.print(retour.depiler() + " ");
		}
		
		
	}

}
