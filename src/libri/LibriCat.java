package libri;

public class LibriCat extends Libri {
	public LibriCat(String titolo,
			int anno, int costo) {
		super(titolo, anno, costo);
	}
	
	public boolean stessoCosto(Object obj) {
		if (super.equals(obj))
			return true;
		
		return false;
	}
}
