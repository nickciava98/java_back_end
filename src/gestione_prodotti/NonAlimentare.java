package gestione_prodotti;

public class NonAlimentare extends Prodotto {
	private String materiale;
	
	public NonAlimentare(String descrizione,
			float prezzoUnitario,
			String materiale) {
		super(descrizione, prezzoUnitario);
		this.materiale = materiale;
	}
	
	public String getMateriale() {
		return materiale;
	}
	
	@Override
	public float applicaSconto() {
		if (materiale.toLowerCase().equals("carta")
				| materiale.toLowerCase().equals("plastica")
				| materiale.toLowerCase().equals("vetro")) 
			return super.getPrezzoUnitario() * .9f;
		
		return super.applicaSconto();
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nMateriale: " + materiale;
	}	
}
