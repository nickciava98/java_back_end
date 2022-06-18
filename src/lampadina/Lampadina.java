package lampadina;

public class Lampadina {
	private String stato;
	private int numeroClick, numeroClickMax;
	
	public Lampadina(String stato, int numeroClickMax) {
		this.stato = stato;
		
		//tolgo 1 per motivi di ciclo, numeroClick parte da 0
		this.numeroClickMax = numeroClickMax - 1; 
	}
	
	public String stato() {
		return stato;
	}
	
	public void click() {
		if (stato.equals("acceso") 
				& numeroClick <= numeroClickMax) {
			stato = "spento";
			numeroClick++;
		}			
		
		else if (stato.equals("acceso")
				& numeroClick > numeroClickMax) 
			stato = "rotto";
		
		else if (stato.equals("spento")
				& numeroClick <= numeroClickMax) {
			stato = "acceso";
			numeroClick++;
		}
		
		else if (stato.equals("spento")
				& numeroClick > numeroClickMax) 
			stato = "rotto";
	}
	
	public int getNumeroClick() {
		return numeroClick;
	}
	
	public int getNumeroClickMax() {
		return numeroClickMax;
	}
}
