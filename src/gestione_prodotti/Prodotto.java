package gestione_prodotti;

import java.util.Objects;

public class Prodotto {
	private int codiceABarre;
	private String descrizione;
	private float prezzoUnitario;
	private static int chiaveCB = 10;
	
	public Prodotto(String descrizione,
			float prezzoUnitario) {
		this.codiceABarre = hashCode();
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public int getCodiceABarre() {
		return codiceABarre;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public float getPrezzoUnitario() {
		return prezzoUnitario;
	}
	
	public void setPrezzoUnitario(
			float prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public float applicaSconto() {
		return prezzoUnitario *= .95f;		
	}

	@Override
	public int hashCode() {
		int CB = Objects.hash(Prodotto.chiaveCB, 
				descrizione, 
				prezzoUnitario);
		
		Prodotto.chiaveCB++;
		
		return CB;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Prodotto other = (Prodotto) obj;
		return codiceABarre == other.codiceABarre;
	}

	@Override
	public String toString() {
		return "Barcode: " + codiceABarre 
				+ "\nDescrizione: " + descrizione 
				+ "\nPrezzo unitario: € " + prezzoUnitario;
	}
}
