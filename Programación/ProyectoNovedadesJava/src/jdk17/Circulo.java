package jdk17;

public class Circulo implements Figura{

	private double diametro;

	public Circulo(double diametro) {
		this.diametro = diametro;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "Circulo [diametro=" + diametro + "]";
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(diametro / 2, 2);
	}
}
