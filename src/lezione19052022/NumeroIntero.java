package lezione19052022;

public class NumeroIntero {
	public static void main(String args[]) {
		int n = 11;
		
		if(n % 2 == 0) { 
			System.out.println(
					"n pari, 2n = " + 2 * n);
		}
		
		else {
			System.out.println(
					"n dispari, 3n = " + 3 * n);
		}
	}
}
