package carrello_elettronico;

public class Articolo {
	private String titolo, nome;
	private double prezzoUnitario;
	
	public Articolo(String titolo,
			String nome,
			double prezzoUnitario) {
		this.titolo = titolo;
		this.nome = nome;
		this.prezzoUnitario = prezzoUnitario;
	}

	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}

	@Override
	public String toString() {
		return "Articolo: " + titolo 
				+ "\nNome: " + nome 
				+ "\nPrezzo unitario: € " + prezzoUnitario + "\n";
	}	
}
