package lezione240522;

public class Temperature {
	static double media_temps(double[] temps) {
		double somma_temp = 0;
		
		for (int i = 0; i < temps.length; i++) 
			somma_temp += temps[i];
		
		return somma_temp / temps.length;
	}
	
	static void check_temps(double m_temps, double[] temps) {
		for (int i = 0; i < temps.length; i++) {
			if (temps[i] >= m_temps) 
				System.out.println(
						"(out) [" + temps[i] 
								+ "°C]> maggiore o uguale alla media");
			
			else 
				System.out.println(
						"(out) [" + temps[i] + "°C]> minore della media");
		}
	}
	
	public static void main(String[] args) {
		double[] temps = 
			{12.4, 18.9, 30.7, 44.7, 15.3, 17.8, 
					18.4, 17.7, 32.9, 33.7, 11.4, 10.6};
		
		if (temps.length > 0) {			
			check_temps(media_temps(temps), temps);
		}
		
		else {
			System.err.println("(err) [temps.length]> nessun elemento");
		}
	}
}
