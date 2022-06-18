package carrello_elettronico;

import java.util.ArrayList;

public class Carrello {
	private ArrayList<Articolo> articoli;
	
	public Carrello () {
		articoli = new ArrayList<>();
	}
	
	public void aggiungiArticolo(Articolo articolo) {
		articoli.add(articolo);
	}
	
	public void cambiaArticolo(Articolo articolo1, 
			Articolo articolo2) {
		articoli.set(articoli.indexOf(articolo1), articolo2);
	}
	
	public void rimuoviArticolo(Articolo articolo) {
		articoli.remove(articolo);
	}
	
	public void stampaArticoli() {
		System.out.println(articoli);
	}
	
	public double totale() {
		double totale = 0;
		
		for (Articolo articolo : articoli)
			totale += articolo.getPrezzoUnitario();
		
		return totale;
	}
}
