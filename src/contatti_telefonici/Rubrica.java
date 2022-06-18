package contatti_telefonici;

import java.util.ArrayList;

public class Rubrica {
	private ArrayList<Contatto> contatti;
	
	public Rubrica() {
		contatti = new ArrayList<>();
	}
	
	public void aggiungiContatto(String nome,
			String cognome, String numeroTelefono) {
		contatti.add(
				new Contatto(nome, cognome, numeroTelefono));
	}
	
	public void rimuoviContatto(String nome,
			String cognome) {
		
		for (int i = 0; i < contatti.size(); i++)
			if (contatti.get(i).leggiNome().equalsIgnoreCase(nome)
					& contatti.get(i).leggiCognome().equalsIgnoreCase(cognome))
				contatti.remove(contatti.get(i));
	}
	
	public ArrayList<Contatto> cerca(String nome, String cognome) {
		ArrayList<Contatto> contattiTrovati = new ArrayList<>();
		
		for (int i = 0; i < contatti.size(); i++) 
			if (contatti.get(i).leggiNome().equalsIgnoreCase(nome)
					& contatti.get(i).leggiCognome().equalsIgnoreCase(cognome)) 
				contattiTrovati.add(contatti.get(i));
			
		return contattiTrovati;
	}
	
	public ArrayList<Contatto> cercaNominativo(String numeroTelefono) {
		ArrayList<Contatto> contattiTrovati = new ArrayList<>();
		
		for (int i = 0; i < contatti.size(); i++)
			if (contatti.get(i).leggiNumeroTelefono().equals(numeroTelefono))
				contattiTrovati.add(contatti.get(i));
		
		return contattiTrovati;
	}
	
	public ArrayList<Contatto> cercaIniziali(String iniziali) {
		ArrayList<Contatto> contattiTrovati = new ArrayList<>();
		
		for (int i = 0; i < contatti.size(); i++)
			if (contatti.get(i).leggiNome().toLowerCase()
					.startsWith(iniziali.toLowerCase())
					| contatti.get(i).leggiCognome().toLowerCase()
					.startsWith(iniziali.toLowerCase()))
				contattiTrovati.add(contatti.get(i));
		
		return contattiTrovati;
	}
	
	@Override
	public String toString() {
		return contatti.toString();
	}
}
