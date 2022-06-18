package banca;

public class TestContoEsteso {
	public static void main(String[] args) {
		ContoEsteso conto123 = new ContoEsteso(
				"123"); //solo numero
		ContoEsteso conto456 = new ContoEsteso(
				"456", //numero
				5000); //bilancio
		ContoEsteso conto789 = new ContoEsteso(
				"789", //numero
				1200, //bilancio
				2000); //fido
		
		//stampa valori 
		System.out.println("[fido_conto" 
				+ conto123.getNumero() + "]> " 
				+ conto123.getFido());
		System.out.println("[fido_conto" 
				+ conto456.getNumero() + "]> " 
				+ conto456.getFido());
		System.out.println("[fido_conto" 
				+ conto789.getNumero() + "]> " 
				+ conto789.getFido());
		
		//cambio fido 123
		conto123.nuovoFido(1800);
		System.out.println("\n[new_fido_conto" 
				+ conto123.getNumero() + "]> "
				+ conto123.getFido() + "\n");
		
		//prova prelievo 456
		if (!conto456.preleva(900))
			System.err.println("> prelievo non possibile");
		
		System.out.println("[bilancio_conto_" 
				+ conto456.getNumero() + "]> " 
				+ conto456.getBilancio());
	}
}
