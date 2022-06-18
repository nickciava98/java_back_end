package brano;

public class TestBranoDigitale {
	public static void main(String[] args) {
		BranoDigitale brano = new BranoDigitale(
				"mp3", //formato
				"brano_1", //titolo
				"autore_1"); //autore
		
		//stampo valori correnti
		System.out.println("[formato]> " + brano.getFormato());
		System.out.println("[titolo]> " + brano.getTitolo());
		System.out.println("[autore]> " + brano.getAutore());
		
		//cambio valori
		brano.setFormato("wav");
		brano.setTitolo("brano_2");
		brano.setAutore("autore_2");
		
		//stampo nuovi valori
		System.out.println("\n[new_formato]> " + brano.getFormato());
		System.out.println("[new_titolo]> " + brano.getTitolo());
		System.out.println("[new_autore]> " + brano.getAutore());
	}
}
