package stringhe;

import java.util.Scanner;

public class ParoleQuasiUguali {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[parola_1]> ");
		String parola_1 = scanner.next();
		
		System.out.print("[parola_2]> ");
		String parola_2 = scanner.next();
		
		scanner.close();
		
		if (parola_1.equals(parola_2)) 
			System.out.println("> sono uguali");
		
		else if (parola_1.equalsIgnoreCase(parola_2)) 
			System.out.println("> sono quasi uguali");
		
		else
			System.out.println("> non sono uguali");
	}
}
