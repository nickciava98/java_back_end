package giocatore;

public class ClienteGiocatore {
	public static void main(String[] args) {
		GiocatoreBaseball giocatore1 = 
				new GiocatoreBaseball(
						"Mario Rossi", //nome
						30); //eta
		
		//stampo valori attuali giocatore1
		System.out.println("[nome_1]> " 
				+ giocatore1.getNome());
		System.out.println("[punteggio_1]> " 
				+ giocatore1.getPunteggio());
		System.out.println("[eta_1]> " 
				+ giocatore1.getEta());
		
		//test giocatore1
		giocatore1.setPunteggio(97.44);
		System.out.println("\n[new_punteggio_1]> " 
				+ giocatore1.getPunteggio());
		
		GiocatoreBaseball giocatore2 = 
				new GiocatoreBaseball(
						"Giuseppe Verdi", //nome
						98.44, //punteggio
						32); //eta
		
		//stampo valori attuali giocatore2
		System.out.println("\n[nome_2]> " 
				+ giocatore2.getNome());
		System.out.println("[punteggio_2]> " 
				+ giocatore2.getPunteggio());
		System.out.println("[eta_2]> " 
				+ giocatore2.getEta() + "\n");
		
		if (giocatore1.migliore(giocatore2))
			System.out.println(
					"> giocatore1 migliore");
		
		else
			System.out.println(
					"> giocatore2 migliore");
	}
}
