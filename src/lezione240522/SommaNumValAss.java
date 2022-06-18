package lezione240522;

import java.util.Scanner;

public class SommaNumValAss {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n_vals, num_in, sum_pos = 0, sum_abs_neg = 0;
		
		do { //Input, n_vals > 0!!!
			System.out.print("(in) [n_vals]> ");
			n_vals = scanner.nextInt();
			
			if (n_vals <= 0) {
				System.err.println("(err) [n_vals]> valore errato");
			}
		} while (n_vals <= 0);
		
		if (n_vals > 1) { //entro se posso inserire più di un valore
			int n_pos = 0, n_neg = 0;
			
			for (int i = 1; i <= n_vals; i++) { //Inserisco i valori
				System.out.print("(in) [num_in_" + i + "]> ");
				num_in = scanner.nextInt();
				
				if (num_in > 0) { //Se positivo
					sum_pos += num_in;
					n_pos++;
				}
				
				else if (num_in < 0) { //Se negativo
					sum_abs_neg += -num_in;
					n_neg++;
				} //Se zero non succede nulla e va avanti
			}
			
			if (n_pos > 1 | n_neg > 1) { //Se è stato inserito più di un numero
				if (sum_pos > 0 & n_pos > 1) { 
					/*
					 * Se è stato inserito più di un numero positivo la somma sarà significativa, 
					 * altrimenti conterrà solo il numero inserito
					 */
					System.out.println("(out) [sum_pos]> " + sum_pos);
				}
				
				if (sum_abs_neg > 0 & n_neg > 1) {
					/*
					 * Se è stato inserito più di un numero negativo la somma sarà significativa,
					 * altrimenti conterrà solo il numero inserito
					 */
					System.out.println("(out) [sum_abs_neg]> " + sum_abs_neg);
				}
			}
			
			else { //Errore se è stato inserito solo un valore, somma non significativa
				System.err.println("(err) [n_pos | n_neg]> somma possibile con più di un valore");
			}
		}
		
		else { //Somma non possibile con un solo valore
			System.err.println("(err) [n_vals]> calcolo non possibile");
		}
		
		scanner.close();
	}
}
