package pavimenti;

public class ProvaPavimenti {
	public static void main(String[] args) {
		Pavimento pavimento = new Pavimento(
				new PiastrellaTriangolare(17, 25),
				7521);
		
		
		System.out.println("[superficie_1]> " 
				+ pavimento.getSuperficie() + " m\u00b2");
		
		pavimento.setPiastrella(new PiastrellaQuadrata(11));
		pavimento.setNumPiastrelle(1128);
		
		System.out.println("[superficie_2]> " 
				+ pavimento.getSuperficie() + " m\u00b2");
	}
}
