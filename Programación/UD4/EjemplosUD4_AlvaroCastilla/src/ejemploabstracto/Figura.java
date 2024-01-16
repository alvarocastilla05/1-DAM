package ejemploabstracto;

public abstract class Figura {

	//PUNTOS PARA GRAFICAR
	private double x;
	
	private double y;

	//EL CONSTRUCTOR NO LO USAMOS PARA INSTANCIAR SINO DEFINIRLA EN LA SUBCLASE
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	
	public abstract double calcularArea();
	
	
	
	
	
}
