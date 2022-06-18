package lezione230522;

import java.util.Scanner;

public class ProdottoConSomma {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.print("(in) [num_1]> ");
		num_1 = scanner.nextInt();
		
		System.out.print("(in) [num_2]> ");
		num_2 = scanner.nextInt();
		
		scanner.close();
		
		if (num_1 != 0 & num_2 != 0) {
			int i = 1, prodotto = num_1;
			
			while (i < num_2) {
				prodotto += num_1;
				i++;
			}
			
			System.out.println(
					"(out) [prodotto]> " + prodotto);
		}
		
		else {
			System.out.println("(out) [prodotto]> 0");
		}
	}
}
