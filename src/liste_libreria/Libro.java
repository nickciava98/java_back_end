package liste_libreria;

public class Libro {
	private String titolo, autore;
	private float prezzo;
	
	public Libro(String titolo,
			String autore, float prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public float getPrezzo() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		return titolo + " di " 
				+ autore + " € " + prezzo;
	}
}
