package ca.uqam.inf2120.labos.collections;
import java.util.ArrayList;
import java.util.List;


/**
 * TestArrayList avec des m�thodes pour manipuler le type Double.
 *  
 * @author Ismael Doukoure / Gloire
 *
 */
public class TestArrayList {
	
	/**
	 * Calcule la somme des valeurs de la liste pass�e en param�tre.
	 * 
	 * @param liste
	 * @return La somme 
	 */
	public static double somme(List<Double> liste) {
		double somme = 0;
		
		for (int i = 0; i < liste.size(); ++i) {
			somme += liste.get(i);
		}
		
		return somme;
	}
	
	/**
	 * Calcule la moyenne des valeurs de la liste pass�e en param�tre.
	 * 
	 * @param liste
	 * @return La moyenne 
	 */
	public static double moyenne(List<Double> liste) {
		double moyenne = 0;
		
		if (liste.size() > 0) {
			moyenne = somme(liste)/liste.size();
		}
		return moyenne;
	}
	
	/**
	 * Retourne la valeur Minimum de la liste
	 * Equivalent � la m�thode Collection.min(Collection<Object> t);
	 * 
	 * @param liste
	 * @return La plus petite valeur
	 */
	public static double obtenirMin(List<Double> liste) {
		double min = 0;
		
		if (liste.size() > 0) {
			 min = liste.get(0);

			for (double val : liste) {

				if (val < min) {
					min = val;
				}
			}
		}
		return min;
	}
	
	/**
	 * Retourne la valeur Maximum de la liste
	 * Equivalent � la methode Collection.max(Collection<Object> t);
	 * 
	 * @param liste
	 * @return La plus grande valeur
	 */
	public static double obtenirMax(List<Double> liste) {
		double max = 0;
		
		if (liste.size() > 0) {
			 max = liste.get(0);

			for (double val : liste) {

				if (val > max) {
					max = val;
				}
			}
		}
		return max;
	}
	
	/**
	 * Retourne le nombre de valeurs > � la moyenne
	 * @param liste
	 * @param moyenne
	 * @return
	 */
	public static int obtenirNbValeursSupMoyenne(List<Double> liste, double moyenne) {
		int n = 0;
		
		for (int i = 0; i < liste.size(); ++i) {
			if (liste.get(i) > moyenne) {
				n++;
			}
		}
		
		return n;
	}
	
	/**
	 * Remplace les valeurs selon les crit�res suivants :
	 *   - si la valeur est n�gative, on la remplace par z�ro.
	 *   - i)	si la valeur est positive et impaire, on la remplace par sa valeur augment�e de 1.
	 *   
	 * @param liste
	 * @return La nouvelle liste.
	 */
	public static List<Double> parcourirEtRemplacer(List<Double> liste) {
		List<Double> retour = new ArrayList<Double>();
		
		for (int i = 0; i < liste.size(); ++i) {
			double valeur = liste.get(i);
			if (valeur < 0) {
				retour.add(0.0);
			}
			else if (valeur % 2 != 0) {
				retour.add(valeur + 1);
			}
			else {
				retour.add(valeur);
			}
		}
		
		return retour;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Double> uneListe = new ArrayList<Double>();
		
		uneListe.add(12.0);
		uneListe.add(15.0);
		uneListe.add(36.0);
		uneListe.add(40.0);
		uneListe.add(9.0);
		
		double min = obtenirMin(uneListe);
		double max = obtenirMax(uneListe);
		double moyenne = moyenne(uneListe);
		System.out.println("La somme des valeurs de la liste est : "+ somme(uneListe));
		System.out.println("La moyenne des valeurs de la liste est : "+ moyenne);
		System.out.println("La valeur minimale de la liste est : "+  min + 
				" et son indice est "+ uneListe.indexOf(min));
		System.out.println("La valeur maximale de la liste est "+ max + 
				" et son indice est "+ uneListe.indexOf(max));
		System.out.println("Le nombre de valeurs strictement sup�rieures � la moyenne est : "+
				obtenirNbValeursSupMoyenne(uneListe, moyenne));
		
		
		uneListe.set(0, -10.0);
		uneListe.set(3, -15.0);
		
		System.out.print("\n\nLa liste avant la modification : ");
		for (double v : uneListe) {
			System.out.print(v + " ");
		}
		
		System.out.print("\n\nLa liste apr�s la modification : ");
		
		List<Double> retour = parcourirEtRemplacer(uneListe);
		for (double v : retour) {
			System.out.print(v + " ");
		}
	}

}
