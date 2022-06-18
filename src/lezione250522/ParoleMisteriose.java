package lezione250522;

import java.util.Scanner;

public class ParoleMisteriose {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] parole = { 
				"cane", "gatto", "topo", "criceto", "pesce"};
		
		for (int i = 0; i < 3; i++) {
			System.out.print("[parola]> ");
			String parola = scanner.nextLine();
			
			for (int j = 0; j < parole.length; j++) 
				if (parole[j].equals(parola)) {					
					System.out.println("> indovinato");
					System.out.print(
							"> le altre parole misteriose sono: ");
					
					for (int k = 0; k < parole.length; k++)
						if (k != j) 
							System.out.print(parole[k] + " ");
					
					scanner.close(); 
					return;
				}
			
			System.out.println("> sbagliato");
			
			if (i != 2)
				System.err.println(
						"> " + (2 - i) + " tentativi rimasti");
		}
		
		scanner.close();
		
		System.err.println("> tentativi esauriti");
		System.out.print("> le parole misteriose erano: ");
		
		for (int i = 0; i < parole.length; i++) 
			System.out.print(parole[i] + " ");
	}
}
