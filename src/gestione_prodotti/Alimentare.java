package gestione_prodotti;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alimentare extends Prodotto {
	LocalDate dataScadenza;
	
	public Alimentare(String descrizione,
			float prezzoUnitario,
			LocalDate dataScadenza) {
		super(descrizione, prezzoUnitario);
		this.dataScadenza = dataScadenza;
	}
	
	public LocalDate getDataScadenza() {
		return dataScadenza;
	}
	
	@Override
	public float applicaSconto() {
		if (LocalDate.now().until(dataScadenza, ChronoUnit.DAYS) <= 10
				& LocalDate.now().until(dataScadenza, ChronoUnit.DAYS) >= 0)  
			return super.getPrezzoUnitario() * .8f;
		
		else if (LocalDate.now().until(dataScadenza, ChronoUnit.DAYS) < 0)
			return -1;
		
		return super.applicaSconto();
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "\nData di scadenza: " + dataScadenza;
	}	
}
