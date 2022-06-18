package lezione260522_classi;

public class TestRettangolo {
	public static void main(String[] args) {
		Rettangolo rettangolo1 = new Rettangolo();
		Rettangolo rettangolo2 = new Rettangolo();
		Rettangolo rettangolo3 = new Rettangolo();
		
		rettangolo1.base = 10f;
		rettangolo1.altezza = 15f;
		
		rettangolo2.base = 13f;
		rettangolo2.altezza = 100f;
		
		rettangolo3.base = 100f;
		rettangolo3.altezza = 10f;
		
		float perimetro1 = rettangolo1.perimetro();
		float perimetro2 = rettangolo2.perimetro();
		float perimetro3 = rettangolo3.perimetro();
		
		System.out.println("P1 " + perimetro1);
		System.out.println("P2 " + perimetro2);
		System.out.println("P3 " + perimetro3);
		
		float area1 = rettangolo1.area();
		float area2 = rettangolo2.area();
		float area3 = rettangolo3.area();
		
		System.out.println("A1 " + area1);
		System.out.println("A2 " + area2);
		System.out.println("A3 " + area3);
		
		float somma_p = perimetro1 + perimetro2 + perimetro3;
		float somma_a = area1 + area2 + area3;
		
		System.out.println("SP " + somma_p);
		System.out.println("SA " + somma_a);
		
		rettangolo2.ridimensiona(10, 15);
		
		perimetro2 = rettangolo2.perimetro();
		area2 = rettangolo2.area();
		
		System.out.println("P2 " + perimetro2);
		System.out.println("A2 " + area2);
		
		somma_p = perimetro1 + perimetro2 + perimetro3;
		somma_a = area1 + area2 + area3;
		
		System.out.println("SP " + somma_p);
		System.out.println("SA " + somma_a);
		
		
//		//Input base, altezza
//		System.out.print("[base]> ");
//		float base = scanner.nextFloat();
//		
//		System.out.print("[altezza]> ");
//		float altezza = scanner.nextFloat();
//		
//		rettangolo.base = base;
//		rettangolo.altezza = altezza;
//		
//		//Stampo perimetro e area
//		System.out.println(
//				"\n[2p]> " + rettangolo.perimetro());
//		System.out.println(
//				"[A]> " + rettangolo.area());
//		
//		
//		//Input nuovi valori base, altezza
//		System.out.print("\n[new_base]> ");
//		base = scanner.nextFloat();
//		
//		System.out.print("[new_altezza]> ");
//		altezza = scanner.nextFloat();
//		
//		scanner.close();
//		
//		//Ridimensiona rettangolo con nuovi valori
//		rettangolo.ridimensiona(base, altezza);
//		System.out.println("\n> valori aggiornati");
//		
//		//Stampa nuovo perimetro e nuova area
//		System.out.println(
//				"\n[new_2p]> " + rettangolo.perimetro());
//		System.out.println(
//				"[new_A]> " + rettangolo.area());
	}
}
