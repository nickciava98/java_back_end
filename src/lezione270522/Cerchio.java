package lezione270522;

public class Cerchio {
	private double raggio;
	
	public Cerchio() { 
		/*
		 * Costruttore vuoto
		 */
	}
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	public double diametro() {
		return 2 * raggio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * raggio;
	}
	
	public double area() {
		return Math.PI * raggio * raggio;
	}
	
	public Cerchio sommaRaggio(Cerchio cerchio) {
		return new Cerchio(raggio + cerchio.raggio);
	}
}
