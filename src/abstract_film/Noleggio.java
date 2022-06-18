package abstract_film;

public class Noleggio {
	private Film film;
	private int docID, giorniRitardo;
	
	public Noleggio(Film film,
			int docID,
			int giorniRitardo) {
		this.film = film;
		this.docID = docID;
		this.giorniRitardo = giorniRitardo;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public int getDocID() {
		return docID;
	}

	public void setDocID(int docID) {
		this.docID = docID;
	}

	public int getGiorniRitardo() {
		return giorniRitardo;
	}

	public void setGiorniRitardo(int giorniRitardo) {
		this.giorniRitardo = giorniRitardo;
	}

	@Override
	public String toString() {
		return "Noleggio " + film 
				+ "\nDocumento n.: " + docID 
				+ "\nGiorni di ritardo: " + giorniRitardo
				+ "\nPenale: € " + film.calcolaPenaleRitardo(giorniRitardo);
	}
}
