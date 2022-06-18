package pavimenti;

public class PiastrellaQuadrata extends Piastrella {
	private double dimensione;
	
	public PiastrellaQuadrata(
			double dimensione) {
		this.dimensione = dimensione;
	}

	public double getDimensione() {
		return dimensione;
	}

	public void setDimensione(double dimensione) {
		this.dimensione = dimensione;
	}
	
	public double getArea() {
		return Math.pow(dimensione, 2);
	}
}
