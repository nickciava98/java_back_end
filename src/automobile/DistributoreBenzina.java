package automobile;

public class DistributoreBenzina {
	private double depositoVerde,
		depositoGasolio,
		euroPerLitroVerde,
		euroPerLitroGasolio;
	
	public DistributoreBenzina(
			double euroPerLitroVerde,
			double euroPerLitroGasolio) {
		this.euroPerLitroVerde = euroPerLitroVerde;
		this.euroPerLitroGasolio = euroPerLitroGasolio;
	}
	
	public double getDepositoVerde() {
		return depositoVerde;
	}
	
	public double getDepositoGasolio() {
		return depositoGasolio;
	}
	
	public double getEuroPerLitroVerde() {
		return euroPerLitroVerde;
	}
	
	public double getEuroPerLitroGasolio() {
		return euroPerLitroGasolio;
	}
	
	public void rifornisciVerde(double quantita) {
		depositoVerde += quantita;
	}
	
	public void rifornisciGasolio(double quantita) {
		depositoGasolio += quantita;
	}
	
	public void vendi(double euro,
			Automobile auto) {		
		if (auto.isDiesel()) {
			if (depositoGasolio >= euro / euroPerLitroGasolio) {
				double carbAuto = 
						depositoGasolio
							- (depositoGasolio 
									- euro / euroPerLitroGasolio);
				auto.addGas(carbAuto);
				
				depositoGasolio -= euro / euroPerLitroGasolio;
			}
			
			else 
				System.err.println("[depositoGasolio]> non sufficiente");
		}
		
		else {
			if (depositoVerde >= euro / euroPerLitroVerde) {
				double carbAuto = 
						depositoVerde 
							- (depositoVerde 
									- euro / euroPerLitroVerde);
				auto.addGas(carbAuto);
				
				depositoVerde -= euro / euroPerLitroVerde;	
			}
			
			else
				System.err.println("[depositoVerde]> non sufficiente");
		}
	}
	
	public void aggiornaVerde(double euroPerLitroVerde) {
		this.euroPerLitroVerde = euroPerLitroVerde;
	}
	
	public void aggiornaGasolio(double euroPerLitroGasolio) {
		this.euroPerLitroGasolio = euroPerLitroGasolio;
	}
}
