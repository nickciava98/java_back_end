package lezione230522;

import java.util.Scanner;

public class MediaValori {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		float num_in = 1, sum_num_in = 0;
		
		while (num_in != 0) {
			System.out.print("(in) [num_in]> ");
			num_in = scanner.nextFloat();
			
			sum_num_in += num_in;
			i++;
		}
		
		scanner.close();
		
		if (i - 1 > 0) {
			float media = sum_num_in / (i - 1);
			
			System.out.println("(out) [media]> " + media);
		}
		
		else {
			System.err.println("(err) [i]> inserire almeno un valore");
		}
	}
}
