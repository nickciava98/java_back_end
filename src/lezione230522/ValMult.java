package lezione230522;

import java.util.Scanner;

public class ValMult {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		
		System.out.print("(in) [n]> ");
		n = scanner.nextInt();
		
		System.out.print("(in) [m]> ");
		m = scanner.nextInt();
		
		if (n > 0) {
			int num_in, i = 1, cont_mul = 0;
			
			while (i <= n) {
				System.out.print("(in) [num_in_" + i + "]> ");
				num_in = scanner.nextInt();
				
				if (num_in % m == 0) {
					cont_mul++;
				}
				
				i++;
			}
			
			System.out.println("(out) [cont_mul]> " + cont_mul);
		}
		
		else {
			System.err.println("(err) [n]> valore errato");
		}
		
		scanner.close();
	}
}
