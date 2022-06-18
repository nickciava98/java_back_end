package prodotti;

public class UsaProdotti {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto(
				"Prodotto 1"); //descrizione
		Prodotto p2 = new Prodotto(
				"Prodotto 2", //descrizione 
				100); //quantita
		
		//stampa valori p1
		System.out.println("[descrizione_p1]> " 
				+ p1.getDescrizione());
		System.out.println("[quantita_p1]> " 
				+ p1.getQuantita() + " pz");
		System.out.println("[prezzo_p1]> € " 
				+ p1.getPrezzo());
		
		//aggiorno valori p1
		p1.rifornisci(120);
		System.out.println("\n[new_quantita_p1]> "
				+ p1.getQuantita() + " pz");
		p1.setPrezzo(10);
		System.out.println("[new_prezzo_p1]> € "
				+ p1.getPrezzo());
		
		//stampa valori p2
		System.out.println("\n[descrizione_p2]> " 
				+ p2.getDescrizione());
		System.out.println("[quantita_p2]> " 
				+ p2.getQuantita() + " pz");
		System.out.println("[prezzo_p2]> € " 
				+ p2.getPrezzo());
		
		//aggiorno valori p2
		p2.setPrezzo(12.9f);
		System.out.println("\n[new_prezzo_p2]> € "
				+ p2.getPrezzo());
		
		//test vendi p2
		if (p2.vendi())
			System.out.println("> vendita " 
					+ p2.getDescrizione() 
					+ ", € " + p2.getPrezzo());
		
		ProdottoScontabile ps = new ProdottoScontabile(
				"ProdottoScontabile 1", //descrizione
				120, //quantita
				20, //prezzo
				15); //quantitaProdotti
		
		//stampo valori ps
		System.out.println("\n[descrizione_ps]> "
				+ ps.getDescrizione());
		System.out.println("[quantita_ps]> "
				+ ps.getQuantita() + " pz");
		System.out.println("[prezzo_ps]> € " 
				+ ps.getPrezzo());
		System.out.println("[quantitaProdotti_ps]> " 
				+ ps.getQuantitaProdotti() + " pz");
		
		//aggiorno valori ps
		ps.setPrezzo(49.9f);
		System.out.println("\n[new_prezzo_ps]> € "
				+ ps.getPrezzo());
		
		//test vendi ps
		int quantitaVendita = 18;
		
		if (ps.vendi(quantitaVendita)) 
			System.out.println("> vendita "
					+ quantitaVendita + "x "
					+ ps.getDescrizione()
					+ ", € " + ps.getPrezzoScontato(16)
					+ " con sconto del "
					+ ps.getSconto() + "%");
	}

}
