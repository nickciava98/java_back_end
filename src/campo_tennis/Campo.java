package campo_tennis;

import java.util.ArrayList;

public class Campo {
	private int numPostiMax;
	private ArrayList<Prenotazione> prenotazioni;
	
	public Campo(int numPostiMax) {
		this.numPostiMax = numPostiMax;
		prenotazioni = new ArrayList<>();
	}
	
	public boolean addPren(int oraInizio,
			int oraFine, String nomeCliente) {
		if (prenotazioni.size() < numPostiMax) {
			if (prenotazioni.size() > 0) {
				for (Prenotazione prenotazione : prenotazioni)
					if (prenotazione.getOraInizio() != oraInizio
							& prenotazione.getOraFine() != oraFine) {
						prenotazioni.add(
								new Prenotazione(
										nomeCliente, oraInizio, oraFine));
						return true;
					}
			}
			
			else {
				prenotazioni.add(
						new Prenotazione(nomeCliente, oraInizio, oraFine));
				return true;
			}
		}
		
		return false;
	}
	
	public boolean removePren(int oraInizio,
			int oraFine, String nomeCliente) {
		if (prenotazioni.size() > 0 & prenotazioni.size() < numPostiMax)
			for (Prenotazione prenotazione : prenotazioni)
				if (prenotazione.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
					prenotazioni.remove(prenotazioni.indexOf(prenotazione));
					return true;
				}
		
		return false;
	}
	
	public double utilizzo() {
		return prenotazioni.size() * 100 / numPostiMax;
	}
	
	@Override
	public String toString() {
		return prenotazioni.toString();
	}
}
