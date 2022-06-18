package campo_tennis;

public class Prenotazione {
	private String nomeCliente;
	private int oraInizio, oraFine;
	
	public Prenotazione(String nomeCliente,
			int oraInizio, int oraFine) {
		this.nomeCliente = nomeCliente;
		this.oraInizio = oraInizio;
		this.oraFine = oraFine;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public int getOraInizio() {
		return oraInizio;
	}
	
	public int getOraFine() {
		return oraFine;
	}
	
	@Override
	public String toString() {
		return nomeCliente + ": " 
				+ oraInizio + ":00 - " + oraFine + ":00";
	}
}
