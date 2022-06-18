package liste_libreria;

public class ProvaLibreria {
	public static void main(String[] args) {		
		Libreria libreria = new Libreria();
		
		libreria.aggiungiLibro(new Libro("Libro1", "Mario Rossi", 20));
		libreria.aggiungiLibro(new Libro("Libro2", "Giuseppe Verdi", 10));
		libreria.aggiungiLibro(new Libro("Libro3", "Giuseppe Verdi", 11));
		
		if (libreria.trovaLibro("Mario Rossi").size() > 0)
			System.out.println("Di Mario Rossi " 
					+ libreria.trovaLibro("Mario Rossi"));
		
		if (libreria.trovaNumeroLibri("Giuseppe Verdi") > 0)
			System.out.println("Di Giuseppe Verdi " 
					+ libreria.trovaNumeroLibri("Giuseppe Verdi") + " libro/i");
		
		if (libreria.trovaNumeroLibri("Giuseppe Verdi", 10) > 0)
			System.out.println("Di Giuseppe Verdi con prezzo > € 10 " 
					+ libreria.trovaNumeroLibri("Giuseppe Verdi", 10) + " libro/i");
	}
}
