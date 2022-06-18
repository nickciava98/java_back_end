package lezione07062022;

public class UsaVeicoli {
	public static void main(String[] args) {
		Vettura auto = new Vettura(
				"DG777KM", //targa 
				"Fiat", //marca
				"Panda", //modello
				"utilitaria"); //tipologia
		
		//stampa valori attuali
		System.out.println("[targa_auto]> " + auto.getTarga());
		System.out.println("[marca_auto]> " + auto.getMarca());
		System.out.println("[modello_auto]> " + auto.getModello());
		System.out.println("[tipologia_auto]> " + auto.getTipologia());
		
		auto.setGuasto(true);
		
		if (auto.isGuasto())
			System.err.println("[stato_auto]> guasto");
		
		Motociclo moto = new Motociclo(
				"AZ899DF", //targa
				"Yamaha", //marca
				"RZ7", //modello
				1000); //cilindrata
		
		//stampa valori attuali
		System.out.println("\n[targa_moto]> " + moto.getTarga());
		System.out.println("[marca_moto]> " + moto.getMarca());
		System.out.println("[modello_moto]> " + moto.getModello());
		System.out.println("[cilindrata_moto]> " + moto.getCilindrata());
		
		if (moto.isGuasto())
			System.err.println("[stato_moto]> guasto");
	}
}
