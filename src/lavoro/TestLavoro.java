package lavoro;

public class TestLavoro {
	public static void main(String[] args) {
		Lavoratore[] lavoratori = new Lavoratore[5];
		
		lavoratori[0] = new Capo("Giuseppe", "Rossi");
		
		for (int i = 1; i < lavoratori.length; i++)
			lavoratori[i] = new Impiegato("Impiegato", "" + i);
		
		for (int i = 0; i < lavoratori.length; i++) {
			System.out.println(lavoratori[i] 
					+ "\nStipendio: € " + lavoratori[i].stipendio(22)
					+ "\n");
		}
	}
}
