package articoli_commerciali;

import java.util.LinkedList;

public class Catalogo {
	private LinkedList<Articolo> articoli;
	
	public Catalogo() {
		articoli = new LinkedList<>();
	}
	
	public void aggiungiArticolo(Articolo articolo) {
		articoli.add(articolo);
	}
	
	public LinkedList<Articolo> getArticoliSottoPrezzo(double prezzo) {
		LinkedList<Articolo> articoliSottoPrezzo = new LinkedList<>();
		
		for (Articolo articolo : articoli) //for (i = 0; i < articoli.size(); i++) 
			if (articolo.getPrezzo() < prezzo) //if (articoli.get(i).getPrezzo() < prezzo)
				articoliSottoPrezzo.add(articolo);
		
		return articoliSottoPrezzo;
	}
	
	@Override
	public String toString() {
		return articoli.toString();
	}
}
