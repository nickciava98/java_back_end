package stringhe;

import java.util.Scanner;

public class ContaCharInString {
	public static int occorrenzeString(String stringa, 
			char carattere) {
		int occorrenze = 0;
		
		for (int i = 0; i < stringa.length(); i++) 
			if (stringa.charAt(i) == carattere) 
				occorrenze++;
		
		return occorrenze;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine();
		
		System.out.print("[carattere]> ");
		char carattere = scanner.next().charAt(0);
		
		scanner.close();
		
		int occorrenze = occorrenzeString(stringa, carattere);
		
		if (occorrenze > 0) 
			System.out.println("[occorrenze]> " + occorrenze);
		
		else
			System.out.println("> nessuna occorrenza");
	}
}
