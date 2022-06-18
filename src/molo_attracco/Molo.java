package molo_attracco;

import java.util.HashMap;

public class Molo {
	private String codice;
	private int numeroPosti;
	private boolean[] posti;
	private HashMap<Integer, Barca> barche;
	
	private Molo(String codice,
			int numeroPosti) {
		this.codice = codice;
		this.numeroPosti = numeroPosti;
		posti = new boolean[numeroPosti];
		barche = new HashMap<>();
	}
	
	public static Molo crea(String codice, 
			int numeroPosti) { 
		return new Molo(codice, numeroPosti);
	}
	
	public int numPostiBarca() {
		return numeroPosti;
	}
	
	public Boolean libero(int numero) {
		try {
			return !posti[numero];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("\nPosto " + numero 
					+ " non esiste!\n");
		}
		
		return null;
	}
	
	public boolean assegnaPostoBarca(
			String barca, int numero) 
					throws NullPointerException {
		if (libero(numero) != null) {
			Barca daAssegnare = new Barca(barca);
			posti[numero] = true;
			barche.put(numero, daAssegnare);
			return true;
		}
		
		return false;
	}
	
	public boolean liberaPostoBarca(int numero) 
			throws NullPointerException {
		if (!libero(numero)) {
			posti[numero] = false;
			barche.remove(numero);
			return true;
		}
	
		return false;
	}
	
	public String dammiBarca(int numero) 
			throws NullPointerException {
		if (!libero(numero)) 
			return barche.get(numero).toString();
		
		return null;
	}
	
	public int dammiUnPostoLibero() 
			throws NullPointerException {
		for (int i = 0; i < posti.length; i++)
			if (libero(i))
				return i;
		
		return -1;
	}
	
	public void compattaBarche() {
		try {
			for (int i = 0; i < posti.length; i++)
				for (int j = i + 1; j < posti.length; j++)
					if (!posti[i] & posti[j]) {
						assegnaPostoBarca(barche.get(j).getNome(), i);
						liberaPostoBarca(j);
					}
		} catch (Exception e) {
			System.err.println("\nImpossibile compattare!");
		}
	}
	
	public static boolean[] situazionePostiBarca(
			Molo molo) {
		return molo.posti;
	}
	
	@Override
	public String toString() {
		return "Molo: " + codice + " - "
				+ numeroPosti + " posti";
	}
}
