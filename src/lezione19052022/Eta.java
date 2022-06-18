package lezione19052022;

public class Eta {
	public static void main(String args[]) {
		//e1, e2, e3 - Età delle tre persone
		int e1 = 15, e2 = 45, e3 = 76;
		
		System.out.println(
				"Età persona 1: " + e1);
		System.out.println(
				"Età persona 2: " + e2);
		System.out.println(
				"Età persona 3: " + e3);
		
		//em - Età media
		float em = (e1 + e2 + e3) / 3f;
		
		System.out.println("Età media: " + em);
	}
}
