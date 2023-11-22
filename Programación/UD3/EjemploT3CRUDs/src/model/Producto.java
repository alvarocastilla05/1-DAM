package model;

public class Producto {

	private String codigo;
	private String nombre;
	private double precioUnitario;
	private boolean activo;

	public Producto(String codigo, String nombre, double precioUnitario, boolean activo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.activo=activo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	/*Estudiaremos este método en el tema 5, pero de momento podemos usarlo.
	Sirve para definir y ver si el objeto que llama y el que se le pasa, son iguales, 
	en este caso, solo son iguales si coinciden el código, el nombre y el precio unitario,
	las tres cosas*/
	public int compareTo(Producto o) {
		if (this.codigo.equalsIgnoreCase(o.getCodigo())
				&& this.nombre.equalsIgnoreCase(o.getNombre())
				&& this.precioUnitario == o.getPrecioUnitario())
			return 0;

		return 1;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", activo="
				+ activo + "]";
	}
	

	
}
