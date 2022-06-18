package lezione250522;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[10];
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("[numeri_" + i + "]> ");
			numeri[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int massimo = numeri[0], pos_max = 0;
		
		for (int i = 0; i < numeri.length; i++)
			if (numeri[i] > massimo) {
				massimo = numeri[i];
				pos_max = i;
			} 
		
		System.out.println("\n[massimo]> " + massimo);
		System.out.println("[pos_max]> " + pos_max);
	}
}
