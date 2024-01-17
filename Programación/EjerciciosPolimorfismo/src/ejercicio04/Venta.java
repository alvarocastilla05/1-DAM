package ejercicio04;

import java.util.Arrays;



public class Venta {

	private Producto [] lista;
	
	
	
	public Venta(Producto[] lista) {
		super();
		this.lista = lista;
	}
	
	
	public Producto[] getLista() {
		return lista;
	}


	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	
	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}


	public void mostrarAviso (Producto [] lista, double descuento) {
		
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] instanceof Alimentacion) {
				((Alimentacion)lista[i]).mostrarAviso(descuento);
			}
		}
	}
	
	public double calcularPrecioUnProducto (Producto p, double impuestoLujo, double descuento) {
		return p.calcularPrecio(impuestoLujo, descuento);
	}
	
	public double sumarPrecios (double impuestoLujo, double descuento) {
		double resultado = 0;
		
		for (int i = 0; i < lista.length; i++) {
			resultado = resultado+calcularPrecioUnProducto(lista[i], impuestoLujo, descuento);
			
		}
		return resultado;
	}
	
	public void mostrarCabeceraTicket () {
		
		System.out.println("\t\tMERCADONA\n"
				+ "\t\t\t\tFecha:12/12/2012\n"
				+ "\t\t\t\tHora:12:12");
	}
	
	public void mostrarTicket (double impuestoLujo, double descuento) {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getNombre()+ " " + lista[i].getPrecioUnitario()+ " " + lista[i].calcularPrecio(impuestoLujo, descuento));
		}
	}
	
	public void mostrarTotal (LineaDeVenta lv, double impuestoLujo, double descuento) {
		System.out.println("El precio total es: "+ lv.calcularPrecioTotal(impuestoLujo, descuento));
	}
}
