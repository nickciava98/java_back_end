package barca;

public class BarcaAMotore {
	private float capacitaSerbatoio, 
		quantitaSerbatoio,
		velocitaMax,
		velocitaCorr,
		efficienza,
		distanza;
	
	public BarcaAMotore(float capacitaSerbatoio,
			float velocitaMax,
			float efficienza,
			float distanza) {
		this.capacitaSerbatoio = capacitaSerbatoio;
		this.velocitaMax = velocitaMax;
		this.efficienza = efficienza;
		this.distanza = distanza;
	}
	
	public float getCapacitaSerbatoio() {
		return capacitaSerbatoio;
	}
	
	public float getQuantitaSerbatoio() {
		return quantitaSerbatoio;
	}
	
	public float getVelocitaMax() {
		return velocitaMax;
	}
	
	public float getVelocitaCorr() {
		return velocitaCorr;
	}
	
	public float getEfficienza() {
		return efficienza;
	}
	
	public float getDistanza() {
		return distanza;
	}
	
	public boolean cambiaVelocita(float velocita) {
		if (velocita <= velocitaMax) {
			velocitaCorr = velocita;
			return true;
		}
		
		return false;
	}
	
	public boolean naviga(float tempo, float velocita) {
		if (quantitaSerbatoio 
				>= efficienza * velocita 
				* velocita * tempo) {
			quantitaSerbatoio -= 
					efficienza * velocita 
					* velocita * tempo;
			cambiaVelocita(velocita);
			distanza += velocita * tempo;
			return true;
		}
		
		return false;
	}
	
	public boolean riempiSerbatoio(float quantita) {
		if (quantita + quantitaSerbatoio 
				<= capacitaSerbatoio) {
			quantitaSerbatoio += quantita;
			return true;
		}
		
		return false;
	}
}
