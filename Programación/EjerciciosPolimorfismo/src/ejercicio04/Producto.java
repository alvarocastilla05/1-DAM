package ejercicio04;

public class Producto {

	private double precioUnitario;
	private String nombre;
	private int codIdentificacion;
	
	public Producto(double precioUnitario, String nombre, int codIdentificacion) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.codIdentificacion = codIdentificacion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodIdentificacion() {
		return codIdentificacion;
	}

	public void setCodIdentificacion(int codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codIdentificacion="
				+ codIdentificacion + "]";
	}
	
	
	public double calcularPrecio (double impuestoLujo, double descuento) {
		return precioUnitario;
	}
	
	
	
	
}
