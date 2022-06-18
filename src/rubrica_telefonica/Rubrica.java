package rubrica_telefonica;

import java.util.ArrayList;
import java.util.HashSet;

public class Rubrica {
	private HashSet<Persona> lista;
	
	public Rubrica() {
		lista = new HashSet<>();
	}
	
	public void aggiungiContatto(String nome,
			String cognome, String telefono) {
		lista.add(new Persona(nome, cognome, telefono));
	}
	
	public void rimuoviContatto(String nome,
			String cognome) {
		ArrayList<Persona> contatti = new ArrayList<>();
		
		for (Persona persona : lista) 
			if (persona.getNome().equalsIgnoreCase(nome)
					& persona.getCognome().equalsIgnoreCase(cognome))
				contatti.add(persona);
		
		for (Persona persona : contatti)		
			lista.remove(persona);
	}
	
	public HashSet<String> trovaTelefono(String nome,
			String cognome) {
		HashSet<String> telefoniTrovati = new HashSet<String>();
		
		for (Persona persona : lista)
			if (persona.getNome().equalsIgnoreCase(nome)
					& persona.getCognome().equalsIgnoreCase(cognome))
				telefoniTrovati.add(persona.getTelefono());
		
		return telefoniTrovati;
	}
	
	public HashSet<String> trovaContatto(String telefono) {
		HashSet<String> contattiTrovati = new HashSet<String>();
		
		for (Persona persona : lista) 
			if (persona.getTelefono().equals(telefono))
				contattiTrovati.add(
						persona.getNome() + " " + persona.getCognome());
		
		return contattiTrovati;
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}
}
