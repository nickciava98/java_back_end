package lavoro;

public class Impiegato extends Lavoratore {
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
	}
	
	@Override
	public double stipendio(int giorni) {
		return super.stipendio(giorni) 
				+ 10 * giorni;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nQualifica: Impiegato";
	}
}
