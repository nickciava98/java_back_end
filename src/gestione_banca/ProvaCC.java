package gestione_banca;

public class ProvaCC {
	public static void main(String[] args) {
		Banca banca = new Banca();
		ContoCorrente cc1 = new ContoCorrente("Mario Rossi", 100);
		ContoCorrente cc2 = new ContoCorrente("Giuseppe Verdi", 239);
		ContoCorrente cc3 = new ContoCorrente("Giovanni Battista", 888);
		
		banca.aggiungiConto(cc1);
		banca.aggiungiConto(cc2);
		banca.aggiungiConto(cc3);
		
		System.out.println("Conti Correnti presenti:");
		banca.visualizzaConti();
		System.out.println();
		
		ContoCorrente cc4 = new ContoCorrente("Angelo Di Vincenzo", 765);
		cc4.deposita(100);
		
		if (!banca.modificaConto(cc2, cc4))
			System.err.println("Errore modifica CC");
		
		System.out.println("Nuovi conti correnti presenti:");
		banca.visualizzaConti();
		System.out.println();
		
		if (!cc3.preleva(888))
			System.err.println("CC2 prelievo non possibile");
		
		if (!banca.rimuoviConto(cc1))
			System.err.println("Errore rimozione CC1");
		
		System.out.println("Conti in rosso:");
		banca.visualizzaContiInRosso();
	}
}
