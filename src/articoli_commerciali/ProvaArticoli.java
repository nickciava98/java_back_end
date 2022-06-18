package articoli_commerciali;

public class ProvaArticoli {
	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		
		catalogo.aggiungiArticolo(new Articolo("articolo_1", 9.99));
		catalogo.aggiungiArticolo(new Articolo("articolo_2", 8.92));
		catalogo.aggiungiArticolo(new Articolo("articolo_3", 9.98));
		
		System.out.println("Catalogo:");
		System.out.println(catalogo);
		
		System.out.println("\nArticoli sotto € 9.99:");
		System.out.println(catalogo.getArticoliSottoPrezzo(9.99));
	}
}
