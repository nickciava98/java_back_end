package giocatore;

public class GiocatoreBaseball {
	private String nome;
	private double punteggio; 
	private int eta;
	
	public GiocatoreBaseball(String nome, 
			int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public GiocatoreBaseball(String nome,
			double punteggio, 
			int eta) {
		this.nome = nome;
		this.punteggio = punteggio;
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPunteggio() {
		return punteggio;
	}
	
	public void setPunteggio(
			double punteggio) {
		this.punteggio = punteggio;
	}
	
	public int getEta() {
		return eta;
	}
	
	public boolean migliore(
			GiocatoreBaseball giocatore) {
		if (punteggio > giocatore.punteggio)
			return true;
		
		else if (punteggio == giocatore.punteggio) {
			if (eta <= giocatore.eta)
				return true;
			
			else
				return false;
		}
		
		return false;
	}
	
}
