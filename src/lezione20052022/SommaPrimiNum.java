package lezione20052022;

public class SommaPrimiNum {
	public static void main(String args[]) {
		int i = 0, tot = 0;
		
		System.out.print("Somma primi 10 numeri naturali: ");
		
		while (i <= 10) {
			tot += i;
			i++;
		}
		
		System.out.println(tot);
	}
}
