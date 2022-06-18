package pavimenti;

public class PiastrellaTriangolare extends Piastrella {
	private double base, latoObliquo;
	
	public PiastrellaTriangolare(double base,
			double latoObliquo) {
		this.base = base;
		this.latoObliquo = latoObliquo;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLatoObliquo() {
		return latoObliquo;
	}

	public void setLatoObliquo(double latoObliquo) {
		this.latoObliquo = latoObliquo;
	}
	
	public double getArea() {
		return .5 * base 
				* Math.sqrt( //teorema di pitagora
						Math.pow(latoObliquo, 2) 
						- Math.pow(base, 2));
	}
}
