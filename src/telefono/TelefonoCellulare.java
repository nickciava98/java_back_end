package telefono;

public class TelefonoCellulare {
	public int secondiConversazione, numeroTelefonate;
	public float costoTelefonate, costoPerSecondo;
	public String stato, marca, modello, operatore;
	
	public TelefonoCellulare() {
		//vuoto
	}
	
	public TelefonoCellulare(int secondiConversazione, 
			int numeroTelefonate, 
			float costoTelefonate, 
			float costoPerSecondo, 
			String stato, 
			String marca, 
			String modello, 
			String operatore) {
		this.secondiConversazione = secondiConversazione;
		this.costoTelefonate = costoTelefonate;
		this.costoPerSecondo = costoPerSecondo;
		this.stato = stato;
		this.marca = marca;
		this.modello = modello;
		this.operatore = operatore;
	}
	
	public void accendi() {
		if (!stato.equals("acceso"))
			stato = "acceso";
	}
	
	public void spegni() {
		if (!stato.equals("spento"))
			stato = "spento";
	}
	
	public void telefona(int secondi) {
		if (stato.equals("acceso")) {
			secondiConversazione += secondi;
			numeroTelefonate++;
			costoTelefonate = costoPerSecondo * secondi;
		}
	}
	
	public void cambioOperatore(String operatore, 
			float costoPerSecondo) {
		costoTelefonate = 0;
		this.operatore = operatore;
		this.costoPerSecondo = costoPerSecondo;
	}
}
