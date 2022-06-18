package lezione250522;

import java.util.Scanner;

public class Array7Nums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[7];
		int cont_zero = 0;
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("[numeri_" + i + "]> ");
			numeri[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for (int i = 0; i < numeri.length; i++) 
			if (numeri[i] == 0) 
				cont_zero++;
		
		if (cont_zero > 0)
			System.out.println(
					"> zero memorizzato " + cont_zero + " volte");
		
		else 
			System.err.println("> nessuno zero presente");
	}
}
