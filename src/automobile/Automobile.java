package automobile;

public class Automobile {
	private float resa;
	private double carb;
	private String carburante;
	
	public Automobile(float resa, 
			float carb,
			String carburante) {
		this.resa = resa;
		this.carb = carb;
		this.carburante = carburante;
	}
	
	//esegue senza controllo preliminare
//	public void drive(float distanza) {
//		if (carb >= resa * distanza) 
//			carb -= resa * distanza;
//	}
	
	public float getResa() {
		return resa;
	}
	
	public double getGas() {
		return carb;
	}
		
	public void addGas(double quant) {
		carb += quant;
	}
	
	public boolean isDiesel() {
		if (carburante.equals("gasolio")
				| carburante.equals("verde"))
			if (carburante.equals("gasolio"))
				return true;
		
		return false;
	}
	
	public boolean drive(float distanza) {
		if (carb >= resa * distanza) {
			carb -= resa * distanza;
			return true;
		}
		
		return false;
	}
}
