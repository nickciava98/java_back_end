package lezione20052022;

import java.util.Scanner;

public class NumNaturali {
	public static void main(String args[]) {
		int a, b, i;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a> ");
		a = scanner.nextInt();
		
		System.out.print("b> ");
		b = scanner.nextInt();
		
		scanner.close();
		
		if (a < b) { //Caso 1 a < b
			i = a;
			
			while (i <= b) {
				System.out.print(i + " ");
				
				i++;
			}
		}
		
		else { //Caso 2 a > b
			//Visualizza come se a e b fossero in ordine inverso
			i = b;
			
			while (i <= a) {
				System.out.print(i + " ");
				
				i++;
			}
		}
	}
}
