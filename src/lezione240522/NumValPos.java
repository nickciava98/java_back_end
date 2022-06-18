package lezione240522;

import java.util.Scanner;

public class NumValPos {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n_vals = 0;
		
		//Flag di errore, utile per la condizione del ciclo
		boolean err = true; 
		
		/*
		 * Cicla fino a quando esaurisco i tentativi se sbaglio, 
		 * esce al primo valore corretto se ci sono ancora tentativi
		 */
		for (int i = 0; i < 3 & err; i++) { 
			//Input n_vals
			System.out.print("(in) [n_vals]> ");
			n_vals = scanner.nextInt();
			
			if (n_vals <= 0) { //Stampa errore se <= 0
				System.err.println(
						"(err) [n_vals]> valore errato, " + (2 - i) 
						+ " tentativi rimasti");
				
				err = true; //Imposto un flag di errore
			}
			
			else {
				err = false; //Se > 0 non c'è errore 
			}
		}
		
		if (!err) { //Se non c'è errore, prosegue con l'input
			int num_in, cont_pos = 0;
			
			for (int i = 0; i < n_vals; i++) {
				System.out.print("(in) [num_in]> ");
				num_in = scanner.nextInt();
				
				/*
				 * Se il valore inserito è positivo 
				 * incrementa il contatore dei valori positivi
				 */
				if (num_in > 0) { 
					cont_pos++;
				}
			}
			
			//Stampa quanti valori positivi sono stati inseriti
			System.out.println("(out) [cont_pos]> " + cont_pos);
		}
		
		/*
		 * Il programma finisce se c'è errore e non esegue i calcoli 
		 * oppure dopo aver finito i calcoli
		 */
		
		scanner.close();
	}
}
