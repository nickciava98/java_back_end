package corsi_universitari;

import java.util.Objects;

public class Studente {
	private int matricola;
	private String nome, cognome;
	
	public Studente(String nome, 
			String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		matricola = hashCode();
	}
	
	public int getMatricola() {
		return matricola;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(nome, cognome);
		
		if (hash < 0)
			return -hash;
		
		return hash;
	}
}
