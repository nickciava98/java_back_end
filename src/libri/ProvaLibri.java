package libri;

public class ProvaLibri {
	public static void main(String[] args) {
		LibriCat l1 = new LibriCat(
				"Nome della rosa", //titolo
				1986, //anno
				20); //costo
		LibriCat l2 = new LibriCat(
				"Anna Karenina", 
				1877,
				20);
		
		//stampa valori
		System.out.println(l1 + "\n");
		System.out.println(l2 + "\n");
		
		if (l1.stessoCosto(l2))
			System.out.println("[costo_l1] = [costo_l2]");
	}
}
