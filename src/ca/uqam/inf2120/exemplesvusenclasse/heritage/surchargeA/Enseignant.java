/**
 * Enseignant.java
 */
package ca.uqam.inf2120.exemplesvusenclasse.heritage.surchargeA;

/**
 * @author Victor Piron
 * PIRV11026606
 * INF2120 Groupe 30 (Isma�l Doukoure)
 * piron.victor@courrier.uqam.ca  
 * @version 2014-02-02
 */
public class Enseignant extends Personne {

	public boolean equals(Object obj) {
		System.out.println("Enseignant-equals(Object)");
		return true;
		}
		public String toString() {
		System.out.println("Enseignant - toString()");
		return "";
		}
}
