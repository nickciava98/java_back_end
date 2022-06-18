package stringhe;

import java.util.Scanner;

public class SpezzaMeta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("[stringa_1]> " 
				+ stringa.substring(0, stringa.length() / 2));
		System.out.println("[stringa_2]> " 
				+ stringa.substring(stringa.length() / 2));
	}
}
