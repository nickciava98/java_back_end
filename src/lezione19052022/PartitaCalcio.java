package lezione19052022;

import java.util.Scanner;

public class PartitaCalcio {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Squadra 1> ");
		String sq1 = scanner.nextLine();
		
		System.out.print("Gol Sq.1> ");
		int gol1 = scanner.nextInt();
		
		System.out.print("Squadra 2> ");
		String sq2 = scanner.nextLine(); 
		
		System.out.print("Gol Sq.2> ");
		int gol2 = scanner.nextInt();
		
		scanner.close();
		
		if (gol1 > gol2) {
			System.out.println(sq1 + " vince");
		}
		
		else if (gol1 < gol2) {
			System.out.println(sq2 + " vince");
		}
		
		else {
			System.out.println("Pareggio");
		}
	}
}
