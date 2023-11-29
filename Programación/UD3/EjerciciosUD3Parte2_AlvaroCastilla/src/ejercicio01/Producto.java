package ejercicio01;

public class Producto {

	private double precioFab;
	private String nombre;
	private int fragil;
	private double precioVent;
	private String codProduct;
	
	public Producto(double precioFab, String nombre, int fragil, double precioVent, String codProduct) {
		this.precioFab = precioFab;
		this.nombre = nombre;
		this.fragil = fragil;
		this.precioVent = precioVent;
		this.codProduct = codProduct;
	}

	

	
	
	public double getPrecioFab() {
		return precioFab;
	}





	public void setPrecioFab(double precioFab) {
		this.precioFab = precioFab;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getFragil() {
		return fragil;
	}





	public void setFragil(int fragil) {
		this.fragil = fragil;
	}





	public double getPrecioVent() {
		return precioVent;
	}





	public void setPrecioVent(double precioVent) {
		this.precioVent = precioVent;
	}





	public String getCodProduct() {
		return codProduct;
	}





	public void setCodProduct(String codProduct) {
		this.codProduct = codProduct;
	}
	
	





	@Override
	public String toString() {
		return "Producto [precioFab=" + precioFab + ", nombre=" + nombre + ", fragil=" + fragil + ", precioVent="
				+ precioVent + ", codProduct=" + codProduct + "]";
	}





	public double calcularPrecioTr (double precioFab, double porcentaje) {
		double precioTr;
		int cien=100;
		precioTr=(precioFab*porcentaje)/cien;
		
		return precioTr;
		
	}
	
	public double calcularCoste(double precioFab, double precioTr) {
		double coste;
		
		coste=precioFab+precioTr;
		return coste;
	}
	
	public void mostrarCoste(double coste) {
		System.out.printf("El precio del coste es %.2f €", coste);
	}
	
	
	
	public double sumarPrecios(double coste) {
		double precioTot;
		precioTot=coste++;
		
		return precioTot;
	}
	
	
}
