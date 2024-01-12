package ejemploabstracto;

public class Rectangulo extends Figura{

	private double altura, base;

	public Rectangulo(double x, double y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	
	
}
