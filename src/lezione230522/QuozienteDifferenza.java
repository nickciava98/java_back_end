package lezione230522;

import java.util.Scanner;

public class QuozienteDifferenza {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.print("(in) [num_1]> ");
		num_1 = scanner.nextInt();
		
		System.out.print("(in) [num_2]> ");
		num_2 = scanner.nextInt();
		
		scanner.close();	
		
		if (num_2 != 0) {
			int i = num_1, quoziente = 0, resto;
			
			while (i >= num_2) {
				i -= num_2;
				quoziente++;
			}
			
			resto = i;
			
			System.out.println("(out) [quoziente]> " + quoziente);
			
			if (resto != 0) {
				System.out.println("(out) [resto]> " + resto);
			}
		}
		
		else {
			System.err.println("(err) [num_2]> divisione per zero");
		}
	}
}
