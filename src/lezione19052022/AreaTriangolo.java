package lezione19052022;

/**
 * 
 * @author niccolo
 * 
 * Calcola area triangolo dati b, h se != 0
 *
 */

public class AreaTriangolo {
	public static void main(String args[]) {
		int base = 3, altezza = 19;
		
		System.out.println("Base = " + base);
		System.out.println("Altezza = " + altezza);
		
		if (base > 0 && altezza > 0) {
			float area = base * altezza / 2f;
			
			System.out.println("Area = " + area);
		}
		
		else {
			System.out.println("Valori errati");
		}
	}
}
