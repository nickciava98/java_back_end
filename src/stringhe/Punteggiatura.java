package stringhe;

import java.util.Scanner;

public class Punteggiatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringa;
		int punt = 0;
		
		do {
			System.out.print("[stringa]> ");
			stringa = scanner.nextLine();
			
			for (int i = 0; i < stringa.length(); i++)      
				if (stringa.charAt(i) == '!' 
						| stringa.charAt(i) == ',' 
						| stringa.charAt(i) == ';' 
						| stringa.charAt(i) == '.' 
						| stringa.charAt(i) == '?' 
						| stringa.charAt(i) == '-' 
						| stringa.charAt(i) == '\'' 
						| stringa.charAt(i) == '\"' 
						| stringa.charAt(i) == ':')   
					punt++;        
		} while (!stringa.isEmpty());
		
		scanner.close();
		
		System.out.println("[punt]> " + punt);
	}
}
