package informazioni_pizza;

public class Ingrediente {
	private String nome;
	private int kcal;
	
	public Ingrediente(String nome,
			int kcal) {
		this.nome = nome;
		this.kcal = kcal;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	@Override
	public String toString() {
		return nome + " " + kcal + " kcal";
	}
}
