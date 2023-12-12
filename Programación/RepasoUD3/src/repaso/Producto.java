package repaso;

public class Producto {

	private String nombre;
	private double precioFabrica;
	private int seccion; //1 alimentacion, 2 electronica, 3 ropa.
	private boolean enVenta;
	
	//Constructor. 
	public Producto(String n, double precioFabrica, int seccion, boolean enVenta) {
		this.nombre = n;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}
	
	
	
}
