package lezione20052022;

import java.util.Scanner;

public class IscrizioneStudente {
	public static void main(String args[]) {
		float media, reddito, iscrizione;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Media> ");
		media = scanner.nextFloat();
		
		if (media > 0 & media <= 10) {
			if (media < 7) {
				iscrizione = 43;
			}
			
			else if (media >= 7 | media <= 8) {
				iscrizione = 35.5f;
			}
			
			else { 
				iscrizione = 18;
			}
		
			System.out.print("Reddito> ");
			reddito = scanner.nextFloat();
			
			if (reddito > 0 & reddito <= 16000) {
				iscrizione *= .6f;
			}
			
			System.out.println("Quota iscrizione: € " + iscrizione);
		}
		
		else {
			System.out.println("Valore media errato");
		}
		
		scanner.close();
	}
}
