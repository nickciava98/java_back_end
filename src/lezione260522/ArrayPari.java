package lezione260522;

import java.util.Scanner;

public class ArrayPari {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[10];
		
		//popolazione del vettore da standard input
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("[numeri_" + i + "]> ");
			numeri[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int cont_pari = 0; //Contatore num. pari
		
		//Ciclo solo negli indici pari, i = i + 2
		for (int i = 0; i < numeri.length; i += 2) 
			if (numeri[i] % 2 == 0) 
				cont_pari++; //Incremento se pari
			
		/*
		 * Se cont_pari è uguale alla metà della dimensione dell'array
		 * allora tutti i valori in pos. pari sono pari
		 */
		if (cont_pari == numeri.length / 2) 
			System.out.println("> pari in ogni pos. pari");
		
		//Altrimenti c'è almeno un dispari in pos. pari
		else
			System.out.println("> almeno un dispari in pos. pari");
	}
}
