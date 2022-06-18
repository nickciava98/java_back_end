package campo_tennis;

public class ProvaCampo {
	public static void main(String[] args) {
		Campo campo = new Campo(12);
		
		if (!campo.addPren(10, 12, "Giorgio"))
			System.err.println("Errore prenotazione Giorgio");
		
		if (!campo.addPren(10, 12, "Mario"))
			System.err.println("Errore prenotazione Mario");

		if (!campo.addPren(19, 20, "Mario"))
			System.err.println("Errore prenotazione Mario");
		
		if (!campo.addPren(14, 15, "Giovanni"))
			System.err.println("Errore prenotazione Giovanni");
		
		if (!campo.addPren(16, 18, "Matteo"))
			System.err.println("Errore prenotazione Matteo");
		
		System.out.println("\nPrenotazioni presenti:\n" + campo);
		
		if (!campo.removePren(16, 18, "Matteo")) 
			System.err.println("Errore rimozione prenotazione Matteo");
		
		System.out.println("\nNuove prenotazioni:\n" + campo);
		System.out.println("\nUtilizzo: " + campo.utilizzo() + "%");
	}
}
