package lezione230522;

import java.util.Scanner;

public class ValNeg {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, n, neg = 0;
		
		while (i <= 20) {
			System.out.print("(in) [n_" + i + "]> ");
			n = scanner.nextInt();
			
			if (n < 0) {
				neg++;
			}
			
			i++;
		}
		
		scanner.close();
		
		System.out.println("(out) [neg]> " + neg);
	}
}
