package lezione06062022;

import java.util.Scanner;

public class RipetizioneCaratteri {
	public static final int NMAX = 45;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[stringa]> ");
		String stringa = scanner.nextLine().toLowerCase();
		
		scanner.close();
		
		/*
		 * array con le ripetizioni di ogni singolo carattere,
		 * conterrà in ogni posizione la ripetizione del carattere 
		 * presente alla stessa posizione nella stringa
		 */
		int[] numChars = new int[stringa.length()];
		
		/*
		 * controllo per ogni carattere quante volte viene ripetuto
		 */
		for (int i = 0; i < stringa.length(); i++)
			for (int j = i; j < stringa.length(); j++)
				if (stringa.charAt(i) == stringa.charAt(j))
					numChars[i]++;
		
		int indexNumChars = 0, maxNumChars = numChars[0];
		
		/*
		 * vado a cercare il massimo elemento del vettore delle ripetizioni
		 * e mi salvo la posizione del massimo
		 */
		for (int i = 1; i < stringa.length(); i++)
			if (numChars[i] >= maxNumChars)
				indexNumChars = i;
		
		/*
		 * il carattere ripetuto più volte sarà presente alla posizione 
		 * indexNumChars della stringa di partenza
		 */
		if (numChars[indexNumChars] > 1)
			System.out.println("> carattere ripetuto più volte '" 
					+ stringa.charAt(indexNumChars) + "'");
	}
}
