package repaso;

public class Producto {

	private String nombre;
	private double precioFabrica;
	private int seccion; //1 alimentacion, 2 electronica, 3 ropa.
	private boolean enVenta;
	private int id;
	
	
	//Constructor. 
	public Producto(String nombre, double precioFabrica, int seccion, boolean enVenta, int id) {
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
		this.id=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", enVenta="
				+ enVenta + ", id=" + id + "]";
	}

	
	
	
	
	
	
	
	
}
