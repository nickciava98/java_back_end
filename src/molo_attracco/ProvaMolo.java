package molo_attracco;

public class ProvaMolo {
	public static void main(String[] args) {
		Molo molo = Molo.crea("123", 10);
		molo.assegnaPostoBarca("Barca1", 1);
		molo.assegnaPostoBarca("Barca2", 5);
		molo.assegnaPostoBarca("Barca3", 6);
		
		try {
			System.out.println("Posto 5 - " + molo.dammiBarca(6));
		} catch (NullPointerException npe) {
			System.err.println("Errore dammiBarca()");
		}
		
		try {
			System.out.println("\nPrimo posto libero: " 
				+ molo.dammiUnPostoLibero());
		} catch(NullPointerException npe) {
			System.err.println("Errore dammiUnPostoLibero()");
		}
		
		try {
			System.out.println("Posto 7 libero? " + 
					(molo.libero(8) != null ? "OK" : "Errore"));
		} catch (NullPointerException npe) {
			System.err.println("Errore libero()");
		}
		
		System.out.println("\nNumero totale posti: " 
				+ molo.numPostiBarca());
		
		try {
			System.out.println("\nLiberato posto 1: " 
					+ (molo.liberaPostoBarca(2) ? "OK" : "Errore"));
		} catch (NullPointerException npe) {
			System.err.println("Errore liberaPostoBarca()");
		}
		
		System.out.println("\nSituazione posti non compattati:");
		boolean[] situazione = Molo.situazionePostiBarca(molo);
		
		for (int i = 0; i < situazione.length; i++)
			System.out.println((i < 9 ? " " + (i + 1) : (i + 1)) 
					+ " - " 
					+ (situazione[i] ? "occupato" : "libero"));
		
		molo.compattaBarche();
		
		System.out.println("\nSituazione posti compattati:");
		situazione = Molo.situazionePostiBarca(molo);
		
		for (int i = 0; i < situazione.length; i++)
			System.out.println((i < 9 ? " " + (i + 1) : (i + 1)) 
					+ " - " 
					+ (situazione[i] ? "occupato" : "libero"));
	}
}
