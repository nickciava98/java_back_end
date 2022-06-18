package lezione19052022;

public class PrezzoProdotto {
	public static void main(String args[]) {
		float prezzo = 29.56f;
		float prezzo_s;
		
		System.out.println("Prezzo: € " + prezzo);
		
		if (prezzo < 30) {
			prezzo_s = prezzo * .88f;
		}
		
		else {
			prezzo_s = prezzo * .75f;
		}
		
		System.out.println("Prezzo scontato: € " + prezzo_s);
	}
}
