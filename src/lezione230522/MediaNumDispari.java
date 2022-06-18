package lezione230522;

import java.util.Scanner;

public class MediaNumDispari {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * n - valore di input
		 * i - contatore dei numeri naturali > 0
		 * n_dispari - contatore dei numeri dispari trovati
		 * somma_dispari - contenitore della somma dei numeri dispari
		 * media - media dei primi n numeri dispari
		 */
		int n, i = 0, n_dispari = 0, somma_dispari = 0, media;
		
		//Input n (numeri pari da sommare)
		System.out.print("(in) [n]> "); 
		n = scanner.nextInt();
		
		scanner.close();
		
		//n > 0 !!!
		if (n > 0) {
			/*
			 * Ciclo per ogni numero naturale > 0
			 * Mi fermo se il conteggio dei numeri dispari trovati è >= n
			 */
			while (n_dispari < n) {		
				if (i % 2 == 1) {
					//Incremento il contatore dei numeri dispari
					n_dispari++; 
					somma_dispari += i; //Sommo il numero pari trovato
				}
				
				//Incremento per spostarmi al numero naturale successivo
				i++;
			}
			
			media = somma_dispari / n_dispari;
			
			//Stampo la media dei primi n numeri dispari
			System.out.println("(out) [media]> " + media);
		}
		
		else {
			//Errore se n <= 0
			System.err.println("(err) [n]> inserito valore errato");
		}
	}
}
