package stringhe;

import java.util.Scanner;

public class ContaVocali {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.next();
		
		scanner.close(); 
		
		int vocali = 0;
		
		for (int i = 0; i < stringa.length(); i++)
			if (stringa.toLowerCase().charAt(i) == 'a'
					| stringa.toLowerCase().charAt(i) == 'e'
					| stringa.toLowerCase().charAt(i) == 'i'
					| stringa.toLowerCase().charAt(i) == 'o'
					| stringa.toLowerCase().charAt(i) == 'u')
				vocali++;
		
		System.out.println("[vocali]> " + vocali);
	}
}
