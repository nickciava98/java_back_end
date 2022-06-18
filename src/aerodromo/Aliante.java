package aerodromo;

public class Aliante extends Aeromobile {
	private int efficienza;
	
	public Aliante (String sigla, 
			int efficienza) {
		super(sigla);
		this.efficienza = efficienza;
	}
	
	public int getEfficienza() {
		return efficienza;
	}
	
	public boolean superiore(CMP x) {
		if (this == x)
			return true;
		
		if (x == null)
			return false;
		
		if (!(x instanceof Aliante))
			return false;
		
		Aliante aliante = (Aliante) x;
		
		if (efficienza >= aliante.getEfficienza())
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
		
		Aliante other = (Aliante) obj;
		return efficienza == other.efficienza;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "\nEfficienza: " + efficienza;
	}
}
