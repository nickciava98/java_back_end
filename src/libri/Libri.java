package libri;

public abstract class Libri {
	private String titolo;
	private int anno, costo;
	
	public Libri(String titolo, 
			int anno, int costo) {
		this.titolo = titolo;
		this.anno = anno;
		this.costo = costo;
	}
	
	public abstract boolean stessoCosto(Object obj);
	
	@Override
	public String toString() {
		return "Libro: " + titolo
				+ "\nAnno: " + anno
				+ "\nCosto: € " + costo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libri other = (Libri) obj;
		return costo == other.costo;
	}
}
