package ejercicio01;

import java.util.Arrays;

public class Ventas {

	private Producto [] lista;
	private int cantidadProductos;
	
	public Ventas(Producto[] lista, int cantidadProductos) {
		this.lista = lista;
		this.cantidadProductos = cantidadProductos;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	

	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + ", cantidadProductos=" + cantidadProductos + "]";
	}

	public int mostrarNumeroVendidos () {
		int contador = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				if (lista[i].isVendido()==true) {
					contador++;
				}	
			}
		}
		return contador;
	}
	
	public double calcularPrecioUnProducto (Producto p, double porcentaje, double fijoEspadaDoble) {
		return p.calcularPVP(porcentaje, fijoEspadaDoble);
	}
	
	public double calcularDineroRecaudado(double porcentaje, double fijoEspadaDoble) {
		double total = 0;
		for (int i = 0; i < cantidadProductos; i++) {
			if(lista[i]!=null &&  lista[i].isVendido()==true) {
				total=total+calcularPrecioUnProducto(lista[i], porcentaje, fijoEspadaDoble);
			}
		}
		return total;
	}
	public double calcularDevolucion (double cantidadEntregada, double porcentaje, double fijoEspadaDoble) {
		double devolucion = 0;
		for (int i = 0; i < lista.length; i++) {
			if(cantidadEntregada>=calcularDineroRecaudado(porcentaje, fijoEspadaDoble)) {
				devolucion=cantidadEntregada-calcularDineroRecaudado(porcentaje, fijoEspadaDoble);	
		}
		}
		return devolucion;
	}
	

}
