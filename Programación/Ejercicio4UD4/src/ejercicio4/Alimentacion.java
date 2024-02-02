package ejercicio4;

public class Alimentacion extends Producto{

	//Atributos
	private double pcntDescuento;
	private boolean caducaEnDosDias;
	
	//Constructores
	public Alimentacion(double precioUnitario, String nombre, String codIdentificacion, double pcntDescuento,
			boolean caducaEnDosDias) {
		super(precioUnitario, nombre, codIdentificacion);
		this.pcntDescuento = pcntDescuento;
		this.caducaEnDosDias = caducaEnDosDias;
	}

	//Getters and Setters
	public double getPcntDescuento() {
		return pcntDescuento;
	}

	public void setPcntDescuento(double pcntDescuento) {
		this.pcntDescuento = pcntDescuento;
	}

	public boolean isCaducaEnDosDias() {
		return caducaEnDosDias;
	}

	public void setCaducaEnDosDias(boolean caducaEnDosDias) {
		this.caducaEnDosDias = caducaEnDosDias;
	}

	//ToString
	@Override
	public String toString() {
		return "Alimentacion [pcntDescuento=" + pcntDescuento + ", caducaEnDosDias=" + caducaEnDosDias + "]";
	}

	//Methods
	@Override
	public double calcularPrecioUnitario() {
		double cien = 100;
		if(caducaEnDosDias) {
			return super.getPrecioUnitario()-(super.getPrecioUnitario()*pcntDescuento/cien);
		}else {
			return super.getPrecioUnitario();
		}
	}
	
	public void mostrarSiCaducaEn2Dias() {
		if(caducaEnDosDias) {
			System.out.println("El producto anterior caduca en 2 días.");
		}
	}
	
	
	
	
	
	
}
