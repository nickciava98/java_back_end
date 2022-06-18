package lezione06062022;

import java.util.Scanner;

public class DoppieStringa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine();
		
		scanner.close();
		
		int contDoppie = 0;
		
		for (int i = 0; i < stringa.length() - 1; i++)
			if (stringa.charAt(i) == stringa.charAt(i + 1)) {
				contDoppie++; 
				i++;
			}
		
		System.out.println("[contDoppie]> " + contDoppie);
	}
}
