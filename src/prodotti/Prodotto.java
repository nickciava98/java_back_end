package prodotti;

public class Prodotto {
	private String descrizione;
	private float prezzo;
	private int quantita;
	
	public Prodotto(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Prodotto(String descrizione,
			int quantita) {
		this.descrizione = descrizione;
		this.quantita = quantita;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}
	
	public void rifornisci(int quantita) {
		this.quantita = quantita;
	}
	
	public boolean vendi() {
		if (quantita > 0) {
			quantita--;
			return true;
		}
		
		return false;
	}
}
