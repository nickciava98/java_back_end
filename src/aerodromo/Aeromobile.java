package aerodromo;

public abstract class Aeromobile implements CMP {
	private String sigla;
	
	public Aeromobile(String sigla) {
		this.sigla = sigla;
	}
	
	public abstract boolean superiore(CMP cmp);
	
	@Override
	public String toString() {
		return "Aeromobile: " + sigla;
	}
}
