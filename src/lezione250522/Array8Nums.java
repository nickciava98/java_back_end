package lezione250522;

import java.util.Scanner;

public class Array8Nums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[8];
		
		for (int i = 0; i < numeri.length; i++) {
			//input
			System.out.print("[numeri_" + i + "]> ");
			numeri[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int somma_neg = 0;
		
		for (int i = 0; i < numeri.length; i++) 
			if (numeri[i] < 0) { //check valore negativo
				somma_neg += numeri[i];
				numeri[i] = 0;
			}
		
		if (-somma_neg > 0) { //se |somma_neg| > 0 stampa
			System.out.println("[somma_neg]> " + somma_neg);
			
			System.out.print("[numeri_new]> ");
			
			for (int i = 0; i < numeri.length; i++)
				System.out.print(numeri[i] + " ");
		}
		
		else { //altrimenti non sono stati inseriti nums < 0
			System.err.println(
					"> nessun valore negativo trovato, modifiche non effettuate");
		}
	}
}
