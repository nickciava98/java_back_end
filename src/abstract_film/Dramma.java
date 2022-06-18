package abstract_film;

public class Dramma extends Film {
	public Dramma(String codiceID, 
			String titolo) {
		super(codiceID, titolo);
	}
	
	public float calcolaPenaleRitardo(int giorniRitardo) {
		if (giorniRitardo > 0)
			return super.getPenale() * giorniRitardo;
		
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nGenere: dramma";
	}
}
