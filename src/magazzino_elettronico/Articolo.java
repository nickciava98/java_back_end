package magazzino_elettronico;

public class Articolo {
	private String codice;
	private int quantitativo;
	
	public Articolo(String codice,
			int quantitativo) {
		this.codice = codice;
		this.quantitativo = quantitativo;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public int getQuantitativo() {
		return quantitativo;
	}
	
	public void setQuantitativo(
			int quantitativo) {
		this.quantitativo = quantitativo;
	}
	
	@Override
	public String toString() {
		return "Art. " + codice
				+ " - " + quantitativo + " pz";
	}
}
