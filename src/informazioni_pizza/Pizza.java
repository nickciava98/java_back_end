package informazioni_pizza;

import java.util.ArrayList;

public class Pizza {
	private String nome;
	private float prezzo;
	private ArrayList<Ingrediente> ingredienti;
	
	public Pizza(String nome, float prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		ingredienti = new ArrayList<>();
	}

	public void modificaNome(String nome) {
		this.nome = nome;
	}
	
	public void aggiungiIngrediente(
			Ingrediente ingrediente) {
		ingredienti.add(ingrediente);
	}
	
	public boolean rimuoviIngrediente(
			Ingrediente ingrediente) {
		if (ingredienti.indexOf(ingrediente) != -1) {
			ingredienti.remove(ingrediente);
			return true;
		}
		
		return false;
	}
	
	public boolean modificaIngrediente(
			Ingrediente ingrediente1,
			Ingrediente ingrediente2) {
		if (ingredienti.indexOf(ingrediente1) != -1) {
			ingredienti.set(
					ingredienti.indexOf(ingrediente1), ingrediente2);
			return true;
		}
		
		return false;
	}
	
	public void stampaIngredienti() {
		System.out.println(ingredienti);
	}
	
	public int kilocalorie() {
		int kcals = 0;
		
		for (Ingrediente ingrediente : ingredienti) 
			kcals += ingrediente.getKcal();
		
		return kcals;
	}
	
	@Override
	public String toString() {
		return nome + " € " + prezzo;
	}
}
