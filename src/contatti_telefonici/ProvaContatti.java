package contatti_telefonici;

public class ProvaContatti {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		
		rubrica.aggiungiContatto("Mario", "Rossi", "3331234123");
		rubrica.aggiungiContatto("Giovanni", "Battista", "3325644789");
		rubrica.aggiungiContatto("Antonio", "Di Roberto", "3354488996");
		rubrica.aggiungiContatto("Michele", "Rossi", "3354488996");
		
		System.out.println("Rubrica:\n" + rubrica);
		System.out.println("\nRicerca: " 
				+ rubrica.cerca("Giovanni", "Battista"));
		
		System.out.println("Iniziali GIO: " + rubrica.cercaIniziali("GIO"));
		System.out.println("Iniziali ROS: " + rubrica.cercaIniziali("ROS"));
		System.out.println("Nr. 3354488996: " + rubrica.cercaNominativo("3354488996"));
		
		rubrica.rimuoviContatto("Antonio", "Di Roberto");
		System.out.println("\nRubrica:\n" + rubrica);
	}
}
