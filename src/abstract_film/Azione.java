package abstract_film;

public class Azione extends Film {
	public Azione(String codiceID, 
			String titolo) {
		super(codiceID, titolo);
		super.setPenale(3);
	}
	
	public float calcolaPenaleRitardo(int giorniRitardo) {		
		if (giorniRitardo > 0)
			return super.getPenale() * giorniRitardo;
		
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "\nGenere: azione";
	}	
}
