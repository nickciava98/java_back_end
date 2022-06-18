package automobile;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile auto = new Automobile(
				1, //resa  
				0, //carb
				"gasolio"); //carburante
		
		System.out.println("> creata auto con resa "
				+ auto.getResa() + " l/km\n");
		
		if (auto.isDiesel())
			System.out.println("[carburante]> gasolio");
		
		else
			System.out.println("[carburante]> verde");
		
		System.out.println("\n> rifornimento 50 l");
		auto.addGas(10);
		
		//esegue senza controllo preliminare
//		System.out.println("> l'auto percorre 30 km");
//		auto.drive(30);
//		
//		System.out.println("> il serbatoio contiene "
//				+ auto.getGas() + " l");	
		
		/*
		 * esegue controllando che ci sia 
		 * sufficiente carburante
		 */
		System.out.println("> l'auto percorre 30 km");
		
		if (auto.drive(30)) {
			System.out.println("> il serbatoio contiene "
					+ auto.getGas() + " l");
		}
		
		else
			System.out.println("> carburante non sufficiente\n"
					+ "\tnecessari almeno " + auto.getResa() * 30
							+ " l");
	}
}
