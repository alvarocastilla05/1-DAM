package gestion;

import model.Producto;

public class GestionProductos {
	
	private Producto p;		//DEBEMOS de tener un atributo de lista de producto, solo esta puesto prod ucto para que veamos otra diferente.

	public GestionProductos(Producto p) {
		
		this.p = p;
	}
	
	//A una fila del ticket se le llama línea de pedidos. 
	
	public double calcularLinea (int cantidad) {
		double subTotal = 0;
		subTotal=cantidad*p.getPrecioUnitario();
		return subTotal;
	}
	
	public double calcularConDescuento (double descuento, int cantidad, int tope) {
		double cien = 100;
		if(cantidad>=tope) {
			return calcularLinea(cantidad)-calcularLinea(cantidad)*descuento/cien;
		}else
			return calcularLinea(cantidad);
	}
	
	
	
	
	
}
