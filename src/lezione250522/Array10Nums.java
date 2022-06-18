package lezione250522;

import java.util.Scanner;

public class Array10Nums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[10];
		
		System.out.print("[posizione_1]> ");
		int posizione_1 = scanner.nextInt();
		
		scanner.close();
		
		if (posizione_1 > 0 & posizione_1 <= 10) {
			numeri[posizione_1 - 1] = 1;
			
			int i;
			
			for (i = 0; i < numeri.length; i++)
				if (numeri[i] == 1) 			
					break;
			
			System.out.println(
					"> trovato 1 in posizione "
					+ (i + 1));
		}		
		
		else
			System.err.println("> indice errato");
	}
}
