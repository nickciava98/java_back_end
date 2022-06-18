package abstract_film;

public class Commedia extends Film {
	public Commedia(String codiceID, 
			String titolo) {
		super(codiceID, titolo);
		super.setPenale(2.5f);
	}
	
	public float calcolaPenaleRitardo(int giorniRitardo) {
		if (giorniRitardo > 0)
			return super.getPenale() * giorniRitardo;
		
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nGenere: commedia";
	}
}
