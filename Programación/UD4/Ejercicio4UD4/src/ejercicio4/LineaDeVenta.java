package ejercicio4;

public class LineaDeVenta {

	//Atributos
	private Producto p;
	private int cantidad;
	
	//Constructores
	public LineaDeVenta(Producto p, int cantidad) {
		this.p = p;
		this.cantidad = cantidad;
	}

	//Getters and Setters
	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	//ToString
	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	//Methods
	public double calcularPrecioTotalLinea () {
		return p.calcularPrecioUnitario()*cantidad;
	}
	
	/*
	//Para verlo cuando no tenemos atributo producto
	public double calcularPrecioUnProducto (Producto p) {
		return p.calcularPrecioUnitario();
	}
	
	public double calcularPrecioTotalLineaV2 (Producto p) {
		return calcularPrecioUnProducto(p)*cantidad;
	}//Así debemos de hacerlo cuando no tengamos como atributo el objeto, como en este caso si está, es mejor la v1.
	
	*/
	
	
	
}
