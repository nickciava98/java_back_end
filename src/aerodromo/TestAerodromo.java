package aerodromo;

public class TestAerodromo {
	public static void main(String[] args) {
		AereoMotore am1 = new AereoMotore(
				"AM01", //sigla
				512.44); //potenzaCV
		AereoMotore am2 = new AereoMotore(
				"AM02",
				510.44);
		Aliante al1 = new Aliante(
				"AL01", //sigla
				4); //efficienza
		Aliante al2 = new Aliante(
				"AL02",
				3);
		
		//stampa valori
		System.out.println(am1 + "\n\n" + al1 + "\n");
		
		//test cmp
		if (am1.superiore(am2))
			System.out.println("AM01 superiore a AM02");
		
		else if (am2.superiore(am1))
			System.out.println("AM02 superiore a AM01");
		
		else 
			System.err.println("AM01 e AM02 non confrontabili");
		
		if (al1.superiore(am2)) //errore
			System.out.println("AL01 superiore a AL02");
		
		else if (al2.superiore(al1))
			System.out.println("AL02 superiore a AL01");
		
		else
			System.err.println("AL01 e AL02 non confrontabili");
	}
}
