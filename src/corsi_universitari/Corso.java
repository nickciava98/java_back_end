package corsi_universitari;

import java.util.ArrayList;

public class Corso {
	private String nomeCorso, 
		nomeDocente;
	private int numCrediti, numStudenti, maxStudenti;
	private ArrayList<Studente> studenti;
	
	public Corso(String nomeCorso,
			String nomeDocente,
			int numCrediti, int maxStudenti) {
		this.nomeCorso = nomeCorso;
		this.nomeDocente = nomeDocente;
		this.numCrediti = numCrediti;
		numStudenti = 0;
		this.maxStudenti = maxStudenti;
		studenti = new ArrayList<>();
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public String getNomeDocente() {
		return nomeDocente;
	}

	public int getNumCrediti() {
		return numCrediti;
	}

	public int getMaxStudenti() {
		return maxStudenti;
	}
	
	public boolean aggiungiStudente(Studente studente) {
		if (numStudenti < maxStudenti) {
			studenti.add(studente);
			numStudenti++;
			return true;
		}
		
		return false;
	}
	
	public int postiDisponibili() {
		return maxStudenti - numStudenti;
	}
	
	public ArrayList<Integer> matricole() {
		ArrayList<Integer> matricole = new ArrayList<>();
		
		for (Studente studente : studenti)
			matricole.add(studente.getMatricola());
		
		return matricole;
	}
	
	@Override
	public String toString() {
		return "Corso " + nomeCorso
				+ "\ntenuto dal Prof. " + nomeDocente 
				+ "\n" + numCrediti + " CFU, "
				+ numStudenti + " iscritti, " 
				+ maxStudenti + " posti";
	}
}
