package banca;

public class TestContoBancario {
	public static void main(String[] args) {
		//creo il conto con numero e bilancio
		ContoBancario conto = new ContoBancario("123", 1000);
		
		//stampo il saldo attuale
		System.out.println("[saldo_123]> €" 
				+ conto.getBilancio());
		
		conto.deposita(1000); //deposito 1000 euro
		
		//stampo il nuovo saldo
		System.out.println("[new_saldo_123]> €" 
				+ conto.getBilancio());
		
		/*
		 * tento di prelevare 500 euro,
		 * se non c'è abbastanza disponibilità 
		 * mostro un errore con il saldo attuale
		 */
		if (!conto.preleva(500))
			System.err.println(
					"[saldo_123]> €" + conto.getBilancio() 
							+ " saldo insufficiente");
		
		else //se è possibile prelevare stampo il nuovo saldo
			System.out.println("[saldo_123]> €" 
					+ conto.getBilancio()
					+ " prelievo effettuato");
		
		//creo nuovo conto con soltanto il numero
		ContoBancario conto2 = new ContoBancario("345");
		
		//stampo il saldo attuale, zero perché non inizializzato
		System.out.println("\n[saldo_345]> €" 
				+ conto2.getBilancio());
		
		//ripeto operazioni precedenti
		
		conto2.deposita(1000); //deposito 1000 euro
		
		//stampo il nuovo saldo
		System.out.println("[new_saldo_345]> €" 
				+ conto2.getBilancio());
		
		/*
		 * tento di prelevare 500 euro,
		 * se non c'è abbastanza disponibilità 
		 * mostro un errore con il saldo attuale
		 */
		if (!conto2.preleva(3000))
			System.err.println(
					"[saldo_345]> €" 
							+ conto2.getBilancio() 
							+ " saldo insufficiente");
		
		else //se è possibile prelevare stampo il nuovo saldo
			System.out.println("[saldo_345]> €" 
					+ conto2.getBilancio()
					+ " prelievo effettuato");		
	}
}
