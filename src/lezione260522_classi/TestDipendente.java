package lezione260522_classi;

import java.util.Scanner;

public class TestDipendente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		Dipendente dipendente = new Dipendente();
		
		System.out.print("[nome]> ");
		dipendente.nome = scanner.nextLine();
		
		System.out.print("[stipendio]> ");
		dipendente.stipendio = scanner.nextDouble();
		
		System.out.println("[dipendente]> "
				+ dipendente.nome 
				+ ", €" + dipendente.stipendio + "/mese");		
		
		System.out.print("\n[aumento%]> ");
		dipendente.aumentaSalario(
				scanner.nextDouble());
		
		System.out.println("[stipendio_aumentato]> "
				+ dipendente.stipendio);
		
		scanner.nextLine();
		
		System.out.print("\n[new_nome]> ");
		dipendente.nome = scanner.nextLine();
		
		System.out.print("[new_stipendio]> ");
		dipendente.stipendio = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("[new_dipendente]> "
				+ dipendente.nome 
				+ ", €" + dipendente.stipendio + "/mese");
	}
}
