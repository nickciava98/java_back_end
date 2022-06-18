package docente_universitario;

import java.util.ArrayList;

public class ProvaDU {
	public static void main(String[] args) {
		ArrayList<Docente> docenti = new ArrayList<>();
		
		docenti.add(new Docente("Mario", "Rossi", 33));
		docenti.add(new Docente("Giuseppe", "Verdi", 34));
		docenti.add(new Docente("Giovanni", "Battista", 27));
		
		System.out.println(docenti);
		
		Universita universita = new Universita(docenti);
		
		System.out.println("docente più giovane> " + 
				+ universita.etaMinima() + " anni");
		
		if (universita.trovaDocente("Mario", "Rossij"))
			System.out.println("> trovato");
		
		else
			System.err.println("> non trovato");
	}
}
