package lavoro;

public class Lavoratore {
	private String nome, cognome;
	private final double stipendioGiornaliero;
	
	public Lavoratore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendioGiornaliero = 25;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public double stipendio(int giorni) {
		return giorni * stipendioGiornaliero;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome
				+ "\nCognome: " + cognome;
	}
}
