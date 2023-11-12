package ejercicio04;

public class Cilindro {
	
	private double radio;
	private double altura;
	private double volumen;
	

	public Cilindro(double radio, double altura, double volumen) {
		
		this.radio = radio;
		this.altura = altura;
		this.volumen = volumen;
	}

	public double calcularVol () {
		
		int dos=2;
		volumen=Math.PI*(Math.pow(radio, dos))*altura;
		return volumen;
		
	}
	
	public double mostrarArea() {
		System.out.printf("El volumen del cilindro es %.2f m3", volumen);
		return volumen;
	}
}
