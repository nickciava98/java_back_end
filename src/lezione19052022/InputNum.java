package lezione19052022;

import java.util.Scanner;

/**
 * 
 * @author niccolo
 *
 * Scrivere l'algoritmo che, 
 * letto in input un valore numerico, 
 * dica se è positivo, negativo o nullo.
 * 
 */

public class InputNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("num> ");
		float num = scanner.nextFloat();
		
		if (num > 0) {
			System.out.println("Positivo");
		}
		
		else if (num == 0) {
			System.out.println("Nullo");
		}
		
		else {
			System.out.println("Negativo");
		}
		
		scanner.close();
	}
}
