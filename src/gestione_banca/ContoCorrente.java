package gestione_banca;

import java.util.Objects;

public class ContoCorrente {
	private int numero;
	private String nominativo;
	private double saldo;
	
	public ContoCorrente(String nominativo,
			double saldo) {
		this.nominativo = nominativo;
		this.saldo = saldo;
		numero = hashCode();
	}
	
	public void deposita(double quantita) {
		saldo += quantita;
	}
	
	public boolean preleva(double quantita) {
		if (saldo >= quantita) {
			saldo -= quantita;
			return true;
		}
		
		return false;
	}
	
	public double leggiSaldo() {
		return saldo;
	}
	
	public int hashCode() {
		int hash = Objects.hash(nominativo, saldo);
		
		if (hash < 0)
			return -hash;
		
		return hash;
	}
	
	@Override
	public String toString() {
		return "Conto nr. " + numero
				+ "\nIntestato a: " + nominativo
				+ "\nSaldo pari a: € " + saldo;
	}
}
