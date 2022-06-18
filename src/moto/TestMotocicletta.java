package moto;

public class TestMotocicletta {
	public static void main(String[] args) {
		Motocicletta moto = new Motocicletta(
				100, //capacitaMax
				"Yamaha", //marca
				"1200 cc", //cilindrata
				7); //marciaMax
		
		//valori iniziali
		System.out.println("[serbatoio]> " + moto.getSerbatoio());
		System.out.println("[capacitaMax]> " + moto.getCapacitaMax());
		System.out.println("[marca]> " + moto.getMarca());
		System.out.println("[cilindrata]> " + moto.getCilindrata());
		System.out.println("[statoMotore]> " + moto.getStatoMotore());
		System.out.println("[luci]> " + moto.getLuci());
		System.out.println("[velocita]> " + moto.getVelocita());
		System.out.println("[frecciaDestra]> " + moto.getFrecciaDestra());
		System.out.println("[frecciaSinistra]> " + moto.getFrecciaSinistra());
		System.out.println("[marcia]> " + moto.getMarcia());
		System.out.println("[marciaMax]> " + moto.getMarciaMax());
		
		//test con valori corretti
		System.out.println("\n> test con valori corretti\n");
				
		if (moto.rifornimento(50))
			System.out.println("> effettuato rifornimento, val. serbatoio " 
					+ moto.getSerbatoio());
		
		else
			System.err.println("> impossibile effettuare rifornimento, capacitaMax " 
					+ moto.getCapacitaMax());
		
		moto.accendiMoto();
		System.out.println("\n[statoMotore]> " + moto.getStatoMotore());
		
		moto.aumentaMarcia();
		moto.aumentaMarcia();
		System.out.println("\n[marcia+]> " + moto.getMarcia());
		
		moto.diminuisciMarcia();
		System.out.println("[marcia-]> " + moto.getMarcia());
		
		moto.accelera(15);
		System.out.println("\n[velocita+]> " + moto.getVelocita());
		
		moto.frena(10);
		System.out.println("[velocita-]> " + moto.getVelocita());
		
		moto.accendiLuci();
		System.out.println("\n[luci+]> " + moto.getLuci());
		
		moto.spegniLuci();
		System.out.println("[luci-]> " + moto.getLuci());
		
		moto.accendiFrecciaDestra();
		System.out.println("\n[frecciaDestra+]> " + moto.getFrecciaDestra());
		
		moto.spegniFrecciaDestra();
		System.out.println("[frecciaDestra-]> " + moto.getFrecciaDestra());
		
		moto.accendiFrecciaSinistra();
		System.out.println("\n[frecciaSinistra+]> " + moto.getFrecciaSinistra());
		
		moto.spegniFrecciaSinistra();
		System.out.println("[frecciaSinistra-]> " + moto.getFrecciaSinistra());
		
		//test con valori errati
		System.out.println("\n> test con valori errati\n");
		
		if (moto.rifornimento(250))
			System.out.println("> effettuato rifornimento, val. serbatoio " 
					+ moto.getSerbatoio());
		
		else
			System.err.println("> impossibile effettuare rifornimento, capacitaMax " 
					+ moto.getCapacitaMax());
		
		moto.accendiMoto();
		System.out.println("\n[statoMotore]> " + moto.getStatoMotore());
		moto.accendiMoto();
		
		moto.aumentaMarcia();
		System.out.println("\n[marcia+]> " + moto.getMarcia());
		
		moto.diminuisciMarcia();
		System.out.println("[marcia-]> " + moto.getMarcia());
		moto.diminuisciMarcia();
		
		moto.accelera(15);
		System.out.println("\n[velocita+]> " + moto.getVelocita());
		
		moto.frena(10);
		System.out.println("[velocita-]> " + moto.getVelocita());
		moto.frena(10);
		
		moto.accendiLuci();
		System.out.println("\n[luci+]> " + moto.getLuci());
		moto.accendiLuci();
		
		moto.spegniLuci();
		System.out.println("[luci-]> " + moto.getLuci());
		moto.spegniLuci();
		
		moto.accendiFrecciaDestra();
		System.out.println("\n[frecciaDestra+]> " + moto.getFrecciaDestra());
		moto.accendiFrecciaDestra();
		
		moto.spegniFrecciaDestra();
		System.out.println("[frecciaDestra-]> " + moto.getFrecciaDestra());
		moto.spegniFrecciaDestra();
		
		moto.accendiFrecciaSinistra();
		System.out.println("\n[frecciaSinistra+]> " + moto.getFrecciaSinistra());
		moto.accendiFrecciaSinistra();
		
		moto.spegniFrecciaSinistra();
		System.out.println("[frecciaSinistra-]> " + moto.getFrecciaSinistra());
		moto.spegniFrecciaSinistra();
	}
}
