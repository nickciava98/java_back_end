package cisterna;

public class TestCisterna {
	public static void main(String[] args) {
		Cisterna cisterna = new Cisterna(
				1, //identificativo
				1500); //capacitaMax
				
		//stampa valori attuali
		System.out.println("[identificativo]> " 
				+ cisterna.getIdentificativo());
		System.out.println("[capacitaMax]> " 
				+ cisterna.getCapacitaMax() + " l");
		System.out.println("[stato]> " + 
				cisterna.getStato() + " l");
		
		//test con valori corretti
		System.out.println("\n> test con valori corretti\n");
		
		if (!cisterna.aggiungiValore(100))
			System.err.println(
					"> superato limite capacitaMax");
		
		System.out.println("[stato]> " 
				+ cisterna.togliValore(50) + " l");
		
		//test con valori errati
		System.out.println("\n> test con valori errati\n");
		
		if (!cisterna.aggiungiValore(1600))
			System.err.println(
					"> superato limite capacitaMax");
		
		System.out.println("[stato_atttuale]> " 
				+ cisterna.togliValore(2000) + " l");
	}
}
