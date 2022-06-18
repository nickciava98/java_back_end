package lezione260522;

import java.util.Scanner;

public class Array10Nums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[10];
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("[numeri_" + i + "]> ");
			numeri[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for (int i = 0; i < numeri.length - 1; i++) 
			if (numeri[i] > numeri[i + 1]) {
				System.err.println(
						"> valori non crescenti");
				return;
			}
			
		System.out.println("> valori inseriti crescenti");
	}
}
