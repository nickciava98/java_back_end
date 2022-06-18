package lezione270522;

public class TestCerchio {
	public static void main(String[] args) {
		//Creo primo cerchio con raggio 10
		Cerchio cerchio1 = new Cerchio(10);
		
		//Stampo raggio (var. istanza) e chiamo metodi per calcoli
		System.out.println("[raggio_1]> " + cerchio1.getRaggio());
		System.out.println(
				"[diametro_1]> " + cerchio1.diametro());
		System.out.println(
				"[perimetro_1]> " + cerchio1.perimetro());
		System.out.println("[area_1]> " + cerchio1.area());
		
		//Creo secondo cerchio senza passare il raggio
		Cerchio cerchio2 = new Cerchio(); //Chiamerà costruttore vuoto
		
		//Stampo il raggio che deve essere 0
		System.out.println("\n[raggio_2]> " + cerchio2.getRaggio());
		
		cerchio2.setRaggio(12); //Modifico il raggio del cerchio2
		
		//Stampo nuovo raggio e chiamo metodi per calcoli
		System.out.println("\n[new_raggio_2]> " + cerchio2.getRaggio());
		System.out.println(
				"[diametro_2]> " + cerchio2.diametro());
		System.out.println(
				"[perimetro_2]> " + cerchio2.perimetro());
		System.out.println("[area_2]> " + cerchio2.area());
		
		//Creo terzo cerchio con raggio raggio_1 + raggio_2
		Cerchio cerchio3 = cerchio1.sommaRaggio(cerchio2);
		System.out.println("\n[raggio_3]> " + cerchio3.getRaggio());		
	}
}
