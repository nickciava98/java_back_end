package prodotti;

public class ProdottoScontabile extends Prodotto {
	private int sconto, 
		quantitaProdotti; //quantita oltre la quale si fa sconto
	
	public ProdottoScontabile(String descrizione,
			int quantita, int sconto, 
			int quantitaProdotti) {
		super(descrizione, quantita);
		this.sconto = sconto;
		this.quantitaProdotti = quantitaProdotti;
	}
	
	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto;
	}

	public int getQuantitaProdotti() {
		return quantitaProdotti;
	}

	public void setQuantitaProdotti(int quantitaProdotti) {
		this.quantitaProdotti = quantitaProdotti;
	}
	
	public float getPrezzoScontato(int quantita) {
		return getPrezzo() * quantita * sconto / 100f;
	}

	public boolean vendi(int quantita) {
		if (quantita >= quantitaProdotti 
				& this.getQuantita() > quantita) {
			rifornisci(getQuantita() - quantita);
			return true;
		}
		
		return false;
	}
}
