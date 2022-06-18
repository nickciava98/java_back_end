package lezione240522;

import java.util.Scanner;

public class Asterischi {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		String out = "";
		
		do {		
			System.out.print("(in) [n]> ");
			n = scanner.nextInt();
			
			if (n < 0) {
				System.err.println("(err) [n]> valore negativo");
			}
		} while (n < 0);
		
		scanner.close();
		
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				out += "*";
				
				System.out.println("(out) " + out);
			}
		}
		
		else {
			System.err.println("(err) [n]> nulla da visualizzare");
		}
	}
}
