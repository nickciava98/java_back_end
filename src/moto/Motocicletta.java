package moto;

public class Motocicletta {
	private int serbatoio;
	private int capacitaMax;
	private String marca;
	private String cilindrata;
	private boolean statoMotore;
	private boolean luci;
	private int velocita;
	private boolean frecciaDestra;
	private boolean frecciaSinistra;
	private int marcia;
	private int marciaMax;
	
	public Motocicletta(int capacitaMax,
			String marca,
			String cilindrata,
			int marciaMax) {
		this.capacitaMax = capacitaMax;
		this.marca = marca;
		this.cilindrata = cilindrata;
		this.marciaMax = marciaMax;
	}
	
	public int getSerbatoio() {
		return serbatoio;
	}
	
	public int getCapacitaMax() {
		return capacitaMax;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getCilindrata() {
		return cilindrata;
	}
	
	public boolean getStatoMotore() {
		return statoMotore;
	}
	
	public boolean getLuci() {
		return luci;
	}
	
	public int getVelocita() {
		return velocita;
	}
	
	public boolean getFrecciaDestra() {
		return frecciaDestra;
	}
	
	public boolean getFrecciaSinistra() {
		return frecciaSinistra;
	}
	
	public int getMarcia() {
		return marcia;
	}
	
	public int getMarciaMax() {
		return marciaMax;
	}
	
	public boolean rifornimento(int litri) {
		if (serbatoio + litri <= capacitaMax) {
			serbatoio += litri;
			return true;
		}
		
		return false;
	}
	
	//possibile anche con return boolean
	public void accendiMoto() {
		if (!statoMotore & serbatoio > 0) {
			statoMotore = true;
			return;
		}
		
		else if (statoMotore)
			System.err.println("> moto già accesa");
		
		else if (serbatoio <= 0)
			System.err.println("> serbatoio vuoto");
	}
	
	//possibile anche con return boolean
	public void spegniMoto() {
		if (statoMotore) {
			statoMotore = false;
			return;
		}
		
		System.err.println("> moto già spenta");
	}
	
	//possibile anche con return boolean
	public void aumentaMarcia() {
		if (marcia < marciaMax)
			marcia++;
		
		else
			System.err.println("> raggiunto valore marciaMax");
	}
	
	//possibile anche con return boolean
	public void diminuisciMarcia() {
		if (marcia > 0)
			marcia--;
		
		else
			System.err.println("> raggiunto valore marciaMin");
	}
	
	//possibile anche con return boolean
	public void accelera(int incrementoVelocita) {
		if (statoMotore & marcia > 0) {
			velocita += incrementoVelocita;
			return;
		}
		
		else if (!statoMotore)
			System.err.println("> moto spenta");
		
		else if (marcia <= 0) 
			System.err.println("> marcia non inserita");
	}
	
	//possibile anche con return boolean
	public void frena(int diminuzioneVelocita) {
		if (statoMotore & marcia > 0 
				& velocita >= diminuzioneVelocita) {
			velocita -= diminuzioneVelocita;
			return;
		}
		
		else if (!statoMotore)
			System.err.println("> moto spenta");
		
		else if (marcia <= 0) 
			System.err.println("> marcia non inserita");
		
		else if (velocita <= diminuzioneVelocita)
			System.err.println("> velocità troppo bassa");
	}
	
	//possibile anche con return boolean
	public void accendiLuci() {
		if (!luci) {
			luci = true;
			return;
		}
		
		System.err.println("> luci già accese");
	}
	
	//possibile anche con return boolean
	public void spegniLuci() {
		if (luci) {
			luci = false;
			return;
		}
		
		System.err.println("> luci già spente");
	}
	
	//possibile anche con return boolean
	public void accendiFrecciaDestra() {
		if (!frecciaDestra) {
			frecciaDestra = true;
			return;
		}
		
		System.err.println("> freccia destra già accesa");
	}
	
	//possibile anche con return boolean
	public void spegniFrecciaDestra() {
		if (frecciaDestra) {
			frecciaDestra = false;
			return;
		}
		
		System.err.println("> freccia destra già spenta");
	}
	
	//possibile anche con return boolean
	public void accendiFrecciaSinistra() {
		if (!frecciaSinistra) {
			frecciaSinistra = true;
			return;
		}
		
		System.err.println("> freccia sinistra già accesa");
	}
	
	//possibile anche con return boolean
	public void spegniFrecciaSinistra() {
		if (frecciaSinistra) {
			frecciaSinistra = false;
			return;
		}
		
		System.err.println("> freccia sinistra già spenta");
	}
}
