package lezione19052022;

import java.util.Scanner;

public class Sconto {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		//Input del prezzo
		System.out.print("Prezzo> ");
		float prezzo = s.nextFloat();
		
		s.close();
		
		//Calcolo del prezzo scontato		
		float prezzo_s = prezzo - (0.2f * prezzo);
		
		System.out.println("Prezzo Scontato: " + prezzo_s);
	}

}
