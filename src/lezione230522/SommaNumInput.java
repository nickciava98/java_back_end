package lezione230522;

import java.util.Scanner;

public class SommaNumInput {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 0, n, somma = 0;
		
		while (i < 10) {
			System.out.print("(in) [n_" + (i + 1) + "]> ");
			n = scanner.nextInt();
			
			somma += n;
			i++;
		}
		
		scanner.close();
		
		System.out.println("(out) [somma]> " + somma);
	}
}
