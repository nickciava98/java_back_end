package lezione260522_classi;

public class Dipendente {
	public String nome;
	public double stipendio;
	
	public void aumentaSalario(
			double perCento) {
		stipendio *= 1 + .01 * perCento;
	}
	
	public void cambiaNome(String n) {
		nome = n;
	}
	
	public void cambiaStipendio(double s) {
		stipendio = s;
	}
}
