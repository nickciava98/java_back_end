package domande;

import java.util.Scanner;

public class DomandaRisposta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine();
		
		scanner.close();
		
		if (stringa.endsWith("?"))
			System.out.println("> non saprei...");
		
		else if (stringa.endsWith("!")) 
			System.out.println("> hai proprio ragione!");
		
		else
			System.out.println("> mmm, non mi convince...");
	}
}
