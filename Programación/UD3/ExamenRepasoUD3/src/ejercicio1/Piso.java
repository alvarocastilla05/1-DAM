package ejercicio1;

public class Piso {

	private int id;
	private String direccion;
	private int area;
	private int estado;
	private double precioVenta;
	
	public Piso(int id, String direccion, int area, int estado, double precioVenta) {
		this.id=id;
		
		this.direccion = direccion;
		this.area = area;
		this.estado = estado;
		this.precioVenta = precioVenta;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Piso [id=" + id + ", direccion=" + direccion + ", area=" + area + ", estado=" + estado
				+ ", precioVenta=" + precioVenta + "]";
	}



	
	
	
	
	
	
}
