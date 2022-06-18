package abstract_film;

public class TestFilm {
	public static void main(String[] args) {
		Azione filmAzione = new Azione(
				"AZ01", 
				"Azione1");
		Commedia filmCommedia = new Commedia(
				"CM01",
				"Commedia1");
		Dramma filmDramma = new Dramma(
				"DR01",
				"Dramma1");
		
		//stampa valori
		System.out.println(filmAzione);
		System.out.println("\n" + filmCommedia);
		System.out.println("\n" + filmDramma);
		
		//crea noleggio
		Noleggio noleggioAzione = new Noleggio(filmAzione, 123, 10);
		Noleggio noleggioCommedia = new Noleggio(filmCommedia, 111, 7);
		Noleggio noleggioDramma = new Noleggio(filmDramma, 231, 0);
		
		//stampa valori
		System.out.println("\n" + noleggioAzione);
		System.out.println("\n" + noleggioCommedia);
		System.out.println("\n" + noleggioDramma);
	}
}
