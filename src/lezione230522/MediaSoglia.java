package lezione230522;

import java.util.Scanner;

public class MediaSoglia {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, s;
		
		System.out.print("(in) [n]> ");
		n = scanner.nextInt();
		
		System.out.print("(in) [s]> ");
		s = scanner.nextInt();
		
		if (n > 0 & s > 0) {
			int i = 1, j = 0;
			float tot = 0, num;
			
			while (i <= n) {
				System.out.print("(in) [num_" + i + "]> ");
				num = scanner.nextInt();
				
				if (num <= s) {
					tot += num;
					j++;
				}
				
				i++;
			}
			
			float media = tot / j;
			
			System.out.println("(out) [media]> " + media);
		}
		
		else {
			System.err.println("(err) [n | s]> valori errati");
		}
		
		scanner.close();
	}
}
