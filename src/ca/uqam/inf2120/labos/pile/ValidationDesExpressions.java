package ca.uqam.inf2120.labos.pile;

import java.util.Scanner;

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
public class ValidationDesExpressions {

	/**
	 * Valider si l'expression math�matique est correctement d�limit�e
	 * par les pareth�ses.
	 * 
	 * @param expression L'expression �  valider.
	 * @return Vrai si l'expression est correctement d�limit�e, sinon faux.
	 */
	public static boolean validerExpression(String expression) {

		Pile<Character> pileTemp = new PileArrayListImpl<Character>();													
		boolean estValide = true;
		char caractereCourant;
		
		if (expression != null && !expression.isEmpty()) {
			
			for (int i = 0; estValide && (i < expression.length()); i++) {
				
				caractereCourant = expression.charAt(i);
				
				if (caractereCourant == '(') {
					pileTemp.empiler(caractereCourant);
					
				} else if (caractereCourant == ')') {
					if (pileTemp.estVide()) {
						estValide = false;
					} else {
						pileTemp.depiler();
					}
					
					
				}
		    }
		}	
		
		return (pileTemp.estVide() && estValide);
	}


	/**
	 * Tester la m�thode validerExpression
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Veuillez entrer une expression : ");
		String s = clavier.nextLine();
		
		clavier.close();
		
		if (validerExpression(s)) {
			System.out.println("=> Valide");
		}
		else {
			System.out.println("=> non Valide");
		}
		
		

	}

}
