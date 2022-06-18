package docente_universitario;

import java.util.ArrayList;

public class Universita {
	private ArrayList<Docente> docenti;
	
	public Universita(ArrayList<Docente> docenti) {
		this.docenti = docenti;
	}
	
	public int etaMinima() {
		int minimo = docenti.get(0).getEta();
		
		for (Docente docente : docenti) 
			if (docente.getEta() < minimo)
				minimo = docente.getEta();
		
		return minimo;
	}
	
	public boolean trovaDocente(String nome, 
			String cognome) {
		for (Docente docente : docenti) 
			if (docente.getNome().equals(nome) 
					& docente.getCognome().equals(cognome))
				return true;
		
		return false;
	}
}
