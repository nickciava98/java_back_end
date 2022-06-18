package aerodromo;

public class AereoMotore extends Aeromobile {
	private double potenzaCV;
	
	public AereoMotore(String sigla,
			double potenzaCV) {
		super(sigla);
		this.potenzaCV = potenzaCV;
	}
	
	public double getPotenzaCV() {
		return potenzaCV;
	}

	public boolean superiore(CMP x) {
		if (this == x)
			return true;
		
		if (x == null)
			return false;
		
		if (!(x instanceof AereoMotore))
			return false;
		
		AereoMotore aereoMotore = (AereoMotore) x;
		
		if (potenzaCV >= aereoMotore.getPotenzaCV())
			return true;
		
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		AereoMotore other = (AereoMotore) obj;
		return Double.doubleToLongBits(potenzaCV) == Double.doubleToLongBits(other.potenzaCV);
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nPotenza: " + potenzaCV + " CV";
	}
}
