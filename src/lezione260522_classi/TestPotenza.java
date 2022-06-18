package lezione260522_classi;

import java.util.Scanner;

public class TestPotenza {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[base]> ");
		int base = scanner.nextInt();
		
		System.out.print("[esponente]> ");
		int esponente = scanner.nextInt();
		
		Potenza potenza = new Potenza();
		
		potenza.base = base;
		potenza.esponente = esponente;
		potenza.pow();
		
		System.out.print("\n[new_base]> ");
		potenza.cambioBase(scanner.nextInt());
		
		System.out.print("[new_esponente]> ");
		potenza.cambioEsponente(scanner.nextInt());
		
		scanner.close();
		
		potenza.pow();		
	}
}
