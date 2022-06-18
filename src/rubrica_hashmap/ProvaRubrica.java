package rubrica_hashmap;

public class ProvaRubrica {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		
		rubrica.aggiungiContatto("Mario", "Rossi", "mario.rossi@email.com", "3326489257");
		rubrica.aggiungiContatto("Mario", "Rossi", "mario.rossi@email.com", "3368741556");
		rubrica.aggiungiContatto("Giovanni", "Verdi", "giovanni.verdi@myemail.com", "3257896441");
		
		System.out.println("Rubrica:\n" + rubrica);
		
		System.out.println("\nContatto con tel. 3326489257: " 
				+ rubrica.cercaContatto("3326489257"));
		System.out.println("\nTelefono Mario Rossi: "
				+ rubrica.cercaContatto("Mario", "Rossi"));
		
		rubrica.rimuoviContatto("3326489257");
		System.out.println("Rimosso 3326489257");
		
		//non aggiunge perché duplicato
		rubrica.aggiungiContatto("Giovanni", "Verdi", "giovanni.verdi@gmail.com", "3257896441");
		
		System.out.println("\nNuova rubrica:\n" + rubrica);
	}
}
