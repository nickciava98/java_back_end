package lezione19052022;

public class Bolletta {
	public static void main(String args[]) {
		int consumo = 101;
		float bolletta;
		
		System.out.println("Bolletta");
		System.out.println("Quota fissa: € 20.00");
		System.out.println("Consumo: " + consumo + " mc");
		
		if(consumo <= 100) {
			System.out.print("Tariffa € 2.50/mc - € ");
			
			bolletta = 20 + 2.5f * consumo;
			
			System.out.println(bolletta - 20);
		}
		
		else {
			System.out.print("Tariffa € 2.50/mc - € ");
			
			bolletta = 20 + 2.5f * consumo;
			
			//Visualizza solo l'importo da pagare per i primi 100 mc
			System.out.println(bolletta - 20);
			
			System.out.print("Tariffa € 4.00/mc - € ");
			
			bolletta += 4 * (consumo - 100);
			
			//Visualizza solo l'importo per i successivi mc
			System.out.println(bolletta - (20 + 2.5f * consumo));
		}
		
		//Visualizza il totale da pagare
		System.out.println("Valore bolletta: € " + bolletta);
	}
}
