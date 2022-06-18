package lezione07062022;

public class Motociclo extends Veicolo {
	private int cilindrata;

	public Motociclo(String targa,
			String marca, String modello,
			int cilindrata) {
		super(targa, marca, modello);
		this.cilindrata = cilindrata;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
}
