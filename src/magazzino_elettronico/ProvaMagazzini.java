package magazzino_elettronico;

public class ProvaMagazzini {
	public static void main(String[] args) {
		Distribuzione distribuzione = new Distribuzione();
//		Magazzino roma = new Magazzino("Roma");
//		Magazzino genova = new Magazzino("Genova");
//		Magazzino milano = new Magazzino("Milano");
//		Magazzino napoli = new Magazzino("Napoli");
//		Magazzino torino = new Magazzino("Torino");
//		
//		roma.aggiungiArticolo("123", 3);
//		genova.aggiungiArticolo("123", 7);
//		milano.aggiungiArticolo("456", 55);
//		napoli.aggiungiArticolo("789", 48);
//		torino.aggiungiArticolo("123", 5);
		
		distribuzione.aggiungiMagazzino("Roma");
		distribuzione.aggiungiMagazzino("Genova");
		distribuzione.aggiungiMagazzino("Milano");
		distribuzione.aggiungiMagazzino("Napoli");
		distribuzione.aggiungiMagazzino("Torino");
		
		for (Magazzino magazzino : distribuzione.getMagazzini()) {
			magazzino.aggiungiArticolo("123", 5);
			magazzino.aggiungiArticolo("456", 7);
			magazzino.aggiungiArticolo("789", 10);
		}
		
		distribuzione.getMagazzini().get(0).getArticoli().get(0).setQuantitativo(0);
			
		System.out.println(distribuzione);
		System.out.println("\nTotale Art. 456: " 
				+ distribuzione.totaleArticolo("456") + " pz");
		System.out.println("\nArticolo con più pz: " 
				+ distribuzione.stat());
		System.out.println("\nDa rifornire: " + distribuzione.daRifornire());
		
		for (Magazzino magazzino : distribuzione.daRifornire())
			for (Articolo articolo : magazzino.getArticoli())
				if (articolo.getQuantitativo() == 0)
					distribuzione.rifornisciMagazzino(magazzino.getCitta(), articolo.getCodice(), 5);
		
		System.out.println("\n" + distribuzione);
	}
}
