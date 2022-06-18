package corsi_universitari;

public class ProvaCorsi {
	public static void main(String[] args) {
		Corso matematica = new Corso(
				"Matematica", "Antonio Di Roberto", 10, 3);
		
		System.out.println(matematica + "\n");
		
		if (!matematica.aggiungiStudente(
				new Studente("Mario", "Rossi")))
			System.err.println("Posti esauriti");
		
		if (!matematica.aggiungiStudente(
				new Studente("Giuseppe", "Verdi")))
			System.err.println("Posti esauriti");
		
		if (matematica.matricole().size() > 0)
			System.out.println("Elenco matricole iscritti\n" 
					+ matematica.matricole());
		
		System.out.println("\nPosti disponibili: " 
				+ matematica.postiDisponibili()
				+ "\nIscritti: "
				+ matematica.matricole().size());
	}
}
