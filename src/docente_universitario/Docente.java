package docente_universitario;

import java.util.Objects;

public class Docente {
	private int codice;
	private String nome, cognome;
	private int eta;
	
	public Docente(String nome, String cognome,
			int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codice = hashCode();
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(nome, cognome);
		
		if (hash < 0)
			return -hash;
		
		return hash;
	}
	
	@Override
	public String toString() {
		return "Docente nr. " + codice + " " 
				+ nome + " " + cognome 
				+ " " + eta + " anni";
	}
}
