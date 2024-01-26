package ejercicio04;


public class Alimentacion extends Producto{

	private int diasParaCaducar;
	
	

	public Alimentacion(double precioUnitario, String nombre, int codIdentificacion, int diasParaCaducar) {
		super(precioUnitario, nombre, codIdentificacion);
		this.diasParaCaducar = diasParaCaducar;
	}
	
	
	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}

	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}

	
	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducar=" + diasParaCaducar + "]";
	}


	@Override
	public double calcularPrecio(double impuestoLujo, double descuento) {
		double cien = 100;
		double precio;
		if(diasParaCaducar<=2) {
			precio = super.calcularPrecio(impuestoLujo, descuento)-(super.calcularPrecio(impuestoLujo, descuento)*(descuento/cien));
		}else {
			precio = super.calcularPrecio(impuestoLujo, descuento);
		}
		return precio;
	}
	
	public void mostrarAviso (double descuento) {
		if(diasParaCaducar<=2) {
			System.out.printf("El producto tiene un descuento del %.2f ya que está cerca de caducar", descuento);
		}
		
		
	}
	
	

	
}
