package gestione_prodotti;

import java.time.LocalDate;

public class ProvaProdotti {
	public static void main(String[] args) {
		Prodotto p = new Prodotto("prodotto 1", 10.9f);
		Alimentare a = new Alimentare("prodotto alimentare 1", 11, LocalDate.parse("2022-06-01"));
		NonAlimentare na = new NonAlimentare("prodotto non alimentare 1", 14.8f, "carta");
		
		//stampa valori prodotti
		System.out.println(p);
		System.out.println("\n" + a);
		System.out.println("\n" + na);
		
		a.applicaSconto();
	}
}
