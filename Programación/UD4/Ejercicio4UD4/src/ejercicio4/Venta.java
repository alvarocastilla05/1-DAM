package ejercicio4;

import java.util.Arrays;

public class Venta {

	//Atributos
	private LineaDeVenta [] lista;

	//Constructores
	public Venta(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	//Getters and Setters
	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	//ToString 
	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	//Methods
	public double calcularPrecioTotal() {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			total = total+lista[i].calcularPrecioTotalLinea();
		}
		return total;
	}
	
	public void mostrarTicket() {
		System.out.println("*************************************************************************");
		System.out.println("Producto\tPrecio\tCant.\t\tSubTotal");
		System.out.println("---------------------------------------------------------------------------");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getP().getNombre());
			System.out.println("\t\t"+lista[i].getP().calcularPrecioUnitario());
			System.out.println("\t\t"+lista[i].getCantidad());
			System.out.println("\t\t"+lista[i].calcularPrecioTotalLinea());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Total compra:"+this.calcularPrecioTotal());
	}
	
	public void mostrarProductosGuardados() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getP().getNombre());
			if(lista[i].getP() instanceof Alimentacion) {
				((Alimentacion)lista[i].getP()).mostrarSiCaducaEn2Dias(); 
			}
		}
	}
	
	
	
	
	
	
}
