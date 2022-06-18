package contratto_telefono;

import java.util.Objects;

public class ContrattoTelefonico {
	private Integer numeroTel, numTelefonate;
	private String utente;
	private Double costoTelefonate;
	private final Double COSTO_AL_SECONDO;
	
	public ContrattoTelefonico(
			Integer numeroTel,
			String utente,
			Double costoTelefonate,
			Integer numTelefonate,
			Double COSTO_AL_SECONDO) {
		this.numeroTel = numeroTel;
		this.utente = utente;
		this.costoTelefonate = costoTelefonate;
		this.numTelefonate = numTelefonate;
		this.COSTO_AL_SECONDO = COSTO_AL_SECONDO;
	}

	public Integer getNumeroTel() {
		return numeroTel;
	}

	public Integer getNumTelefonate() {
		return numTelefonate;
	}

	public void setNumTelefonate(Integer numTelefonate) {
		this.numTelefonate = numTelefonate;
	}

	public String getUtente() {
		return utente;
	}

	public Double getBolletta() {
		return costoTelefonate;
	}
	
	public Double getCOSTO_AL_SECONDO() {
		return COSTO_AL_SECONDO;
	}
	
	public void aggiornaBolletta(int numSecondi) {
		costoTelefonate += COSTO_AL_SECONDO * numSecondi;
		numTelefonate++;
	}
	
	public void aggiungiCosti(double costo) {
		costoTelefonate += costo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContrattoTelefonico other = (ContrattoTelefonico) obj;
		return Objects.equals(numeroTel, other.numeroTel);
	}

	@Override
	public String toString() {
		return "numeroTel = " + numeroTel 
				+ ", utente = " + utente;
	}	
}
