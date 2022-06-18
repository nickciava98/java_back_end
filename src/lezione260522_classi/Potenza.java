package lezione260522_classi;

public class Potenza {
	public int base, esponente;
	
	public void pow() {
		int potenza = 1;
		
		for (int i = 0; i < esponente; i++) 
			potenza *= base;
		
		System.out.println("[pow]> " + potenza);
	}
	
	public void cambioBase(int b) {
		base = b;
	}
	
	public void cambioEsponente(int e) {
		esponente = e;
	}
}
