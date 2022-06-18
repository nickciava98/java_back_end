package rubrica_telefonica;

public class ProvaRubrica {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		
		rubrica.aggiungiContatto("Mario", "Rossi", "3326489257");
		rubrica.aggiungiContatto("Mario", "Rossi", "3368741556");
		rubrica.aggiungiContatto("Giovanni", "Verdi", "3257896441");
		
		System.out.println("Rubrica:\n"
				+ rubrica);
		
		System.out.println("\nContatto con tel. 3326489257: " 
				+ rubrica.trovaContatto("3326489257"));
		System.out.println("Numeri intestati a Mario Rossi: "
				+ rubrica.trovaTelefono("Mario", "Rossi"));
		
		rubrica.rimuoviContatto("Mario", "Rossi");
		System.out.println("Rimosso Mario Rossi");
		
		//non aggiunge perché duplicato
		rubrica.aggiungiContatto("Giovanni", "Verdi", "3257896441");
		
		System.out.println("\nNuova rubrica:\n" + rubrica);
	}
}
