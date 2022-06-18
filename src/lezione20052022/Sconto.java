package lezione20052022;

import java.util.Scanner;

public class Sconto {
	public static void main(String args[]) {
		float prezzo, quantita, prezzo_tot;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Prezzo> ");
		prezzo = scanner.nextFloat();
		
		System.out.print("Quantità> ");
		quantita = scanner.nextFloat();
		
		scanner.close();
		
		if (quantita > 0 & prezzo > 0) {
			if (quantita < 5) {
				prezzo_tot = prezzo * quantita;
			}
			
			else if (quantita > 5 & quantita <= 10) {
				System.out.println("Sconto 5%");
				
				prezzo_tot = prezzo * quantita * .95f;
			}
			
			else if (quantita > 10 & quantita <= 20) {
				System.out.println("Sconto 15%");
				
				prezzo_tot = prezzo * quantita * .85f;
			}
			
			else {
				System.out.println("Sconto 20%");
				
				prezzo_tot = prezzo * quantita * .8f;
			}
			
			System.out.println("Totale spesa: € " + prezzo_tot);
		}
		
		else {
			System.out.println("Nessun acquisto");
		}
	}
}
