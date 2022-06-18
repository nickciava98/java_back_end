package abstract_film;

import java.util.Objects;

public abstract class Film {
	private String codiceID, titolo;
	private float penale;
	
	public Film(String codiceID, String titolo) {
		this.codiceID = codiceID;
		this.titolo = titolo;
		this.penale = 2;
	}

	public String getCodiceID() {
		return codiceID;
	}

	public void setCodiceID(String codiceID) {
		this.codiceID = codiceID;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public float getPenale() {
		return penale;
	}
	
	public void setPenale(float penale) {
		this.penale = penale;
	}
	
	public abstract float calcolaPenaleRitardo(int giorniRitardo);

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(codiceID, other.codiceID);
	}

	@Override
	public String toString() {
		return "Film: " + codiceID 
				+ "\nTitolo: " + titolo;
	}	
}
