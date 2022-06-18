package cisterna;

public class Cisterna {
	private int identificativo,
		capacitaMax, stato;
	
	public Cisterna(int identificativo, 
			int capacitaMax) {
		this.identificativo = identificativo;
		this.capacitaMax = capacitaMax;
		this.stato = 0;
	}
	
	public int getIdentificativo() {
		return identificativo;
	}
	
	public int getCapacitaMax() {
		return capacitaMax;
	}
	
	public int getStato() {
		return stato;
	}
	
	public boolean aggiungiValore(
			int quantita) {
		if (stato + quantita <= capacitaMax) {
			stato += quantita;
			return true;
		}
		
		stato = capacitaMax;
		return false;
	}
	
	public int togliValore(int quantita) {
		if (stato >= quantita) {
			stato -= quantita;
			return stato;
		}
		
		System.err.println("> cisterna vuota");
		return stato;
	}
}
