package contratto_telefono;

public class ContrattoFisso extends ContrattoTelefonico {
	private String indirizzo;
	
	public ContrattoFisso(
			Integer numeroTel,
			String utente,
			Double costoTelefonate,
			Integer numTelefonate,
			Double COSTO_AL_SECONDO,
			String indirizzo) {
		super(numeroTel, utente, costoTelefonate, 
				numTelefonate, COSTO_AL_SECONDO);
		this.indirizzo = indirizzo;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}

	@Override
	public String toString() {
		return super.toString() + " " + indirizzo;
	}
}
