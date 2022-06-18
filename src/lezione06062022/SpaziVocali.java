package lezione06062022;

import java.util.Scanner;

public class SpaziVocali {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine();
		
		scanner.close();
		
		int contSpaziVocali = 0;
		stringa = stringa.toLowerCase();
		
		for(int i = 0; i < stringa.length() - 1; i++) 
			if (stringa.charAt(i) == ' ' 
					& (stringa.charAt(i + 1) == 'a'
					| stringa.charAt(i + 1) == 'e'
					| stringa.charAt(i + 1) == 'i'
					| stringa.charAt(i + 1) == 'o'
					| stringa.charAt(i + 1) == 'u')) 
				contSpaziVocali++;
		
		System.out.println("[contSpaziVocali]> " 
				+ contSpaziVocali);
	}
}
