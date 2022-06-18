package informazioni_pizza;

public class ProvaPizza {
	public static void main(String[] args) {
		Ingrediente ingrediente1 = new Ingrediente("Pomodoro", 50);
		Ingrediente ingrediente2 = new Ingrediente("Olio", 120);
		Ingrediente ingrediente3 = new Ingrediente("Mozzarella", 100);
		Ingrediente ingrediente4 = new Ingrediente("Basilico", 10);
		Pizza margherita = new Pizza("Margherita", 5);
		
		margherita.aggiungiIngrediente(ingrediente1);
		margherita.aggiungiIngrediente(ingrediente2);
		margherita.aggiungiIngrediente(ingrediente3);
		margherita.aggiungiIngrediente(ingrediente4);
		
		System.out.println(margherita + "\nIngredienti: ");
		margherita.stampaIngredienti();
		System.out.println("Kcal: " + margherita.kilocalorie());
		
		Ingrediente ingrediente2a = new Ingrediente("Olio EVO", 118);
		
		if (margherita.modificaIngrediente(ingrediente2, ingrediente2a)) {
			System.out.println("\nNuovi ingredienti:");
			margherita.stampaIngredienti();
			System.out.println("Nuove kcal: " + margherita.kilocalorie());
		}
		
		if (margherita.rimuoviIngrediente(ingrediente3)) {
			margherita.modificaNome("Marinara");
			
			System.out.println("\n" + margherita + "\nNuovi ingredienti:");
			margherita.stampaIngredienti();
			System.out.println("Nuove kcal: " + margherita.kilocalorie());
		}
	}
}
