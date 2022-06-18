package lezione06062022;

import java.util.Scanner;

public class CheckCaratteri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.next();
		
		scanner.close();
		
		for (int i = 0; i < stringa.length(); i++)
			if (stringa.indexOf(stringa.charAt(i), i + 1) != -1) { 
				System.err.println("> almeno un carattere viene ripetuto");
				return;
			}
		
		System.out.println("> non ci sono caratteri ripetuti");
	}
}
