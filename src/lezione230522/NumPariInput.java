package lezione230522;

import java.util.Scanner;

public class NumPariInput {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, n, pari = 0;
		
		while (i <= 15) {
			System.out.print("(in) [n_" + i + "]> ");
			n = scanner.nextInt();
			
			if (n % 2 == 0) {
				pari++;
			}
			
			i++;
		}
		
		scanner.close();
		
		System.out.println("(out) [pari]> " + pari);
	}
}
