package contatti_telefonici;

public class Contatto {
	private String nome, cognome, 
		numeroTelefono;
	
	public Contatto(String nome,
			String cognome,
			String numeroTelefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.numeroTelefono = numeroTelefono;
	}
	
	public String leggiNome() {
		return nome;
	}
	
	public String leggiCognome() {
		return cognome;
	}
	
	public String leggiNumeroTelefono() {
		return numeroTelefono;
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome 
				+ ", tel: " + numeroTelefono;
	}
}
