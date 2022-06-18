package lezione20052022;

import java.util.Scanner;

public class BigliettoMuseo {
	public static void main(String args[]) {
		int opzione, prezzo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 - Età inferiore a 6 anni");
		System.out.println("2 - Studenti");
		System.out.println("3 - Pensionati");
		System.out.println("4 - Altri");
		
		System.out.print("> ");
		opzione = scanner.nextInt();
		
		scanner.close();
		
		if (opzione >= 1 & opzione <= 4) {
			if (opzione == 1) {
				prezzo = 0;
			}
			
			else if (opzione == 2) {
				prezzo = 8;
			}
			
			else if (opzione == 3) {
				prezzo = 10;
			}
			
			else {
				prezzo = 15;
			}
			
			System.out.println("Prezzo biglietto: € " + prezzo);
		}
		
		else {
			System.out.println("Opzione errata");
		}
	}
}
