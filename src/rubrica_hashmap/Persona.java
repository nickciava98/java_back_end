package rubrica_hashmap;

import java.util.Objects;

public class Persona {
	private String nome, cognome,
		telefono, email;
	
	public Persona(String nome,
			String cognome,
			String telefono,
			String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
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
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cognome, 
				nome, telefono, email);
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
				&& Objects.equals(telefono, other.telefono)
				&& Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return nome + " " + cognome;
	}
}
