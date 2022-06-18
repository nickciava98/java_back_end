package stringhe;

import java.util.Scanner;

public class Rimpiazza {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine();
		
		System.out.print("[char_1]> ");
		char char_1 = scanner.next().charAt(0);
		
		System.out.print("[char_2]> ");
		char char_2 = scanner.next().charAt(0);
		
		scanner.close();
		
		System.out.println("[new_stringa]> " 
				+ stringa.replace(char_1, char_2));
	}
}
