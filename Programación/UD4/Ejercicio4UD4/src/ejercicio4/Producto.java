package ejercicio4;

public abstract class Producto {

	//Atributos
	private double precioUnitario;
	private String nombre;
	private String codIdentificacion;
	
	//Constructores
	public Producto(double precioUnitario, String nombre, String codIdentificacion) {
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.codIdentificacion = codIdentificacion;
	}

	//Getters and Setters
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

	public String getCodIdentificacion() {
		return codIdentificacion;
	}

	public void setCodigoIndentificacion(String codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}

	//ToString
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codIdentificacion="
				+ codIdentificacion + "]";
	}
	
	//Methods 
	public abstract double calcularPrecioUnitario();
	
	
	
	
	
}
