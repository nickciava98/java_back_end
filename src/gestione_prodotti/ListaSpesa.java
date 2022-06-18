package gestione_prodotti;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ListaSpesa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> tessera? [1 - S, 0 - N]> ");
		int tessera = scanner.nextInt();
		
		int input;
		float totale = 0;
		
		do {
			System.out.print("\n1 - inserisci prodotto\n" 
					+ "0 - esci\n" 
					+ "> ");
			input = scanner.nextInt();
			
			if (input == 1) {
				System.out.print("\n[descrizione]> ");
				String descrizione = scanner.nextLine();
				
				scanner.nextLine();
				
				System.out.print("[prezzoUnitario]> € ");
				float prezzoUnitario = scanner.nextFloat();
				
				System.out.print("[quantita]> ");
				int quantita = scanner.nextInt();
				
				System.out.print("\n> alimentare? [1 - S, 0 - N]> ");
				int isAlimentare = scanner.nextInt();
				
				if (isAlimentare == 1) {
					System.out.print("[dataScadenza]> ");
					String dataScadenza = scanner.next();
					
					Alimentare a = new Alimentare(
							descrizione, 
							prezzoUnitario, 
							LocalDate.parse(dataScadenza, 
									DateTimeFormatter.ofPattern("dd/MM/yyyy")));
					
					if (tessera == 1) {
						if (a.applicaSconto() != -1) {
							System.out.println("\n> sconto 10%");
							totale += quantita * a.applicaSconto();
						}
						
						else
							System.err.println("\n> scaduto");
					}
					
					else
						totale += quantita * a.getPrezzoUnitario();
					
					System.out.println("\n" + a);
				}
				
				else {
					System.out.print("[materiale]> ");
					String materiale = scanner.next();
					
					NonAlimentare na = new NonAlimentare(
							descrizione,
							prezzoUnitario,
							materiale);
					
					if (tessera == 1) {
						System.out.println("\n> sconto 10%");
						totale += quantita * na.applicaSconto();
					}
					
					else
						totale += quantita * na.getPrezzoUnitario();
					
					System.out.println("\n" + na);
				}
			}
		} while (input != 0);
		
		scanner.close();
		
		System.out.println("\n> totale spesa: € " + totale);
	}
}
