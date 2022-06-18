package pavimenti;

public class Pavimento {
	private Piastrella piastrella;
	private int numPiastrelle;
	
	public Pavimento(Piastrella piastrella,
			int numPiastrelle) {
		this.piastrella = piastrella;
		this.numPiastrelle = numPiastrelle;
	}
	
	public void setPiastrella(Piastrella piastrella) {
		this.piastrella = piastrella;
	}
	
	public int getNumPiastrelle() {
		return numPiastrelle;
	}
	
	public void setNumPiastrelle(int numPiastrelle) {
		this.numPiastrelle = numPiastrelle;
	}
	
	public double getSuperficie() {
		return numPiastrelle * piastrella.getArea() / 10000;
	}
}
