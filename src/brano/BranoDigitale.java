package brano;

public class BranoDigitale {
	private String formato, titolo, autore;
	
	public BranoDigitale(String formato,
			String titolo, String autore) {
		this.formato = formato;
		this.titolo = titolo;
		this.autore = autore;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
}
