package magazzino_elettronico;

import java.util.ArrayList;

public class Magazzino {
	private String citta;
	private ArrayList<Articolo> articoli;
	
	public Magazzino(String citta) {
		this.citta = citta;
		articoli = new ArrayList<>();
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void aggiungiArticolo(String codice,
			int quantitativo) {
		articoli.add(
				new Articolo(codice, quantitativo));
	}
	
	public boolean rimuoviArticolo(String codice,
			int quantitativo) {
		Articolo toRemove = null;
		boolean ret = false;
		
		for (Articolo articolo : articoli)
			if (articolo.getCodice().equalsIgnoreCase(codice)
					& articolo.getQuantitativo() == quantitativo) {
				toRemove = articolo;
				ret = true;
			}
		
		articoli.remove(toRemove);
		return ret;
	}
	
	public ArrayList<Articolo> getArticoli() {
		return articoli;
	}
	
	@Override
	public String toString() {
		return "Magazzino di " + citta
				+ " contenente\n" + articoli;
	}
}
