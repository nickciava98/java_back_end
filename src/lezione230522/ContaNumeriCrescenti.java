package lezione230522;

import java.util.Scanner;

public class ContaNumeriCrescenti {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * num - numero in input
		 * num_pre - numero precedente preso in input
		 * len_sq - lunghezza della sequenza crescente
		 */
		float num = 0, num_pre = 0;
		int len_sq = 0;
		
		//Input primo valore
		System.out.print("(in) [num]> ");
		num = scanner.nextFloat();
		num_pre = num; //Essendo il primo, il precedente non esiste
		len_sq++;
		
		while (num >= num_pre) { //Ciclo fino a quando inserisco valori maggiori
			num_pre = num; //Il precedente sarà ancora in num perché l'input è dopo
			
			System.out.print("(in) [num]> ");
			num = scanner.nextFloat();
			
			len_sq++; //Incremento lunghezza
		}
		
		scanner.close();
		
		System.out.println("(out) [len_sq]> " + (len_sq - 1));
	}
}
