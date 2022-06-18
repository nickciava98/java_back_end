package carrello_elettronico;

public class ProvaCE {
	public static void main(String[] args) {
		Articolo articolo1 = new Articolo("articolo1", "nome1", 10.9);
		Articolo articolo2 = new Articolo("articolo2", "nome2", 9.93);
		Articolo articolo3 = new Articolo("articolo3", "nome3", 7.77);
		
		System.out.println(articolo1);
		System.out.println(articolo2);
		System.out.println(articolo3);
		
		Carrello carrello = new Carrello();
		
		carrello.aggiungiArticolo(articolo1);
		carrello.aggiungiArticolo(articolo2);
		carrello.aggiungiArticolo(articolo3);
		
		System.out.println("ArrayList<>\n-----------");
		carrello.stampaArticoli();
		
		System.out.println("\nTotale: € " + carrello.totale());
		
		Articolo articolo4 = new Articolo("articolo4", "nome4", 6.22);
		carrello.cambiaArticolo(articolo1, articolo4);
		
		System.out.println("\nArrayList<>\n-----------");
		carrello.stampaArticoli();
		
		carrello.rimuoviArticolo(articolo2);
		
		System.out.println("\nArrayList<>\n-----------");
		carrello.stampaArticoli();
		
		System.out.println("\nTotale: € " + carrello.totale());
	}
}
