package lezione240522;

import java.util.Scanner;

public class MediaNumeri {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num_in = 0, cont_num = 0;
		float somma = 0;
		
		do {
			somma += num_in;
			cont_num++;
			
			System.out.print("(in) [num_in]> ");
			num_in = scanner.nextInt();
			
		} while (num_in >= 0);
		
		scanner.close();
		
		if (somma > 0) {
			float media = somma / (cont_num - 1);
			
			System.out.println("(out) [media]> " + media);
		}
		
		else {
			System.err.println("(err) [somma]> media non possibile");
		}
	}
}
