package lezione19052022;

public class FormatoOra {
	public static void main(String args[]) {
		int h = -18, m = 30, s = 40;
		
		System.out.println(
				"Orario - " 
				+ h + ":" + m + ":" + s);
		
		if (h >= 0 & m >= 0 & s >= 0 
				& h < 24 & m < 60 & s < 60) {
			System.out.println("Orario corretto");
		}
		
		else {
			System.out.println("Orario sbagliato");
		}
	}
}
