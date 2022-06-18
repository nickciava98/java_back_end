package lezione230522;

/**
 * Somma dei primi n numeri naturali
 * n preso in input
 */

import java.util.Scanner;

public class SommaPrimiNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, i = 1, somma = 0;
		
		System.out.print("(in) [n]> ");
		n = scanner.nextInt();
		
		while (n <= 0) {
			System.out.println("n <= 0, riprovare");
			
			System.out.print("(in) [n]> ");
			n = scanner.nextInt();
		}
		
		scanner.close();
		
		
		while (i <= n) {
			somma += i;
			i++;
		}
		
		System.out.println("(out) [somma]> " + somma);
	}
}
