package magazzino_elettronico;

import java.util.ArrayList;
import java.util.HashSet;

public class Distribuzione {
	private ArrayList<Magazzino> magazzini;
	private int numeroMagazzini;
	
	public Distribuzione() {
		magazzini = new ArrayList<>();
	}
	
	public ArrayList<Magazzino> getMagazzini() {
		return magazzini;
	}
	
	public int getNumeroMagazzini() {
		return numeroMagazzini;
	}
	
	public boolean aggiungiMagazzino(String citta) {
		if (magazzini.add(new Magazzino(citta))) {
			numeroMagazzini++;
			return true;
		}
		
		return false;
	}
	
	public boolean eliminaMagazzino(String citta) {
		for (Magazzino magazzino : magazzini)
			if (magazzino.getCitta().equalsIgnoreCase(citta)) {
				magazzini.remove(magazzino);
				return true;
			}
		
		return false;
	}
	
	public int totaleArticolo(String codice) {
		int totale = 0;
		
		for (Magazzino magazzino : magazzini)
			for (Articolo articolo : magazzino.getArticoli())
				if (articolo.getCodice().equalsIgnoreCase(codice))
					totale += articolo.getQuantitativo();
		
		return totale;
	}
	
	public ArrayList<Articolo> daPrelevare(Magazzino daRifornire, String codice) {
		ArrayList<Articolo> articoliDaPrelevare = new ArrayList<>();
		
		for (Magazzino magazzino : magazzini)
			if (!magazzino.equals(daRifornire))
				for (Articolo articolo : magazzino.getArticoli())
					if (articolo.getCodice().equalsIgnoreCase(codice)
							& articolo.getQuantitativo() > 1)
						articoliDaPrelevare.add(articolo);
		
		return articoliDaPrelevare;
	}
	
	public void rifornisciMagazzino(String citta,
		String codice, int quantita) {
		boolean articoloPresente = false;
		Magazzino daRifornire = null;
		
		for (Magazzino magazzino : magazzini) {
			if (magazzino.getCitta().equalsIgnoreCase(citta))
				daRifornire = magazzino;
		
			for (Articolo articolo : magazzino.getArticoli())
				if (articolo.getCodice().equalsIgnoreCase(codice))
					articoloPresente = true;
		}
		
		if (articoloPresente & daRifornire != null) {
			int quantitaRimanente = quantita;
			
			for (Magazzino magazzino : magazzini)
				if (!magazzino.getCitta().equalsIgnoreCase(citta)) {
					for (Articolo articolo : magazzino.getArticoli()) {
						if (articolo.getCodice().equalsIgnoreCase(codice)
								& quantitaRimanente > 0) {							
							if (articolo.getQuantitativo() > quantitaRimanente + 1) {								
								for (Articolo articoloDaRifornire : daRifornire.getArticoli())
									if (articoloDaRifornire.getCodice().equalsIgnoreCase(codice))
										articoloDaRifornire.setQuantitativo(
												articoloDaRifornire.getQuantitativo() 
												+ articolo.getQuantitativo() - 1);
								
								articolo.setQuantitativo(
										articolo.getQuantitativo() - quantitaRimanente);
								quantitaRimanente = 0;
							}
							
							else if (articolo.getQuantitativo() < quantitaRimanente + 1) {
								quantitaRimanente -= articolo.getQuantitativo() - 1;
								articolo.setQuantitativo(1);
								
								for (Articolo articoloDaRifornire : daRifornire.getArticoli())
									if (articoloDaRifornire.getCodice().equalsIgnoreCase(codice))
										articoloDaRifornire.setQuantitativo(
												articoloDaRifornire.getQuantitativo()
												+ quantitaRimanente);
							}
						}
					}
				}
		}
	}
	
	public HashSet<Magazzino> daRifornire() {
		HashSet<Magazzino> magazziniDaRifornire = 
				new HashSet<>();
		
		for (Magazzino magazzino : magazzini)
			for (Articolo articolo : magazzino.getArticoli())
				if (articolo.getQuantitativo() == 0)
					magazziniDaRifornire.add(magazzino);
		
		return magazziniDaRifornire;
	}
	
	public Articolo stat() {
		Articolo articoloMax = null;
		int massimo = magazzini.get(0).getArticoli().get(0).getQuantitativo();
		
		for (Magazzino magazzino : magazzini) {			
			for (Articolo articolo : magazzino.getArticoli())
				if (articolo.getQuantitativo() > massimo) {
					massimo = articolo.getQuantitativo();
					articoloMax = articolo;
				}
		}
		
		return articoloMax;
	}
	
	@Override
	public String toString() {
		return "La distribuzione ha " + numeroMagazzini 
				+ " magazzini:\n" + magazzini;
	}
}
