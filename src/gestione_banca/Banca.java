package gestione_banca;

import java.util.ArrayList;

public class Banca {
	private ArrayList<ContoCorrente> conti;
	
	public Banca() {
		conti = new ArrayList<>();
	}
	
	public void aggiungiConto(ContoCorrente cc) {
		conti.add(cc);
	}
	
	public boolean modificaConto(ContoCorrente cc1, 
			ContoCorrente cc2) {
		if (conti.indexOf(cc1) != -1) { 
			conti.set(conti.indexOf(cc1), cc2);
			return true;
		}
		
		return false;
	}
	
	public boolean rimuoviConto(ContoCorrente cc) {
		if (conti.indexOf(cc) != -1) {
			conti.remove(cc);
			return true;
		}
		
		return false;
	}
	
	public void visualizzaConti() {
		System.out.println(conti);
	}
	
	public void visualizzaContiInRosso() {
		for (ContoCorrente cc : conti) 
			if (cc.leggiSaldo() <= 0)
				System.out.println(cc);
	}
}
