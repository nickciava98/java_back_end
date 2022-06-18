package barca;

public class TestBarcaAMotore {
	public static void main(String[] args) {
		BarcaAMotore barca = new BarcaAMotore(
				1000, //capacitaSerbatoio
				270, //velocitaMax
				.7f, //efficienza
				150); //distanza
		
		//valori iniziali
		System.out.println("[capacitaSerbatoio]> " 
				+ barca.getCapacitaSerbatoio() + " l");
		System.out.println("[quantitaSerbatoio]> " 
				+ barca.getQuantitaSerbatoio() + " l");
		System.out.println("[velocitaMax]> " 
				+ barca.getVelocitaMax() + " km/h");
		System.out.println("[velocitaCorr]> " 
				+ barca.getVelocitaCorr() + " km/h");
		System.out.println("[efficienza]> " 
				+ barca.getEfficienza() + " l/km");
		System.out.println("[distanza]> " 
				+ barca.getDistanza() + " km");
		
		//test con valori corretti
		System.out.println("\n> test con valori corretti\n");
		
		//tento di riempire con 980 l 
		if (!barca.riempiSerbatoio(980)) 
			System.err.println(
					"[quantitaSerbatoio]> eccede capacità");
		
		//tento di cambiare la velocità a 130 km/h
		if (!barca.cambiaVelocita(130))
			System.out.println("[velocita]> valore errato");
		
		//tento di navigare per 10 ore a 50 km/h
		if (barca.naviga(10, 50)) {
			System.out.println("[quantitaSerbatoio]> " 
					+ barca.getQuantitaSerbatoio() + " l");
			System.out.println("[distanza]> " 
					+ barca.getDistanza() + " km");
		}
		
		else
			System.err.println("[quantitaSerbatoio]> non sufficiente");
		
		//test con valori errati
		System.out.println("\n> test con valori errati\n");
		
		//tento di riempire con 1010 l
		if (!barca.riempiSerbatoio(1010)) 
			System.err.println(
					"[quantitaSerbatoio]> eccede capacità");
		
		//tento di cambiare la velocità a 350 km/h
		if (!barca.cambiaVelocita(350))
			System.err.println("[velocita]> valore errato");
		
		//tento di navigare per 10 ore a 160 km/h
		if (barca.naviga(10, 160)) {
			System.out.println("[quantitaSerbatoio]> " 
					+ barca.getQuantitaSerbatoio() + " l");
			System.out.println("[distanza]> " 
					+ barca.getDistanza() + " km");
		}
		
		else
			System.err.println("[quantitaSerbatoio]> non sufficiente, "
					+ "necessari almeno " 
					+ 1600 * barca.getEfficienza() + " l");
	}
}
