package rubrica_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Rubrica {
	private HashMap<String, Persona> contatti;
	
	public Rubrica() {
		contatti = new HashMap<>();
	}
	
	public void aggiungiContatto(
			String nome, String cognome,
			String email, String telefono) {
		contatti.put(telefono, 
			new Persona(nome, cognome, telefono, email));
	}
	
	public void rimuoviContatto(String telefono) {
		contatti.remove(telefono);
	}
	
	public String cercaContatto(String telefono) {
		return contatti.get(telefono).getNome() + " "
				+ contatti.get(telefono).getCognome();
	}
	
	public ArrayList<String> cercaContatto(String nome,
			String cognome) {
		ArrayList<String> telefoni = new ArrayList<>();
		
		for (Persona contatto : contatti.values())
			if (contatto.getNome().equalsIgnoreCase(nome)
					& contatto.getCognome().equalsIgnoreCase(cognome))
				telefoni.add(contatto.getTelefono());
		
		return telefoni;		
	}
	
	@Override
	public String toString() {
		return contatti.toString();
	}
}
