package molo_attracco;

public class Barca {
	private String nome;
	
	public Barca(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return "Barca: " + nome;
	}
}
