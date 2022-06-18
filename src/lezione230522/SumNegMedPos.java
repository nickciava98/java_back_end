package lezione230522;

import java.util.Scanner;

public class SumNegMedPos {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, num_in, tot_neg = 0, i = 1;
		float tot_pos = 0, cont_pos = 0;
		
		System.out.print("(in) [n]> ");
		n = scanner.nextInt();
		
		if (n > 0) {
			while (i <= n) {
				System.out.print("(in) [num_in_" + i + "]> ");
				num_in = scanner.nextInt();
				
				if (num_in > 0) {
					tot_pos += num_in;
					cont_pos++;
				}
				
				else {
					tot_neg += num_in;
				}
				
				i++;
			}
			
			float med_pos = tot_pos / cont_pos;
			
			System.out.println("(out) [tot_neg]> " + tot_neg);
			System.out.println("(out) [med_pos]> " + med_pos);
		}
		
		else {
			System.err.println("(err) [n]> valore errato");
		}
		
		scanner.close();
	}
}
