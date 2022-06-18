package lezione260522;

import java.util.Scanner;

public class Array6Nums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[6];
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("[numeri_" + i + "]> ");
			numeri[i] = scanner.nextInt();
		}
		
		System.out.print("[val_in]> ");
		int val_in = scanner.nextInt();
		
		scanner.close();
		
		int val_inf = 0, val_sup = 0, val_eq = 0;
		
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] < val_in) 
				val_inf++;
			
			else if (numeri[i] > val_in)
				val_sup++;
			
			else 
				val_eq++;
		}
		
		System.out.println("[val_inf]> " + val_inf);
		System.out.println("[val_eq]> " + val_eq);
		System.out.println("[val_sup]> " + val_sup);
	}
}
