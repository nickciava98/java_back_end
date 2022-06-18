package lezione20052022;

import java.util.Scanner;

public class ValMax {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		float n1, n2, n3;
		
		System.out.print("n1> ");
		n1 = scanner.nextFloat();
		
		System.out.print("n2> ");
		n2 = scanner.nextFloat();
		
		System.out.print("n3> ");
		n3 = scanner.nextFloat();
		
		scanner.close();
		
		if(n1 > n2 & n1 > n3) {
			System.out.println("n1 massimo");
		}
		
		else if(n2 > n3) {
			System.out.println("n2 massimo");
		}
		
		else {
			System.out.println("n3 massimo");
		}
	}
}

