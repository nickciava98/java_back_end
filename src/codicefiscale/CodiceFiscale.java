package codicefiscale;

public class CodiceFiscale {
	private String codiceFiscale;
	
	public CodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public String[] checkCodiceFiscale() {
		String[] status = new String[8];
		
		codiceFiscale = codiceFiscale.toLowerCase();
		
		if (codiceFiscale.length() == 16) {
			String cognome = codiceFiscale.substring(0, 3), 
					nome = codiceFiscale.substring(3, 6), 
					annoNascita = codiceFiscale.substring(6, 8); 
			char meseNascita = codiceFiscale.charAt(8); 
			String giornoNascita = codiceFiscale.substring(9, 11); 
			char lettera = codiceFiscale.charAt(11);
			String codicePaese = codiceFiscale.substring(12, 15);
			char codiceNazione = codiceFiscale.charAt(15);
			
			char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 
					'f', 'g', 'h', 'i', 'j', 'k', 'l', 
					'm', 'n', 'o', 'p', 'q', 'r', 's', 
					't', 'u', 'v', 'w', 'x', 'y', 'z'};
			char[] numeri = {'0', '1', '2', '3', '4', 
					'5', '6', '7', '8', '9'};
			int contAlfabeto = 0;
			
			for (int i = 0; i < cognome.length(); i++)
				for (int j = 0; j < alfabeto.length; j++)
					if (cognome.charAt(i) == alfabeto[j])
						contAlfabeto++;
			
			if (contAlfabeto != 3)
				status[0] = "> err. cognome";
			
			else
				status[0] = "> cognome ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < nome.length(); i++)
				for (int j = 0; j < alfabeto.length; j++)
					if (nome.charAt(i) == alfabeto[j])
						contAlfabeto++;
			
			if (contAlfabeto != 3)
				status[1] = "> err. nome";
			
			else
				status[1] = "> nome ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < annoNascita.length(); i++)
				for (int j = 0; j < numeri.length; j++)
					if (annoNascita.charAt(i) == numeri[j])
						contAlfabeto++;
			
			if (contAlfabeto != 2)
				status[2] = "> err. annoNascita";
			
			else
				status[2] = "> annoNascita ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < alfabeto.length; i++)
				if (meseNascita == alfabeto[i])
					contAlfabeto++;
			
			if (contAlfabeto != 1)
				status[3] = "> err. meseNascita";
			
			else
				status[3] = "> meseNascita ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < giornoNascita.length(); i++)
				for (int j = 0; j < numeri.length; j++)
					if (giornoNascita.charAt(i) == numeri[j])
						contAlfabeto++;
			
			if (contAlfabeto != 2)
				status[4] = "> err. giornoNascita";
			
			else
				status[4] = "> giornoNascita ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < alfabeto.length; i++)
				if (lettera == alfabeto[i])
					contAlfabeto++;
			
			if (contAlfabeto != 1)
				status[5] = "> err. lettera";
			
			else
				status[5] = "> lettera ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < codicePaese.length(); i++)
				for (int j = 0; j < numeri.length; j++)
					if (codicePaese.charAt(i) == numeri[j])
						contAlfabeto++;
			
			if (contAlfabeto != 3)
				status[6] = "> err. codicePaese";
			
			else
				status[6] = "> codicePaese ok";
			
			contAlfabeto = 0;
			
			for (int i = 0; i < alfabeto.length; i++)
				if (codiceNazione == alfabeto[i])
					contAlfabeto++;
			
			if (contAlfabeto != 3)
				status[7] = "> err. codiceNazione";
			
			else
				status[7] = "> codiceNazione ok";
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		CodiceFiscale codiceFiscale = new CodiceFiscale("CVRNCL98E10H926S");
		
		System.out.println("[codiceFiscale]> " 
				+ codiceFiscale.getCodiceFiscale() + "\n");
		
		String[] status = codiceFiscale.checkCodiceFiscale();
		
		for (int i = 0; i < status.length; i++) {
			if (status[i].contains("err"))
				System.err.println(status[i]);
			
			else
				System.out.println(status[i]);
		}
		
		codiceFiscale.setCodiceFiscale("C67NJ088E906H2SA");
		
		System.out.println("\n[new_codiceFiscale]> " 
				+ codiceFiscale.getCodiceFiscale() + "\n");
		
		status = codiceFiscale.checkCodiceFiscale();
		
		for (int i = 0; i < status.length; i++) {
			if (status[i].contains("err"))
				System.err.println(status[i]);
			
			else
				System.out.println(status[i]);
		}
	}
}
