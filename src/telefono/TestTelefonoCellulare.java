package telefono;

public class TestTelefonoCellulare {
	public static void main(String[] args) {
		//creo telefono senza valori
		TelefonoCellulare telefono = 
				new TelefonoCellulare();
		
		System.out.println("> caratteristiche telefono\n");
		
		//stampo i valori del telefono, tutti zero/null
		System.out.println(
				"[secondiConversazione]> " 
						+ telefono.secondiConversazione);
		System.out.println(
				"[numeroTelefonate]> " 
						+ telefono.numeroTelefonate);
		System.out.println(
				"[costoTelefonate]> " 
						+ telefono.costoTelefonate);
		System.out.println(
				"[costoPerSecondo]> " 
						+ telefono.costoPerSecondo);
		System.out.println(
				"[stato]> " 
						+ telefono.stato);
		System.out.println(
				"[marca]> " 
						+ telefono.marca);
		System.out.println(
				"[modello]> " 
						+ telefono.modello);
		
		System.out.println(
				"[operatore]> " 
						+ telefono.operatore);
		
		//cambio valori
		telefono.secondiConversazione = 10;
		telefono.numeroTelefonate = 3;
		telefono.costoTelefonate = 9.9f;
		telefono.costoPerSecondo = 0.1f;
		telefono.stato = "acceso";
		telefono.marca = "Samsung";
		telefono.modello = "S22";
		telefono.operatore = "TIM";
		
		System.out.println("\n\n> test cambio valori\n");
		
		//stampo i nuovi valori del telefono
		System.out.println(
				"[secondiConversazione]> " 
						+ telefono.secondiConversazione);
		System.out.println(
				"[numeroTelefonate]> " 
						+ telefono.numeroTelefonate);
		System.out.println(
				"[costoTelefonate]> " 
						+ telefono.costoTelefonate);
		System.out.println(
				"[costoPerSecondo]> " 
						+ telefono.costoPerSecondo);
		System.out.println(
				"[stato]> " 
						+ telefono.stato);
		System.out.println(
				"[marca]> " 
						+ telefono.marca);
		System.out.println(
				"[modello]> " 
						+ telefono.modello);
		
		System.out.println(
				"[operatore]> " 
						+ telefono.operatore);
		
		//creo nuovo telefono con valori
		TelefonoCellulare telefono2 = 
				new TelefonoCellulare(
						0, 0, 0, 0.12f, 
						"acceso", "Huawei", "P50", "WIND");
		
		System.out.println("\n\n> test telefono2\n");
		
		//test spegni
		System.out.println("> test spegni -> accendi");
		telefono2.spegni();
		System.out.println(
				"[stato]> " 
						+ telefono2.stato);
		
		//test accendi
		telefono2.accendi();
		System.out.println(
				"[stato]> " 
						+ telefono2.stato);
		
		//test telefonata
		System.out.println("\n> test telefonata di 49 s");
		telefono2.telefona(49);
		System.out.println(
				"[secondiConversazione]> " 
						+ telefono2.secondiConversazione);
		System.out.println(
				"[numeroTelefonate]> " 
						+ telefono2.numeroTelefonate);
		System.out.println(
				"[costoTelefonate]> " 
						+ telefono2.costoTelefonate);
		
		//test cambio operatore
		System.out.println("\n> test cambio operatore");
		telefono2.cambioOperatore("ILIAD", 0.07f);
		System.out.println(
				"[operatore]> " 
						+ telefono2.operatore);
		System.out.println(
				"[costoTelefonate]> " 
						+ telefono2.costoTelefonate);
		System.out.println(
				"[costoPerSecondo]> " 
						+ telefono2.costoPerSecondo);
	}
}
