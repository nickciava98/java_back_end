package liste_libreria;

import java.util.ArrayList;

public class Libreria {
	ArrayList<Libro> libri;
	
	public Libreria() {
		libri = new ArrayList<>();
	}
	
	public void aggiungiLibro(Libro libro) {
		libri.add(libro);
	}
	
	public ArrayList<String> trovaLibro(String autore) {
		ArrayList<String> libriAutore = new ArrayList<>();
		
		for (Libro libro : libri)
			if (libro.getAutore().equals(autore))
				libriAutore.add(libro.getTitolo());
		
		return libriAutore;
	}
	
	public int trovaNumeroLibri(String autore) {
		int numeroLibri = 0;
		
		for (Libro libro : libri)
			if (libro.getAutore().equals(autore))
				numeroLibri++;
		
		return numeroLibri;
	}
	
	public int trovaNumeroLibri(String autore,
			int minimoPrezzo) {
		int numeroLibri = 0;
		
		for (Libro libro : libri)
			if (libro.getAutore().equals(autore)
					& libro.getPrezzo() > minimoPrezzo)
				numeroLibri++;
		
		return numeroLibri;
	}
}
