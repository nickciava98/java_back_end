package banca;

public class ContoBancario {
	private String numero;
	private int bilancio;
		
	public ContoBancario(String numero) {
		this.numero = numero;
	}
	
	public ContoBancario(String numero, 
			int bilancio) {
		this.numero = numero;
		this.bilancio = bilancio;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getBilancio() {
		return bilancio;
	}

	public void setBilancio(int bilancio) {
		this.bilancio = bilancio;
	}

	public void deposita(int ammontare) {
		bilancio += ammontare;
	}
	
	public boolean preleva(int ammontare) {
		if (bilancio >= ammontare) {
			bilancio -= ammontare;
			return true;
		}
		
		else 
			return false;
	}
}
