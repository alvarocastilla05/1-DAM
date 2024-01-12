package ejercicio03;

public  class Vehiculo {

	private double cilindrada;
	private double potenciaEnCaballos;
	private int emisiones; //1-cero emisiones, 2-ECO, 3-tipo B, 4-tipo C
	
	
	public Vehiculo(double cilindrada, double potenciaEnCaballos, int emisiones ) {
		super();
		this.cilindrada = cilindrada;
		this.potenciaEnCaballos = potenciaEnCaballos;
		this.emisiones = emisiones;
		
	}

	

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotenciaEnCaballos() {
		return potenciaEnCaballos;
	}

	public void setPotenciaEnCaballos(double potenciaEnCaballos) {
		this.potenciaEnCaballos = potenciaEnCaballos;
	}

	public int getEmisiones() {
		return emisiones;
	}

	public void setEmisiones(int emisiones) {
		this.emisiones = emisiones;
	}

	

	public  double calcularPrecio(double fijo, double fijoMercancia, double porcentajeCilindrada, double porcentajePotencia) {
		switch(emisiones) {
			case 1:
				return fijo;
			case 2:
				return fijo=1000;
			case 3:
				return fijo=500;
			case 4:
				return fijo=250;
				
		}
		
		
			
				
		
		
		
		
		
		
		return fijo;
	}
	
	
}
