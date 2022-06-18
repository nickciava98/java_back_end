package rubrica_telefonica;

import java.util.Objects;

public class Persona {
	private String nome, cognome,
		telefono;
	
	public Persona(String nome,
			String cognome,
			String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cognome, nome, telefono);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Persona other = (Persona) obj;
		
		return Objects.equals(cognome, other.cognome) 
				&& Objects.equals(nome, other.nome)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return nome + " " + cognome
				+ " tel: " + telefono;
	}
}
