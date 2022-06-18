package lezione240522;

import java.util.Scanner;

public class TabellinaNumero {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.print("(in) [n]> ");
		n = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(
					"(out) " + n + "x" + i + " = " + n * i);
		}
	}
}

