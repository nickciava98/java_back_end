package lampadina;

import java.util.Scanner;

public class TestLampadina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[numeroClickMax]> ");
		int numeroClickMax = scanner.nextInt();
		
		Lampadina lampadina = new Lampadina("spento", 
				numeroClickMax);
				
		int selezione;
		
		do {
			System.out.print("\n1 - click\n2 - stato\n0 - esci\n> ");
			selezione = scanner.nextInt();
			
			if (selezione == 1 
					& !lampadina.stato().equals("rotto"))
				lampadina.click();
			
			else if (selezione == 2)
				System.out.println("[stato]> " 
						+ lampadina.stato());
			
			else if (lampadina.stato().equals("rotto"))
				System.out.println("> lampadina rotta");
			
			else if (selezione == 0) 
				break;
		} while (selezione != 0 
				& selezione >= 1 
				& selezione <= 2);
		
		scanner.close();
		
		System.out.println("\n[stato_finale]> " 
				+ lampadina.stato());
		System.out.println("[numeroClick_totale]> " 
				+ (lampadina.getNumeroClick() + 1)); //aggiungo 1 per mostrare il numero vero > 0
		System.out.println("[numeroClickMax]> " 
				+ (lampadina.getNumeroClickMax() + 1)); //come sopra
	}
}
