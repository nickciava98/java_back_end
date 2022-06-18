package lezione260522_classi;

public class Rettangolo {
	public float base, altezza;
	
	public void ridimensiona(float b, float h) {
		base = b;
		altezza = h;
	}
	
	public float perimetro() {
		return 2 * (base + altezza);
	}
	
	public float area() {
		return base * altezza;
	}
}
