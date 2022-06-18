package lezione06062022;

public class CalcolaMedia {
	public static void main(String[] args) {
		int[] v = {6, 3, 1, 2, 9};
		float somma = 0;
		
		for (int i = 0; i < v.length; i++)
			somma += v[i];
		
		System.out.println(somma / v.length);
	}
}
