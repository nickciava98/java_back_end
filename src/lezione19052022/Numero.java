package lezione19052022;

/**
 * 
 * @author niccolo
 * 
 * Dato un numero intero, stabilire se è pari o dispari
 *
 */

public class Numero {
	public static void main(String args[]) {
		int n = 13;
		
		System.out.println("n = " + n);
		
		if(n % 2 == 0) {
			System.out.println("Pari");
		}
		
		else {
			System.out.println("Dispari");
		}
	}
}
