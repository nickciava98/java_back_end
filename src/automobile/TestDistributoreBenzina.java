package automobile;

public class TestDistributoreBenzina {
	public static void main(String[] args) {
		DistributoreBenzina distributore = 
				new DistributoreBenzina(
						1.819, //euroPerLitroVerde
						1.719); //euroPerLitroGasolio
		
		//stampo valori attuali
		System.out.println("[depositoVerde]> " 
				+ distributore.getDepositoVerde() + " l");
		System.out.println("[euroPerLitroVerde]> " 
				+ distributore.getEuroPerLitroVerde() + " €/l");
		System.out.println("\n[depositoGasolio]> " 
				+ distributore.getDepositoGasolio() + " l");
		System.out.println("[euroPerLitroGasolio]> " 
				+ distributore.getEuroPerLitroGasolio() + " €/l");
		
		//rifornisco distributore
		distributore.rifornisciVerde(100);
		System.out.println("\n[new_depositoVerde]> " 
				+ distributore.getDepositoVerde() + " l");
		
		distributore.rifornisciGasolio(100);
		System.out.println("[new_depositoGasolio]> " 
				+ distributore.getDepositoGasolio() + " l");
		
		//creo auto
		Automobile auto = new Automobile(
				1, //resa  
				0, //carb
				"gasolio"); //carburante
		
		//vendo benzina ad auto
		distributore.vendi(20, auto);
		
		//stampo valore carb auto
		System.out.println("\n[auto.carb]> " 
				+ auto.getGas() + " l");
	}
}
