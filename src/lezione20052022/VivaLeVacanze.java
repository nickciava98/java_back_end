package lezione20052022;

public class VivaLeVacanze {
	public static void main(String args[]) {
		int i = 1;
		
		while (i <= 10) {
			System.out.println(
					i != 10 ? " [" + i + "] Viva le vacanze!" 
							: "[" + i + "] Viva le vacanze!");
			
			i++;
		}
	}
}
