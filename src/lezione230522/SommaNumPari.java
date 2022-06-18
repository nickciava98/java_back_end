package lezione230522;

import java.util.Scanner;

public class SommaNumPari {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * n - valore di input
		 * i - contatore dei numeri naturali pari > 0
		 * n_pari - contatore dei numeri pari trovati
		 * somma_pari - contenitore della somma dei numeri pari
		 */
		int n, i = 0, n_pari = 0, somma_pari = 0;
		
		//Input n (numeri pari da sommare)
		System.out.print("(in) [n]> "); 
		n = scanner.nextInt();
		
		scanner.close();
		
		//n > 0 !!!
		if (n > 0) {
			/*
			 * Ciclo per ogni numero naturale > 0
			 * Mi fermo se il conteggio dei numeri pari trovati è >= n
			 */
			while (n_pari < n) {
				//Incremento per spostarmi al numero naturale pari successivo
				i += 2;
				
				//Incremento il contatore dei numeri pari
				n_pari++; 
				somma_pari += i; //Sommo il numero pari trovato
			}
			
			//Stampo la somma dei primi n numeri pari
			System.out.println("(out) [somma_pari]> " + somma_pari);
		}
		
		else {
			//Errore se n <= 0
			System.err.println("(err) [n]> inserito valore errato");
		}
	}
}
