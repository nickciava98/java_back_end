package contratto_telefono;

public class TestContrattoTelefonico {
	public static void main(String[] args) {
		ContrattoTelefonico ct = new ContrattoTelefonico(
				330, //numeroTel
				"marioRossi", //utente
				0.0, //costoTelefonate
				0, //numTelefonate
				0.11); //COSTO_AL_SECONDO
		
		//stampa valori attuali
		System.out.println("[numeroTel_ct]> " 
				+ ct.getNumeroTel());
		System.out.println("[utente_ct]> " 
				+ ct.getUtente());
		System.out.println("[costoTelefonate_ct]> " 
				+ ct.getBolletta());
		System.out.println("[numTelefonate_ct]> " 
				+ ct.getNumTelefonate());
		System.out.println("[COSTO_AL_SECONDO_ct]> " 
				+ ct.getCOSTO_AL_SECONDO());
		
		//aggiorna bolletta
		ct.aggiornaBolletta(10);
		System.out.println("\n[new_costoTelefonate_ct]> " 
				+ ct.getBolletta());
		System.out.println("[new_numTelefonate_ct]> " 
				+ ct.getNumTelefonate());
		
		//aggiungi costi
		ct.aggiungiCosti(11.99);
		System.out.println("\n[new_2_costoTelefonate_ct]> " 
				+ ct.getBolletta());
		
		System.out.println("\n[ct]> " + ct.toString());
		
		ContrattoMobile cm = new ContrattoMobile(
				331, //numeroTel
				"giuseppeVerdi", //utente
				1.0, //costoTelefonate
				11, //numTelefonate
				0.01, //COSTO_AL_SECONDO
				0.05); //COSTO_RISPOSTA 
		
		//stampa valori attuali
		System.out.println("\n[numeroTel_cm]> " 
				+ cm.getNumeroTel());
		System.out.println("[utente_cm]> " 
				+ cm.getUtente());
		System.out.println("[costoTelefonate_cm]> " 
				+ cm.getBolletta());
		System.out.println("[numTelefonate_cm]> " 
				+ cm.getNumTelefonate());
		System.out.println("[COSTO_AL_SECONDO_cm]> " 
				+ cm.getCOSTO_AL_SECONDO());
		System.out.println("[COSTO_RISPOSTA_cm]> "
				+ cm.getCOSTO_RISPOSTA());
		
		//aggiorna bolletta
		cm.aggiornaBolletta(25);
		System.out.println("\n[new_costoTelefonate_cm]> " 
				+ cm.getBolletta());
		System.out.println("[new_numTelefonate_cm]> " 
				+ cm.getNumTelefonate());
		
		System.out.println("\n[cm]> " + cm.toString());
		
		ContrattoFisso cf = new ContrattoFisso(
				332, //numeroTel
				"antonioDiRoberto", //utente
				2.0, //costoTelefonate
				22, //numTelefonate
				0.11, //COSTO_AL_SECONDO
				"Via G. Pascoli 21"); //indirizzo
		
		ContrattoFisso cfq = new ContrattoFisso(
				332, //numeroTel
				"giuseppeDiFrancesco", //utente
				2.2, //costoTelefonate
				21, //numTelefonate
				0.1, //COSTO_AL_SECONDO
				"Via G. Pascoli 21"); //indirizzo
		
		//controllo equals
		if (!cf.equals(cfq))
			System.err.println("> cf != cfq");
		
		//stampa valori attuali
		System.out.println("\n[numeroTel_cf]> " 
				+ cf.getNumeroTel());
		System.out.println("[utente_cf]> " 
				+ cf.getUtente());
		System.out.println("[costoTelefonate_cf]> " 
				+ cf.getBolletta());
		System.out.println("[numTelefonate_cf]> " 
				+ cf.getNumTelefonate());
		System.out.println("[COSTO_AL_SECONDO_cf]> " 
				+ cf.getCOSTO_AL_SECONDO());
		System.out.println("[indirizzo_cf]> "
				+ cf.getIndirizzo());
		
		System.out.println("\n[cf]> " + cf);
	}
}
