package lezione20052022;

import java.util.Scanner;

public class Bambino {
	public static void main(String args[]) {
		int op1, op2, ris, ris_corr;
		char opr;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("operando1> ");
		op1 = scanner.nextInt();
		
		System.out.print("operando2> ");
		op2 = scanner.nextInt();
		
		System.out.print("operatore> ");
		opr = scanner.next().charAt(0);
		
		System.out.print("risultato> ");
		ris = scanner.nextInt();
		
		scanner.close();
		
		if (opr == '+') {
			ris_corr = op1 + op2;
		}
		
		else if (opr == '-') {
			ris_corr = op1 - op2;
		}
		
		else if (opr == '*') {
			ris_corr = op1 * op2;
		}
		
		else {
			ris_corr = op1 / op2;
		}
		
		if (ris == ris_corr) {
			System.out.println("Risultato corretto");
		}
		
		else {
			System.out.println("Risultato sbagliato");
		}
	}
}
