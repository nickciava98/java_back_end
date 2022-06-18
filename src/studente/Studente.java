package studente;

public class Studente {
	private String nome, 
		cognome, matricola;
	private int eta;
	public static int chiaveMatricola;
	
	public Studente(String nome,
			String cognome,
			int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		
		Studente.chiaveMatricola++;
		generaMatricola();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void generaMatricola() {
		matricola = nome + (eta + Studente.chiaveMatricola * 220);
	}
}
