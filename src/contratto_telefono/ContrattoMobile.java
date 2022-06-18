package contratto_telefono;

public class ContrattoMobile extends ContrattoTelefonico {
	private final Double COSTO_RISPOSTA;
	
	public ContrattoMobile(
			Integer numeroTel,
			String utente,
			Double costoTelefonate,
			Integer numTelefonate,
			Double COSTO_AL_SECONDO,
			Double COSTO_RISPOSTA) {
		super(numeroTel, utente, costoTelefonate, 
				numTelefonate, COSTO_AL_SECONDO);
		this.COSTO_RISPOSTA = COSTO_RISPOSTA;
	}
	
	public Double getCOSTO_RISPOSTA() {
		return COSTO_RISPOSTA;
	}
	
	@Override
	public void aggiornaBolletta(int numSecondi) {
		super.aggiornaBolletta(numSecondi);
		aggiungiCosti(COSTO_RISPOSTA);
	}

	@Override
	public String toString() {
		return super.toString() + " " + COSTO_RISPOSTA;
	}

		
}
