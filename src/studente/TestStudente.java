package studente;

public class TestStudente {
	public static void main(String[] args) {
		Studente std1 = new Studente(
				"Mario",
				"Rossi",
				15);
		
		//stampo valori attuali std1
		System.out.println("[nome_1]> " + std1.getNome());
		System.out.println("[cognome_1]> " + std1.getCognome());
		System.out.println("[eta_1]> " + std1.getEta());
		
		//controllo matricola std1
		System.out.println("[matricola_1]> " + std1.getMatricola());
		
		//creo nuovo studente
		Studente std2 = new Studente(
				"Mario",
				"Verdi",
				15);
		
		//stampo valori attuali std2
		System.out.println("\n[nome_2]> " + std2.getNome());
		System.out.println("[cognome_2]> " + std2.getCognome());
		System.out.println("[eta_2]> " + std2.getEta());
		
		//controllo matricola std2
		System.out.println("[matricola_2]> " + std2.getMatricola());
	}
}
