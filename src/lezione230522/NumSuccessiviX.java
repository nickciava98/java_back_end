package lezione230522;

import java.util.Scanner;

public class NumSuccessiviX {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, x;
		
		System.out.print("(in) [n]> ");
		n = scanner.nextInt();
		
		System.out.print("(in) [x]> ");
		x = scanner.nextInt();
		
		scanner.close();
		
		if (n > 0) {
			int i = 1;
			
			while (i <= n) {
				System.out.println("(out) [x + " + i + "]> " + (x + i));
				
				i++;
			}
		}
		
		else {
			System.err.println("(err) [n]> valore errato");
		}
	}
}
