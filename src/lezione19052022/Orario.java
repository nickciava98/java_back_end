package lezione19052022;

public class Orario {
	public static void main(String args[]) {
		// h - Ore, m - Minuti, s - Secondi
		int h = 10, m = 30, s = 43;
		
		//tot_s - Totale in secondi
		int tot_s = h * 3600 + m * 60 + s;
		
		System.out.println(
				"Orario - " + h + ":" + m + ":" + s);
		
		System.out.println(
				"Il totale in secondi è: " + tot_s);
	}
}
